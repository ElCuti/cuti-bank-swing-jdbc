package com.trabajojdbc.gestion_bancaria;

import com.trabajojdbc.gestion_bancaria.service.BancoService;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    // Inicializamos las variables que vamos a tener que usar a lo largo del código
    private Cuenta cuentaActiva = null;
    private BancoService bancoService = new BancoService();
    private int paginaActual = 0;
    private final int TAMANO_PAGINA = 5;

    public VentanaPrincipal() {
        //Iniciamos los componentes de la parte grafica y desactivamos la selección de la tabla de transacciones
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
        btnCambiarContrasenia = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        lblPagina = new javax.swing.JLabel();
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

        btnBorrar.setText("BORRAR CUENTA");
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
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(97, 97, 97)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(35, 35, 35)
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

        btnCambiarContrasenia.setText("Cambiar Contraseña");
        btnCambiarContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarContraseniaActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente >");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnAnterior.setText("< Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        lblPagina.setText("Página 1");

        javax.swing.GroupLayout panelTransaccionesLayout = new javax.swing.GroupLayout(panelTransacciones);
        panelTransacciones.setLayout(panelTransaccionesLayout);
        panelTransaccionesLayout.setHorizontalGroup(
            panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransaccionesLayout.createSequentialGroup()
                .addGroup(panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTransaccionesLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelTransaccionesLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBienvenida)
                                    .addComponent(txtSaldo)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransaccionesLayout.createSequentialGroup()
                                .addComponent(btnExit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCambiarContrasenia)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransaccionesLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(207, 207, 207)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransaccionesLayout.createSequentialGroup()
                                .addComponent(btnAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPagina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSiguiente)
                                .addGap(6, 6, 6))))
                    .addGroup(panelTransaccionesLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addGroup(panelTransaccionesLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSiguiente)
                            .addComponent(btnAnterior)
                            .addComponent(lblPagina))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelTransaccionesLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExit)
                            .addComponent(btnCambiarContrasenia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addContainerGap(58, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
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

    /**
     * Cierre de sesión del usuario logeado
     */
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.cuentaActiva = null;
        mostrar(panelLogin);
        java.awt.CardLayout layout = (java.awt.CardLayout) panelContenedor.getLayout();
        layout.show(panelContenedor, "pantalla_login");
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * Procesa el intento de logearte con tu cuenta
     */
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try {
            //Recogemos los datos de los campos de texto
            int numero = Integer.parseInt(txtCuenta.getText());
            String contrasenia = txtPass.getText().trim();

            //Obtenemos la cuenta
            Cuenta cuentaLogueada = bancoService.login(numero, contrasenia);

            //Establecemos la cuenta de forma activa y lo redirigimos al panel de transacciones
            this.cuentaActiva = cuentaLogueada;
            mostrar(panelTransacciones);
            java.awt.CardLayout layout = (java.awt.CardLayout) panelContenedor.getLayout();
            layout.show(panelContenedor, "pantalla_transacciones");

            //Guardamos el ID del usuario activo
            Usuario propietario = cuentaLogueada.getIDUsuario();

            //Vaciamos los campos de texto del login y rellenamos los campos de bienvenida del panel de transacciones
            txtCuenta.setText("");
            txtPass.setText("");
            txtBienvenida.setText("¡Bienvenido a tu cuenta " + propietario.getNombre() + "!");
            txtSaldo.setText("Tu saldo actual es de " + cuentaLogueada.getSaldo() + "€");

            //Establecemos la primera pagina del historial de transacciones y la mostramos
            this.paginaActual = 0;
            actualizarTablaMovimientos();

        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, introduce un número de cuenta válido (solo números).", "Error de Formato", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Error de Autenticación", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEntrarActionPerformed
    /**
     * Procesamiento de creación de usuario
     */
    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        try {
            //Recogemos los datos de los campos de texto
            String nombre = txtUsuarioCrear.getText().trim();
            String apellido = txtApellidoCrear.getText().trim();
            String dni = txtDNICrear.getText().trim();

            //Creamos el usuario con los datos insertados
            bancoService.crearUsuario(nombre, apellido, dni);

            //Mostramos mensaje de exito
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario creado correctamente.", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            //Vaciamos los campos de texto
            txtUsuarioCrear.setText("");
            txtApellidoCrear.setText("");
            txtDNICrear.setText("");

        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    /**
     * Boton para volver al login desde crear usuario
     */
    private void btnIrLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrLoginActionPerformed
        mostrar(panelLogin);
        java.awt.CardLayout layout = (java.awt.CardLayout) panelContenedor.getLayout();
        layout.show(panelContenedor, "pantalla_login");
    }//GEN-LAST:event_btnIrLoginActionPerformed

    /**
     * Boton para ir al panel para registrarse como usuario
     */
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        mostrar(panelRegistrar);
        java.awt.CardLayout layout = (java.awt.CardLayout) panelContenedor.getLayout();
        layout.show(panelContenedor, "pantalla_registrar");    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtUsuarioCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioCrearActionPerformed

    }//GEN-LAST:event_txtUsuarioCrearActionPerformed

    /**
     * Boton para ir al panel de crear cuentas
     */
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        mostrar(panelCrear);
        java.awt.CardLayout layout = (java.awt.CardLayout) panelContenedor.getLayout();
        layout.show(panelContenedor, "pantalla_crear");    }//GEN-LAST:event_btnCrearActionPerformed

    /**
     * Boton para volver al login desde crear cuenta
     */
    private void btnIrLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrLogin1ActionPerformed
        mostrar(panelLogin);
        java.awt.CardLayout layout = (java.awt.CardLayout) panelContenedor.getLayout();
        layout.show(panelContenedor, "pantalla_login");    }//GEN-LAST:event_btnIrLogin1ActionPerformed
    /**
     * Procesamiento para crear cuenta
     */
    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        try {
            //Recogemos los datos de los campos de texto
            String strNumero = txtNumeroCrearCuenta.getText().trim();
            String contrasenia = txtContraseñaCrearCuenta.getText().trim();
            String contraseniaCheck = txtConfContraseñaCrearCuenta.getText().trim();
            String dni = txtDNICrearCuenta.getText().trim();

            //Creamos la cuenta
            bancoService.crearCuenta(strNumero, contrasenia, contraseniaCheck, dni);

            //Mostramos mensaje de exito
            javax.swing.JOptionPane.showMessageDialog(this, "Cuenta creada correctamente.", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            //Vaciamos los campos de texto
            txtNumeroCrearCuenta.setText("");
            txtContraseñaCrearCuenta.setText("");
            txtConfContraseñaCrearCuenta.setText("");
            txtDNICrearCuenta.setText("");

        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);

            //En caso de que no coincidan las contraseñas vaciamos unicamente los campos de contraseña
            if (ex.getMessage().contains("No coinciden las contraseñas")) {
                txtContraseñaCrearCuenta.setText("");
                txtConfContraseñaCrearCuenta.setText("");
            }
        }
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void txtNumeroCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCrearCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCrearCuentaActionPerformed

    /**
     * Procesamiento de borrado de cuenta
     */
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        try {
            //Recolección de datos mediante campos de texto
            String strNumero = txtCuenta.getText().trim();
            String contrasenia = txtPass.getText().trim();

            //Mensaje de confirmación
            int respuesta = javax.swing.JOptionPane.showConfirmDialog(
                    this,
                    "¿Estás totalmente seguro de que quieres BORRAR tu cuenta? Esta acción NO se puede deshacer.",
                    "Confirmar Borrado definitivo",
                    javax.swing.JOptionPane.YES_NO_OPTION,
                    javax.swing.JOptionPane.WARNING_MESSAGE
            );

            if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
                //Borramos la cuenta si la respuesta es que si
                bancoService.borrarCuenta(strNumero, contrasenia);

                //Mostramos mensaje de exito
                javax.swing.JOptionPane.showMessageDialog(this, "Cuenta borrada con éxito.", "Borrado Completado", javax.swing.JOptionPane.INFORMATION_MESSAGE);

                //Vaciamos los campos de texto
                txtCuenta.setText("");
                txtPass.setText("");
            }

        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Error al intentar borrar", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtNumRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumRActionPerformed

    /**
     * Procesamiento de enviar transacciones
     */
    private void btnEnviarTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarTransaccionActionPerformed
        try {
            //Obtención de datos mediante campo de texto
            int numeroEnviar = Integer.parseInt(txtNumR.getText());
            int cantidad = Integer.parseInt(txtCantidad.getText());
            String comentario = txtComentario.getText().trim();

            //Lanzamos mensaje de confirmación
            int respuesta = javax.swing.JOptionPane.showConfirmDialog(
                    this, "¿Estás seguro de que quieres enviar " + cantidad + "€ a la cuenta número " + numeroEnviar + "?",
                    "Confirmar Transferencia", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE
            );

            if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
                //Ejecutamos las transacción
                bancoService.realizarTransferencia(this.cuentaActiva.getId(), numeroEnviar, cantidad, comentario);

                txtNumR.setText("");
                txtCantidad.setText("");
                txtComentario.setText("");

                //Actualizamos el saldo en el panel de transacciones
                this.cuentaActiva.setSaldo(this.cuentaActiva.getSaldo() - cantidad);
                txtSaldo.setText("Tu saldo actual es de " + this.cuentaActiva.getSaldo() + "€");

                //Actualizamos los registros recientes
                actualizarTablaMovimientos();

                //Mensaje de exito
                javax.swing.JOptionPane.showMessageDialog(this, "¡Transacción enviada con éxito!", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, introduce números válidos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEnviarTransaccionActionPerformed

    /**
     * Procesamiento de cambio de contraseña
     */
    private void btnCambiarContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContraseniaActionPerformed
        //Creamos una ventana de una sola columna
        javax.swing.JPanel panel = new javax.swing.JPanel(new java.awt.GridLayout(0, 1));
        //Le ponemos los elementos que queremos en la ventana
        panel.add(new javax.swing.JLabel("Introduce la nueva contraseña:"));
        javax.swing.JPasswordField txtNueva = new javax.swing.JPasswordField();
        panel.add(txtNueva);

        panel.add(new javax.swing.JLabel("Confirma la nueva contraseña:"));
        javax.swing.JPasswordField txtConf = new javax.swing.JPasswordField();
        panel.add(txtConf);

        //Ponemos un panel de confirmación
        int result = javax.swing.JOptionPane.showConfirmDialog(
                this,
                panel,
                "Cambiar Contraseña",
                javax.swing.JOptionPane.OK_CANCEL_OPTION,
                javax.swing.JOptionPane.PLAIN_MESSAGE
        );

        if (result == javax.swing.JOptionPane.OK_OPTION) {
            try {

                String nueva = new String(txtNueva.getPassword());
                String conf = new String(txtConf.getPassword());

                //Cambiamos la contraseña antigua a por la nueva
                bancoService.cambiarContrasenia(this.cuentaActiva.getId(), nueva, conf);

                //Mostramos mensaje de exito
                javax.swing.JOptionPane.showMessageDialog(this, "¡Contraseña actualizada con éxito!", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception ex) {
                javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Error al cambiar", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCambiarContraseniaActionPerformed

    /**
     * Boton para navegar hacia atras en las paginas de transacciones
     */
    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if (paginaActual > 0) {
            paginaActual--;
            actualizarTablaMovimientos();
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    /**
     * Boton para navegar hacia adelante en las paginas de transacciones
     */
    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        try {
            // Calculamos cuantas transacciones tiene el usuario
            long totalMovimientos = bancoService.contarTotalMovimientos(this.cuentaActiva.getId());
            //Calculamos cuantas paginas tenemos que crear dividiendo la cantidad de movimientos del usuario con el tamaño de la pagina
            //Al hacer el calculo con un double, podemos luego con el .ceil redondearlo para arriba y luego transformarlo en un INT
            int totalPaginas = (int) Math.ceil((double) totalMovimientos / TAMANO_PAGINA);
            //Si no tiene paginas, le ponemos 1 para el correcto funcionamiento
            if (totalPaginas == 0) {
                totalPaginas = 1;
            }

            //Si hay mas paginas para avanzar, avanzamos y enseñamos los siguientes 5 registros
            if (paginaActual < totalPaginas - 1) {
                paginaActual++;
                actualizarTablaMovimientos();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    /**
     * Metodo main
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

    /**
     * Cambia la pantalla actual del contenedor principal por una nueva vista.
     * Borra todo el contenido previo y redibuja el panel con el nuevo
     * componente.
     *
     * @param comp El componente (JPanel, vista, etc.) que se desea mostrar.
     */
    public void mostrar(Component comp) {
        panelContenedor.removeAll();
        panelContenedor.add(comp);
        panelContenedor.repaint();
        panelContenedor.revalidate();
    }

    public void actualizarTablaMovimientos() {
        //Si no hay cuenta activa no se ejecuta
        if (this.cuentaActiva == null) {
            return;
        }
        try {
            //Recopilamos todas las transacciones del usuario
            List<Transacciones> movimientos = bancoService.obtenerMovimientosPaginados(this.cuentaActiva.getId(), paginaActual, TAMANO_PAGINA);
            //Guardamos el total de transacciones del usuario
            long totalMovimientos = bancoService.contarTotalMovimientos(this.cuentaActiva.getId());

            //Creamos un modelo default de tabla con 0 filas
            DefaultTableModel modelo = (DefaultTableModel) tablaMovimientos.getModel();
            modelo.setRowCount(0);

            //Recorremos cada transacción
            for (Transacciones transaccion : movimientos) {
                String tipo;
                String numeroRelacionadoStr = "";

                // Comprobamos si en la transacción fuimos emisores o receptores
                // Si la transaccion tiene un emisor y el id del emisor coincide con el de la cuenta activa lo establecemos como un "envio"
                if (transaccion.getCuentaEmisor() != null && transaccion.getCuentaEmisor().getId() == this.cuentaActiva.getId()) {
                    tipo = "Enviado";
                    if (transaccion.getCuentaReceptor() != null) {
                        numeroRelacionadoStr = String.valueOf(transaccion.getCuentaReceptor().getNumero());
                    }
                } else {
                    tipo = "Recibido";
                    if (transaccion.getCuentaEmisor() != null) {
                        numeroRelacionadoStr = String.valueOf(transaccion.getCuentaEmisor().getNumero());
                    }
                }

                modelo.addRow(new Object[]{
                    tipo,
                    transaccion.getCantidad() + "€",
                    transaccion.getFecha(),
                    numeroRelacionadoStr
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

            // Lógica de cálculo de páginas
            int totalPaginas = (int) Math.ceil((double) totalMovimientos / TAMANO_PAGINA);
            if (totalPaginas == 0) {
                totalPaginas = 1;
            }

            lblPagina.setText("Página " + (paginaActual + 1) + " de " + totalPaginas);

            btnAnterior.setEnabled(paginaActual > 0);
            btnSiguiente.setEnabled(paginaActual < (totalPaginas - 1));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCambiarContrasenia;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEnviarTransaccion;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnIrLogin;
    private javax.swing.JButton btnIrLogin1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSiguiente;
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
    private javax.swing.JLabel lblPagina;
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
