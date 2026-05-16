/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajojdbc.gestion_bancaria.repository;

import com.trabajojdbc.gestion_bancaria.Cuenta;
import com.trabajojdbc.gestion_bancaria.EntityManagerUtil;
import com.trabajojdbc.gestion_bancaria.Transacciones;
import com.trabajojdbc.gestion_bancaria.Usuario;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author jc324
 */
public class BancoRepository {

    private BancoRepository() {
    }

    ;
    
    public static Integer obtenerIdUsuarioPorDni(EntityManager em, String dniABuscar) {
        try {
            Usuario usuarioEncontrado = em.createNamedQuery("Usuario.findByDni", Usuario.class)
                    .setParameter("dni", dniABuscar)
                    .getSingleResult();
            return usuarioEncontrado.getId();

        } catch (Exception e) {
            return null;
        }
    }

    public static Cuenta buscarCuentaPorNumero(EntityManager em, int numeroBuscar) {
        try {
            return em.createNamedQuery("Cuenta.findByNumero", Cuenta.class)
                    .setParameter("numero", numeroBuscar)
                    .getSingleResult();

        } catch (Exception e) {
            return null;
        }
    }

    public static List<Transacciones> obtenerUltimosMovimientos(int cuentaId) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            return em.createQuery(
                    "SELECT t FROM Transacciones t WHERE t.cuentaEmisor.id = :miId OR t.cuentaReceptor.id = :miId ORDER BY t.id DESC",
                    Transacciones.class)
                    .setParameter("miId", cuentaId)
                    .setMaxResults(5)
                    .getResultList();
        } catch (Exception e) {
            return Collections.emptyList();
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }
}
