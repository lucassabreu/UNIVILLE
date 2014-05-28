package ejb;

import java.util.List;

import javax.ejb.Remote;

import dao.Cliente;

@Remote
public interface ClienteBeanRemote {

    public void save(Cliente cliente);

    public List<Cliente> getAllClientes();

    public Cliente getClienteByEnd(String ender);
}
