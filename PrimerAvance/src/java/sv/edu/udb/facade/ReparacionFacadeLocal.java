/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.facade;

import java.util.List;
import javax.ejb.Local;
import sv.edu.udb.entity.Reparacion;

/**
 *
 * @author neon
 */
@Local
public interface ReparacionFacadeLocal {

    void create(Reparacion reparacion);

    void edit(Reparacion reparacion);

    void remove(Reparacion reparacion);

    Reparacion find(Object id);

    List<Reparacion> findAll();

    List<Reparacion> findRange(int[] range);

    int count();
    
}
