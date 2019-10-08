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

    private Bitacora bi;
    @EJB
    private BitacoraFacadeLocal bitacoraFacade;

    /**
     * Creates a new instance of BitacoraBean
     */
    public BitacoraBean() {
        this.bi = new Bitacora();
    }
    
    public void create(){
    bitacoraFacade.create(bi);
    }
    
    public void delete(){
    bitacoraFacade.remove(bi);
    }
    
    public Bitacora find(){
    return bitacoraFacade.find(this.bi.getIdBitacora());
    }
    
    public List<Bitacora> findAll(){
    return bitacoraFacade.findAll();
    }

    public Bitacora getBi() {
        return bi;
    }

    public void setBi(Bitacora bi) {
        this.bi = bi;
    }
}
