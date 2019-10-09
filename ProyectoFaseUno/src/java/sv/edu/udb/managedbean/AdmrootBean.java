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
import sv.edu.udb.entity.Admroot;
import sv.edu.udb.facade.AdmrootFacadeLocal;

/**
 *
 * @author neon
 */
@Named(value = "admrootBean")
@SessionScoped
public class AdmrootBean implements Serializable {

    @EJB
    private AdmrootFacadeLocal admrootFacade;

    Admroot adm;
    
    /**
     * Creates a new instance of AdmrootBean
     */
    public AdmrootBean() {
        this.adm = new Admroot();
    }
    
    public void create(){
       admrootFacade.create(adm);
    }
    
    public void edit(){
        admrootFacade.edit(adm);
    }
    
    public void delete(){
        admrootFacade.remove(adm);
    }
    
    public Admroot getAdm(){
        return admrootFacade.find(this.adm.getIdRoot());
    }
    
    public List<Admroot> findAll(){
        return admrootFacade.findAll();
    }
    
}
