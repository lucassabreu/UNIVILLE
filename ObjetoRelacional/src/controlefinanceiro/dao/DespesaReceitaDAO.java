package controlefinanceiro.dao;

import java.sql.Connection;

public class DespesaReceitaDAO {
    private Connection connection;

    public DespesaReceitaDAO(Connection conn) {
        this.connection = conn;
    }
}
