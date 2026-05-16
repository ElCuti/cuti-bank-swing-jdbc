package com.trabajojdbc.gestion_bancaria;

import com.trabajojdbc.gestion_bancaria.util.ValidacionUtil;
import com.trabajojdbc.gestion_bancaria.repository.BancoRepository;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Daniel
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Cuenta cuentaActiva = null;

    public VentanaPrincipal() {
        initComponents();
        tablaMovimientos.setRowSelectionAllowed(false); 
        tablaMovimientos.setColumnSelectionAllowed(false); 
        tablaMovimientos.setCellSelectionEnabled(false); 
        tablaMovimientos.setFocusable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        panelContenedor = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCuenta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        panelTransacciones = new javax.swing.JPanel();
        txtBienvenida = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        txtSaldo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMovimientos = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNumR = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtComentario = new javax.swing.JTextField();
        btnEnviarTransaccion = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        panelRegistrar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUsuarioCrear = new javax.swing.JTextField();
        txtDNICrear = new javax.swing.JTextField();
        txtApellidoCrear = new javax.swing.JTextField();
        btnCrearUsuario = new javax.swing.JButton();
        btnIrLogin = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        panelCrear = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNumeroCrearCuenta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDNICrearCuenta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnCrearCuenta = new javax.swing.JButton();
        btnIrLogin1 = new javax.swing.JButton();
        txtContraseñaCrearCuenta = new javax.swing.JPasswordField();
        txtConfContraseñaCrearCuenta = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\jc324\\Documents\\GitHub\\ProyectoJavaJDBC_GestionBancaria\\imagenes\\logo.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelContenedor.setLayout(new java.awt.CardLayout());

        jLabel1.setText("NUMERO CUENTA");

        jLabel2.setText("CONTRASEÑA");

        btnEntrar.setText("LOGIN");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Introduzca su numero de cuenta y su contraseña para acceder a su cuenta");

        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("REGISTRARME");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCrear.setText("CREAR CUENTA");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(375, 375, 375))
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                                .addComponent(btnRegistrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCrear))
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addComponent(btnBorrar)
                                .addGap(95, 95, 95)
                                .addComponent(btnEntrar)))))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntrar))
                .addGap(55, 55, 55)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnRegistrar))
                .addContainerGap())
        );

        panelContenedor.add(panelLogin, "pantalla_login");

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtSaldo.setText("Tu saldo actual es de :");

        tablaMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Cantidad", "Fecha", "Numero de Cuenta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMovimientos);

        jLabel14.setText("Tus ultimos movimientos");

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setText("Transacción");

        jLabel16.setText("Número de cuenta:");

        txtNumR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumRActionPerformed(evt);
            }
        });

        jLabel17.setText("Cantidad a enviar");

        jLabel18.setText("Comentario:");

        btnEnviarTransaccion.setText("Enviar");
        btnEnviarTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarTransaccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel15)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(txtNumR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnEnviarTransaccion)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnEnviarTransaccion)
                .addGap(18, 18, 18))
        );

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        javax.swing.GroupLayout panelTransaccionesLayout = new javax.swing.GroupLayout(panelTransacciones);
        panelTransacciones.setLayout(panelTransaccionesLayout);
        panelTransaccionesLayout.setHorizontalGroup(
            panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransaccionesLayout.createSequentialGroup()
                .addGroup(panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTransaccionesLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelTransaccionesLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBienvenida)
                                    .addComponent(txtSaldo))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransaccionesLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(207, 207, 207))))
                    .addGroup(panelTransaccionesLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTransaccionesLayout.setVerticalGroup(
            panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransaccionesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtBienvenida)
                .addGap(35, 35, 35)
                .addGroup(panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSaldo)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelContenedor.add(panelTransacciones, "pantalla_transacciones\n\n");

        jLabel4.setText("CREAR USUARIO");

        jLabel6.setText("Nombre*");

        jLabel7.setText("Apellido");

        jLabel8.setText("DNI*");

        txtUsuarioCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioCrearActionPerformed(evt);
            }
        });

        btnCrearUsuario.setText("CREAR USUARIO");
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        btnIrLogin.setText("IR AL LOGIN");
        btnIrLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrLoginActionPerformed(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        javax.swing.GroupLayout panelRegistrarLayout = new javax.swing.GroupLayout(panelRegistrar);
        panelRegistrar.setLayout(panelRegistrarLayout);
        panelRegistrarLayout.setHorizontalGroup(
            panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarLayout.createSequentialGroup()
                .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistrarLayout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jLabel4))
                    .addGroup(panelRegistrarLayout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(btnIrLogin)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelRegistrarLayout.createSequentialGroup()
                .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtApellidoCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegistrarLayout.createSequentialGroup()
                                .addGap(375, 375, 375)
                                .addComponent(jLabel6))
                            .addGroup(panelRegistrarLayout.createSequentialGroup()
                                .addGap(311, 311, 311)
                                .addComponent(txtUsuarioCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRegistrarLayout.createSequentialGroup()
                                .addGap(376, 376, 376)
                                .addComponent(jLabel7))))
                    .addGroup(panelRegistrarLayout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jLabel8))
                    .addGroup(panelRegistrarLayout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearUsuario)
                            .addComponent(txtDNICrear, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRegistrarLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        panelRegistrarLayout.setVerticalGroup(
            panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuarioCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidoCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDNICrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCrearUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIrLogin)
                .addGap(43, 43, 43)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        panelContenedor.add(panelRegistrar, "panel_registrar");

        jLabel5.setText("CREAR CUENTA");

        jLabel9.setText("Numero");

        txtNumeroCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCrearCuentaActionPerformed(evt);
            }
        });

        jLabel10.setText("Contraseña");

        jLabel12.setText("DNI");

        jLabel11.setText("Confirmar Contraseña");

        btnCrearCuenta.setText("CREAR CUENTA");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        btnIrLogin1.setText("IR AL LOGIN");
        btnIrLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrLogin1ActionPerformed(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        javax.swing.GroupLayout panelCrearLayout = new javax.swing.GroupLayout(panelCrear);
        panelCrear.setLayout(panelCrearLayout);
        panelCrearLayout.setHorizontalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrearLayout.createSequentialGroup()
                                .addGap(353, 353, 353)
                                .addComponent(jLabel5))
                            .addGroup(panelCrearLayout.createSequentialGroup()
                                .addGap(314, 314, 314)
                                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(12, 12, 12)))
                                .addGap(80, 80, 80)
                                .addComponent(jLabel10))
                            .addGroup(panelCrearLayout.createSequentialGroup()
                                .addGap(281, 281, 281)
                                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCrearLayout.createSequentialGroup()
                                        .addComponent(btnCrearCuenta)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnIrLogin1))
                                    .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panelCrearLayout.createSequentialGroup()
                                            .addComponent(txtDNICrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtConfContraseñaCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelCrearLayout.createSequentialGroup()
                                            .addComponent(txtNumeroCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtContraseñaCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        panelCrearLayout.setVerticalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContraseñaCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)))
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDNICrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConfContraseñaCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearCuenta)
                    .addComponent(btnIrLogin1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        panelContenedor.add(panelCrear, "panel_crear");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.cuentaActiva = null;
        mostrar(panelLogin);
        java.awt.CardLayout layout = (java.awt.CardLayout) panelContenedor.getLayout();
        layout.show(panelContenedor, "pantalla_login");
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            int numero = Integer.parseInt(txtCuenta.getText());
            String contrasenia = txtPass.getText().trim();

            Cuenta cuentaEncontrada = BancoRepository.buscarCuentaPorNumero(em, numero);

            if (cuentaEncontrada != null && BCrypt.checkpw(contrasenia, cuentaEncontrada.getContrasenia())) {
                this.cuentaActiva = cuentaEncontrada;
                mostrar(panelTransacciones);
                java.awt.CardLayout layout = (java.awt.CardLayout) panelContenedor.getLayout();
                layout.show(panelContenedor, "pantalla_transacciones");
                Usuario propietario = cuentaEncontrada.getIDUsuario();
                txtCuenta.setText("");
                txtPass.setText("");
                txtBienvenida.setText("¡Bienvenido a tu cuenta " + propietario.getNombre() + "!");
                txtSaldo.setText("Tu saldo actual es de " + cuentaEncontrada.getSaldo() + "€");
                actualizarTablaMovimientos();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "El numero o la contraseña son incorrectos, verifique y vuelva a intentarlo", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);

            }

        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error, compruebe que has introducido todos los datos necesarios y correctamente", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } finally {
            em.close();
        }


    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        String nombre = txtUsuarioCrear.getText().trim();
        String apellido = txtApellidoCrear.getText().trim();
        String dni = txtDNICrear.getText().trim();

        if (nombre.isEmpty() || dni.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "El Nombre y el DNI son campos obligatorios", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!ValidacionUtil.dniCheck(dni)) {
            javax.swing.JOptionPane.showMessageDialog(this, "El DNI no tiene el formato correcto, comprueba que este correcto (8 Numeros y una letra mayuscula)", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombre(nombre);
        nuevoUsuario.setApellido(apellido);
        nuevoUsuario.setDni(dni);

        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(nuevoUsuario);
            em.getTransaction().commit();
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario creado correctamente.");
            txtUsuarioCrear.setText("");
            txtApellidoCrear.setText("");
            txtDNICrear.setText("");
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            if (e.getMessage() != null && e.getMessage().contains("UNIQUE constraint failed: Usuario.DNI")) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error al guardar: ESTE DNI YA ESTA REGISTRADO!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }

        } finally {
            em.close();
        }
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void btnIrLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrLoginActionPerformed
        mostrar(panelLogin);
        java.awt.CardLayout layout = (java.awt.CardLayout) panelContenedor.getLayout();
        layout.show(panelContenedor, "pantalla_login");
    }//GEN-LAST:event_btnIrLoginActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        mostrar(panelRegistrar);
        java.awt.CardLayout layout = (java.awt.CardLayout) panelContenedor.getLayout();
        layout.show(panelContenedor, "pantalla_registrar");    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtUsuarioCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioCrearActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        mostrar(panelCrear);
        java.awt.CardLayout layout = (java.awt.CardLayout) panelContenedor.getLayout();
        layout.show(panelContenedor, "pantalla_crear");    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnIrLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrLogin1ActionPerformed
        mostrar(panelLogin);
        java.awt.CardLayout layout = (java.awt.CardLayout) panelContenedor.getLayout();
        layout.show(panelContenedor, "pantalla_login");    }//GEN-LAST:event_btnIrLogin1ActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            String strNumero = txtNumeroCrearCuenta.getText();
            String contrasenia = txtContraseñaCrearCuenta.getText().trim();
            String dni = txtDNICrearCuenta.getText().trim();
            String contraseniaCheck = txtConfContraseñaCrearCuenta.getText().trim();

            if (!contrasenia.equals(contraseniaCheck)) {
                javax.swing.JOptionPane.showMessageDialog(this, "No coinciden las contraseñas, tienen que ser las mismas", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                txtContraseñaCrearCuenta.setText("");
                txtConfContraseñaCrearCuenta.setText("");
                return;
            }
            if (strNumero.isEmpty() || dni.isEmpty() || contrasenia.isEmpty() || contraseniaCheck.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            int numero = Integer.parseInt(strNumero);
            if (!ValidacionUtil.dniCheck(dni)) {
                javax.swing.JOptionPane.showMessageDialog(this, "El DNI no tiene el formato correcto, comprueba que este correcto (8 Numeros y una letra mayuscula)", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            Integer id = BancoRepository.obtenerIdUsuarioPorDni(em, dni);
            if (id == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "El DNI no corresponde a ninguno de nuestra base de datos, compruebelo de nuevo", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                em.close();
                return;
            }
            Cuenta cuentaNueva = new Cuenta();
            Usuario propietario = new Usuario(id);
            cuentaNueva.setIDUsuario(propietario);
            cuentaNueva.setNumero(numero);
            cuentaNueva.setContrasenia(BCrypt.hashpw(contrasenia, BCrypt.gensalt()));

            try {
                em.getTransaction().begin();
                em.persist(cuentaNueva);
                em.getTransaction().commit();
                javax.swing.JOptionPane.showMessageDialog(this, "Cuenta creada correctamente.");
                txtNumeroCrearCuenta.setText("");
                txtContraseñaCrearCuenta.setText("");
                txtDNICrearCuenta.setText("");
                txtConfContraseñaCrearCuenta.setText("");
            } catch (Exception e) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                if (e.getMessage() != null && e.getMessage().contains("UNIQUE constraint failed (UNIQUE constraint failed: Cuenta.Numero")) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Error al ejecutar: ESTE NÚMERO ESTA EN USO!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
            }
        } finally {
            em.close();
        }
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void txtNumeroCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCrearCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCrearCuentaActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            int numero = Integer.parseInt(txtCuenta.getText());
            String contrasenia = txtPass.getText().trim();

            Cuenta cuentaEncontrada = BancoRepository.buscarCuentaPorNumero(em, numero);

            if (cuentaEncontrada != null && BCrypt.checkpw(contrasenia, cuentaEncontrada.getContrasenia())) {
                em.getTransaction().begin();
                em.remove(cuentaEncontrada);
                em.getTransaction().commit();
                javax.swing.JOptionPane.showMessageDialog(this, "Cuenta borrada con exito!", "Borrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "El numero o la contraseña son incorrectos, verifique y vuelva a intentarlo", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);

            }

        } catch (NumberFormatException ex) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            javax.swing.JOptionPane.showMessageDialog(this, "Error, compruebe que has introducido todos los datos necesarios y correctamente", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } finally {
            em.close();
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtNumRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumRActionPerformed

    private void btnEnviarTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarTransaccionActionPerformed
        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            int numeroEnviar = Integer.parseInt(txtNumR.getText());
            int cantidad = Integer.parseInt(txtCantidad.getText());
            String comentario = txtComentario.getText().trim();
            Cuenta cuentaOrigen = em.find(Cuenta.class, this.cuentaActiva.getId());
            Cuenta cuentaDestino = BancoRepository.buscarCuentaPorNumero(em, numeroEnviar);
            if (cantidad <= 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "La cantidad a enviar debe ser mayor a 0.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cuentaDestino == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "La cuenta de destino no existe.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cuentaOrigen.getId() == cuentaDestino.getId()) {
                javax.swing.JOptionPane.showMessageDialog(this, "No puedes enviarte dinero a ti mismo.", "Error", javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (cuentaOrigen.getSaldo() < cantidad) {
                javax.swing.JOptionPane.showMessageDialog(this, "Saldo insuficiente para realizar la transacción.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            int respuesta = javax.swing.JOptionPane.showConfirmDialog(
                    this, "¿Estás seguro de que quieres enviar " + cantidad + "€ a la cuenta número " + numeroEnviar + "?", "Confirmar Transferencia", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE
            );
            if (respuesta != javax.swing.JOptionPane.YES_OPTION) {
                return;
            }
            em.getTransaction().begin();

            cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - cantidad);
            cuentaDestino.setSaldo(cuentaDestino.getSaldo() + cantidad);

            Transacciones nuevoMovimiento = new Transacciones();
            nuevoMovimiento.setCantidad(cantidad);
            nuevoMovimiento.setComentario(comentario);
            nuevoMovimiento.setCuentaEmisor(cuentaOrigen);
            nuevoMovimiento.setCuentaReceptor(cuentaDestino);

            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            nuevoMovimiento.setFecha(sdf.format(new java.util.Date()));

            em.persist(nuevoMovimiento);
            em.getTransaction().commit();
            txtNumR.setText("");
            txtCantidad.setText("");
            txtComentario.setText("");
            txtSaldo.setText("Tu saldo actual es de " + cuentaOrigen.getSaldo() + "€");
            actualizarTablaMovimientos();
            javax.swing.JOptionPane.showMessageDialog(this, "¡Transacción enviada con éxito!", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {

        } finally {
            em.close();
        }
    }//GEN-LAST:event_btnEnviarTransaccionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatDarkLaf());

        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, "No se pudo inicializar FlatLaf", ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    public void mostrar(Component comp) {
        panelContenedor.removeAll();
        panelContenedor.add(comp);
        panelContenedor.repaint();
        panelContenedor.revalidate();
    }

    public void actualizarTablaMovimientos() {
        if (this.cuentaActiva == null) {
            return;
        }
        EntityManager em = EntityManagerUtil.getEntityManager();
        try{
        List<Transacciones> ultimosMovimientos = BancoRepository.obtenerUltimosMovimientos(this.cuentaActiva.getId());

            DefaultTableModel modelo = (DefaultTableModel) tablaMovimientos.getModel();
            modelo.setRowCount(0);

            for (Transacciones transaccion : ultimosMovimientos) {
                String tipo;
                int numeroRelacionado;

                if (transaccion.getCuentaEmisor().getId() == this.cuentaActiva.getId()) {
                    tipo = "Enviado";
                    numeroRelacionado = transaccion.getCuentaReceptor().getNumero();
                } else {
                    tipo = "Recibido";
                    numeroRelacionado = transaccion.getCuentaEmisor().getNumero();
                }
                modelo.addRow(new Object[]{
                    tipo,
                    transaccion.getCantidad() + "€",
                    transaccion.getFecha(),
                    numeroRelacionado
                });
            }
            DefaultTableCellRenderer renderizadorColores = new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                    String tipoMovimiento = (String) table.getModel().getValueAt(row, 0);

                    if (!isSelected) { 
                        if ("Enviado".equals(tipoMovimiento)) {
                            c.setBackground(new Color(255, 235, 235)); 
                            c.setForeground(Color.black);
                        } else if ("Recibido".equals(tipoMovimiento)) {
                            c.setBackground(new Color(212, 250, 190)); 
                            c.setForeground(Color.black);
                        } else {
                            c.setBackground(Color.WHITE);
                        }
                    }

                    setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    return c;
                }
            };
            for (int i = 0; i < tablaMovimientos.getColumnCount(); i++) {
                tablaMovimientos.getColumnModel().getColumn(i).setCellRenderer(renderizadorColores);
            }

        } catch (Exception e) {
            
        } finally {
            em.close();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEnviarTransaccion;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnIrLogin;
    private javax.swing.JButton btnIrLogin1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelCrear;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelRegistrar;
    private javax.swing.JPanel panelTransacciones;
    private javax.swing.JTable tablaMovimientos;
    private javax.swing.JTextField txtApellidoCrear;
    private javax.swing.JLabel txtBienvenida;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtComentario;
    private javax.swing.JPasswordField txtConfContraseñaCrearCuenta;
    private javax.swing.JPasswordField txtContraseñaCrearCuenta;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtDNICrear;
    private javax.swing.JTextField txtDNICrearCuenta;
    private javax.swing.JTextField txtNumR;
    private javax.swing.JTextField txtNumeroCrearCuenta;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JLabel txtSaldo;
    private javax.swing.JTextField txtUsuarioCrear;
    // End of variables declaration//GEN-END:variables
}
