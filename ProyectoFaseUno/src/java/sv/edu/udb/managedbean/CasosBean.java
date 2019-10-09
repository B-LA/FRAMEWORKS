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
import sv.edu.udb.entity.Casos;
import sv.edu.udb.facade.CasosFacadeLocal;

/**
 *
 * @author neon
 */
@Named(value = "casosBean")
@SessionScoped
public class CasosBean implements Serializable {

    @EJB
    private CasosFacadeLocal casosFacade;

    private Casos ca;
    
    /**
     * Creates a new instance of CasosBean
     */
    public CasosBean() {
        this.ca = new Casos();
    }
    
    public void create(){
        casosFacade.create(ca);
    }
    
    public void delete(){
        casosFacade.remove(ca);
    }
    
    public void edit(){
        casosFacade.edit(ca);
    }
    
    public Casos findCa(){
        return casosFacade.find(this.ca.getIdCaso());
    }
    
    public List<Casos> findAll(){
        return casosFacade.findAll();
    }

    public Casos getCa() {
        return ca;
    }

    public void setCa(Casos ca) {
        this.ca = ca;
    }
    
}
