package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLInsert {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String strConn = "jdbc:mysql://localhost/poo2013";
            
            Connection conn = DriverManager.getConnection(strConn, "root", "");
            
            String sqlInsert = "INSERT INTO cliente (nome, endereco, sexo, cidade) VALUES(?,?,?,?)";
            
            PreparedStatement pStat = conn.prepareStatement(sqlInsert);

            pStat.setString(1, "Zezinho");
            pStat.setString(2, "Rua lalalala");
            pStat.setBoolean(3, true);
            pStat.setString(4, "Joinville");
            
            int numLinhas = pStat.executeUpdate();
            
            System.out.printf("NumLinhas: %d\n", numLinhas);
            
            conn.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
