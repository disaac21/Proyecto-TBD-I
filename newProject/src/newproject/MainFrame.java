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
import javax.swing.JComboBox;
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
        tienda_idLabel1 = new javax.swing.JLabel();
        modificarTiendaComboBox = new javax.swing.JComboBox<>();
        tienda_nombreLabel1 = new javax.swing.JLabel();
        tienda_nombreTextField1 = new javax.swing.JTextField();
        tienda_horarioLabel1 = new javax.swing.JLabel();
        tienda_horarioTextField1 = new javax.swing.JTextField();
        modificarTiendaButton = new javax.swing.JButton();
        tiendaEliminarTab = new javax.swing.JPanel();
        tienda_idLabel2 = new javax.swing.JLabel();
        eliminarTiendaComboBox = new javax.swing.JComboBox<>();
        eliminarTiendaButton = new javax.swing.JButton();
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
        cliente_idLabel1 = new javax.swing.JLabel();
        cliente_nombreLabel1 = new javax.swing.JLabel();
        cliente_nombreTextField1 = new javax.swing.JTextField();
        cliente_correoLabel1 = new javax.swing.JLabel();
        cliente_correoTextField1 = new javax.swing.JTextField();
        modificarClienteButton = new javax.swing.JButton();
        modificarClienteComboBox = new javax.swing.JComboBox<>();
        clienteEliminarTab = new javax.swing.JPanel();
        tienda_idLabel3 = new javax.swing.JLabel();
        eliminarClienteComboBox = new javax.swing.JComboBox<>();
        eliminarClienteButton = new javax.swing.JButton();
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
        producto_precioTextField = new javax.swing.JTextField();
        producto_cantidadTextField = new javax.swing.JTextField();
        producto_reordenTextField = new javax.swing.JTextField();
        producto_tiendaComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        productoModificarTab = new javax.swing.JPanel();
        producto_codigoUPCLabel1 = new javax.swing.JLabel();
        producto_nombreLabel1 = new javax.swing.JLabel();
        producto_nombreTextField1 = new javax.swing.JTextField();
        producto_tamanoLabel1 = new javax.swing.JLabel();
        producto_tamanoLabelTextField1 = new javax.swing.JTextField();
        producto_embalajeLabel1 = new javax.swing.JLabel();
        producto_embalajeTextField1 = new javax.swing.JTextField();
        producto_marcaLabel1 = new javax.swing.JLabel();
        producto_marcaTextField1 = new javax.swing.JTextField();
        modificarProductoButton = new javax.swing.JButton();
        modificarProductosComboBox = new javax.swing.JComboBox<>();
        productoEliminarTab = new javax.swing.JPanel();
        tienda_idLabel4 = new javax.swing.JLabel();
        eliminarProductoComboBox = new javax.swing.JComboBox<>();
        eliminarProductoButton1 = new javax.swing.JButton();
        vendedorTab = new javax.swing.JPanel();
        vendedorTabbedPane = new javax.swing.JTabbedPane();
        vendedorCrearTab = new javax.swing.JPanel();
        vendedor_idLabel = new javax.swing.JLabel();
        vendedor_idTextField = new javax.swing.JTextField();
        vendedor_nombreLabel = new javax.swing.JLabel();
        vendedor_nombreTextField = new javax.swing.JTextField();
        crearVendedorButton = new javax.swing.JButton();
        vendedorModificarTab = new javax.swing.JPanel();
        cliente_idLabel2 = new javax.swing.JLabel();
        modificarVendedorComboBox = new javax.swing.JComboBox<>();
        cliente_nombreLabel2 = new javax.swing.JLabel();
        cliente_nombreTextField2 = new javax.swing.JTextField();
        modificarVendedorButton = new javax.swing.JButton();
        vendedorEliminarTab = new javax.swing.JPanel();
        tienda_idLabel5 = new javax.swing.JLabel();
        eliminarVendedorComboBox = new javax.swing.JComboBox<>();
        eliminarProductoButton2 = new javax.swing.JButton();
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
        reportesTab = new javax.swing.JPanel();
        reportesTabbedPane = new javax.swing.JTabbedPane();
        inventarioProductosTab = new javax.swing.JPanel();
        inventarioProductosScrollPane = new javax.swing.JScrollPane();
        inventarioProductosTable = new javax.swing.JTable();
        refreshInventarioProductosButton = new javax.swing.JButton();
        comprasClienteTab = new javax.swing.JPanel();
        comprasClienteScrollPane = new javax.swing.JScrollPane();
        comprasClienteTable = new javax.swing.JTable();
        comprasClienteButton = new javax.swing.JButton();
        comprasClienteComboBox = new javax.swing.JComboBox<>();
        ventasTiendaTab = new javax.swing.JPanel();
        ventasTiendaScrollPane = new javax.swing.JScrollPane();
        ventasTiendaTable = new javax.swing.JTable();
        ventasTiendaComboBox = new javax.swing.JComboBox<>();
        ventasTiendaButton = new javax.swing.JButton();
        productosTiendaTab = new javax.swing.JPanel();
        productosTiendaComboBox = new javax.swing.JComboBox<>();
        productosTiendaScrollPane = new javax.swing.JScrollPane();
        productosTiendaTable = new javax.swing.JTable();
        productosTiendaButton = new javax.swing.JButton();
        Top20ProductosPais = new javax.swing.JPanel();
        productosPaisComboBox = new javax.swing.JComboBox<>();
        productosPaisButton = new javax.swing.JButton();
        productosPaisScrollPane = new javax.swing.JScrollPane();
        productosPaisTable = new javax.swing.JTable();
        Top5VentasAnuales = new javax.swing.JPanel();
        ventasAnualesTiendaButton = new javax.swing.JButton();
        ventasAnualesTiendaScrollPane = new javax.swing.JScrollPane();
        ventasAnualesTiendaTable = new javax.swing.JTable();
        TiendasCocaPepsi = new javax.swing.JPanel();
        ventasCocaPepsiButton = new javax.swing.JButton();
        ventasCocaPepsiScrollPane = new javax.swing.JScrollPane();
        ventasCocaPepsiTable = new javax.swing.JTable();
        productType = new javax.swing.JPanel();
        productTypeButton = new javax.swing.JButton();
        productTypeScrollPane = new javax.swing.JScrollPane();
        productTypeTable = new javax.swing.JTable();
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
        adminTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                adminTabbedPaneStateChanged(evt);
            }
        });

        mantenimientoTab.setBackground(new java.awt.Color(255, 255, 255));

        mantenimientoTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        mantenimientoTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        tiendaTab.setBackground(new java.awt.Color(255, 255, 255));

        tiendaTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        tiendaTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tiendaTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tiendaTabbedPaneStateChanged(evt);
            }
        });

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                .addComponent(crearTiendaButton)
                .addContainerGap())
        );

        tiendaTabbedPane.addTab("Crear", tiendaCrearTab);

        tiendaModificarTab.setBackground(new java.awt.Color(255, 255, 255));

        tienda_idLabel1.setText("ID:");

        modificarTiendaComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                modificarTiendaComboBoxItemStateChanged(evt);
            }
        });

        tienda_nombreLabel1.setText("Nombre:");

        tienda_horarioLabel1.setText("Horario:");

        modificarTiendaButton.setText("Modificar Tienda");
        modificarTiendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarTiendaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tiendaModificarTabLayout = new javax.swing.GroupLayout(tiendaModificarTab);
        tiendaModificarTab.setLayout(tiendaModificarTabLayout);
        tiendaModificarTabLayout.setHorizontalGroup(
            tiendaModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tiendaModificarTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modificarTiendaButton)
                .addContainerGap())
            .addGroup(tiendaModificarTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(tiendaModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tienda_idLabel1)
                    .addComponent(tienda_nombreLabel1)
                    .addComponent(tienda_horarioLabel1))
                .addGap(27, 27, 27)
                .addGroup(tiendaModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tiendaModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tienda_nombreTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(tienda_horarioTextField1))
                    .addComponent(modificarTiendaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(325, Short.MAX_VALUE))
        );
        tiendaModificarTabLayout.setVerticalGroup(
            tiendaModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tiendaModificarTabLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(tiendaModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tienda_idLabel1)
                    .addComponent(modificarTiendaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tiendaModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tienda_nombreLabel1)
                    .addComponent(tienda_nombreTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tiendaModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tienda_horarioLabel1)
                    .addComponent(tienda_horarioTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                .addComponent(modificarTiendaButton)
                .addContainerGap())
        );

        tiendaTabbedPane.addTab("Modificar", tiendaModificarTab);

        tiendaEliminarTab.setBackground(new java.awt.Color(255, 255, 255));

        tienda_idLabel2.setText("ID:");

        eliminarTiendaComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                eliminarTiendaComboBoxItemStateChanged(evt);
            }
        });

        eliminarTiendaButton.setText("Eliminar Tienda");
        eliminarTiendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarTiendaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tiendaEliminarTabLayout = new javax.swing.GroupLayout(tiendaEliminarTab);
        tiendaEliminarTab.setLayout(tiendaEliminarTabLayout);
        tiendaEliminarTabLayout.setHorizontalGroup(
            tiendaEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tiendaEliminarTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminarTiendaButton)
                .addContainerGap())
            .addGroup(tiendaEliminarTabLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tienda_idLabel2)
                .addGap(59, 59, 59)
                .addComponent(eliminarTiendaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
        );
        tiendaEliminarTabLayout.setVerticalGroup(
            tiendaEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tiendaEliminarTabLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(tiendaEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tienda_idLabel2)
                    .addComponent(eliminarTiendaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                .addComponent(eliminarTiendaButton)
                .addContainerGap())
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
                .addContainerGap(480, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                .addComponent(crearTiendaButton1)
                .addContainerGap())
        );

        clienteTabbedPane.addTab("Crear", clienteCrearTab);

        clienteModificarTab.setBackground(new java.awt.Color(255, 255, 255));

        cliente_idLabel1.setText("ID:");

        cliente_nombreLabel1.setText("Nombre:");

        cliente_correoLabel1.setText("Correo Electrónico:");

        modificarClienteButton.setText("Modificar Cliente");
        modificarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarClienteButtonActionPerformed(evt);
            }
        });

        modificarClienteComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                modificarClienteComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout clienteModificarTabLayout = new javax.swing.GroupLayout(clienteModificarTab);
        clienteModificarTab.setLayout(clienteModificarTabLayout);
        clienteModificarTabLayout.setHorizontalGroup(
            clienteModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteModificarTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(clienteModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cliente_idLabel1)
                    .addComponent(cliente_nombreLabel1)
                    .addComponent(cliente_correoLabel1))
                .addGap(18, 18, 18)
                .addGroup(clienteModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clienteModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cliente_nombreTextField1)
                        .addComponent(cliente_correoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(modificarClienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(280, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clienteModificarTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modificarClienteButton)
                .addContainerGap())
        );
        clienteModificarTabLayout.setVerticalGroup(
            clienteModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteModificarTabLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(clienteModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliente_idLabel1)
                    .addComponent(modificarClienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(clienteModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliente_nombreLabel1)
                    .addComponent(cliente_nombreTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(clienteModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliente_correoLabel1)
                    .addComponent(cliente_correoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                .addComponent(modificarClienteButton)
                .addContainerGap())
        );

        clienteTabbedPane.addTab("Modificar", clienteModificarTab);

        clienteEliminarTab.setBackground(new java.awt.Color(255, 255, 255));

        tienda_idLabel3.setText("ID:");

        eliminarClienteComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                eliminarClienteComboBoxItemStateChanged(evt);
            }
        });

        eliminarClienteButton.setText("Eliminar Cliente");
        eliminarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarClienteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout clienteEliminarTabLayout = new javax.swing.GroupLayout(clienteEliminarTab);
        clienteEliminarTab.setLayout(clienteEliminarTabLayout);
        clienteEliminarTabLayout.setHorizontalGroup(
            clienteEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clienteEliminarTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminarClienteButton)
                .addContainerGap())
            .addGroup(clienteEliminarTabLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tienda_idLabel3)
                .addGap(59, 59, 59)
                .addComponent(eliminarClienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
        );
        clienteEliminarTabLayout.setVerticalGroup(
            clienteEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clienteEliminarTabLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(clienteEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tienda_idLabel3)
                    .addComponent(eliminarClienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                .addComponent(eliminarClienteButton)
                .addContainerGap())
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

        producto_reordenTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producto_reordenTextFieldActionPerformed(evt);
            }
        });

        producto_tiendaComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                producto_tiendaComboBoxItemStateChanged(evt);
            }
        });

        jLabel1.setText("Precio:");

        jLabel2.setText("Cantidad:");

        jLabel3.setText("Reorden:");

        jLabel4.setText("Tienda:");

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
                            .addComponent(producto_marcaLabel)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(productoCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(productoCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(producto_reordenTextField)
                                .addComponent(producto_cantidadTextField)
                                .addComponent(producto_precioTextField)
                                .addComponent(producto_marcaTextField)
                                .addComponent(producto_nombreTextField)
                                .addComponent(producto_tamanoLabelTextField)
                                .addComponent(producto_embalajeTextField)
                                .addComponent(producto_codigoUPCTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addComponent(producto_tiendaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 416, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addGroup(productoCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_precioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(productoCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_cantidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(productoCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_reordenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(productoCrearTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_tiendaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(crearProductoButton)
                .addContainerGap())
        );

        productoTabbedPane.addTab("Crear", productoCrearTab);

        productoModificarTab.setBackground(new java.awt.Color(255, 255, 255));

        producto_codigoUPCLabel1.setText("Código UPC:");

        producto_nombreLabel1.setText("Nombre:");

        producto_tamanoLabel1.setText("Tamaño:");

        producto_embalajeLabel1.setText("Método de Embalaje");

        producto_marcaLabel1.setText("Marca:");

        modificarProductoButton.setText("Modificar Producto");
        modificarProductoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarProductoButtonActionPerformed(evt);
            }
        });

        modificarProductosComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                modificarProductosComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout productoModificarTabLayout = new javax.swing.GroupLayout(productoModificarTab);
        productoModificarTab.setLayout(productoModificarTabLayout);
        productoModificarTabLayout.setHorizontalGroup(
            productoModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productoModificarTabLayout.createSequentialGroup()
                .addGroup(productoModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productoModificarTabLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modificarProductoButton))
                    .addGroup(productoModificarTabLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(productoModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(producto_codigoUPCLabel1)
                            .addComponent(producto_nombreLabel1)
                            .addComponent(producto_tamanoLabel1)
                            .addComponent(producto_embalajeLabel1)
                            .addComponent(producto_marcaLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(productoModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(productoModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(producto_marcaTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(producto_nombreTextField1)
                                .addComponent(producto_tamanoLabelTextField1)
                                .addComponent(producto_embalajeTextField1))
                            .addComponent(modificarProductosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 266, Short.MAX_VALUE)))
                .addContainerGap())
        );
        productoModificarTabLayout.setVerticalGroup(
            productoModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productoModificarTabLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(productoModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_codigoUPCLabel1)
                    .addComponent(modificarProductosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(productoModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_nombreLabel1)
                    .addComponent(producto_nombreTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(productoModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_tamanoLabel1)
                    .addComponent(producto_tamanoLabelTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(productoModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_embalajeLabel1)
                    .addComponent(producto_embalajeTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(productoModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_marcaLabel1)
                    .addComponent(producto_marcaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(modificarProductoButton)
                .addContainerGap())
        );

        productoTabbedPane.addTab("Modificar", productoModificarTab);

        productoEliminarTab.setBackground(new java.awt.Color(255, 255, 255));

        tienda_idLabel4.setText("ID:");

        eliminarProductoComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                eliminarProductoComboBoxItemStateChanged(evt);
            }
        });

        eliminarProductoButton1.setText("Eliminar Producto");
        eliminarProductoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout productoEliminarTabLayout = new javax.swing.GroupLayout(productoEliminarTab);
        productoEliminarTab.setLayout(productoEliminarTabLayout);
        productoEliminarTabLayout.setHorizontalGroup(
            productoEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productoEliminarTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminarProductoButton1)
                .addContainerGap())
            .addGroup(productoEliminarTabLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tienda_idLabel4)
                .addGap(59, 59, 59)
                .addComponent(eliminarProductoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
        );
        productoEliminarTabLayout.setVerticalGroup(
            productoEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productoEliminarTabLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(productoEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tienda_idLabel4)
                    .addComponent(eliminarProductoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                .addComponent(eliminarProductoButton1)
                .addContainerGap())
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
                .addContainerGap(535, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                .addComponent(crearVendedorButton)
                .addContainerGap())
        );

        vendedorTabbedPane.addTab("Crear", vendedorCrearTab);

        vendedorModificarTab.setBackground(new java.awt.Color(255, 255, 255));

        cliente_idLabel2.setText("ID:");

        modificarVendedorComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                modificarVendedorComboBoxItemStateChanged(evt);
            }
        });

        cliente_nombreLabel2.setText("Nombre:");

        modificarVendedorButton.setText("Modificar Vendedor");
        modificarVendedorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarVendedorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vendedorModificarTabLayout = new javax.swing.GroupLayout(vendedorModificarTab);
        vendedorModificarTab.setLayout(vendedorModificarTabLayout);
        vendedorModificarTabLayout.setHorizontalGroup(
            vendedorModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
            .addGroup(vendedorModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(vendedorModificarTabLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addGroup(vendedorModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(vendedorModificarTabLayout.createSequentialGroup()
                            .addGroup(vendedorModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cliente_idLabel2)
                                .addComponent(cliente_nombreLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(vendedorModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(vendedorModificarTabLayout.createSequentialGroup()
                                    .addComponent(modificarVendedorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(vendedorModificarTabLayout.createSequentialGroup()
                                    .addComponent(cliente_nombreTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vendedorModificarTabLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificarVendedorButton)))
                    .addGap(11, 11, 11)))
        );
        vendedorModificarTabLayout.setVerticalGroup(
            vendedorModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(vendedorModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(vendedorModificarTabLayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(vendedorModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cliente_idLabel2)
                        .addComponent(modificarVendedorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(vendedorModificarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cliente_nombreLabel2)
                        .addComponent(cliente_nombreTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(353, 353, 353)
                    .addComponent(modificarVendedorButton)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        vendedorTabbedPane.addTab("Modificar", vendedorModificarTab);

        vendedorEliminarTab.setBackground(new java.awt.Color(255, 255, 255));

        tienda_idLabel5.setText("ID:");

        eliminarVendedorComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                eliminarVendedorComboBoxItemStateChanged(evt);
            }
        });

        eliminarProductoButton2.setText("Eliminar Vendedor");
        eliminarProductoButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vendedorEliminarTabLayout = new javax.swing.GroupLayout(vendedorEliminarTab);
        vendedorEliminarTab.setLayout(vendedorEliminarTabLayout);
        vendedorEliminarTabLayout.setHorizontalGroup(
            vendedorEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vendedorEliminarTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminarProductoButton2)
                .addContainerGap())
            .addGroup(vendedorEliminarTabLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tienda_idLabel5)
                .addGap(59, 59, 59)
                .addComponent(eliminarVendedorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
        );
        vendedorEliminarTabLayout.setVerticalGroup(
            vendedorEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vendedorEliminarTabLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(vendedorEliminarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tienda_idLabel5)
                    .addComponent(eliminarVendedorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                .addComponent(eliminarProductoButton2)
                .addContainerGap())
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
                        .addContainerGap(659, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
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

        reportesTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        reportesTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        reportesTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                reportesTabbedPaneStateChanged(evt);
            }
        });

        inventarioProductosTab.setBackground(new java.awt.Color(255, 255, 255));

        inventarioProductosTable.setModel(new javax.swing.table.DefaultTableModel(
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
        inventarioProductosScrollPane.setViewportView(inventarioProductosTable);

        refreshInventarioProductosButton.setText("Refresh");
        refreshInventarioProductosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshInventarioProductosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inventarioProductosTabLayout = new javax.swing.GroupLayout(inventarioProductosTab);
        inventarioProductosTab.setLayout(inventarioProductosTabLayout);
        inventarioProductosTabLayout.setHorizontalGroup(
            inventarioProductosTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventarioProductosTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inventarioProductosTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inventarioProductosScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                    .addGroup(inventarioProductosTabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(refreshInventarioProductosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        inventarioProductosTabLayout.setVerticalGroup(
            inventarioProductosTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventarioProductosTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inventarioProductosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshInventarioProductosButton)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        reportesTabbedPane.addTab("Inventario de Productos", inventarioProductosTab);

        comprasClienteTab.setBackground(new java.awt.Color(255, 255, 255));

        comprasClienteTable.setModel(new javax.swing.table.DefaultTableModel(
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
        comprasClienteScrollPane.setViewportView(comprasClienteTable);

        comprasClienteButton.setText("Ver Compras");
        comprasClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasClienteButtonActionPerformed(evt);
            }
        });

        comprasClienteComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comprasClienteComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout comprasClienteTabLayout = new javax.swing.GroupLayout(comprasClienteTab);
        comprasClienteTab.setLayout(comprasClienteTabLayout);
        comprasClienteTabLayout.setHorizontalGroup(
            comprasClienteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comprasClienteTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(comprasClienteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comprasClienteScrollPane)
                    .addGroup(comprasClienteTabLayout.createSequentialGroup()
                        .addComponent(comprasClienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                        .addComponent(comprasClienteButton)))
                .addContainerGap())
        );
        comprasClienteTabLayout.setVerticalGroup(
            comprasClienteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comprasClienteTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(comprasClienteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comprasClienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comprasClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comprasClienteScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        reportesTabbedPane.addTab("Compras por Cliente", comprasClienteTab);

        ventasTiendaTab.setBackground(new java.awt.Color(255, 255, 255));

        ventasTiendaTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ventasTiendaScrollPane.setViewportView(ventasTiendaTable);

        ventasTiendaComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ventasTiendaComboBoxItemStateChanged(evt);
            }
        });

        ventasTiendaButton.setText("Ver Ventas");
        ventasTiendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasTiendaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ventasTiendaTabLayout = new javax.swing.GroupLayout(ventasTiendaTab);
        ventasTiendaTab.setLayout(ventasTiendaTabLayout);
        ventasTiendaTabLayout.setHorizontalGroup(
            ventasTiendaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventasTiendaTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventasTiendaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ventasTiendaScrollPane)
                    .addGroup(ventasTiendaTabLayout.createSequentialGroup()
                        .addComponent(ventasTiendaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                        .addComponent(ventasTiendaButton)))
                .addContainerGap())
        );
        ventasTiendaTabLayout.setVerticalGroup(
            ventasTiendaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventasTiendaTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventasTiendaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ventasTiendaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ventasTiendaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ventasTiendaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        reportesTabbedPane.addTab("Historial: Ventas por Tienda", ventasTiendaTab);

        productosTiendaTab.setBackground(new java.awt.Color(255, 255, 255));

        productosTiendaComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                productosTiendaComboBoxItemStateChanged(evt);
            }
        });

        productosTiendaTable.setModel(new javax.swing.table.DefaultTableModel(
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
        productosTiendaScrollPane.setViewportView(productosTiendaTable);

        productosTiendaButton.setText("Ver Productos");
        productosTiendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosTiendaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout productosTiendaTabLayout = new javax.swing.GroupLayout(productosTiendaTab);
        productosTiendaTab.setLayout(productosTiendaTabLayout);
        productosTiendaTabLayout.setHorizontalGroup(
            productosTiendaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productosTiendaTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productosTiendaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productosTiendaScrollPane)
                    .addGroup(productosTiendaTabLayout.createSequentialGroup()
                        .addComponent(productosTiendaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                        .addComponent(productosTiendaButton)))
                .addContainerGap())
        );
        productosTiendaTabLayout.setVerticalGroup(
            productosTiendaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productosTiendaTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productosTiendaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(productosTiendaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productosTiendaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productosTiendaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        reportesTabbedPane.addTab("Top 20: Productos por Tienda", productosTiendaTab);

        Top20ProductosPais.setBackground(new java.awt.Color(255, 255, 255));

        productosPaisComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                productosPaisComboBoxItemStateChanged(evt);
            }
        });

        productosPaisButton.setText("Ver Productos");
        productosPaisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosPaisButtonActionPerformed(evt);
            }
        });

        productosPaisTable.setModel(new javax.swing.table.DefaultTableModel(
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
        productosPaisScrollPane.setViewportView(productosPaisTable);

        javax.swing.GroupLayout Top20ProductosPaisLayout = new javax.swing.GroupLayout(Top20ProductosPais);
        Top20ProductosPais.setLayout(Top20ProductosPaisLayout);
        Top20ProductosPaisLayout.setHorizontalGroup(
            Top20ProductosPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Top20ProductosPaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Top20ProductosPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productosPaisScrollPane)
                    .addGroup(Top20ProductosPaisLayout.createSequentialGroup()
                        .addComponent(productosPaisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                        .addComponent(productosPaisButton)))
                .addContainerGap())
        );
        Top20ProductosPaisLayout.setVerticalGroup(
            Top20ProductosPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Top20ProductosPaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Top20ProductosPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(productosPaisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productosPaisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productosPaisScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        reportesTabbedPane.addTab("Top 20: Productos por País", Top20ProductosPais);

        Top5VentasAnuales.setBackground(new java.awt.Color(255, 255, 255));

        ventasAnualesTiendaButton.setText("Refresh");
        ventasAnualesTiendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasAnualesTiendaButtonActionPerformed(evt);
            }
        });

        ventasAnualesTiendaTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ventasAnualesTiendaScrollPane.setViewportView(ventasAnualesTiendaTable);

        javax.swing.GroupLayout Top5VentasAnualesLayout = new javax.swing.GroupLayout(Top5VentasAnuales);
        Top5VentasAnuales.setLayout(Top5VentasAnualesLayout);
        Top5VentasAnualesLayout.setHorizontalGroup(
            Top5VentasAnualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Top5VentasAnualesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Top5VentasAnualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ventasAnualesTiendaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                    .addGroup(Top5VentasAnualesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ventasAnualesTiendaButton)))
                .addContainerGap())
        );
        Top5VentasAnualesLayout.setVerticalGroup(
            Top5VentasAnualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Top5VentasAnualesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ventasAnualesTiendaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ventasAnualesTiendaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        reportesTabbedPane.addTab("Top 5: Tiendas por Ventas Anuales", Top5VentasAnuales);

        TiendasCocaPepsi.setBackground(new java.awt.Color(255, 255, 255));

        ventasCocaPepsiButton.setText("Refresh");
        ventasCocaPepsiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasCocaPepsiButtonActionPerformed(evt);
            }
        });

        ventasCocaPepsiTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ventasCocaPepsiScrollPane.setViewportView(ventasCocaPepsiTable);

        javax.swing.GroupLayout TiendasCocaPepsiLayout = new javax.swing.GroupLayout(TiendasCocaPepsi);
        TiendasCocaPepsi.setLayout(TiendasCocaPepsiLayout);
        TiendasCocaPepsiLayout.setHorizontalGroup(
            TiendasCocaPepsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TiendasCocaPepsiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TiendasCocaPepsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ventasCocaPepsiScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                    .addGroup(TiendasCocaPepsiLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ventasCocaPepsiButton)))
                .addContainerGap())
        );
        TiendasCocaPepsiLayout.setVerticalGroup(
            TiendasCocaPepsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TiendasCocaPepsiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ventasCocaPepsiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ventasCocaPepsiScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        reportesTabbedPane.addTab("Sales: Tiendas (CocaCola > Pepsi)", TiendasCocaPepsi);

        productType.setBackground(new java.awt.Color(255, 255, 255));

        productTypeButton.setText("Refresh");
        productTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productTypeButtonActionPerformed(evt);
            }
        });

        productTypeTable.setModel(new javax.swing.table.DefaultTableModel(
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
        productTypeScrollPane.setViewportView(productTypeTable);

        javax.swing.GroupLayout productTypeLayout = new javax.swing.GroupLayout(productType);
        productType.setLayout(productTypeLayout);
        productTypeLayout.setHorizontalGroup(
            productTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productTypeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                    .addGroup(productTypeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(productTypeButton)))
                .addContainerGap())
        );
        productTypeLayout.setVerticalGroup(
            productTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productTypeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        reportesTabbedPane.addTab("Top 3 Sales: Productos (Menos Leche)", productType);

        javax.swing.GroupLayout reportesTabLayout = new javax.swing.GroupLayout(reportesTab);
        reportesTab.setLayout(reportesTabLayout);
        reportesTabLayout.setHorizontalGroup(
            reportesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportesTabLayout.createSequentialGroup()
                .addComponent(reportesTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reportesTabLayout.setVerticalGroup(
            reportesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportesTabbedPane)
        );

        adminTabbedPane.addTab("Reportes", reportesTab);

        javax.swing.GroupLayout adminScreenLayout = new javax.swing.GroupLayout(adminScreen.getContentPane());
        adminScreen.getContentPane().setLayout(adminScreenLayout);
        adminScreenLayout.setHorizontalGroup(
            adminScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminTabbedPane)
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
        
        int tienda_id = Integer.parseInt(producto_tiendaComboBox.getSelectedItem().toString().substring(0, producto_tiendaComboBox.getSelectedItem().toString().indexOf('-')-1));
        int codigo_UPC = Integer.parseInt(producto_codigoUPCTextField.getText());
        int precio = Integer.parseInt(producto_precioTextField.getText());
        int cantidad = Integer.parseInt(producto_cantidadTextField.getText());
        int reorden = Integer.parseInt(producto_reordenTextField.getText());

        Insertar.insercionPRODUCTO(upc, nombre, tamano, embalaje, marca, tienda_id, codigo_UPC, precio, cantidad, reorden);

        producto_codigoUPCTextField.setText("");
        producto_nombreTextField.setText("");
        producto_tamanoLabelTextField.setText("");
        producto_embalajeTextField.setText("");
        producto_marcaTextField.setText("");
        producto_precioTextField.setText("");
        producto_cantidadTextField.setText("");
        producto_reordenTextField.setText("");
        

    }//GEN-LAST:event_crearProductoButtonActionPerformed

    private void crearFacturaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearFacturaButtonActionPerformed
        int numero = Integer.parseInt(factura_numeroTextField.getText());
        String fecha = factura_fechaTextField.getText();
        double subtotal = Double.parseDouble(factura_subtotalTextField.getText());
        
        double isv = subtotal * 0.15;
        
        
        double total = subtotal + isv;
        
        int clienteid = Integer.parseInt(facturacliente_idTextField.getText());
        int tiendaid = Integer.parseInt(facturatienda_idTextField.getText());

        Insertar.insercionFACTURA(numero, fecha, isv, subtotal, total, clienteid, tiendaid);

        factura_numeroTextField.setText("");
        factura_fechaTextField.setText("");
        //factura_ISVTextField.setText("");
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

    private void refreshInventarioProductosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshInventarioProductosButtonActionPerformed
        Reportes.inventarioProductos(inventarioProductosTable);
    }//GEN-LAST:event_refreshInventarioProductosButtonActionPerformed

    private void comprasClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasClienteButtonActionPerformed
        Reportes.comprasCliente(comprasClienteTable, comprasClienteComboBox);
    }//GEN-LAST:event_comprasClienteButtonActionPerformed

    private void reportesTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_reportesTabbedPaneStateChanged
        
    }//GEN-LAST:event_reportesTabbedPaneStateChanged

    private void comprasClienteComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comprasClienteComboBoxItemStateChanged
        
    }//GEN-LAST:event_comprasClienteComboBoxItemStateChanged

    private void adminTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_adminTabbedPaneStateChanged
        Reportes.inventarioProductos(inventarioProductosTable);
        
        //Mantenimiento
        modificarTiendaComboBox.removeAllItems();
        Reportes.ventasTiendaComboBox(modificarTiendaComboBox);
        eliminarTiendaComboBox.removeAllItems();
        Reportes.ventasTiendaComboBox(eliminarTiendaComboBox);
        
        modificarClienteComboBox.removeAllItems();
        Reportes.comprasClienteComboBox(modificarClienteComboBox);
        eliminarClienteComboBox.removeAllItems();
        Reportes.comprasClienteComboBox(eliminarClienteComboBox);
        
        producto_tiendaComboBox.removeAllItems();
        Reportes.ventasTiendaComboBox(producto_tiendaComboBox);
        modificarProductosComboBox.removeAllItems();
        Reportes.productosComboBox(modificarProductosComboBox);
        eliminarProductoComboBox.removeAllItems();
        Reportes.productosComboBox(eliminarProductoComboBox);
        
        modificarVendedorComboBox.removeAllItems();
        Reportes.vendedoresComboBox(modificarVendedorComboBox);
        
        eliminarVendedorComboBox.removeAllItems();
        Reportes.vendedoresComboBox(eliminarVendedorComboBox);
        
        
        //Reportes
        comprasClienteComboBox.removeAllItems();
        Reportes.comprasClienteComboBox(comprasClienteComboBox);
        ventasTiendaComboBox.removeAllItems();
        Reportes.ventasTiendaComboBox(ventasTiendaComboBox);
        productosTiendaComboBox.removeAllItems();
        Reportes.ventasTiendaComboBox(productosTiendaComboBox);
        productosPaisComboBox.removeAll();
        Reportes.PaisesComboBox(productosPaisComboBox);
        
    }//GEN-LAST:event_adminTabbedPaneStateChanged

    private void ventasTiendaComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ventasTiendaComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ventasTiendaComboBoxItemStateChanged

    private void ventasTiendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasTiendaButtonActionPerformed
        Reportes.ventasTienda(ventasTiendaTable, ventasTiendaComboBox);
    }//GEN-LAST:event_ventasTiendaButtonActionPerformed

    private void modificarTiendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarTiendaButtonActionPerformed
        int id = Integer.parseInt(modificarTiendaComboBox.getSelectedItem().toString().substring(0, modificarTiendaComboBox.getSelectedItem().toString().indexOf('-')-1));
        String nombre = tienda_nombreTextField1.getText();
        String horario = tienda_horarioTextField1.getText();
        
        System.out.println(id);
        System.out.println(nombre);
        System.out.println(horario);
        
        
        Modificar.modificarTIENDA(id, nombre, horario);
        tienda_nombreTextField1.setText("");
        tienda_horarioTextField1.setText("");
    }//GEN-LAST:event_modificarTiendaButtonActionPerformed

    private void modificarTiendaComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_modificarTiendaComboBoxItemStateChanged
        
    }//GEN-LAST:event_modificarTiendaComboBoxItemStateChanged

    private void tiendaTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tiendaTabbedPaneStateChanged
        
    }//GEN-LAST:event_tiendaTabbedPaneStateChanged

    private void eliminarTiendaComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_eliminarTiendaComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarTiendaComboBoxItemStateChanged

    private void eliminarTiendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarTiendaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarTiendaButtonActionPerformed

    private void modificarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarClienteButtonActionPerformed
        int id = Integer.parseInt(modificarClienteComboBox.getSelectedItem().toString().substring(0, modificarClienteComboBox.getSelectedItem().toString().indexOf('-')-1));
        String nombre = cliente_nombreTextField1.getText();
        String correo = cliente_correoTextField1.getText();
        
        Modificar.modificarCLIENTE(id, nombre, correo);
        
        cliente_nombreTextField1.setText("");
        cliente_correoTextField1.setText("");
    }//GEN-LAST:event_modificarClienteButtonActionPerformed

    private void modificarClienteComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_modificarClienteComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarClienteComboBoxItemStateChanged

    private void eliminarClienteComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_eliminarClienteComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarClienteComboBoxItemStateChanged

    private void eliminarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarClienteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarClienteButtonActionPerformed

    private void modificarProductoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarProductoButtonActionPerformed
        int upc = Integer.parseInt(modificarProductosComboBox.getSelectedItem().toString().substring(0, modificarProductosComboBox.getSelectedItem().toString().indexOf('-')-1));
        String nombre = producto_nombreTextField.getText();
        String tamano = producto_tamanoLabelTextField.getText();
        String embalaje = producto_embalajeTextField.getText();
        String marca = producto_marcaTextField.getText();

        Modificar.modificarPRODUCTO(upc, nombre, tamano, embalaje, marca);
        
        producto_nombreTextField1.setText("");
        producto_tamanoLabelTextField1.setText("");
        producto_embalajeTextField1.setText("");
        producto_marcaTextField1.setText("");
    }//GEN-LAST:event_modificarProductoButtonActionPerformed

    private void modificarProductosComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_modificarProductosComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarProductosComboBoxItemStateChanged

    private void eliminarProductoComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_eliminarProductoComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarProductoComboBoxItemStateChanged

    private void eliminarProductoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarProductoButton1ActionPerformed

    private void productosTiendaComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_productosTiendaComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_productosTiendaComboBoxItemStateChanged

    private void productosTiendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosTiendaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productosTiendaButtonActionPerformed

    private void producto_tiendaComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_producto_tiendaComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_producto_tiendaComboBoxItemStateChanged

    private void producto_reordenTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producto_reordenTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_producto_reordenTextFieldActionPerformed

    private void productosPaisComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_productosPaisComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_productosPaisComboBoxItemStateChanged

    private void productosPaisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosPaisButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productosPaisButtonActionPerformed

    private void ventasAnualesTiendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasAnualesTiendaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ventasAnualesTiendaButtonActionPerformed

    private void ventasCocaPepsiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasCocaPepsiButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ventasCocaPepsiButtonActionPerformed

    private void productTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productTypeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productTypeButtonActionPerformed

    private void modificarVendedorComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_modificarVendedorComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarVendedorComboBoxItemStateChanged

    private void modificarVendedorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarVendedorButtonActionPerformed
        int id = Integer.parseInt(modificarVendedorComboBox.getSelectedItem().toString().substring(0, modificarVendedorComboBox.getSelectedItem().toString().indexOf('-')-1));
        String nombre = cliente_nombreTextField2.getText();
        
        Modificar.modificarVENDEDOR(id, nombre);
        cliente_nombreTextField2.setText("");
    }//GEN-LAST:event_modificarVendedorButtonActionPerformed

    private void eliminarVendedorComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_eliminarVendedorComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarVendedorComboBoxItemStateChanged

    private void eliminarProductoButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarProductoButton2ActionPerformed

    
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
    private javax.swing.JPanel TiendasCocaPepsi;
    private javax.swing.JPanel Top20ProductosPais;
    private javax.swing.JPanel Top5VentasAnuales;
    private javax.swing.JDialog adminScreen;
    private javax.swing.JTabbedPane adminTabbedPane;
    private javax.swing.JPanel clienteCrearTab;
    private javax.swing.JPanel clienteEliminarTab;
    private javax.swing.JPanel clienteModificarTab;
    private javax.swing.JPanel clienteTab;
    private javax.swing.JTabbedPane clienteTabbedPane;
    private javax.swing.JLabel cliente_correoLabel;
    private javax.swing.JLabel cliente_correoLabel1;
    private javax.swing.JTextField cliente_correoTextField;
    private javax.swing.JTextField cliente_correoTextField1;
    private javax.swing.JLabel cliente_idLabel;
    private javax.swing.JLabel cliente_idLabel1;
    private javax.swing.JLabel cliente_idLabel2;
    private javax.swing.JTextField cliente_idTextField;
    private javax.swing.JLabel cliente_nombreLabel;
    private javax.swing.JLabel cliente_nombreLabel1;
    private javax.swing.JLabel cliente_nombreLabel2;
    private javax.swing.JTextField cliente_nombreTextField;
    private javax.swing.JTextField cliente_nombreTextField1;
    private javax.swing.JTextField cliente_nombreTextField2;
    private javax.swing.JButton comprasClienteButton;
    private javax.swing.JComboBox<String> comprasClienteComboBox;
    private javax.swing.JScrollPane comprasClienteScrollPane;
    private javax.swing.JPanel comprasClienteTab;
    private javax.swing.JTable comprasClienteTable;
    private javax.swing.JButton crearFacturaButton;
    private javax.swing.JButton crearProductoButton;
    private javax.swing.JButton crearTiendaButton;
    private javax.swing.JButton crearTiendaButton1;
    private javax.swing.JButton crearVendedorButton;
    private javax.swing.JButton eliminarClienteButton;
    private javax.swing.JComboBox<String> eliminarClienteComboBox;
    private javax.swing.JButton eliminarProductoButton1;
    private javax.swing.JButton eliminarProductoButton2;
    private javax.swing.JComboBox<String> eliminarProductoComboBox;
    private javax.swing.JButton eliminarTiendaButton;
    private javax.swing.JComboBox<String> eliminarTiendaComboBox;
    private javax.swing.JComboBox<String> eliminarVendedorComboBox;
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
    private javax.swing.JScrollPane inventarioProductosScrollPane;
    private javax.swing.JPanel inventarioProductosTab;
    private javax.swing.JTable inventarioProductosTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel mantenimientoTab;
    private javax.swing.JTabbedPane mantenimientoTabbedPane;
    private javax.swing.JButton modificarClienteButton;
    private javax.swing.JComboBox<String> modificarClienteComboBox;
    private javax.swing.JButton modificarProductoButton;
    private javax.swing.JComboBox<String> modificarProductosComboBox;
    private javax.swing.JButton modificarTiendaButton;
    private javax.swing.JComboBox<String> modificarTiendaComboBox;
    private javax.swing.JButton modificarVendedorButton;
    private javax.swing.JComboBox<String> modificarVendedorComboBox;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JButton previewAdminButton;
    private javax.swing.JButton previewUserButton;
    private javax.swing.JPanel productType;
    private javax.swing.JButton productTypeButton;
    private javax.swing.JScrollPane productTypeScrollPane;
    private javax.swing.JTable productTypeTable;
    private javax.swing.JPanel productoCrearTab;
    private javax.swing.JPanel productoEliminarTab;
    private javax.swing.JPanel productoModificarTab;
    private javax.swing.JPanel productoTab;
    private javax.swing.JTabbedPane productoTabbedPane;
    private javax.swing.JTextField producto_cantidadTextField;
    private javax.swing.JLabel producto_codigoUPCLabel;
    private javax.swing.JLabel producto_codigoUPCLabel1;
    private javax.swing.JTextField producto_codigoUPCTextField;
    private javax.swing.JLabel producto_embalajeLabel;
    private javax.swing.JLabel producto_embalajeLabel1;
    private javax.swing.JTextField producto_embalajeTextField;
    private javax.swing.JTextField producto_embalajeTextField1;
    private javax.swing.JLabel producto_marcaLabel;
    private javax.swing.JLabel producto_marcaLabel1;
    private javax.swing.JTextField producto_marcaTextField;
    private javax.swing.JTextField producto_marcaTextField1;
    private javax.swing.JLabel producto_nombreLabel;
    private javax.swing.JLabel producto_nombreLabel1;
    private javax.swing.JTextField producto_nombreTextField;
    private javax.swing.JTextField producto_nombreTextField1;
    private javax.swing.JTextField producto_precioTextField;
    private javax.swing.JTextField producto_reordenTextField;
    private javax.swing.JLabel producto_tamanoLabel;
    private javax.swing.JLabel producto_tamanoLabel1;
    private javax.swing.JTextField producto_tamanoLabelTextField;
    private javax.swing.JTextField producto_tamanoLabelTextField1;
    private javax.swing.JComboBox<String> producto_tiendaComboBox;
    private javax.swing.JButton productosPaisButton;
    private javax.swing.JComboBox<String> productosPaisComboBox;
    private javax.swing.JScrollPane productosPaisScrollPane;
    private javax.swing.JTable productosPaisTable;
    private javax.swing.JButton productosTiendaButton;
    private javax.swing.JComboBox<String> productosTiendaComboBox;
    private javax.swing.JScrollPane productosTiendaScrollPane;
    private javax.swing.JPanel productosTiendaTab;
    private javax.swing.JTable productosTiendaTable;
    private javax.swing.JButton refreshInventarioProductosButton;
    private javax.swing.JPanel reportesTab;
    private javax.swing.JTabbedPane reportesTabbedPane;
    private javax.swing.JPanel tiendaCrearTab;
    private javax.swing.JPanel tiendaEliminarTab;
    private javax.swing.JPanel tiendaModificarTab;
    private javax.swing.JPanel tiendaTab;
    private javax.swing.JTabbedPane tiendaTabbedPane;
    private javax.swing.JLabel tienda_horarioLabel;
    private javax.swing.JLabel tienda_horarioLabel1;
    private javax.swing.JTextField tienda_horarioTextField;
    private javax.swing.JTextField tienda_horarioTextField1;
    private javax.swing.JLabel tienda_idLabel;
    private javax.swing.JLabel tienda_idLabel1;
    private javax.swing.JLabel tienda_idLabel2;
    private javax.swing.JLabel tienda_idLabel3;
    private javax.swing.JLabel tienda_idLabel4;
    private javax.swing.JLabel tienda_idLabel5;
    private javax.swing.JTextField tienda_idTextField;
    private javax.swing.JLabel tienda_nombreLabel;
    private javax.swing.JLabel tienda_nombreLabel1;
    private javax.swing.JTextField tienda_nombreTextField;
    private javax.swing.JTextField tienda_nombreTextField1;
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
    private javax.swing.JButton ventasAnualesTiendaButton;
    private javax.swing.JScrollPane ventasAnualesTiendaScrollPane;
    private javax.swing.JTable ventasAnualesTiendaTable;
    private javax.swing.JButton ventasCocaPepsiButton;
    private javax.swing.JScrollPane ventasCocaPepsiScrollPane;
    private javax.swing.JTable ventasCocaPepsiTable;
    private javax.swing.JButton ventasTiendaButton;
    private javax.swing.JComboBox<String> ventasTiendaComboBox;
    private javax.swing.JScrollPane ventasTiendaScrollPane;
    private javax.swing.JPanel ventasTiendaTab;
    private javax.swing.JTable ventasTiendaTable;
    // End of variables declaration//GEN-END:variables
}
