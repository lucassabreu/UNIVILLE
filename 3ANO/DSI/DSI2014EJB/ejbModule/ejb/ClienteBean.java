package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dao.Cliente;

/**
 * Session Bean implementation class ClienteBean
 */
@WebService
@Stateless
public class ClienteBean implements ClienteBeanRemote, ClienteBeanLocal {

    @PersistenceContext(name = "dsi2014context")
    private EntityManager em;

    /**
     * Default constructor.
     */
    public ClienteBean() {}

    @WebMethod
    public void save(Cliente cliente) {
        if (this.em.find(Cliente.class, cliente.getOid()) != null)
            this.em.persist(cliente); // INSERT
        else
            this.em.merge(cliente); // UPDATE
    }

    @SuppressWarnings("unchecked")
    @WebMethod
    public List<Cliente> getAllClientes() {
        Query q = this.em.createNativeQuery("getAllClientes", Cliente.class);
        return q.getResultList();
    }

    @WebMethod
    public Cliente getClienteByEnd(String ender) {
        Query q = this.em.createNativeQuery("getClienteByEnd", Cliente.class);
        q.setParameter("ender", ender);
        q.setMaxResults(1);
        return (Cliente) q.getSingleResult();
    }
}
