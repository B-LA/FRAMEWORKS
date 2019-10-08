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
import sv.edu.udb.entity.Cliente;
import sv.edu.udb.facade.ClienteFacadeLocal;

/**
 *
 * @author neon
 */
@Named(value = "clienteBean")
@SessionScoped
public class ClienteBean implements Serializable {

    private Cliente cli;
    @EJB
    private ClienteFacadeLocal clienteFacade;

    /**
     * Creates a new instance of ClienteBean
     */
    
    public ClienteBean() {
        this.cli = new Cliente();
    }
    
    /*********************************************************************************************************************/
    
    public void createClient(){
    clienteFacade.create(cli);
    }
    
    public List<Cliente> findAll(){
    return clienteFacade.findAll();
    }
    
    public void geleteClient(){
    clienteFacade.remove(cli);
    }
    
    public Cliente getClient(){
    return clienteFacade.find(this.cli.getIdCliente());
    }
    
    public void modifyClient(){
    clienteFacade.edit(cli);
    }

    /*********************************************************************************************************************/
    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }
    
}
