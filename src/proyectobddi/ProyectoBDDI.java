/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobddi;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class ProyectoBDDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hola como estan");
        System.out.println("bien y vos");
        
        String user = "admin";
        String password = "DanielVictorSerlio";
        String url = "jdbc:mysql://proyecto.cv7itbwgfcgt.us-east-1.rds.amazonaws.com/proyecto";
        Connection connection;
        Statement statement;
        ResultSet rs;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("error en class.forname");
        }

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO CLIENTE VALUES(333, 'Prueba', 'Prueba@gmail.com')");
        } catch (SQLException ex) {
            Logger.getLogger(ProyectoBDDI.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("algo pas en el insert");
        }
        
        System.out.println("gadudm");
        
        
    }
    
}
