package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLUpdate {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String strConn = "jdbc:mysql://localhost/poo2013";
            
            Connection conn = DriverManager.getConnection(strConn, "root", "");
            
            String sqlDelete = "UPDATE cliente "
                            + " SET nome = ?"
                            + " WHERE codigo = ?";
            
            PreparedStatement pStat = conn.prepareStatement(sqlDelete);
            pStat.setString(1, "Joãozinho");
            pStat.setInt(2, 2);

            int numLinhas = pStat.executeUpdate();
            
            System.out.printf("NumLinhas: %d\n", numLinhas);
            
            conn.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
