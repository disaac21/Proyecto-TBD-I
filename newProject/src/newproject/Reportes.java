package newproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    public static void inventarioPRODUCTOS(JTable InventarioDeProductosTable) {
        DefaultTableModel model = new DefaultTableModel();
        TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(model);
        InventarioDeProductosTable.setRowSorter(ordenar);

        model.addColumn("UPC");
        model.addColumn("nombre");
        model.addColumn("tamaño");
        model.addColumn("embalaje");
        model.addColumn("marca");

        InventarioDeProductosTable.setModel(model);

        String[] datos = new String[5];
        String sql = "SELECT * FROM PRODUCTO;";

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
}
