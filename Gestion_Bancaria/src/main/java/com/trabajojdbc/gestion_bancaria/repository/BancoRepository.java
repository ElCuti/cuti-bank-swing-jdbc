package com.trabajojdbc.gestion_bancaria.repository;

import com.trabajojdbc.gestion_bancaria.Cuenta;
import com.trabajojdbc.gestion_bancaria.EntityManagerUtil;
import com.trabajojdbc.gestion_bancaria.Transacciones;
import com.trabajojdbc.gestion_bancaria.Usuario;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;

/**
 * Clase Repositorio encargada de gestionar (Metodos estáticos) todas las
 * consultas que contengan SQL/JPQL para dejar la clase BancoService con la
 * lógica de banco.
 *
 * * @author Daniel
 */
public class BancoRepository {

    /**
     * Busca un usuario en la base de datos a partir de su DNI.
     *
     * @param em Gestor de entidades activo para este proceso.
     * @param dniABuscar El DNI exacto a buscar.
     * @return El ID (Integer) del usuario si existe, o null si no se encuentra
     * en la base de datos.
     */
    public static Integer obtenerIdUsuarioPorDni(EntityManager em, String dniABuscar) {
        try {
            // Aplicamos la query creada en Usuario.java con el parametro dniABuscar
            Usuario usuarioEncontrado = em.createNamedQuery("Usuario.findByDni", Usuario.class)
                    .setParameter("dni", dniABuscar)
                    .getSingleResult();
            return usuarioEncontrado.getId();

        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Busca una cuenta bancaria específica utilizando su número de cuenta.
     *
     * @param em Gestor de entidades activo para este proceso.
     * @param numeroBuscar El número de la cuenta bancaria a buscar.
     * @return El objeto Cuenta con todos sus datos si se encuentra, o null si
     * la cuenta no existe.
     */
    public static Cuenta buscarCuentaPorNumero(EntityManager em, int numeroBuscar) {
        try {
            // Aplicamos la query creada en Cuenta.java con el parametro numeroBuscar
            return em.createNamedQuery("Cuenta.findByNumero", Cuenta.class)
                    .setParameter("numero", numeroBuscar)
                    .getSingleResult();

        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Recupera el historial reciente de movimientos de una cuenta.
     *
     * @param cuentaId El ID interno de la cuenta de la cual se quieren
     * consultar los movimientos.
     * @param pagina Variable que cuenta en que pagina se
     * @return Una lista con las últimas 5 transacciones ordenadas de la más
     * reciente a la más antigua. Si hay un error o no hay transacciones,
     * devuelve una lista vacía.
     */
    public static List<Transacciones> obtenerMovimientosPaginados(int cuentaId, int pagina, int tamanoPagina) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            //primer registro que mirar
            int offset = pagina * tamanoPagina;
            // Obtenemos mediante esta query NATIVA las transacciones del usuario filtradas por la Query para la paginacion
            //*He intendo hacerlo con createQuery añadiendo el metodo setFirstResult y setMaxResult pero JPA no se lleva muy bien que digamos con la paginacion, 
            //a si que he tenido que hacerlo con una consulta nativa, que si funciona 
            return em.createNativeQuery("SELECT * FROM Transacciones WHERE ID_CuentaE = ?1 OR ID_CuentaR = ?2 ORDER BY ID DESC LIMIT ?3 OFFSET ?4", Transacciones.class)
                    .setParameter(1, cuentaId)       
                    .setParameter(2, cuentaId)      
                    .setParameter(3, tamanoPagina)   
                    .setParameter(4, offset)         
                    .getResultList();

        } catch (Exception e) {
            return Collections.emptyList();
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

    /**
     * Cuenta el número total de movimientos (transacciones) asociados a una
     * cuenta específica.
     *
     * @param cuentaId El identificador único de la cuenta a consultar.
     * @return El número total de movimientos de la cuenta. Retorna 0 si la
     * cuenta no tiene movimientos o si ocurre un error durante la consulta a la
     * base de datos.
     */
    public static long contarTotalMovimientos(int cuentaId) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            // returnamos el count con la cantidad de transacciones de la cuenta consultada (Ya sean transacciones emitidas o recibidas)
            return em.createQuery(
                    "SELECT COUNT(t.id) FROM Transacciones t WHERE t.cuentaEmisor.id = :miId OR t.cuentaReceptor.id = :miId",
                    Long.class)
                    .setParameter("miId", cuentaId)
                    .getSingleResult();
        } catch (Exception e) {
            return 0;
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }
}
