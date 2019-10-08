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
import javax.persistence.CascadeType;
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
    @NamedQuery(name = "Peticion.findAll", query = "SELECT p FROM Peticion p")
    , @NamedQuery(name = "Peticion.findByIdPeticion", query = "SELECT p FROM Peticion p WHERE p.idPeticion = :idPeticion")
    , @NamedQuery(name = "Peticion.findByIdCliente", query = "SELECT p FROM Peticion p WHERE p.idCliente = :idCliente")
    , @NamedQuery(name = "Peticion.findByIdCarro", query = "SELECT p FROM Peticion p WHERE p.idCarro = :idCarro")
    , @NamedQuery(name = "Peticion.findByIdTecnico", query = "SELECT p FROM Peticion p WHERE p.idTecnico = :idTecnico")
    , @NamedQuery(name = "Peticion.findByIdEstado", query = "SELECT p FROM Peticion p WHERE p.idEstado = :idEstado")
    , @NamedQuery(name = "Peticion.findByDescripcion", query = "SELECT p FROM Peticion p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Peticion.findByFecha", query = "SELECT p FROM Peticion p WHERE p.fecha = :fecha")})
public class Peticion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_peticion")
    private Integer idPeticion;
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private int idCliente;
    @Basic(optional = false)
    @Column(name = "id_carro")
    private int idCarro;
    @Basic(optional = false)
    @Column(name = "id_tecnico")
    private int idTecnico;
    @Basic(optional = false)
    @Column(name = "id_estado")
    private int idEstado;
    @Basic(optional = false)
    private String descripcion;
    @Basic(optional = false)
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeticion")
    private Collection<Bitacora> bitacoraCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeticion")
    private Collection<Reparacion> reparacionCollection;

    public Peticion() {
    }

    public Peticion(Integer idPeticion) {
        this.idPeticion = idPeticion;
    }

    public Peticion(Integer idPeticion, int idCliente, int idCarro, int idTecnico, int idEstado, String descripcion, Date fecha) {
        this.idPeticion = idPeticion;
        this.idCliente = idCliente;
        this.idCarro = idCarro;
        this.idTecnico = idTecnico;
        this.idEstado = idEstado;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Integer getIdPeticion() {
        return idPeticion;
    }

    public void setIdPeticion(Integer idPeticion) {
        this.idPeticion = idPeticion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public int getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Collection<Bitacora> getBitacoraCollection() {
        return bitacoraCollection;
    }

    public void setBitacoraCollection(Collection<Bitacora> bitacoraCollection) {
        this.bitacoraCollection = bitacoraCollection;
    }

    public Collection<Reparacion> getReparacionCollection() {
        return reparacionCollection;
    }

    public void setReparacionCollection(Collection<Reparacion> reparacionCollection) {
        this.reparacionCollection = reparacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPeticion != null ? idPeticion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peticion)) {
            return false;
        }
        Peticion other = (Peticion) object;
        if ((this.idPeticion == null && other.idPeticion != null) || (this.idPeticion != null && !this.idPeticion.equals(other.idPeticion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.udb.entity.Peticion[ idPeticion=" + idPeticion + " ]";
    }
    
}
