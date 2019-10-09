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
import sv.edu.udb.entity.Mecanicoscasos;
import sv.edu.udb.facade.MecanicoscasosFacadeLocal;

/**
 *
 * @author neon
 */
@Named(value = "mecanicosBean")
@SessionScoped
public class MecanicosBean implements Serializable {

    @EJB
    private MecanicoscasosFacadeLocal mecanicoscasosFacade;

    private Mecanicoscasos mc;
    
    /**
     * Creates a new instance of MecanicosBean
     */
    public MecanicosBean() {
        this.mc = new Mecanicoscasos();
    }
    
    public void create(){
        mecanicoscasosFacade.create(mc);
    }
    
    public void edit(){
        mecanicoscasosFacade.edit(mc);
    }
    
    public void delete(){
        mecanicoscasosFacade.remove(mc);
    }
    
    public Mecanicoscasos findMc(){
        return mecanicoscasosFacade.find(this.mc.getIDAsignacion());
    }
    
    public List<Mecanicoscasos> findAll(){
        return mecanicoscasosFacade.findAll();
    }

    public Mecanicoscasos getMc() {
        return mc;
    }

    public void setMc(Mecanicoscasos mc) {
        this.mc = mc;
    }
    
}
