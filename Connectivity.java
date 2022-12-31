/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Connectivity {
        public Connection connection;
    public Connection getConnection(){
        String dbName="java";
        String username="root";
        String password="";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,username,password);
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return connection;
    }
}
