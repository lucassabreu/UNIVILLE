package controlefinanceiro.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOFactory {
    private static DAOFactory instance;
    private Connection        connection;
    private String            connectionString = "jdbc:mysql://localhost/poo2013";
    private String            username         = "root";
    private String            password         = "";

    private DespesaReceitaDAO despesaReceitaDAO;

    public static DAOFactory getInstance() {
        if (instance == null)
            instance = new DAOFactory();
        return instance;
    }

    private DAOFactory() {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager
                            .getConnection(this.connectionString, this.username, this.password);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public DespesaReceitaDAO getDespesaReceitaDAO() {
        if (despesaReceitaDAO == null)
            this.despesaReceitaDAO = new DespesaReceitaDAO(getConnection());

        return despesaReceitaDAO;
    }
}
