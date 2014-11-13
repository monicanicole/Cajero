/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cajerito.Controlador;

import cajerito.Modelo.Cuenta;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Administrador
 */
public class Consulta_Cuenta {
    
      Query consulta;
      
         public List<Cuenta> listarCuentas() {
        List<Cuenta>cuentas;
        consulta =GestorDePersistencia.em.createQuery("SELECT c FROM Cuenta c");
          cuentas= consulta.getResultList();
        return cuentas;

        }
          public Cuenta obtenerCuenta() {
        List<Cuenta> cuentas;
        consulta = GestorDePersistencia.em.createQuery("SELECT c FROM Cuenta c");
        
        cuentas = consulta.getResultList();
        return cuentas.get(0);

    }
}
