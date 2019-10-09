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
import sv.edu.udb.entity.Usuarios;
import sv.edu.udb.facade.UsuariosFacadeLocal;

/**
 *
 * @author neon
 */
@Named(value = "usuariosBean")
@SessionScoped
public class UsuariosBean implements Serializable {

    @EJB
    private UsuariosFacadeLocal usuariosFacade;

    private Usuarios usr;
    
    /**
     * Creates a new instance of UsuariosBean
     */
    public UsuariosBean() {
        this.usr = new Usuarios();
    }
    
    public void create(){
    usuariosFacade.create(usr);
    }
    
    public void delete(){
    usuariosFacade.remove(usr);
    }
    
    public void edit(){
        usuariosFacade.edit(usr);
    }
    
    public Usuarios findUsr(){
       return usuariosFacade.find(this.usr.getIdUser());
    }
    
    public List<Usuarios> findAll(){
        return usuariosFacade.findAll();
    }

    public Usuarios getUsr() {
        return usr;
    }

    public void setUsr(Usuarios usr) {
        this.usr = usr;
    }
    
}
