/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.facade;

import java.util.List;
import javax.ejb.Local;
import sv.edu.udb.entity.Casos;

/**
 *
 * @author neon
 */
@Local
public interface CasosFacadeLocal {

    void create(Casos casos);

    void edit(Casos casos);

    void remove(Casos casos);

    Casos find(Object id);

    List<Casos> findAll();

    List<Casos> findRange(int[] range);

    int count();
    
}
