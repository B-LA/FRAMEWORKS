/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.facade;

import java.util.List;
import javax.ejb.Local;
import sv.edu.udb.entity.Peticion;

/**
 *
 * @author neon
 */
@Local
public interface PeticionFacadeLocal {

    void create(Peticion peticion);

    void edit(Peticion peticion);

    void remove(Peticion peticion);

    Peticion find(Object id);

    List<Peticion> findAll();

    List<Peticion> findRange(int[] range);

    int count();
    
}