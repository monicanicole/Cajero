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
public class CuentaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "idCuenta")
    private int idCuenta;
    @Basic(optional = false)
    @Column(name = "Usuario_idUsuario")
    private int usuarioidUsuario;

    public CuentaPK() {
    }

    public CuentaPK(int idCuenta, int usuarioidUsuario) {
        this.idCuenta = idCuenta;
        this.usuarioidUsuario = usuarioidUsuario;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public int getUsuarioidUsuario() {
        return usuarioidUsuario;
    }

    public void setUsuarioidUsuario(int usuarioidUsuario) {
        this.usuarioidUsuario = usuarioidUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCuenta;
        hash += (int) usuarioidUsuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentaPK)) {
            return false;
        }
        CuentaPK other = (CuentaPK) object;
        if (this.idCuenta != other.idCuenta) {
            return false;
        }
        if (this.usuarioidUsuario != other.usuarioidUsuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cajerito.Modelo.CuentaPK[ idCuenta=" + idCuenta + ", usuarioidUsuario=" + usuarioidUsuario + " ]";
    }
    
}
