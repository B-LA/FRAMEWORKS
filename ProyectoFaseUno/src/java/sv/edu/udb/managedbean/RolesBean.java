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
import sv.edu.udb.entity.Roles;
import sv.edu.udb.facade.RolesFacadeLocal;

/**
 *
 * @author neon
 */
@Named(value = "rolesBean")
@SessionScoped
public class RolesBean implements Serializable {

    @EJB
    private RolesFacadeLocal rolesFacade;

    Roles rol;
    
    /**
     * Creates a new instance of RolesBean
     */
    public RolesBean() {
        this.rol =  new Roles();
    }
    
    public void create(){
        rolesFacade.create(rol);
    }
    
    public void delete(){
        rolesFacade.remove(rol);
    }
    
    public void edit(){
        rolesFacade.edit(rol);
    }
    
    public Roles findRol(){
        return rolesFacade.find(this.rol.getIdRol());
    }
    
    public List<Roles> findAll(){
        return rolesFacade.findAll();
    }
    
}
