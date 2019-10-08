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
import sv.edu.udb.entity.Estado;
import sv.edu.udb.facade.EstadoFacadeLocal;

/**
 *
 * @author neon
 */
@Named(value = "estadoBean")
@SessionScoped
public class EstadoBean implements Serializable {

    Estado est;
    @EJB
    private EstadoFacadeLocal estadoFacade;

    /**
     * Creates a new instance of EstadoBean
     */
    public EstadoBean() {
        this.est = new Estado();
    }
    
    public void create(){
    estadoFacade.create(est);
    }
    
    public void delete(){
    estadoFacade.remove(est);
    }
    
    public Estado getEstado(){
    return estadoFacade.find(this.est.getIdEstado());
    }
    
    public List<Estado> findAll(){
    return estadoFacade.findAll();
    }
    
}
