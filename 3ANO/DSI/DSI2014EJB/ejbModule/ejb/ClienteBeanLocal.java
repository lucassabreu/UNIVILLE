package ejb;

import java.util.List;

import javax.ejb.Local;

import dao.Cliente;

@Local
public interface ClienteBeanLocal {

    public void save(Cliente cliente);

    public List<Cliente> getAllClientes();

    public Cliente getClienteByEnd(String ender);
}
