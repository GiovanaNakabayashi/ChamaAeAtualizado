
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/chamaae";
        String user = "root";
        String password = "Joao@010224";

        return DriverManager.getConnection(url, user, password);
    }
    
}  

