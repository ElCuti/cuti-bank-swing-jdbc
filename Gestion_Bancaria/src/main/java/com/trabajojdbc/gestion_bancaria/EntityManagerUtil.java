package com.trabajojdbc.gestion_bancaria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Clase de utilidad encargada de gestionar la conexión con la base de datos a
 * través de JPA. Centraliza la creación de gestores para no tener que repetir
 * el código de conexión en cada clase.
 *
 * * @author Daniel
 */
public class EntityManagerUtil {

    /**
     * Crea y devuelve un nuevo gestor de entidades (EntityManager). Este gestor
     * es el "motor" principal que usaremos para comunicarnos con la base de
     * datos (hacer consultas, insertar datos, modificar saldos, etc.).
     *
     * @return Un objeto EntityManager operativo y conectado a la base de datos.
     */
    public static EntityManager getEntityManager() {
        // Creamos la fabrica (Factory) leyendo la configuración de nuestro archivo persistence.xml
        // el String que le pasamos es el nombre exacto de nuestra Unidad de Persistencia (Persistence Unit).
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.trabajoJDBC_Gestion_Bancaria_jar_1.0-SNAPSHOTPU");
        // 2. Le pedimos a la fábrica que nos construya un gestor de entidades (manager) para trabajar.
        EntityManager manager = factory.createEntityManager();
        return manager;
    }
}
