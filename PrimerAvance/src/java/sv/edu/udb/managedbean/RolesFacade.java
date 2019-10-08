/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.managedbean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import sv.edu.udb.facade.RolesFacadeLocal;

/**
 *
 * @author neon
 */
@Named(value = "rolesFacade")
@SessionScoped
public class RolesFacade implements Serializable {

    @EJB
    private RolesFacadeLocal rolesFacade;

    /**
     * Creates a new instance of RolesFacade
     */
    public RolesFacade() {
    }
    
}
