/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.managedbean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sv.edu.udb.entity.Reparacion;
import sv.edu.udb.facade.ReparacionFacadeLocal;

/**
 *
 * @author neon
 */
@Named(value = "reparacionBean")
@SessionScoped
public class ReparacionBean implements Serializable {

    Reparacion rep;
    @EJB
    private ReparacionFacadeLocal reparacionFacade;

    /**
     * Creates a new instance of ReparacionBean
     */
    public ReparacionBean() {
        this.rep = new Reparacion();
    }
    
    public void create(){
        reparacionFacade.create(rep);
    }
    
    public void delete(){
        reparacionFacade.remove(rep);
    }
    
    public void modificar(){
        reparacionFacade.edit(rep);
    }
    
    public Reparacion get(){
        return reparacionFacade.find(this.rep.getIdPeticion());
    }
    
    public List<Reparacion> findAll(){
        return reparacionFacade.findAll();
    }
}
