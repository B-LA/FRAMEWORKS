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
    , @NamedQuery(name = "Bitacora.findByTituloBitacora", query = "SELECT b FROM Bitacora b WHERE b.tituloBitacora = :tituloBitacora")
    , @NamedQuery(name = "Bitacora.findByContenido", query = "SELECT b FROM Bitacora b WHERE b.contenido = :contenido")
    , @NamedQuery(name = "Bitacora.findByPorcentaje", query = "SELECT b FROM Bitacora b WHERE b.porcentaje = :porcentaje")
    , @NamedQuery(name = "Bitacora.findByImg", query = "SELECT b FROM Bitacora b WHERE b.img = :img")})
public class Bitacora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_bitacora")
    private Integer idBitacora;
    private String tituloBitacora;
    private String contenido;
    private Integer porcentaje;
    private String img;
    @JoinColumn(name = "ID_Asignacion", referencedColumnName = "ID_Asignacion")
    @ManyToOne
    private Mecanicoscasos iDAsignacion;

    public Bitacora() {
    }

    public Bitacora(Integer idBitacora) {
        this.idBitacora = idBitacora;
    }

    public Integer getIdBitacora() {
        return idBitacora;
    }

    public void setIdBitacora(Integer idBitacora) {
        this.idBitacora = idBitacora;
    }

    public String getTituloBitacora() {
        return tituloBitacora;
    }

    public void setTituloBitacora(String tituloBitacora) {
        this.tituloBitacora = tituloBitacora;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Mecanicoscasos getIDAsignacion() {
        return iDAsignacion;
    }

    public void setIDAsignacion(Mecanicoscasos iDAsignacion) {
        this.iDAsignacion = iDAsignacion;
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
