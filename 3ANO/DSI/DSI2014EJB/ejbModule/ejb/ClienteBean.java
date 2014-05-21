package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.Cliente;

/**
 * Session Bean implementation class ClienteBean
 */
@Stateless
public class ClienteBean implements ClienteBeanRemote, ClienteBeanLocal {

    @PersistenceContext(name = "dsi2014context")
    private EntityManager em;

    /**
     * Default constructor.
     */
    public ClienteBean() {}

    public void save(Cliente cliente) {
        if (em.find(Cliente.class, cliente.getOid()) != null)
            em.persist(cliente); // INSERT
        else
            em.merge(cliente); // UPDATE
    }
}
