/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cajerito.Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Administrador
 */
@Embeddable
public class TransaccionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "idTransaccion")
    private int idTransaccion;
    @Basic(optional = false)
    @Column(name = "Cuenta_idCuenta")
    private int cuentaidCuenta;
    @Basic(optional = false)
    @Column(name = "Cuenta_Usuario_idUsuario")
    private int cuentaUsuarioidUsuario;

    public TransaccionPK() {
    }

    public TransaccionPK(int idTransaccion, int cuentaidCuenta, int cuentaUsuarioidUsuario) {
        this.idTransaccion = idTransaccion;
        this.cuentaidCuenta = cuentaidCuenta;
        this.cuentaUsuarioidUsuario = cuentaUsuarioidUsuario;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public int getCuentaidCuenta() {
        return cuentaidCuenta;
    }

    public void setCuentaidCuenta(int cuentaidCuenta) {
        this.cuentaidCuenta = cuentaidCuenta;
    }

    public int getCuentaUsuarioidUsuario() {
        return cuentaUsuarioidUsuario;
    }

    public void setCuentaUsuarioidUsuario(int cuentaUsuarioidUsuario) {
        this.cuentaUsuarioidUsuario = cuentaUsuarioidUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idTransaccion;
        hash += (int) cuentaidCuenta;
        hash += (int) cuentaUsuarioidUsuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransaccionPK)) {
            return false;
        }
        TransaccionPK other = (TransaccionPK) object;
        if (this.idTransaccion != other.idTransaccion) {
            return false;
        }
        if (this.cuentaidCuenta != other.cuentaidCuenta) {
            return false;
        }
        if (this.cuentaUsuarioidUsuario != other.cuentaUsuarioidUsuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cajerito.Modelo.TransaccionPK[ idTransaccion=" + idTransaccion + ", cuentaidCuenta=" + cuentaidCuenta + ", cuentaUsuarioidUsuario=" + cuentaUsuarioidUsuario + " ]";
    }
    
}
