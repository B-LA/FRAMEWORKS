/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author neon
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Admroot.findAll", query = "SELECT a FROM Admroot a")
    , @NamedQuery(name = "Admroot.findByIdRoot", query = "SELECT a FROM Admroot a WHERE a.idRoot = :idRoot")
    , @NamedQuery(name = "Admroot.findByUsuario", query = "SELECT a FROM Admroot a WHERE a.usuario = :usuario")
    , @NamedQuery(name = "Admroot.findByContrase\u00f1a", query = "SELECT a FROM Admroot a WHERE a.contrase\u00f1a = :contrase\u00f1a")})
public class Admroot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_root")
    private Integer idRoot;
    @Basic(optional = false)
    private String usuario;
    @Basic(optional = false)
    private String contraseña;

    public Admroot() {
    }

    public Admroot(Integer idRoot) {
        this.idRoot = idRoot;
    }

    public Admroot(Integer idRoot, String usuario, String contraseña) {
        this.idRoot = idRoot;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Integer getIdRoot() {
        return idRoot;
    }

    public void setIdRoot(Integer idRoot) {
        this.idRoot = idRoot;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRoot != null ? idRoot.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admroot)) {
            return false;
        }
        Admroot other = (Admroot) object;
        if ((this.idRoot == null && other.idRoot != null) || (this.idRoot != null && !this.idRoot.equals(other.idRoot))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.udb.entity.Admroot[ idRoot=" + idRoot + " ]";
    }
    
}
