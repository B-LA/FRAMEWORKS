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
import sv.edu.udb.entity.Carro;
import sv.edu.udb.facade.CarroFacadeLocal;

/**
 *
 * @author neon
 */
@Named(value = "carroBean")
@SessionScoped
public class CarroBean implements Serializable {

    private Carro car;
    @EJB
    private CarroFacadeLocal carroFacade;
    
    /**
     * Creates a new instance of CarroBean
     */
    public CarroBean() {
        this.car = new Carro();
    }
    
    public void create(){
    carroFacade.create(car);
    }
    
    public void delete(){
    carroFacade.remove(car);
    }
    
    public Carro find(){
    return carroFacade.find(this.car.getIdCarro());
    }
    
    public List<Carro> findAll(){
    return carroFacade.findAll();
    }

    public Carro getCar() {
        return car;
    }

    public void setCar(Carro car) {
        this.car = car;
    }
}
