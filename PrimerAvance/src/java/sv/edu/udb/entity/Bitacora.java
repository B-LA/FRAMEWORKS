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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author neon
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Bitacora.findAll", query = "SELECT b FROM Bitacora b")
    , @NamedQuery(name = "Bitacora.findByIdBitacora", query = "SELECT b FROM Bitacora b WHERE b.idBitacora = :idBitacora")
    , @NamedQuery(name = "Bitacora.findByIdTecnico", query = "SELECT b FROM Bitacora b WHERE b.idTecnico = :idTecnico")
    , @NamedQuery(name = "Bitacora.findByAvance", query = "SELECT b FROM Bitacora b WHERE b.avance = :avance")
    , @NamedQuery(name = "Bitacora.findByDescripcion", query = "SELECT b FROM Bitacora b WHERE b.descripcion = :descripcion")
    , @NamedQuery(name = "Bitacora.findByFoto", query = "SELECT b FROM Bitacora b WHERE b.foto = :foto")})
public class Bitacora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_bitacora")
    private Integer idBitacora;
    @Basic(optional = false)
    @Column(name = "id_tecnico")
    private int idTecnico;
    @Basic(optional = false)
    private double avance;
    @Basic(optional = false)
    private String descripcion;
    @Basic(optional = false)
    private String foto;
    @JoinColumn(name = "id_peticion", referencedColumnName = "id_peticion")
    @ManyToOne(optional = false)
    private Peticion idPeticion;

    public Bitacora() {
    }

    public Bitacora(Integer idBitacora) {
        this.idBitacora = idBitacora;
    }

    public Bitacora(Integer idBitacora, int idTecnico, double avance, String descripcion, String foto) {
        this.idBitacora = idBitacora;
        this.idTecnico = idTecnico;
        this.avance = avance;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public Integer getIdBitacora() {
        return idBitacora;
    }

    public void setIdBitacora(Integer idBitacora) {
        this.idBitacora = idBitacora;
    }

    public int getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }

    public double getAvance() {
        return avance;
    }

    public void setAvance(double avance) {
        this.avance = avance;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Peticion getIdPeticion() {
        return idPeticion;
    }

    public void setIdPeticion(Peticion idPeticion) {
        this.idPeticion = idPeticion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBitacora != null ? idBitacora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bitacora)) {
            return false;
        }
        Bitacora other = (Bitacora) object;
        if ((this.idBitacora == null && other.idBitacora != null) || (this.idBitacora != null && !this.idBitacora.equals(other.idBitacora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.udb.entity.Bitacora[ idBitacora=" + idBitacora + " ]";
    }
    
}
