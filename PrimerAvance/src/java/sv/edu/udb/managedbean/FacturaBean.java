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
import sv.edu.udb.entity.Factura;
import sv.edu.udb.facade.FacturaFacadeLocal;

/**
 *
 * @author neon
 */
@Named(value = "facturaBeann")
@SessionScoped
public class FacturaBean implements Serializable {

    private Factura fac;
    @EJB
    private FacturaFacadeLocal facturaFacade;

    /**
     * Creates a new instance of FacturaBeann
     */
    public FacturaBean() {
        this.fac = new Factura();
    }
    
    
    public void create(){
        facturaFacade.create(fac);
    }
    
    public void detele(){
    facturaFacade.remove(fac);
    }
    
    public Factura get(){
    return facturaFacade.find(this.fac.getIdFactura());
    }
    
    public List<Factura> findId(){
    return facturaFacade.findAll();
    }

    public Factura getFac() {
        return fac;
    }

    public void setFac(Factura fac) {
        this.fac = fac;
    }
}
