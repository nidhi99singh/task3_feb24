/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;
import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class connection {
        PreparedStatement stmt;
        Connection con=null;
        public final String url="jdbc:mysql://localhost:3306/iot83";
        public final String username="root";
        public final String Password="nidhi@091296";
    public Connection getConnection()
        {
                return con;
        }
    public boolean Createcon() throws SQLException {
        con=DriverManager.getConnection(url,username,Password);
            return con!=null;
    }
}
