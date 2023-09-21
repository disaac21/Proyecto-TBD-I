/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static newproject.MainFrame.password;
import static newproject.MainFrame.url;
import static newproject.MainFrame.user;

/**
 *
 * @author danie
 */
public class Eliminar {
    
    static Connection connection;
    static Statement statement;

    
    public static void eliminarVENDEDOR(int id){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
//            e.printStackTrace();
            System.out.println("error en class.forname");
        }

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            
            statement.executeQuery("call DeleteVendedor("+id+"\')");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("algo pasa en el insert");
        }
    }
    
    public static void eliminarPRODUCTO(int upc){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
//            e.printStackTrace();
            System.out.println("error en class.forname");
        }

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            statement.executeQuery("call DeleteProducto("+upc+"\')");
            //statement.executeQuery("call CrearInventario("+tienda_id+", \'"+producto_codigoUPC+"\', "+precio+", "+cantidad+", "+reorden+")");
            //statement.executeUpdate("INSERT INTO PRODUCTO VALUES(" + upc + ",\'" + nombre + "\',\'" + tamano + "\',\'" + embalaje + "\', \' " + marca + " \')");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("algo pasa en el insert");
        }
    }
    
    public static void eliminarFACTURA(int numero){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
//            e.printStackTrace();
            System.out.println("error en class.forname");
        }

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            statement.executeQuery("call DeleteFactura("+numero+"\')");
            //statement.executeUpdate("INSERT INTO FACTURA VALUES(" + numero + ",\'" + fecha + "\'," + isv + ","+subtotal+","+total+","+clienteid+","+tiendaid+" )");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("algo pasa en el insert");
        }
    }
    
    public static void eliminarCLIENTE(int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
//            e.printStackTrace();
            System.out.println("error en class.forname");
        }

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            statement.executeUpdate("CALL DeleteCliente("+id+"\')");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("algo pasa en el insert");
        }
    }
    
    public static void eliminarTIENDA(int id) {

//        System.out.println("url: " + url);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
//            e.printStackTrace();
            System.out.println("error en class.forname");
        }

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            statement.executeQuery("call DeleteTienda("+ id +"\')");
            //statement.executeUpdate("INSERT INTO TIENDA VALUES(" + id + ", \'" + nombre + "\', \'" + horario + "\')");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("algo pasa en el insert");
        }
    }
    
}
