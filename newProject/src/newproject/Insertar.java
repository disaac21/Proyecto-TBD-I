package newproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static newproject.MainFrame.password;
import static newproject.MainFrame.url;
import static newproject.MainFrame.user;

public class Insertar {

    static Connection connection;
    static Statement statement;
//    static ResultSet rs;

    public static void insercionVENDEDOR(int id,String nombre){
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
            statement.executeUpdate(
                "INSERT INTO VENDEDOR VALUES(" + id + ", \'" + nombre + "\')");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("algo pasa en el insert");
        }
    }

    public static void insercionPRODUCTO(int upc, String nombre, String tamano, String embalaje, String marca){
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
            statement.executeUpdate("INSERT INTO PRODUCTO VALUES(" + upc + ",\'" + nombre + "\',\'" + tamano + "\',\'" + embalaje + "\', \' " + marca + " \')");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("algo pasa en el insert");
        }
    }
    
    public static void insercionFACTURA(int numero,String fecha,double isv,double subtotal,double total,int clienteid,int tiendaid){
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
            statement.executeUpdate("INSERT INTO FACTURA VALUES(" + numero + ",\'" + fecha + "\'," + isv + ","+subtotal+","+total+","+clienteid+","+tiendaid+" )");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("algo pasa en el insert");
        }
    }

    public static void insercionCLIENTE(int id, String nombre, String correo) {
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
            statement.executeUpdate("INSERT INTO CLIENTE VALUES(" + id + ", \'" + nombre + "\', \'" + correo + "\')");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("algo pasa en el insert");
        }
    }

    public static void insercionTIENDA(int id, String nombre, String horario) {

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
            statement.executeUpdate("INSERT INTO TIENDA VALUES(" + id + ", \'" + nombre + "\', \'" + horario + "\')");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("algo pasa en el insert");
        }
    }
}
