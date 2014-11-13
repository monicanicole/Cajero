/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cajerito.Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "transaccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaccion.findAll", query = "SELECT t FROM Transaccion t"),
    @NamedQuery(name = "Transaccion.findByIdTransaccion", query = "SELECT t FROM Transaccion t WHERE t.transaccionPK.idTransaccion = :idTransaccion"),
    @NamedQuery(name = "Transaccion.findByTipo", query = "SELECT t FROM Transaccion t WHERE t.tipo = :tipo"),
    @NamedQuery(name = "Transaccion.findByFecha", query = "SELECT t FROM Transaccion t WHERE t.fecha = :fecha"),
    @NamedQuery(name = "Transaccion.findByCuentaidCuenta", query = "SELECT t FROM Transaccion t WHERE t.transaccionPK.cuentaidCuenta = :cuentaidCuenta"),
    @NamedQuery(name = "Transaccion.findByCuentaUsuarioidUsuario", query = "SELECT t FROM Transaccion t WHERE t.transaccionPK.cuentaUsuarioidUsuario = :cuentaUsuarioidUsuario")})
public class Transaccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TransaccionPK transaccionPK;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "fecha")
    private String fecha;
    @JoinColumns({
        @JoinColumn(name = "Cuenta_idCuenta", referencedColumnName = "idCuenta", insertable = false, updatable = false),
        @JoinColumn(name = "Cuenta_Usuario_idUsuario", referencedColumnName = "Usuario_idUsuario", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Cuenta cuenta;

    public Transaccion() {
    }

    public Transaccion(TransaccionPK transaccionPK) {
        this.transaccionPK = transaccionPK;
    }

    public Transaccion(TransaccionPK transaccionPK, String tipo, String fecha) {
        this.transaccionPK = transaccionPK;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public Transaccion(int idTransaccion, int cuentaidCuenta, int cuentaUsuarioidUsuario) {
        this.transaccionPK = new TransaccionPK(idTransaccion, cuentaidCuenta, cuentaUsuarioidUsuario);
    }

    public TransaccionPK getTransaccionPK() {
        return transaccionPK;
    }

    public void setTransaccionPK(TransaccionPK transaccionPK) {
        this.transaccionPK = transaccionPK;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transaccionPK != null ? transaccionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaccion)) {
            return false;
        }
        Transaccion other = (Transaccion) object;
        if ((this.transaccionPK == null && other.transaccionPK != null) || (this.transaccionPK != null && !this.transaccionPK.equals(other.transaccionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cajerito.Modelo.Transaccion[ transaccionPK=" + transaccionPK + " ]";
    }
    
}
