/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.edu.udb.entity.Reparacion;

/**
 *
 * @author neon
 */
@Stateless
public class ReparacionFacade extends AbstractFacade<Reparacion> implements ReparacionFacadeLocal {

    @PersistenceContext(unitName = "PrimerAvancePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReparacionFacade() {
        super(Reparacion.class);
    }
    
}
