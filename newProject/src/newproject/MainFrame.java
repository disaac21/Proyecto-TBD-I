/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;

import com.formdev.flatlaf.FlatLightLaf;
import com.mysql.cj.MysqlConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.UIManager;

/**
 *
 * @author danie
 */
public class MainFrame extends javax.swing.JFrame {

    
    public MainFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminScreen = new javax.swing.JDialog();
        adminTextPrueba = new javax.swing.JLabel();
        adminTabbedPane = new javax.swing.JTabbedPane();
        mantenimientoTab = new javax.swing.JPanel();
        mantenimientoTabbedPane = new javax.swing.JTabbedPane();
        tiendaTab = new javax.swing.JPanel();
        tiendaTabbedPane = new javax.swing.JTabbedPane();
        tiendaCrearTab = new javax.swing.JPanel();
        tiendaModificarTab = new javax.swing.JPanel();
        tiendaEliminarTab = new javax.swing.JPanel();
        clienteTab = new javax.swing.JPanel();
        clienteTabbedPane = new javax.swing.JTabbedPane();
        clienteCrearTab = new javax.swing.JPanel();
        clienteModificarTab = new javax.swing.JPanel();
        clienteEliminarTab = new javax.swing.JPanel();
        facturaTab = new javax.swing.JPanel();
        facturaTabbedPane = new javax.swing.JTabbedPane();
        facturaCrearTab = new javax.swing.JPanel();
        facturaModificarTab = new javax.swing.JPanel();
        facturaEliminarTab = new javax.swing.JPanel();
        productoTab = new javax.swing.JPanel();
        productoTabbedPane = new javax.swing.JTabbedPane();
        productoCrearTab = new javax.swing.JPanel();
        productoModificarTab = new javax.swing.JPanel();
        productoEliminarTab = new javax.swing.JPanel();
        vendedorTab = new javax.swing.JPanel();
        vendedorTabbedPane = new javax.swing.JTabbedPane();
        vendedorCrearTab = new javax.swing.JPanel();
        vendedorModificarTab = new javax.swing.JPanel();
        vendedorEliminarTab = new javax.swing.JPanel();
        reportesTab = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        userScreen = new javax.swing.JDialog();
        userTextPrueba = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        usernameTextField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        previewAdminButton = new javax.swing.JButton();
        previewUserButton = new javax.swing.JButton();

        adminScreen.setTitle("Admin Screen");
        adminScreen.setMaximumSize(new java.awt.Dimension(600, 400));
        adminScreen.setMinimumSize(new java.awt.Dimension(600, 400));

        adminTextPrueba.setText("Welcome Admin");

        javax.swing.GroupLayout tiendaCrearTabLayout = new javax.swing.GroupLayout(tiendaCrearTab);
        tiendaCrearTab.setLayout(tiendaCrearTabLayout);
        tiendaCrearTabLayout.setHorizontalGroup(
            tiendaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tiendaCrearTabLayout.setVerticalGroup(
            tiendaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tiendaTabbedPane.addTab("Crear", tiendaCrearTab);

        javax.swing.GroupLayout tiendaModificarTabLayout = new javax.swing.GroupLayout(tiendaModificarTab);
        tiendaModificarTab.setLayout(tiendaModificarTabLayout);
        tiendaModificarTabLayout.setHorizontalGroup(
            tiendaModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tiendaModificarTabLayout.setVerticalGroup(
            tiendaModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tiendaTabbedPane.addTab("Modificar", tiendaModificarTab);

        javax.swing.GroupLayout tiendaEliminarTabLayout = new javax.swing.GroupLayout(tiendaEliminarTab);
        tiendaEliminarTab.setLayout(tiendaEliminarTabLayout);
        tiendaEliminarTabLayout.setHorizontalGroup(
            tiendaEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tiendaEliminarTabLayout.setVerticalGroup(
            tiendaEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tiendaTabbedPane.addTab("Eliminar", tiendaEliminarTab);

        javax.swing.GroupLayout tiendaTabLayout = new javax.swing.GroupLayout(tiendaTab);
        tiendaTab.setLayout(tiendaTabLayout);
        tiendaTabLayout.setHorizontalGroup(
            tiendaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tiendaTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        tiendaTabLayout.setVerticalGroup(
            tiendaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tiendaTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        mantenimientoTabbedPane.addTab("Tienda", tiendaTab);

        javax.swing.GroupLayout clienteCrearTabLayout = new javax.swing.GroupLayout(clienteCrearTab);
        clienteCrearTab.setLayout(clienteCrearTabLayout);
        clienteCrearTabLayout.setHorizontalGroup(
            clienteCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        clienteCrearTabLayout.setVerticalGroup(
            clienteCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        clienteTabbedPane.addTab("Crear", clienteCrearTab);

        javax.swing.GroupLayout clienteModificarTabLayout = new javax.swing.GroupLayout(clienteModificarTab);
        clienteModificarTab.setLayout(clienteModificarTabLayout);
        clienteModificarTabLayout.setHorizontalGroup(
            clienteModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        clienteModificarTabLayout.setVerticalGroup(
            clienteModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        clienteTabbedPane.addTab("Modificar", clienteModificarTab);

        javax.swing.GroupLayout clienteEliminarTabLayout = new javax.swing.GroupLayout(clienteEliminarTab);
        clienteEliminarTab.setLayout(clienteEliminarTabLayout);
        clienteEliminarTabLayout.setHorizontalGroup(
            clienteEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        clienteEliminarTabLayout.setVerticalGroup(
            clienteEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        clienteTabbedPane.addTab("Eliminar", clienteEliminarTab);

        javax.swing.GroupLayout clienteTabLayout = new javax.swing.GroupLayout(clienteTab);
        clienteTab.setLayout(clienteTabLayout);
        clienteTabLayout.setHorizontalGroup(
            clienteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clienteTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        clienteTabLayout.setVerticalGroup(
            clienteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clienteTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        mantenimientoTabbedPane.addTab("Cliente", clienteTab);

        javax.swing.GroupLayout facturaCrearTabLayout = new javax.swing.GroupLayout(facturaCrearTab);
        facturaCrearTab.setLayout(facturaCrearTabLayout);
        facturaCrearTabLayout.setHorizontalGroup(
            facturaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        facturaCrearTabLayout.setVerticalGroup(
            facturaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        facturaTabbedPane.addTab("Crear", facturaCrearTab);

        javax.swing.GroupLayout facturaModificarTabLayout = new javax.swing.GroupLayout(facturaModificarTab);
        facturaModificarTab.setLayout(facturaModificarTabLayout);
        facturaModificarTabLayout.setHorizontalGroup(
            facturaModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        facturaModificarTabLayout.setVerticalGroup(
            facturaModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        facturaTabbedPane.addTab("Modificar", facturaModificarTab);

        javax.swing.GroupLayout facturaEliminarTabLayout = new javax.swing.GroupLayout(facturaEliminarTab);
        facturaEliminarTab.setLayout(facturaEliminarTabLayout);
        facturaEliminarTabLayout.setHorizontalGroup(
            facturaEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        facturaEliminarTabLayout.setVerticalGroup(
            facturaEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        facturaTabbedPane.addTab("Eliminar", facturaEliminarTab);

        javax.swing.GroupLayout facturaTabLayout = new javax.swing.GroupLayout(facturaTab);
        facturaTab.setLayout(facturaTabLayout);
        facturaTabLayout.setHorizontalGroup(
            facturaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(facturaTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        facturaTabLayout.setVerticalGroup(
            facturaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(facturaTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        mantenimientoTabbedPane.addTab("Factura", facturaTab);

        javax.swing.GroupLayout productoCrearTabLayout = new javax.swing.GroupLayout(productoCrearTab);
        productoCrearTab.setLayout(productoCrearTabLayout);
        productoCrearTabLayout.setHorizontalGroup(
            productoCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        productoCrearTabLayout.setVerticalGroup(
            productoCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        productoTabbedPane.addTab("Crear", productoCrearTab);

        javax.swing.GroupLayout productoModificarTabLayout = new javax.swing.GroupLayout(productoModificarTab);
        productoModificarTab.setLayout(productoModificarTabLayout);
        productoModificarTabLayout.setHorizontalGroup(
            productoModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        productoModificarTabLayout.setVerticalGroup(
            productoModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        productoTabbedPane.addTab("Modificar", productoModificarTab);

        javax.swing.GroupLayout productoEliminarTabLayout = new javax.swing.GroupLayout(productoEliminarTab);
        productoEliminarTab.setLayout(productoEliminarTabLayout);
        productoEliminarTabLayout.setHorizontalGroup(
            productoEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        productoEliminarTabLayout.setVerticalGroup(
            productoEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        productoTabbedPane.addTab("Eliminar", productoEliminarTab);

        javax.swing.GroupLayout productoTabLayout = new javax.swing.GroupLayout(productoTab);
        productoTab.setLayout(productoTabLayout);
        productoTabLayout.setHorizontalGroup(
            productoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productoTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        productoTabLayout.setVerticalGroup(
            productoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productoTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        mantenimientoTabbedPane.addTab("Producto", productoTab);

        javax.swing.GroupLayout vendedorCrearTabLayout = new javax.swing.GroupLayout(vendedorCrearTab);
        vendedorCrearTab.setLayout(vendedorCrearTabLayout);
        vendedorCrearTabLayout.setHorizontalGroup(
            vendedorCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        vendedorCrearTabLayout.setVerticalGroup(
            vendedorCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        vendedorTabbedPane.addTab("Crear", vendedorCrearTab);

        javax.swing.GroupLayout vendedorModificarTabLayout = new javax.swing.GroupLayout(vendedorModificarTab);
        vendedorModificarTab.setLayout(vendedorModificarTabLayout);
        vendedorModificarTabLayout.setHorizontalGroup(
            vendedorModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        vendedorModificarTabLayout.setVerticalGroup(
            vendedorModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        vendedorTabbedPane.addTab("Modificar", vendedorModificarTab);

        javax.swing.GroupLayout vendedorEliminarTabLayout = new javax.swing.GroupLayout(vendedorEliminarTab);
        vendedorEliminarTab.setLayout(vendedorEliminarTabLayout);
        vendedorEliminarTabLayout.setHorizontalGroup(
            vendedorEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        vendedorEliminarTabLayout.setVerticalGroup(
            vendedorEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        vendedorTabbedPane.addTab("Eliminar", vendedorEliminarTab);

        javax.swing.GroupLayout vendedorTabLayout = new javax.swing.GroupLayout(vendedorTab);
        vendedorTab.setLayout(vendedorTabLayout);
        vendedorTabLayout.setHorizontalGroup(
            vendedorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vendedorTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        vendedorTabLayout.setVerticalGroup(
            vendedorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vendedorTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        mantenimientoTabbedPane.addTab("Vendedor", vendedorTab);

        javax.swing.GroupLayout mantenimientoTabLayout = new javax.swing.GroupLayout(mantenimientoTab);
        mantenimientoTab.setLayout(mantenimientoTabLayout);
        mantenimientoTabLayout.setHorizontalGroup(
            mantenimientoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mantenimientoTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        mantenimientoTabLayout.setVerticalGroup(
            mantenimientoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mantenimientoTabbedPane)
        );

        adminTabbedPane.addTab("Mantenimiento", mantenimientoTab);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Inventario de Productos", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Compras por Cliente", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Historial: Ventas por Tienda", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Top 20: Productos por Tienda", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Top 20: Productos por País", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Top 5: Tiendas por Ventas Anuales", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sales: Tiendas (CocaCola > Pepsi)", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Top 3 Sales: Productos (Menos Leche)", jPanel8);

        javax.swing.GroupLayout reportesTabLayout = new javax.swing.GroupLayout(reportesTab);
        reportesTab.setLayout(reportesTabLayout);
        reportesTabLayout.setHorizontalGroup(
            reportesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportesTabLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        reportesTabLayout.setVerticalGroup(
            reportesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        adminTabbedPane.addTab("Reportes", reportesTab);

        javax.swing.GroupLayout adminScreenLayout = new javax.swing.GroupLayout(adminScreen.getContentPane());
        adminScreen.getContentPane().setLayout(adminScreenLayout);
        adminScreenLayout.setHorizontalGroup(
            adminScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(adminScreenLayout.createSequentialGroup()
                        .addComponent(adminTextPrueba)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        adminScreenLayout.setVerticalGroup(
            adminScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminTextPrueba)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminTabbedPane)
                .addContainerGap())
        );

        userScreen.setTitle("User Screen");

        userTextPrueba.setText("Welcome User");

        javax.swing.GroupLayout userScreenLayout = new javax.swing.GroupLayout(userScreen.getContentPane());
        userScreen.getContentPane().setLayout(userScreenLayout);
        userScreenLayout.setHorizontalGroup(
            userScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userTextPrueba)
                .addContainerGap(518, Short.MAX_VALUE))
        );
        userScreenLayout.setVerticalGroup(
            userScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userTextPrueba)
                .addContainerGap(378, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("System Log In");
        setResizable(false);

        loginButton.setText("Log In");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        usernameLabel.setText("Username");

        passwordLabel.setText("Password");

        previewAdminButton.setText("Preview Pantalla Admin");
        previewAdminButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previewAdminButtonMouseClicked(evt);
            }
        });
        previewAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewAdminButtonActionPerformed(evt);
            }
        });

        previewUserButton.setText("Preview Pantalla User");
        previewUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewUserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(loginButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(previewAdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(previewUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(previewAdminButton)
                        .addGap(18, 18, 18)
                        .addComponent(previewUserButton)))
                .addContainerGap(294, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void previewAdminButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previewAdminButtonMouseClicked
        
    }//GEN-LAST:event_previewAdminButtonMouseClicked

    private void previewAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewAdminButtonActionPerformed
        adminScreen.setModal(true); //bloquear window
        adminScreen.pack();//tamaño más grande
        adminScreen.setAlwaysOnTop(true);
        adminScreen.setLocationRelativeTo(this); //posición
        adminScreen.setVisible(true); //vista
    }//GEN-LAST:event_previewAdminButtonActionPerformed

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void previewUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewUserButtonActionPerformed
        userScreen.setModal(true); //bloquear window
        userScreen.pack();//tamaño más grande
        userScreen.setAlwaysOnTop(true);
        userScreen.setLocationRelativeTo(this); //posición
        userScreen.setVisible(true); //vista
    }//GEN-LAST:event_previewUserButtonActionPerformed

    
    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch (Exception e) {
            System.out.println("failed to initialized");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
        
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
            //statement.executeUpdate("INSERT INTO CLIENTE VALUES(4, 'Prueba 4', 'Prueba@gmail.com')");
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("algo pasa en el insert");
        }
        
        System.out.println("gadudm");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog adminScreen;
    private javax.swing.JTabbedPane adminTabbedPane;
    private javax.swing.JLabel adminTextPrueba;
    private javax.swing.JPanel clienteCrearTab;
    private javax.swing.JPanel clienteEliminarTab;
    private javax.swing.JPanel clienteModificarTab;
    private javax.swing.JPanel clienteTab;
    private javax.swing.JTabbedPane clienteTabbedPane;
    private javax.swing.JPanel facturaCrearTab;
    private javax.swing.JPanel facturaEliminarTab;
    private javax.swing.JPanel facturaModificarTab;
    private javax.swing.JPanel facturaTab;
    private javax.swing.JTabbedPane facturaTabbedPane;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel mantenimientoTab;
    private javax.swing.JTabbedPane mantenimientoTabbedPane;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JButton previewAdminButton;
    private javax.swing.JButton previewUserButton;
    private javax.swing.JPanel productoCrearTab;
    private javax.swing.JPanel productoEliminarTab;
    private javax.swing.JPanel productoModificarTab;
    private javax.swing.JPanel productoTab;
    private javax.swing.JTabbedPane productoTabbedPane;
    private javax.swing.JPanel reportesTab;
    private javax.swing.JPanel tiendaCrearTab;
    private javax.swing.JPanel tiendaEliminarTab;
    private javax.swing.JPanel tiendaModificarTab;
    private javax.swing.JPanel tiendaTab;
    private javax.swing.JTabbedPane tiendaTabbedPane;
    private javax.swing.JDialog userScreen;
    private javax.swing.JLabel userTextPrueba;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JPanel vendedorCrearTab;
    private javax.swing.JPanel vendedorEliminarTab;
    private javax.swing.JPanel vendedorModificarTab;
    private javax.swing.JPanel vendedorTab;
    private javax.swing.JTabbedPane vendedorTabbedPane;
    // End of variables declaration//GEN-END:variables
}
