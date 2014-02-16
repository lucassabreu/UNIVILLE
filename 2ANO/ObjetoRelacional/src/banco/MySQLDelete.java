package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLDelete {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String strConn = "jdbc:mysql://localhost/poo2013";
            
            Connection conn = DriverManager.getConnection(strConn, "root", "");
            
            String sqlDelete = "DELETE FROM cliente WHERE codigo = ?";
            
            PreparedStatement pStat = conn.prepareStatement(sqlDelete);
            pStat.setInt(1, 1);

            int numLinhas = pStat.executeUpdate();
            
            System.out.printf("NumLinhas: %d\n", numLinhas);
            
            conn.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
