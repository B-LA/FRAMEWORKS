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
import sv.edu.udb.entity.Peticion;
import sv.edu.udb.facade.PeticionFacadeLocal;

/**
 *
 * @author neon
 */
@Named(value = "peticionBean")
@SessionScoped
public class PeticionBean implements Serializable {

    private Peticion pet;
    @EJB
    private PeticionFacadeLocal peticionFacade;

    /**
     * Creates a new instance of PeticionBean
     */
    public PeticionBean() {
        this.pet = new Peticion();
    }
    
    public void create(){
        peticionFacade.create(pet);
    }
    
    public void delete(){
        peticionFacade.remove(pet);
    }
    
    public Peticion get(){
        return peticionFacade.find(this.pet.getIdPeticion());
    }
    
    public List<Peticion> findAll(){
        return peticionFacade.findAll();
    }

    public Peticion getPet() {
        return pet;
    }

    public void setPet(Peticion pet) {
        this.pet = pet;
    }
    
}
