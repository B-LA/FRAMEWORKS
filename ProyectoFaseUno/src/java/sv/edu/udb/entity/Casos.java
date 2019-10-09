/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author neon
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Casos.findAll", query = "SELECT c FROM Casos c")
    , @NamedQuery(name = "Casos.findByIdCaso", query = "SELECT c FROM Casos c WHERE c.idCaso = :idCaso")
    , @NamedQuery(name = "Casos.findByMarca", query = "SELECT c FROM Casos c WHERE c.marca = :marca")
    , @NamedQuery(name = "Casos.findByModelo", query = "SELECT c FROM Casos c WHERE c.modelo = :modelo")
    , @NamedQuery(name = "Casos.findByPlaca", query = "SELECT c FROM Casos c WHERE c.placa = :placa")
    , @NamedQuery(name = "Casos.findByFechaEntrada", query = "SELECT c FROM Casos c WHERE c.fechaEntrada = :fechaEntrada")
    , @NamedQuery(name = "Casos.findByFechaSalida", query = "SELECT c FROM Casos c WHERE c.fechaSalida = :fechaSalida")
    , @NamedQuery(name = "Casos.findBySede", query = "SELECT c FROM Casos c WHERE c.sede = :sede")
    , @NamedQuery(name = "Casos.findByEstado", query = "SELECT c FROM Casos c WHERE c.estado = :estado")
    , @NamedQuery(name = "Casos.findByIDAsignacion", query = "SELECT c FROM Casos c WHERE c.iDAsignacion = :iDAsignacion")})
public class Casos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_caso")
    private Integer idCaso;
    @Basic(optional = false)
    private String marca;
    @Basic(optional = false)
    private String modelo;
    @Basic(optional = false)
    private String placa;
    @Basic(optional = false)
    @Column(name = "fecha_entrada")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrada;
    @Basic(optional = false)
    @Column(name = "fecha_salida")
    @Temporal(TemporalType.DATE)
    private Date fechaSalida;
    @Basic(optional = false)
    private String sede;
    @Basic(optional = false)
    private String estado;
    @Column(name = "ID_Asignacion")
    private Integer iDAsignacion;
    @OneToMany(mappedBy = "idCaso")
    private Collection<Mecanicoscasos> mecanicoscasosCollection;

    public Casos() {
    }

    public Casos(Integer idCaso) {
        this.idCaso = idCaso;
    }

    public Casos(Integer idCaso, String marca, String modelo, String placa, Date fechaEntrada, Date fechaSalida, String sede, String estado) {
        this.idCaso = idCaso;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.sede = sede;
        this.estado = estado;
    }

    public Integer getIdCaso() {
        return idCaso;
    }

    public void setIdCaso(Integer idCaso) {
        this.idCaso = idCaso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIDAsignacion() {
        return iDAsignacion;
    }

    public void setIDAsignacion(Integer iDAsignacion) {
        this.iDAsignacion = iDAsignacion;
    }

    public Collection<Mecanicoscasos> getMecanicoscasosCollection() {
        return mecanicoscasosCollection;
    }

    public void setMecanicoscasosCollection(Collection<Mecanicoscasos> mecanicoscasosCollection) {
        this.mecanicoscasosCollection = mecanicoscasosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCaso != null ? idCaso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Casos)) {
            return false;
        }
        Casos other = (Casos) object;
        if ((this.idCaso == null && other.idCaso != null) || (this.idCaso != null && !this.idCaso.equals(other.idCaso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.udb.entity.Casos[ idCaso=" + idCaso + " ]";
    }
    
}
