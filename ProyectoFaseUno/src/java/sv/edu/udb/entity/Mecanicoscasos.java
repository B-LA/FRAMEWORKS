/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author neon
 */
@Entity
@Table(name = "Mecanicos_casos")
@NamedQueries({
    @NamedQuery(name = "Mecanicoscasos.findAll", query = "SELECT m FROM Mecanicoscasos m")
    , @NamedQuery(name = "Mecanicoscasos.findByIDAsignacion", query = "SELECT m FROM Mecanicoscasos m WHERE m.iDAsignacion = :iDAsignacion")})
public class Mecanicoscasos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Asignacion")
    private Integer iDAsignacion;
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    @ManyToOne
    private Usuarios idUser;
    @JoinColumn(name = "id_caso", referencedColumnName = "id_caso")
    @ManyToOne
    private Casos idCaso;
    @OneToMany(mappedBy = "iDAsignacion")
    private Collection<Bitacora> bitacoraCollection;

    public Mecanicoscasos() {
    }

    public Mecanicoscasos(Integer iDAsignacion) {
        this.iDAsignacion = iDAsignacion;
    }

    public Integer getIDAsignacion() {
        return iDAsignacion;
    }

    public void setIDAsignacion(Integer iDAsignacion) {
        this.iDAsignacion = iDAsignacion;
    }

    public Usuarios getIdUser() {
        return idUser;
    }

    public void setIdUser(Usuarios idUser) {
        this.idUser = idUser;
    }

    public Casos getIdCaso() {
        return idCaso;
    }

    public void setIdCaso(Casos idCaso) {
        this.idCaso = idCaso;
    }

    public Collection<Bitacora> getBitacoraCollection() {
        return bitacoraCollection;
    }

    public void setBitacoraCollection(Collection<Bitacora> bitacoraCollection) {
        this.bitacoraCollection = bitacoraCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDAsignacion != null ? iDAsignacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mecanicoscasos)) {
            return false;
        }
        Mecanicoscasos other = (Mecanicoscasos) object;
        if ((this.iDAsignacion == null && other.iDAsignacion != null) || (this.iDAsignacion != null && !this.iDAsignacion.equals(other.iDAsignacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.udb.entity.Mecanicoscasos[ iDAsignacion=" + iDAsignacion + " ]";
    }
    
}
