/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.edu.udb.entity.Mecanicoscasos;

/**
 *
 * @author neon
 */
@Stateless
public class MecanicoscasosFacade extends AbstractFacade<Mecanicoscasos> implements MecanicoscasosFacadeLocal {

    @PersistenceContext(unitName = "ProyectoFaseUnoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MecanicoscasosFacade() {
        super(Mecanicoscasos.class);
    }
    
}
