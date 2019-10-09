/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.facade;

import java.util.List;
import javax.ejb.Local;
import sv.edu.udb.entity.Admroot;

/**
 *
 * @author neon
 */
@Local
public interface AdmrootFacadeLocal {

    void create(Admroot admroot);

    void edit(Admroot admroot);

    void remove(Admroot admroot);

    Admroot find(Object id);

    List<Admroot> findAll();

    List<Admroot> findRange(int[] range);

    int count();
    
}
