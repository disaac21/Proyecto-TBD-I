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
import javax.swing.table.TableModel;
import newproject.Insertar;
import newproject.Reportes;



/**
 *
 * @author danie
 */
public class MainFrame extends javax.swing.JFrame {

static String user = "admin";
static String password = "DanielVictorSerlio";
static String url = "jdbc:mysql://proyecto.cv7itbwgfcgt.us-east-1.rds.amazonaws.com/proyecto";
    
    public MainFrame() {
        initComponents();
        this.pack();//tamaño más grande
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(this); //posición
        
        Reportes.inventarioPRODUCTOS(InventarioDeProductosTable);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminScreen = new javax.swing.JDialog();
        adminTabbedPane = new javax.swing.JTabbedPane();
        mantenimientoTab = new javax.swing.JPanel();
        mantenimientoTabbedPane = new javax.swing.JTabbedPane();
        tiendaTab = new javax.swing.JPanel();
        tiendaTabbedPane = new javax.swing.JTabbedPane();
        tiendaCrearTab = new javax.swing.JPanel();
        tienda_idLabel = new javax.swing.JLabel();
        tienda_idTextField = new javax.swing.JTextField();
        tienda_nombreLabel = new javax.swing.JLabel();
        tienda_nombreTextField = new javax.swing.JTextField();
        tienda_horarioLabel = new javax.swing.JLabel();
        tienda_horarioTextField = new javax.swing.JTextField();
        tienda_ubicacionLabel = new javax.swing.JLabel();
        tienda_ubicacionTextField = new javax.swing.JTextField();
        crearTiendaButton = new javax.swing.JButton();
        tiendaModificarTab = new javax.swing.JPanel();
        tiendaEliminarTab = new javax.swing.JPanel();
        clienteTab = new javax.swing.JPanel();
        clienteTabbedPane = new javax.swing.JTabbedPane();
        clienteCrearTab = new javax.swing.JPanel();
        cliente_idLabel = new javax.swing.JLabel();
        cliente_idTextField = new javax.swing.JTextField();
        cliente_nombreLabel = new javax.swing.JLabel();
        cliente_nombreTextField = new javax.swing.JTextField();
        cliente_correoLabel = new javax.swing.JLabel();
        cliente_correoTextField = new javax.swing.JTextField();
        crearTiendaButton1 = new javax.swing.JButton();
        clienteModificarTab = new javax.swing.JPanel();
        clienteEliminarTab = new javax.swing.JPanel();
        facturaTab = new javax.swing.JPanel();
        facturaTabbedPane = new javax.swing.JTabbedPane();
        facturaCrearTab = new javax.swing.JPanel();
        factura_numeroLabel = new javax.swing.JLabel();
        factura_numeroTextField = new javax.swing.JTextField();
        factura_fechaLabel = new javax.swing.JLabel();
        factura_fechaTextField = new javax.swing.JTextField();
        factura_ISVLabel = new javax.swing.JLabel();
        factura_ISVTextField = new javax.swing.JTextField();
        factura_subtotalLabel = new javax.swing.JLabel();
        factura_subtotalTextField = new javax.swing.JTextField();
        factura_totalLabel = new javax.swing.JLabel();
        factura_totalTextField = new javax.swing.JTextField();
        facturacliente_idLabel = new javax.swing.JLabel();
        facturacliente_idTextField = new javax.swing.JTextField();
        facturatienda_idLabel = new javax.swing.JLabel();
        facturatienda_idTextField = new javax.swing.JTextField();
        crearFacturaButton = new javax.swing.JButton();
        facturaModificarTab = new javax.swing.JPanel();
        facturaEliminarTab = new javax.swing.JPanel();
        productoTab = new javax.swing.JPanel();
        productoTabbedPane = new javax.swing.JTabbedPane();
        productoCrearTab = new javax.swing.JPanel();
        producto_codigoUPCLabel = new javax.swing.JLabel();
        producto_codigoUPCTextField = new javax.swing.JTextField();
        producto_nombreLabel = new javax.swing.JLabel();
        producto_nombreTextField = new javax.swing.JTextField();
        producto_tamanoLabel = new javax.swing.JLabel();
        producto_tamanoLabelTextField = new javax.swing.JTextField();
        producto_embalajeLabel = new javax.swing.JLabel();
        producto_embalajeTextField = new javax.swing.JTextField();
        producto_marcaLabel = new javax.swing.JLabel();
        producto_marcaTextField = new javax.swing.JTextField();
        crearProductoButton = new javax.swing.JButton();
        productoModificarTab = new javax.swing.JPanel();
        productoEliminarTab = new javax.swing.JPanel();
        vendedorTab = new javax.swing.JPanel();
        vendedorTabbedPane = new javax.swing.JTabbedPane();
        vendedorCrearTab = new javax.swing.JPanel();
        vendedor_idLabel = new javax.swing.JLabel();
        vendedor_idTextField = new javax.swing.JTextField();
        vendedor_nombreLabel = new javax.swing.JLabel();
        vendedor_nombreTextField = new javax.swing.JTextField();
        crearVendedorButton = new javax.swing.JButton();
        vendedorModificarTab = new javax.swing.JPanel();
        vendedorEliminarTab = new javax.swing.JPanel();
        reportesTab = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        InventarioDeProductosTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        compras_por_cliente = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_clientes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_compras = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        userScreen = new javax.swing.JDialog();
        loginPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        previewAdminButton = new javax.swing.JButton();
        previewUserButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();

        adminScreen.setTitle("Admin Screen");
        adminScreen.setBackground(new java.awt.Color(255, 255, 255));
        adminScreen.setMinimumSize(new java.awt.Dimension(600, 400));

        adminTabbedPane.setBackground(new java.awt.Color(255, 255, 255));

        mantenimientoTab.setBackground(new java.awt.Color(255, 255, 255));

        mantenimientoTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        mantenimientoTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        tiendaTab.setBackground(new java.awt.Color(255, 255, 255));

        tiendaTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        tiendaTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        tiendaCrearTab.setBackground(new java.awt.Color(255, 255, 255));

        tienda_idLabel.setText("ID:");

        tienda_nombreLabel.setText("Nombre:");

        tienda_horarioLabel.setText("Horario:");

        tienda_ubicacionLabel.setText("Ubicación:");

        crearTiendaButton.setText("Crear Tienda");
        crearTiendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTiendaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tiendaCrearTabLayout = new javax.swing.GroupLayout(tiendaCrearTab);
        tiendaCrearTab.setLayout(tiendaCrearTabLayout);
        tiendaCrearTabLayout.setHorizontalGroup(
            tiendaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tiendaCrearTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(crearTiendaButton)
                .addContainerGap())
            .addGroup(tiendaCrearTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(tiendaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tienda_idLabel)
                    .addComponent(tienda_nombreLabel)
                    .addComponent(tienda_horarioLabel)
                    .addComponent(tienda_ubicacionLabel))
                .addGap(18, 18, 18)
                .addGroup(tiendaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tienda_nombreTextField)
                    .addComponent(tienda_horarioTextField)
                    .addComponent(tienda_ubicacionTextField)
                    .addComponent(tienda_idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        tiendaCrearTabLayout.setVerticalGroup(
            tiendaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tiendaCrearTabLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(tiendaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tienda_idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tienda_idLabel))
                .addGap(18, 18, 18)
                .addGroup(tiendaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tienda_nombreLabel)
                    .addComponent(tienda_nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tiendaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tienda_horarioLabel)
                    .addComponent(tienda_horarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tiendaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tienda_ubicacionLabel)
                    .addComponent(tienda_ubicacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(crearTiendaButton)
                .addContainerGap())
        );

        tiendaTabbedPane.addTab("Crear", tiendaCrearTab);

        tiendaModificarTab.setBackground(new java.awt.Color(255, 255, 255));

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

        tiendaEliminarTab.setBackground(new java.awt.Color(255, 255, 255));

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
            .addComponent(tiendaTabbedPane)
        );
        tiendaTabLayout.setVerticalGroup(
            tiendaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tiendaTabbedPane)
        );

        mantenimientoTabbedPane.addTab("Tienda", tiendaTab);

        clienteTab.setBackground(new java.awt.Color(255, 255, 255));

        clienteTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        clienteTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        clienteCrearTab.setBackground(new java.awt.Color(255, 255, 255));

        cliente_idLabel.setText("ID:");

        cliente_nombreLabel.setText("Nombre:");

        cliente_correoLabel.setText("Correo Electrónico:");

        crearTiendaButton1.setText("Crear Cliente");
        crearTiendaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTiendaButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout clienteCrearTabLayout = new javax.swing.GroupLayout(clienteCrearTab);
        clienteCrearTab.setLayout(clienteCrearTabLayout);
        clienteCrearTabLayout.setHorizontalGroup(
            clienteCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteCrearTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(clienteCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cliente_idLabel)
                    .addComponent(cliente_nombreLabel)
                    .addComponent(cliente_correoLabel))
                .addGap(18, 18, 18)
                .addGroup(clienteCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cliente_idTextField)
                    .addComponent(cliente_nombreTextField)
                    .addComponent(cliente_correoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clienteCrearTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(crearTiendaButton1)
                .addContainerGap())
        );
        clienteCrearTabLayout.setVerticalGroup(
            clienteCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteCrearTabLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(clienteCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliente_idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cliente_idLabel))
                .addGap(18, 18, 18)
                .addGroup(clienteCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliente_nombreLabel)
                    .addComponent(cliente_nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(clienteCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliente_correoLabel)
                    .addComponent(cliente_correoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(crearTiendaButton1)
                .addContainerGap())
        );

        clienteTabbedPane.addTab("Crear", clienteCrearTab);

        clienteModificarTab.setBackground(new java.awt.Color(255, 255, 255));

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

        clienteEliminarTab.setBackground(new java.awt.Color(255, 255, 255));

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
            .addComponent(clienteTabbedPane)
        );
        clienteTabLayout.setVerticalGroup(
            clienteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clienteTabbedPane)
        );

        mantenimientoTabbedPane.addTab("Cliente", clienteTab);

        facturaTab.setBackground(new java.awt.Color(255, 255, 255));

        facturaTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        facturaTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        facturaTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        facturaCrearTab.setBackground(new java.awt.Color(255, 255, 255));

        factura_numeroLabel.setText("Número:");

        factura_fechaLabel.setText("Fecha:");

        factura_ISVLabel.setText("ISV:");

        factura_subtotalLabel.setText("Subtotal");

        factura_totalLabel.setText("Total");

        facturacliente_idLabel.setText("Cliente ID:");

        facturatienda_idLabel.setText("Tienda ID:");

        crearFacturaButton.setText("Crear Factura");
        crearFacturaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearFacturaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout facturaCrearTabLayout = new javax.swing.GroupLayout(facturaCrearTab);
        facturaCrearTab.setLayout(facturaCrearTabLayout);
        facturaCrearTabLayout.setHorizontalGroup(
            facturaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(facturaCrearTabLayout.createSequentialGroup()
                .addGroup(facturaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facturaCrearTabLayout.createSequentialGroup()
                        .addContainerGap(343, Short.MAX_VALUE)
                        .addComponent(crearFacturaButton))
                    .addGroup(facturaCrearTabLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(facturaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(factura_numeroLabel)
                            .addComponent(factura_fechaLabel)
                            .addComponent(factura_ISVLabel)
                            .addComponent(factura_subtotalLabel)
                            .addComponent(factura_totalLabel)
                            .addComponent(facturacliente_idLabel)
                            .addComponent(facturatienda_idLabel))
                        .addGap(18, 18, 18)
                        .addGroup(facturaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(factura_totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(facturaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(factura_fechaTextField)
                                .addComponent(factura_ISVTextField)
                                .addComponent(factura_subtotalTextField)
                                .addComponent(factura_numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(facturaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(facturacliente_idTextField)
                                .addComponent(facturatienda_idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        facturaCrearTabLayout.setVerticalGroup(
            facturaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(facturaCrearTabLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(facturaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(factura_numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(factura_numeroLabel))
                .addGap(18, 18, 18)
                .addGroup(facturaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(factura_fechaLabel)
                    .addComponent(factura_fechaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(facturaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(factura_ISVLabel)
                    .addComponent(factura_ISVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(facturaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(factura_subtotalLabel)
                    .addComponent(factura_subtotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(facturaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(factura_totalLabel)
                    .addComponent(factura_totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(facturaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facturacliente_idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facturacliente_idLabel))
                .addGap(18, 18, 18)
                .addGroup(facturaCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facturatienda_idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facturatienda_idLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(crearFacturaButton)
                .addContainerGap())
        );

        facturaTabbedPane.addTab("Crear", facturaCrearTab);

        facturaModificarTab.setBackground(new java.awt.Color(255, 255, 255));

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

        facturaEliminarTab.setBackground(new java.awt.Color(255, 255, 255));

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
            .addComponent(facturaTabbedPane)
        );
        facturaTabLayout.setVerticalGroup(
            facturaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(facturaTabbedPane)
        );

        mantenimientoTabbedPane.addTab("Factura", facturaTab);

        productoTab.setBackground(new java.awt.Color(255, 255, 255));

        productoTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        productoTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        productoCrearTab.setBackground(new java.awt.Color(255, 255, 255));

        producto_codigoUPCLabel.setText("Código UPC:");

        producto_codigoUPCTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producto_codigoUPCTextFieldActionPerformed(evt);
            }
        });

        producto_nombreLabel.setText("Nombre:");

        producto_tamanoLabel.setText("Tamaño:");

        producto_embalajeLabel.setText("Método de Embalaje");

        producto_marcaLabel.setText("Marca:");

        crearProductoButton.setText("Crear Producto");
        crearProductoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearProductoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout productoCrearTabLayout = new javax.swing.GroupLayout(productoCrearTab);
        productoCrearTab.setLayout(productoCrearTabLayout);
        productoCrearTabLayout.setHorizontalGroup(
            productoCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productoCrearTabLayout.createSequentialGroup()
                .addGroup(productoCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productoCrearTabLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(crearProductoButton))
                    .addGroup(productoCrearTabLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(productoCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(producto_codigoUPCLabel)
                            .addComponent(producto_nombreLabel)
                            .addComponent(producto_tamanoLabel)
                            .addComponent(producto_embalajeLabel)
                            .addComponent(producto_marcaLabel))
                        .addGap(18, 18, 18)
                        .addGroup(productoCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(producto_marcaTextField)
                            .addComponent(producto_nombreTextField)
                            .addComponent(producto_tamanoLabelTextField)
                            .addComponent(producto_embalajeTextField)
                            .addComponent(producto_codigoUPCTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(0, 148, Short.MAX_VALUE)))
                .addContainerGap())
        );
        productoCrearTabLayout.setVerticalGroup(
            productoCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productoCrearTabLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(productoCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_codigoUPCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(producto_codigoUPCLabel))
                .addGap(18, 18, 18)
                .addGroup(productoCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_nombreLabel)
                    .addComponent(producto_nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(productoCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_tamanoLabel)
                    .addComponent(producto_tamanoLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(productoCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_embalajeLabel)
                    .addComponent(producto_embalajeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(productoCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_marcaLabel)
                    .addComponent(producto_marcaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(crearProductoButton)
                .addContainerGap())
        );

        productoTabbedPane.addTab("Crear", productoCrearTab);

        productoModificarTab.setBackground(new java.awt.Color(255, 255, 255));

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

        productoEliminarTab.setBackground(new java.awt.Color(255, 255, 255));

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
            .addComponent(productoTabbedPane)
        );
        productoTabLayout.setVerticalGroup(
            productoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productoTabbedPane)
        );

        mantenimientoTabbedPane.addTab("Producto", productoTab);

        vendedorTab.setBackground(new java.awt.Color(255, 255, 255));

        vendedorTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        vendedorTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        vendedorCrearTab.setBackground(new java.awt.Color(255, 255, 255));

        vendedor_idLabel.setText("ID:");

        vendedor_nombreLabel.setText("Nombre:");

        vendedor_nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendedor_nombreTextFieldActionPerformed(evt);
            }
        });

        crearVendedorButton.setText("Crear Vendedor");
        crearVendedorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearVendedorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vendedorCrearTabLayout = new javax.swing.GroupLayout(vendedorCrearTab);
        vendedorCrearTab.setLayout(vendedorCrearTabLayout);
        vendedorCrearTabLayout.setHorizontalGroup(
            vendedorCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vendedorCrearTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(crearVendedorButton)
                .addContainerGap())
            .addGroup(vendedorCrearTabLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(vendedorCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vendedor_idLabel)
                    .addComponent(vendedor_nombreLabel))
                .addGap(18, 18, 18)
                .addGroup(vendedorCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vendedor_idTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(vendedor_nombreTextField))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        vendedorCrearTabLayout.setVerticalGroup(
            vendedorCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vendedorCrearTabLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(vendedorCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendedor_idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendedor_idLabel))
                .addGap(18, 18, 18)
                .addGroup(vendedorCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendedor_nombreLabel)
                    .addComponent(vendedor_nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addComponent(crearVendedorButton)
                .addContainerGap())
        );

        vendedorTabbedPane.addTab("Crear", vendedorCrearTab);

        vendedorModificarTab.setBackground(new java.awt.Color(255, 255, 255));

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

        vendedorEliminarTab.setBackground(new java.awt.Color(255, 255, 255));

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
            .addComponent(vendedorTabbedPane)
        );
        vendedorTabLayout.setVerticalGroup(
            vendedorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vendedorTabbedPane)
        );

        mantenimientoTabbedPane.addTab("Vendedor", vendedorTab);

        javax.swing.GroupLayout mantenimientoTabLayout = new javax.swing.GroupLayout(mantenimientoTab);
        mantenimientoTab.setLayout(mantenimientoTabLayout);
        mantenimientoTabLayout.setHorizontalGroup(
            mantenimientoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mantenimientoTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        mantenimientoTabLayout.setVerticalGroup(
            mantenimientoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mantenimientoTabbedPane)
        );

        adminTabbedPane.addTab("Mantenimiento", mantenimientoTab);

        reportesTab.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        InventarioDeProductosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "UPC", "Nombre", "Tamaño", "Embalaje", "Marca"
            }
        ));
        jScrollPane2.setViewportView(InventarioDeProductosTable);

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Inventario de Productos", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        compras_por_cliente.setText("Ver Compras");
        compras_por_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compras_por_clienteActionPerformed(evt);
            }
        });

        tabla_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tabla_clientes);

        tabla_compras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tabla_compras);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compras_por_cliente)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(compras_por_cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Compras por Cliente", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Historial: Ventas por Tienda", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Top 20: Productos por Tienda", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Top 20: Productos por País", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Top 5: Tiendas por Ventas Anuales", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sales: Tiendas (CocaCola > Pepsi)", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Top 3 Sales: Productos (Menos Leche)", jPanel8);

        javax.swing.GroupLayout reportesTabLayout = new javax.swing.GroupLayout(reportesTab);
        reportesTab.setLayout(reportesTabLayout);
        reportesTabLayout.setHorizontalGroup(
            reportesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportesTabLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(adminTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                .addContainerGap())
        );
        adminScreenLayout.setVerticalGroup(
            adminScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminTabbedPane))
        );

        userScreen.setTitle("User Screen");
        userScreen.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout userScreenLayout = new javax.swing.GroupLayout(userScreen.getContentPane());
        userScreen.getContentPane().setLayout(userScreenLayout);
        userScreenLayout.setHorizontalGroup(
            userScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        userScreenLayout.setVerticalGroup(
            userScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("System Log In");
        setBackground(new java.awt.Color(255, 255, 255));

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        loginLabel.setText("Log In");

        usernameLabel.setText("Username:");

        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        passwordLabel.setText("Password:");

        loginButton.setText("Log In");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(usernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passwordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(loginLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginLabel)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel)
                    .addComponent(loginButton))
                .addContainerGap())
        );

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

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(previewAdminButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(previewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previewAdminButton)
                    .addComponent(previewUserButton))
                .addContainerGap())
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

    private void crearProductoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearProductoButtonActionPerformed
        int upc = Integer.parseInt(producto_codigoUPCTextField.getText());
        String nombre = producto_nombreTextField.getText();
        String tamano = producto_tamanoLabelTextField.getText();
        String embalaje = producto_embalajeTextField.getText();
        String marca = producto_marcaTextField.getText();

        Insertar.insercionPRODUCTO(upc, nombre, tamano, embalaje, marca);

        producto_codigoUPCTextField.setText("");
        producto_nombreTextField.setText("");
        producto_tamanoLabelTextField.setText("");
        producto_embalajeTextField.setText("");
        producto_marcaTextField.setText("");
        

    }//GEN-LAST:event_crearProductoButtonActionPerformed

    private void crearFacturaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearFacturaButtonActionPerformed
        int numero = Integer.parseInt(factura_numeroTextField.getText());
        String fecha = factura_fechaTextField.getText();
        double isv = Double.parseDouble(factura_ISVTextField.getText());
        double subtotal = Double.parseDouble(factura_subtotalTextField.getText());
        double total = Double.parseDouble(factura_totalTextField.getText());
        int clienteid = Integer.parseInt(facturacliente_idTextField.getText());
        int tiendaid = Integer.parseInt(facturatienda_idTextField.getText());

        Insertar.insercionFACTURA(numero, fecha, isv, subtotal, total, clienteid, tiendaid);

        factura_numeroTextField.setText("");
        factura_fechaTextField.setText("");
        factura_ISVTextField.setText("");
        factura_subtotalTextField.setText("");
        factura_totalTextField.setText("");
        facturacliente_idTextField.setText("");
        facturatienda_idTextField.setText("");
    }//GEN-LAST:event_crearFacturaButtonActionPerformed

    private void producto_codigoUPCTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producto_codigoUPCTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_producto_codigoUPCTextFieldActionPerformed

    private void vendedor_nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendedor_nombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendedor_nombreTextFieldActionPerformed

    private void crearTiendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTiendaButtonActionPerformed
        
        int id = Integer.parseInt(tienda_idTextField.getText());
        String nombre = tienda_nombreTextField.getText();
        String horario = tienda_horarioTextField.getText();
        
        System.out.println(id);
        System.out.println(nombre);
        System.out.println(horario);
        
        
        Insertar.insercionTIENDA(id, nombre, horario);
        tienda_idTextField.setText("");
        tienda_nombreTextField.setText("");
        tienda_horarioTextField.setText("");
    }//GEN-LAST:event_crearTiendaButtonActionPerformed

    private void crearTiendaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTiendaButton1ActionPerformed
        int id = Integer.parseInt(cliente_idTextField.getText());
        String nombre = cliente_nombreTextField.getText();
        String correo = cliente_correoTextField.getText();
        
        Insertar.insercionCLIENTE(id, nombre, correo);
        
        cliente_idTextField.setText("");
        cliente_nombreTextField.setText("");
        cliente_correoTextField.setText("");
    }//GEN-LAST:event_crearTiendaButton1ActionPerformed

    private void crearVendedorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearVendedorButtonActionPerformed
        int id = Integer.parseInt(vendedor_idTextField.getText());
        String nombre = vendedor_nombreTextField.getText();
        
        Insertar.insercionVENDEDOR(id, nombre);
        vendedor_idTextField.setText("");
        vendedor_nombreTextField.setText("");
    }//GEN-LAST:event_crearVendedorButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Reportes.inventarioPRODUCTOS(InventarioDeProductosTable);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void compras_por_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compras_por_clienteActionPerformed
        int selectedrow = tabla_clientes.getSelectedRow();
        tabla_clientes.getModel();
    }//GEN-LAST:event_compras_por_clienteActionPerformed

    
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
    private javax.swing.JTable InventarioDeProductosTable;
    private javax.swing.JDialog adminScreen;
    private javax.swing.JTabbedPane adminTabbedPane;
    private javax.swing.JPanel clienteCrearTab;
    private javax.swing.JPanel clienteEliminarTab;
    private javax.swing.JPanel clienteModificarTab;
    private javax.swing.JPanel clienteTab;
    private javax.swing.JTabbedPane clienteTabbedPane;
    private javax.swing.JLabel cliente_correoLabel;
    private javax.swing.JTextField cliente_correoTextField;
    private javax.swing.JLabel cliente_idLabel;
    private javax.swing.JTextField cliente_idTextField;
    private javax.swing.JLabel cliente_nombreLabel;
    private javax.swing.JTextField cliente_nombreTextField;
    private javax.swing.JButton compras_por_cliente;
    private javax.swing.JButton crearFacturaButton;
    private javax.swing.JButton crearProductoButton;
    private javax.swing.JButton crearTiendaButton;
    private javax.swing.JButton crearTiendaButton1;
    private javax.swing.JButton crearVendedorButton;
    private javax.swing.JPanel facturaCrearTab;
    private javax.swing.JPanel facturaEliminarTab;
    private javax.swing.JPanel facturaModificarTab;
    private javax.swing.JPanel facturaTab;
    private javax.swing.JTabbedPane facturaTabbedPane;
    private javax.swing.JLabel factura_ISVLabel;
    private javax.swing.JTextField factura_ISVTextField;
    private javax.swing.JLabel factura_fechaLabel;
    private javax.swing.JTextField factura_fechaTextField;
    private javax.swing.JLabel factura_numeroLabel;
    private javax.swing.JTextField factura_numeroTextField;
    private javax.swing.JLabel factura_subtotalLabel;
    private javax.swing.JTextField factura_subtotalTextField;
    private javax.swing.JLabel factura_totalLabel;
    private javax.swing.JTextField factura_totalTextField;
    private javax.swing.JLabel facturacliente_idLabel;
    private javax.swing.JTextField facturacliente_idTextField;
    private javax.swing.JLabel facturatienda_idLabel;
    private javax.swing.JTextField facturatienda_idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
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
    private javax.swing.JLabel producto_codigoUPCLabel;
    private javax.swing.JTextField producto_codigoUPCTextField;
    private javax.swing.JLabel producto_embalajeLabel;
    private javax.swing.JTextField producto_embalajeTextField;
    private javax.swing.JLabel producto_marcaLabel;
    private javax.swing.JTextField producto_marcaTextField;
    private javax.swing.JLabel producto_nombreLabel;
    private javax.swing.JTextField producto_nombreTextField;
    private javax.swing.JLabel producto_tamanoLabel;
    private javax.swing.JTextField producto_tamanoLabelTextField;
    private javax.swing.JPanel reportesTab;
    private javax.swing.JTable tabla_clientes;
    private javax.swing.JTable tabla_compras;
    private javax.swing.JPanel tiendaCrearTab;
    private javax.swing.JPanel tiendaEliminarTab;
    private javax.swing.JPanel tiendaModificarTab;
    private javax.swing.JPanel tiendaTab;
    private javax.swing.JTabbedPane tiendaTabbedPane;
    private javax.swing.JLabel tienda_horarioLabel;
    private javax.swing.JTextField tienda_horarioTextField;
    private javax.swing.JLabel tienda_idLabel;
    private javax.swing.JTextField tienda_idTextField;
    private javax.swing.JLabel tienda_nombreLabel;
    private javax.swing.JTextField tienda_nombreTextField;
    private javax.swing.JLabel tienda_ubicacionLabel;
    private javax.swing.JTextField tienda_ubicacionTextField;
    private javax.swing.JDialog userScreen;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JPanel vendedorCrearTab;
    private javax.swing.JPanel vendedorEliminarTab;
    private javax.swing.JPanel vendedorModificarTab;
    private javax.swing.JPanel vendedorTab;
    private javax.swing.JTabbedPane vendedorTabbedPane;
    private javax.swing.JLabel vendedor_idLabel;
    private javax.swing.JTextField vendedor_idTextField;
    private javax.swing.JLabel vendedor_nombreLabel;
    private javax.swing.JTextField vendedor_nombreTextField;
    // End of variables declaration//GEN-END:variables
}
