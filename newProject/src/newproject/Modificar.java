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
public class Modificar {
    
    static Connection connection;
    static Statement statement;
    
    public static void modificarVENDEDOR(int id,String nombre){
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
            
            statement.executeQuery("call ModificarVendedor("+id+", \'"+nombre+"\')");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("algo pasa en el insert");
        }
    }
    
    public static void modificarPRODUCTO(int upc, String nombre, String tamano, String embalaje, String marca){
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
            statement.executeQuery("call ModificarProducto("+upc+", \'"+nombre+"\', \'"+tamano+"\', \'"+embalaje+"\', \'"+marca+"\' )");
            //statement.executeQuery("call CrearInventario("+tienda_id+", \'"+producto_codigoUPC+"\', "+precio+", "+cantidad+", "+reorden+")");
            //statement.executeUpdate("INSERT INTO PRODUCTO VALUES(" + upc + ",\'" + nombre + "\',\'" + tamano + "\',\'" + embalaje + "\', \' " + marca + " \')");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("algo pasa en el insert");
        }
    }
    
    public static void modificarFACTURA(int numero,String fecha,double isv,double subtotal,double total,int clienteid,int tiendaid){
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
            statement.executeQuery("call ModificarFactura("+numero+", \'"+fecha+"\', "+isv+", "+subtotal+", "+total+", "+clienteid+", "+tiendaid+")");
            //statement.executeUpdate("INSERT INTO FACTURA VALUES(" + numero + ",\'" + fecha + "\'," + isv + ","+subtotal+","+total+","+clienteid+","+tiendaid+" )");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("algo pasa en el insert");
        }
    }
    
    public static void modificarCLIENTE(int id, String nombre, String correo) {
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
            statement.executeUpdate("CALL ModificarCliente("+id+", \' "+ nombre +" \', \' "+ correo +"  \'  )");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("algo pasa en el insert");
        }
    }
    
    public static void modificarTIENDA(int id, String nombre, String horario) {

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
            statement.executeQuery("call ModificarTienda("+ id +", \'"+nombre+"\', \'"+horario+"\');");
            //statement.executeUpdate("INSERT INTO TIENDA VALUES(" + id + ", \'" + nombre + "\', \'" + horario + "\')");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("algo pasa en el insert");
        }
    }
    
}
