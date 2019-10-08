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
import sv.edu.udb.entity.Empleado;
import sv.edu.udb.facade.EmpleadoFacadeLocal;

/**
 *
 * @author neon
 */
@Named(value = "empleadoBean")
@SessionScoped
public class EmpleadoBean implements Serializable {

    private Empleado emp;
    @EJB
    private EmpleadoFacadeLocal empleadoFacade;

    
    /**
     * Creates a new instance of EmpleadoBean
     */
    public EmpleadoBean() {
        this.emp = new Empleado();
    }
    
    public void create(){
    empleadoFacade.create(emp);
    }
    
    public void edit(){
    empleadoFacade.edit(emp);
    }
    
    public Empleado find(){
    return empleadoFacade.find(this.emp.getIdEmpleado());
    }
    
    public List<Empleado> findAll(){
    return empleadoFacade.findAll();
    }
    
    public void delete(){
        empleadoFacade.remove(emp);
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }

}
