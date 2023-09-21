package newproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import static newproject.MainFrame.password;
import static newproject.MainFrame.url;
import static newproject.MainFrame.user;

public class Reportes {

    static Connection connection;
    static Statement statement;

    public static void inventarioProductos(JTable InventarioDeProductosTable) {
        
        //Captura Modelo
        DefaultTableModel model = new DefaultTableModel();
        TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(model);
        InventarioDeProductosTable.setRowSorter(ordenar);

        //Agrega Columnas
        model.addColumn("Código UPC"); model.addColumn("Nombre"); model.addColumn("Tamaño");
        model.addColumn("Embalaje"); model.addColumn("Marca");

        //Regresa Modelo
        InventarioDeProductosTable.setModel(model);

        //Llena Datos
        String[] datos = new String[5];
        String nombreVista = "inventarioProductos";
        String sql = "SELECT * FROM proyecto.inventarioProductos;";

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                
                model.addRow(datos);
            }
           
            InventarioDeProductosTable.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostro los productos en la tabla");
        }
    }
    
    public static void comprasClienteComboBox(JComboBox ComboBoxClientes) {
        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
                        
            String query = "SELECT id, nombre FROM CLIENTE";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                String clientID = resultSet.getString("id");
                String clientName = resultSet.getString("nombre");
                String clienteCB = (clientID + " - " + clientName);
                
                ComboBoxClientes.addItem(clienteCB);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostro los productos en la tabla");
        }
    }
    
    public static void comprasCliente(JTable compraClienteTable, JComboBox ComboBoxClientes) {
        //numero fecha isv subtotal total cliente_id tienda_id
        
        //Captura Modelo
        DefaultTableModel model = new DefaultTableModel();
        TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(model);
        compraClienteTable.setRowSorter(ordenar);

        //Agrega Columnas
        model.addColumn("Número"); model.addColumn("Fecha"); model.addColumn("ISV");
        model.addColumn("Subtotal"); model.addColumn("Total"); model.addColumn("Cliente ID");
        model.addColumn("Tienda ID");
        

        //Regresa Modelo
        compraClienteTable.setModel(model);

        //Llena Datos
        String[] datos = new String[7];
        String nombreVista = "comprasClientes";
        String sql = "SELECT * FROM " + nombreVista + ";";
        String idFiltrar = ComboBoxClientes.getSelectedItem().toString().substring(0, ComboBoxClientes.getSelectedItem().toString().indexOf('-')-1);

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                
                if (datos[5].equals(idFiltrar)) {
                    model.addRow(datos);
                }
            }
           
            compraClienteTable.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostro los productos en la tabla");
        }
        
    }
    
    public static void ventasTiendaComboBox(JComboBox ComboBoxTiendas) {
        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
                        
            String query = "SELECT id, nombre FROM TIENDA";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                String tiendaID = resultSet.getString("id");
                String tiendaName = resultSet.getString("nombre");
                String tiendaCB = (tiendaID + " - " + tiendaName);
                
                ComboBoxTiendas.addItem(tiendaCB);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostro los productos en la tabla");
        }
    }
    
    public static void ventasTienda(JTable ventasTiendaTable, JComboBox ComboBoxTiendas) {
        //numero fecha isv subtotal total cliente_id tienda_id
        
        //Captura Modelo
        DefaultTableModel model = new DefaultTableModel();
        TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(model);
        ventasTiendaTable.setRowSorter(ordenar);

        //Agrega Columnas
        model.addColumn("Número"); model.addColumn("Fecha"); model.addColumn("ISV");
        model.addColumn("Subtotal"); model.addColumn("Total"); model.addColumn("Cliente ID");
        model.addColumn("Tienda ID");
        

        //Regresa Modelo
        ventasTiendaTable.setModel(model);

        //Llena Datos
        String[] datos = new String[7];
        String nombreVista = "ventasTienda";
        String sql = "SELECT * FROM " + nombreVista + ";";
        String idFiltrar = ComboBoxTiendas.getSelectedItem().toString().substring(0, ComboBoxTiendas.getSelectedItem().toString().indexOf('-')-1);

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                
                if (datos[6].equals(idFiltrar)) {
                    model.addRow(datos);
                }
            }
           
            ventasTiendaTable.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostro los productos en la tabla");
        }
        
    }
    
    public static void productosComboBox(JComboBox ComboboxProductos) {
        
        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
                        
            String query = "SELECT codigoUPC, nombre FROM PRODUCTO";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                String prodID = resultSet.getString("codigoUPC");
                String prodName = resultSet.getString("nombre");
                String prodCB = (prodID + " - " + prodName);
                
                ComboboxProductos.addItem(prodCB);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostro los productos en la tabla");
        }
    }
    
    public static void productosTienda(JTable ventasTiendaTable, JComboBox ComboBoxTiendas) {
        //numero fecha isv subtotal total cliente_id tienda_id
        
        //Captura Modelo
        DefaultTableModel model = new DefaultTableModel();
        TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(model);
        ventasTiendaTable.setRowSorter(ordenar);
        
        //Agrega Columnas
        model.addColumn("Código UPC"); model.addColumn("Nombre"); model.addColumn("Tamaño");
        model.addColumn("Embalaje"); model.addColumn("Marca");
        

        //Regresa Modelo
        ventasTiendaTable.setModel(model);

        //Llena Datos
        String[] datos = new String[5];
        String nombreVista = "ventasTienda";
        String sql = "SELECT * FROM " + nombreVista + ";";
        String idFiltrar = ComboBoxTiendas.getSelectedItem().toString().substring(0, ComboBoxTiendas.getSelectedItem().toString().indexOf('-')-1);

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                
                if (datos[6].equals(idFiltrar)) {
                    model.addRow(datos);
                }
            }
           
            ventasTiendaTable.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostro los productos en la tabla");
        }
        
    }
}
