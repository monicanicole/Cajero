/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cajerito.Controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Administrador
 */
public class GestorDePersistencia {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("CajeritoPU");
    public static final EntityManager em = emf.createEntityManager();
    public static final EntityTransaction et = em.getTransaction();

}
