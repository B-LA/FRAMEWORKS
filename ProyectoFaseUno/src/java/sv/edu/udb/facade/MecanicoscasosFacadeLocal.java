/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.facade;

import java.util.List;
import javax.ejb.Local;
import sv.edu.udb.entity.Mecanicoscasos;

/**
 *
 * @author neon
 */
@Local
public interface MecanicoscasosFacadeLocal {

    void create(Mecanicoscasos mecanicoscasos);

    void edit(Mecanicoscasos mecanicoscasos);

    void remove(Mecanicoscasos mecanicoscasos);

    Mecanicoscasos find(Object id);

    List<Mecanicoscasos> findAll();

    List<Mecanicoscasos> findRange(int[] range);

    int count();
    
}
