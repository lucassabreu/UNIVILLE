package test.main;

import util.ServerConnection;
import dao.Cliente;

public class TestMain {
    public static void main(String[] args) {
        Cliente c = new Cliente();

        c.setCodigo(Double.toString(Math.random()));
        c.setNome("Lucas dos Santos Abreu");
        c.setEndereco("Av Algum Lugar");

        ServerConnection.getInstance().getClienteBeanRemote().save(c);
    }
}
