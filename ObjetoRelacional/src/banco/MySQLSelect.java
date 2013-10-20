package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLSelect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String strConn = "jdbc:mysql://localhost/poo2013";

            Connection conn = DriverManager.getConnection(strConn, "root", "");

            String sqlInsert = "SELECT codigo, nome, endereco, sexo, cidade FROM cliente";

            PreparedStatement pStat = conn.prepareStatement(sqlInsert);

            ResultSet resultSet = pStat.executeQuery();

            while (resultSet.next()) {

                System.out.println(String.format("%d, %s, %s, %s, %s", 
                                resultSet.getInt(1),
                                resultSet.getString(2),
                                resultSet.getString(3),
                                resultSet.getBoolean(4) ? "Masculino" : "Feminino",
                                resultSet.getString(5)));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
