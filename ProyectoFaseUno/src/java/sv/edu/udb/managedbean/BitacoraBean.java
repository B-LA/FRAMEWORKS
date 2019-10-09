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
import sv.edu.udb.entity.Bitacora;
import sv.edu.udb.facade.BitacoraFacadeLocal;

/**
 *
 * @author neon
 */
@Named(value = "bitacoraBean")
@SessionScoped
public class BitacoraBean implements Serializable {

    @EJB
    private BitacoraFacadeLocal bitacoraFacade;

    Bitacora bi;
    
    /**
     * Creates a new instance of BitacoraBean
     */
    public BitacoraBean() {
        this.bi = new Bitacora();
    }
    
    public void create(){
        bitacoraFacade.create(bi);
    }
    
    public void edit(){
        bitacoraFacade.edit(bi);
    }
    
    public void delete(){
        bitacoraFacade.remove(bi);
    }
    
    public Bitacora getBi(){
        return bitacoraFacade.find(this.bi.getIdBitacora());
    }
    
    public List<Bitacora> findAll(){
        return bitacoraFacade.findAll();
    }
    
}
