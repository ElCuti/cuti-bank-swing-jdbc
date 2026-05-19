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
 * Clase Servicio encargada de realizar toda la lógica del banco. Hace de
 * intermediario entre la interfaz grafica y el acceso a datos
 * (BancoRepository). Controla las transacciones y aplica las reglas de
 * validación y seguridad.
 *
 * * @author Daniel
 */
public class BancoService {

    /**
     * Realiza un "borrado lógico" (anonimización) de la cuenta por motivos
     * legales y de auditoría.
     *
     * @param strNumero El número de la cuenta a borrar en formato texto.
     * @param contrasenia La contraseña actual para verificar la identidad antes
     * de borrar.
     * @throws Exception Si los campos están vacíos, el formato es incorrecto, o
     * las credenciales fallan.
     */
    public void borrarCuenta(String strNumero, String contrasenia) throws Exception {
        if (strNumero.isEmpty() || contrasenia.isEmpty()) {
            //Si el dni o la contraseña esta vacia lanza la excepcion
            throw new Exception("Por favor, introduzca el número de cuenta y la contraseña para borrarla.");
        }

        int numero;
        try {
            numero = Integer.parseInt(strNumero); //Transformamos el String en un número
        } catch (NumberFormatException e) {
            //Si la función parseInt falla devolvemos la excepción
            throw new Exception("El número de cuenta debe ser un valor numérico válido.");
        }

        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            //Aplicamos la query para filtrar encontrar una cuenta por su numero
            Cuenta cuentaEncontrada = BancoRepository.buscarCuentaPorNumero(em, numero);

            // Si la cuenta existe y la contraseña es correcta
            if (cuentaEncontrada != null && BCrypt.checkpw(contrasenia, cuentaEncontrada.getContrasenia())) {
                em.getTransaction().begin();
                //Le establecemos una contraseña aleatoria para anonimizar la cuenta y darla de baja, manteniendo su ID y su dueño 
                cuentaEncontrada.setContrasenia(BCrypt.hashpw("CUENTA_BAJA_" + UUID.randomUUID().toString(), BCrypt.gensalt()));
                //Le asignamos saldo 0
                cuentaEncontrada.setSaldo(0);
                em.getTransaction().commit();
            } else {
                //En caso de que la contraseña no sea correcta o no encontremos la cuenta enviamos la excepción
                throw new Exception("El número de cuenta o la contraseña son incorrectos.");
            }
        } catch (Exception e) {
            //Si falla la transferencia hacemos un rollback y lanzamos la excepción
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;
        } finally {
            em.close();
        }
    }

    /**
     * Actúa como puente para recuperar una página específica del historial de
     * transacciones.
     *
     * @param cuentaId El ID interno de la cuenta en base de datos.
     * @param pagina El índice de la página actual (empezando en 0).
     * @param tamanoPagina La cantidad máxima de registros a devolver.
     * @return Una lista de transacciones correspondientes a la página
     * solicitada.
     */
    public List<Transacciones> obtenerMovimientosPaginados(int cuentaId, int pagina, int tamanoPagina) {
        return BancoRepository.obtenerMovimientosPaginados(cuentaId, pagina, tamanoPagina);
    }

    /**
     * Actúa como puente para contar el total histórico de transacciones de una
     * cuenta.
     *
     * @param cuentaId El ID interno de la cuenta en base de datos.
     * @return El número total de movimientos realizados.
     */
    public long contarTotalMovimientos(int cuentaId) {
        return BancoRepository.contarTotalMovimientos(cuentaId);
    }

    /**
     * Valida los datos básicos y registra un nuevo usuario en el sistema.
     *
     * @param nombre El nombre del nuevo usuario.
     * @param apellido El apellido del nuevo usuario (OPCIONAL).
     * @param dni El DNI del usuario (debe cumplir el formato válido español).
     * @throws Exception Si faltan datos, el formato del DNI es inválido, o el
     * DNI ya está registrado.
     */
    public void crearUsuario(String nombre, String apellido, String dni) throws Exception {
        //Faltan datos
        if (nombre.isEmpty() || dni.isEmpty()) {
            throw new Exception("El Nombre y el DNI son campos obligatorios.");
        }
        //DNI no cumple las condiciones establecidas
        if (!ValidacionUtil.dniCheck(dni)) {
            throw new Exception("El DNI no tiene el formato correcto (8 Números y una letra mayúscula).");
        }

        //Creamos el usuario y agregamos los datos introducidos
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
            //Solo hay un valor unico en Usuario y es DNI, en caso de que devuelva una excepcion
            // con ese mensaje solo puede significar que estan intentando guardar por segunda vez un DNI
            if (e.getMessage() != null && e.getMessage().contains("UNIQUE constraint failed")) {
                throw new Exception("Error al guardar: ¡ESTE DNI YA ESTÁ REGISTRADO!");
            }
            //Si no sabemos que fallo es devolvemos un mensaje genérico
            throw new Exception("Error interno al intentar guardar el usuario.");
        } finally {
            em.close();
        }
    }

    /**
     * Ejecuta una transferencia de fondos segura entre dos cuentas distintas.
     * Garantiza la atomicidad de la operación: o se resta y suma el dinero a la
     * vez, o no se hace nada.
     *
     * @param idCuentaOrigen El ID de la cuenta que envía el dinero.
     * @param numeroCuentaDestino El número público de la cuenta que recibe el
     * dinero.
     * @param cantidad El importe a transferir (debe ser mayor a cero).
     * @param comentario Texto descriptivo opcional de la transacción.
     * @throws Exception Si la cantidad es nula/negativa, la cuenta destino no
     * existe, es la misma cuenta, o no hay fondos suficientes.
     */
    public void realizarTransferencia(int idCuentaOrigen, int numeroCuentaDestino, int cantidad, String comentario) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("La cantidad a enviar debe ser mayor a 0.");
        }

        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            //Aplicamos la query para encontrar la cuenta del usuario
            Cuenta cuentaOrigen = em.find(Cuenta.class, idCuentaOrigen);
            //Aplicamos la query para encontrar la cuenta mediante el numero insertado por el usuario
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

            //Realizamos la transferencia de dinero
            cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - cantidad);
            cuentaDestino.setSaldo(cuentaDestino.getSaldo() + cantidad);

            //Registramos la transferencia en la BD
            Transacciones nuevoMovimiento = new Transacciones();
            nuevoMovimiento.setCantidad(cantidad);
            nuevoMovimiento.setComentario(comentario);
            nuevoMovimiento.setCuentaEmisor(cuentaOrigen);
            nuevoMovimiento.setCuentaReceptor(cuentaDestino);

            //Extraemos el momento exacto donde hemos realizado esta transferencia con la plantilla puesta (EJ: 18/08/2006 19:02:32)
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            nuevoMovimiento.setFecha(sdf.format(new Date()));

            em.persist(nuevoMovimiento);
            em.getTransaction().commit();

        } finally {
            em.close();
        }
    }

    /**
     * Autentica a un usuario comprobando el número de cuenta y el hash seguro
     * de la contraseña.
     *
     * @param numeroCuenta El número público de la cuenta.
     * @param contrasenia La contraseña introducida en texto plano.
     * @return El objeto Cuenta cargado con todos sus datos si el login es
     * correcto.
     * @throws Exception Si la cuenta no existe o la contraseña no coincide.
     */
    public Cuenta login(int numeroCuenta, String contrasenia) throws Exception {
        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            //Aplicamos la query para encontrar una cuenta por su número
            Cuenta cuentaEncontrada = BancoRepository.buscarCuentaPorNumero(em, numeroCuenta);

            //Si la cuenta existe y la contraseña coincide (Comprobación mediante BCrypt)
            if (cuentaEncontrada != null && BCrypt.checkpw(contrasenia, cuentaEncontrada.getContrasenia())) {
                return cuentaEncontrada;
            } else {
                throw new Exception("El número de cuenta o la contraseña son incorrectos.");
            }
        } finally {
            em.close();
        }
    }

    /**
     * Crea una nueva cuenta bancaria y la asocia a un usuario ya existente
     * validando su DNI.
     *
     * @param strNumero El número de la cuenta a crear.
     * @param contrasenia La nueva contraseña en texto plano.
     * @param contraseniaCheck La confirmación de la contraseña.
     * @param dni El DNI del titular (debe existir en la base de datos).
     * @throws Exception Si las contraseñas no coinciden, el formato es erróneo,
     * el DNI no existe o el número de cuenta ya se encuentra en uso.
     */
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
        //Aplicamos la query para encontrar la ID de un usuario mediante su DNI
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
            //Hasheamos la contraseña mediante BCrypt
            cuentaNueva.setContrasenia(BCrypt.hashpw(contrasenia, BCrypt.gensalt()));

            em.getTransaction().begin();
            em.persist(cuentaNueva);
            em.getTransaction().commit();

        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            //Solo hay un valor unico en Cuenta y es el numero, en caso de que devuelva una excepcion
            // con ese mensaje solo puede significar que estan intentando guardar por segunda vez un numero
            if (e.getMessage() != null && e.getMessage().contains("UNIQUE constraint failed")) {
                throw new Exception("Error al ejecutar: ¡ESTE NÚMERO DE CUENTA YA ESTÁ EN USO!");
            }
            throw new Exception("Error interno al intentar crear la cuenta.");
        } finally {
            em.close();
        }
    }

    /**
     * Actualiza la contraseña de una cuenta comprobando previamente que no se
     * esté reciclando la contraseña actual.
     *
     * @param idCuenta El ID interno de la cuenta que está activa.
     * @param nuevaPass La nueva contraseña en texto plano elegida.
     * @param confirmacionPass La repetición de la contraseña para evitar
     * errores tipográficos.
     * @throws Exception Si las contraseñas están vacías, no coinciden, son
     * iguales a la actual, o hay un error de conexión con la base de datos.
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
            //Aplicamos la query para encontar una cuenta por su id
            Cuenta cuenta = em.find(Cuenta.class, idCuenta);
            //Comprobamos que la contraseña no sea la misma
            if (BCrypt.checkpw(nuevaPass, cuenta.getContrasenia())) {
                throw new Exception("La nueva contraseña no puede ser igual a la que ya tienes activa.");
            }
            //Cambiamos la contraseña por la nueva
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
