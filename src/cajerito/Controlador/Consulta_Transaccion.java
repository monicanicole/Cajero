/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cajerito.Controlador;

import cajerito.Modelo.Transaccion;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Administrador
 */
public class Consulta_Transaccion {
     Query consulta;
      
         public List<Transaccion> listarTransacciones() {
        List<Transaccion>transacciones;
        consulta =GestorDePersistencia.em.createQuery("SELECT t FROM Transaccion t");
          transacciones= consulta.getResultList();
        return transacciones;

        }
          public Transaccion obtenerTransaccion() {
        List<Transaccion> Transacciones;
        consulta = GestorDePersistencia.em.createQuery("SELECT t FROM Transaccion t");
        
        Transacciones = consulta.getResultList();
        return Transacciones.get(0);

    }
}
