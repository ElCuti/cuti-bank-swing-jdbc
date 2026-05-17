package com.trabajojdbc.gestion_bancaria.service;

import com.trabajojdbc.gestion_bancaria.Cuenta;
import com.trabajojdbc.gestion_bancaria.EntityManagerUtil;
import com.trabajojdbc.gestion_bancaria.Transacciones;
import com.trabajojdbc.gestion_bancaria.Usuario;
import com.trabajojdbc.gestion_bancaria.repository.BancoRepository;
import com.trabajojdbc.gestion_bancaria.util.ValidacionUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import org.mindrot.jbcrypt.BCrypt;
import java.util.UUID;

/**
 *
 * @author Daniel
 */
public class BancoService {

    public void borrarCuenta(String strNumero, String contrasenia) throws Exception {
        if (strNumero.isEmpty() || contrasenia.isEmpty()) {
            throw new Exception("Por favor, introduzca el número de cuenta y la contraseña para borrarla.");
        }

        int numero;
        try {
            numero = Integer.parseInt(strNumero);
        } catch (NumberFormatException e) {
            throw new Exception("El número de cuenta debe ser un valor numérico válido.");
        }

        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            Cuenta cuentaEncontrada = BancoRepository.buscarCuentaPorNumero(em, numero);

            if (cuentaEncontrada != null && BCrypt.checkpw(contrasenia, cuentaEncontrada.getContrasenia())) {
                em.getTransaction().begin();
                cuentaEncontrada.setContrasenia(BCrypt.hashpw("CUENTA_BAJA_" + UUID.randomUUID().toString(), BCrypt.gensalt()));
                cuentaEncontrada.setSaldo(0);
                em.getTransaction().commit();
            } else {
                throw new Exception("El número de cuenta o la contraseña son incorrectos.");
            }
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;
        } finally {
            em.close();
        }
    }

    public List<Transacciones> obtenerMovimientosPaginados(int cuentaId, int pagina, int tamanoPagina) {
        return BancoRepository.obtenerMovimientosPaginados(cuentaId, pagina, tamanoPagina);
    }

    public long contarTotalMovimientos(int cuentaId) {
        return BancoRepository.contarTotalMovimientos(cuentaId);
    }

    public void crearUsuario(String nombre, String apellido, String dni) throws Exception {
        if (nombre.isEmpty() || dni.isEmpty()) {
            throw new Exception("El Nombre y el DNI son campos obligatorios.");
        }
        if (!ValidacionUtil.dniCheck(dni)) {
            throw new Exception("El DNI no tiene el formato correcto (8 Números y una letra mayúscula).");
        }

        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombre(nombre);
        nuevoUsuario.setApellido(apellido);
        nuevoUsuario.setDni(dni);

        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(nuevoUsuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            if (e.getMessage() != null && e.getMessage().contains("UNIQUE constraint failed")) {
                throw new Exception("Error al guardar: ¡ESTE DNI YA ESTÁ REGISTRADO!");
            }
            throw new Exception("Error interno al intentar guardar el usuario.");
        } finally {
            em.close();
        }
    }

    public void realizarTransferencia(int idCuentaOrigen, int numeroCuentaDestino, int cantidad, String comentario) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("La cantidad a enviar debe ser mayor a 0.");
        }

        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            Cuenta cuentaOrigen = em.find(Cuenta.class, idCuentaOrigen);
            Cuenta cuentaDestino = BancoRepository.buscarCuentaPorNumero(em, numeroCuentaDestino);

            if (cuentaDestino == null) {
                throw new Exception("La cuenta de destino no existe.");
            }
            if (cuentaOrigen.getId() == cuentaDestino.getId()) {
                throw new Exception("No puedes enviarte dinero a ti mismo.");
            }
            if (cuentaOrigen.getSaldo() < cantidad) {
                throw new Exception("Saldo insuficiente para realizar la transacción.");
            }

            em.getTransaction().begin();

            cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - cantidad);
            cuentaDestino.setSaldo(cuentaDestino.getSaldo() + cantidad);

            Transacciones nuevoMovimiento = new Transacciones();
            nuevoMovimiento.setCantidad(cantidad);
            nuevoMovimiento.setComentario(comentario);
            nuevoMovimiento.setCuentaEmisor(cuentaOrigen);
            nuevoMovimiento.setCuentaReceptor(cuentaDestino);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            nuevoMovimiento.setFecha(sdf.format(new Date()));

            em.persist(nuevoMovimiento);
            em.getTransaction().commit();

        } finally {
            em.close();
        }
    }

    public Cuenta login(int numeroCuenta, String contrasenia) throws Exception {
        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            Cuenta cuentaEncontrada = BancoRepository.buscarCuentaPorNumero(em, numeroCuenta);

            if (cuentaEncontrada != null && BCrypt.checkpw(contrasenia, cuentaEncontrada.getContrasenia())) {
                return cuentaEncontrada;
            } else {
                throw new Exception("El número de cuenta o la contraseña son incorrectos.");
            }
        } finally {
            em.close();
        }
    }

    public void crearCuenta(String strNumero, String contrasenia, String contraseniaCheck, String dni) throws Exception {
        if (strNumero.isEmpty() || dni.isEmpty() || contrasenia.isEmpty() || contraseniaCheck.isEmpty()) {
            throw new Exception("Todos los campos son requeridos.");
        }
        if (!contrasenia.equals(contraseniaCheck)) {
            throw new Exception("No coinciden las contraseñas, tienen que ser las mismas.");
        }
        if (!ValidacionUtil.dniCheck(dni)) {
            throw new Exception("El DNI no tiene el formato correcto (8 Números y una letra mayúscula).");
        }

        int numero;
        try {
            numero = Integer.parseInt(strNumero);
        } catch (NumberFormatException e) {
            throw new Exception("El número de cuenta debe ser un valor numérico válido.");
        }

        EntityManager em = EntityManagerUtil.getEntityManager();
        Integer idUsuario = BancoRepository.obtenerIdUsuarioPorDni(em, dni);
        if (idUsuario == null) {
            em.close();
            throw new Exception("El DNI no corresponde a ninguno de nuestra base de datos, compruébelo de nuevo.");
        }
        try {
            Cuenta cuentaNueva = new Cuenta();
            Usuario propietario = new Usuario(idUsuario);
            cuentaNueva.setIDUsuario(propietario);
            cuentaNueva.setNumero(numero);
            cuentaNueva.setContrasenia(BCrypt.hashpw(contrasenia, BCrypt.gensalt()));

            em.getTransaction().begin();
            em.persist(cuentaNueva);
            em.getTransaction().commit();

        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            if (e.getMessage() != null && e.getMessage().contains("UNIQUE constraint failed")) {
                throw new Exception("Error al ejecutar: ¡ESTE NÚMERO DE CUENTA YA ESTÁ EN USO!");
            }
            throw new Exception("Error interno al intentar crear la cuenta.");
        } finally {
            em.close();
        }
    }

    /**
     * Actualiza la contraseña de una cuenta ya existente.
     *
     * @param idCuenta El ID interno de la cuenta que está activa.
     * @param nuevaPass La nueva contraseña elegida.
     * @param confirmacionPass La repetición de la contraseña para evitar
     * errores tipográficos.
     * @throws Exception Si las contraseñas están vacías, no coinciden, o hay un
     * error de base de datos.
     */
    public void cambiarContrasenia(int idCuenta, String nuevaPass, String confirmacionPass) throws Exception {
        if (nuevaPass == null || nuevaPass.trim().isEmpty() || confirmacionPass == null || confirmacionPass.trim().isEmpty()) {
            throw new Exception("Las contraseñas no pueden estar vacías.");
        }
        if (!nuevaPass.equals(confirmacionPass)) {
            throw new Exception("Las contraseñas no coinciden. Inténtalo de nuevo.");
        }
        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            Cuenta cuenta = em.find(Cuenta.class, idCuenta);
            if (BCrypt.checkpw(nuevaPass, cuenta.getContrasenia())) {
                throw new Exception("La nueva contraseña no puede ser igual a la que ya tienes activa.");
            }
            cuenta.setContrasenia(BCrypt.hashpw(nuevaPass, BCrypt.gensalt()));
            em.getTransaction().commit();

        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            if (e.getMessage() != null && e.getMessage().contains("La nueva contraseña no puede ser igual")) {
                throw e;
            }
            throw new Exception("Error al actualizar la contraseña en la base de datos.");
        } finally {
            em.close();
        }
    }
}
