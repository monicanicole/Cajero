/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cajerito.Controlador;

import cajerito.Modelo.Usuario;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Administrador
 */
public class Consulta_Usuario {
      Query consulta;
         public List<Usuario> listarUsuarios() {
        List<Usuario>usuarios;
        consulta =GestorDePersistencia.em.createQuery("SELECT u FROM Usuario u");
          usuarios= consulta.getResultList();
        return usuarios;

    }
            
    public Usuario obtenerUsuario() {
        List<Usuario> usuarios;
        consulta = GestorDePersistencia.em.createQuery("SELECT u FROM Usuario u");
        
        usuarios = consulta.getResultList();
        return usuarios.get(0);

    }
    
}
