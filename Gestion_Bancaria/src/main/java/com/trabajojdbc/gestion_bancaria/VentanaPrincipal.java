package com.trabajojdbc.gestion_bancaria;

import java.awt.Component;
import static java.lang.Integer.parseInt;
import javax.persistence.EntityManager;

/**
 *
 * @author Daniel
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        panelTransacciones = new javax.swing.JPanel();
        txtBienvenida = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
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

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBorrar)
                .addGap(65, 65, 65)
                .addComponent(btnEntrar)
                .addGap(156, 156, 156))
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnRegistrar)
                        .addGap(27, 27, 27)
                        .addComponent(btnCrear))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCrear))
                .addContainerGap())
        );

        panelContenedor.add(panelLogin, "pantalla_login");

        txtBienvenida.setText("m");

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jButton1.setText("Enviar");

        javax.swing.GroupLayout panelTransaccionesLayout = new javax.swing.GroupLayout(panelTransacciones);
        panelTransacciones.setLayout(panelTransaccionesLayout);
        panelTransaccionesLayout.setHorizontalGroup(
            panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransaccionesLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(btnExit)
                    .addComponent(txtBienvenida))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTransaccionesLayout.setVerticalGroup(
            panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransaccionesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addGap(30, 30, 30))
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

        javax.swing.GroupLayout panelRegistrarLayout = new javax.swing.GroupLayout(panelRegistrar);
        panelRegistrar.setLayout(panelRegistrarLayout);
        panelRegistrarLayout.setHorizontalGroup(
            panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarLayout.createSequentialGroup()
                .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistrarLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel8))
                    .addGroup(panelRegistrarLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel7))
                    .addGroup(panelRegistrarLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuarioCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRegistrarLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel6)))
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(panelRegistrarLayout.createSequentialGroup()
                .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistrarLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel4))
                    .addGroup(panelRegistrarLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearUsuario)
                            .addComponent(txtDNICrear, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRegistrarLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnIrLogin)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelRegistrarLayout.setVerticalGroup(
            panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
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
                .addGap(24, 24, 24)
                .addComponent(btnCrearUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIrLogin)
                .addContainerGap(64, Short.MAX_VALUE))
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

        javax.swing.GroupLayout panelCrearLayout = new javax.swing.GroupLayout(panelCrear);
        panelCrear.setLayout(panelCrearLayout);
        panelCrearLayout.setHorizontalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel5))
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel9)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel10))
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumeroCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCrearLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearLayout.createSequentialGroup()
                                .addComponent(txtDNICrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtContraseñaCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCrearLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtConfContraseñaCrearCuenta))))
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearCuenta)
                            .addGroup(panelCrearLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnIrLogin1)))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        panelCrearLayout.setVerticalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtContraseñaCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDNICrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConfContraseñaCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnCrearCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIrLogin1)
                .addContainerGap(96, Short.MAX_VALUE))
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
        mostrar(panelLogin);
        java.awt.CardLayout layout = (java.awt.CardLayout) panelContenedor.getLayout();
        layout.show(panelContenedor, "pantalla_login");
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            int numero = Integer.parseInt(txtCuenta.getText());
            String contrasenia = txtPass.getText().trim();

            Cuenta cuentaEncontrada = buscarCuentaPorNumero(em, numero);

            if (cuentaEncontrada != null) {
                if (cuentaEncontrada.getContrasenia().equals(contrasenia)) {
                    mostrar(panelTransacciones);
                    java.awt.CardLayout layout = (java.awt.CardLayout) panelContenedor.getLayout();
                    layout.show(panelContenedor, "pantalla_transacciones");
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "El numero o la contraseña son incorrectos, verifique y vuelva a intentarlo", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);

            }

        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "El numero solo puede contener numeros", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
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
        if (!dniCheck(dni)) {
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
        int numero = -1;
        numero = parseInt(txtNumeroCrearCuenta.getText());
        String contrasenia = txtContraseñaCrearCuenta.getText().trim();
        String dni = txtDNICrearCuenta.getText().trim();
        String contraseniaCheck = txtConfContraseñaCrearCuenta.getText().trim();

        if (!contrasenia.equals(contraseniaCheck)) {
            javax.swing.JOptionPane.showMessageDialog(this, "No coinciden las contraseñas, tienen que ser las mismas", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            txtContraseñaCrearCuenta.setText("");
            txtConfContraseñaCrearCuenta.setText("");
            return;
        }
        if (numero == -1 || dni.isEmpty() || contrasenia.isEmpty() || contraseniaCheck.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!dniCheck(dni)) {
            javax.swing.JOptionPane.showMessageDialog(this, "El DNI no tiene el formato correcto, comprueba que este correcto (8 Numeros y una letra mayuscula)", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        EntityManager em = EntityManagerUtil.getEntityManager();
        Integer id = obtenerIdUsuarioPorDni(em, dni);
        if (id == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "El DNI no corresponde a ninguno de nuestra base de datos, compruebelo de nuevo", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            em.close();
            return;
        }
        em.close();
        Cuenta cuentaNueva = new Cuenta();
        Usuario propietario = new Usuario(id);
        cuentaNueva.setIDUsuario(propietario);
        cuentaNueva.setNumero(numero);
        cuentaNueva.setContrasenia(contrasenia);

        EntityManager em1 = EntityManagerUtil.getEntityManager();
        try {
            em1.getTransaction().begin();
            em1.persist(cuentaNueva);
            em1.getTransaction().commit();
            javax.swing.JOptionPane.showMessageDialog(this, "Cuenta creada correctamente.");
            txtNumeroCrearCuenta.setText("");
            txtContraseñaCrearCuenta.setText("");
            txtDNICrearCuenta.setText("");
            txtConfContraseñaCrearCuenta.setText("");
        } catch (Exception e) {
            if (em1.getTransaction().isActive()) {
                em1.getTransaction().rollback();
            }
            if (e.getMessage() != null && e.getMessage().contains("UNIQUE constraint failed (UNIQUE constraint failed: Cuenta.Numero")) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error al ejecutar: ESTE NÚMERO ESTA EN USO!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } finally {
            em1.close();
        }
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void txtNumeroCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCrearCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCrearCuentaActionPerformed

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

    public boolean dniCheck(String dni) {
        if (dni == null || dni.trim().isEmpty()) {
            return false;
        }
        return dni.matches("^[0-9]{8}[A-Z]$"); //Aplicación de Regex
    }

    public Integer obtenerIdUsuarioPorDni(EntityManager em, String dniABuscar) {
        try {
            Usuario usuarioEncontrado = em.createNamedQuery("Usuario.findByDni", Usuario.class)
                    .setParameter("dni", dniABuscar)
                    .getSingleResult();
            return usuarioEncontrado.getId();

        } catch (Exception e) {
            return null;
        }
    }

    public Cuenta buscarCuentaPorNumero(EntityManager em, int numeroBuscar) {
        try {
            // Llamamos a la consulta que ya existe en tu Entity
            return em.createNamedQuery("Cuenta.findByNumero", Cuenta.class)
                    .setParameter("numero", numeroBuscar)
                    .getSingleResult();

        } catch (Exception e) {
            // Si no hay ninguna cuenta con ese número, JPA lanza esta excepción
            return null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnIrLogin;
    private javax.swing.JButton btnIrLogin1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelCrear;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelRegistrar;
    private javax.swing.JPanel panelTransacciones;
    private javax.swing.JTextField txtApellidoCrear;
    private javax.swing.JLabel txtBienvenida;
    private javax.swing.JPasswordField txtConfContraseñaCrearCuenta;
    private javax.swing.JPasswordField txtContraseñaCrearCuenta;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtDNICrear;
    private javax.swing.JTextField txtDNICrearCuenta;
    private javax.swing.JTextField txtNumeroCrearCuenta;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuarioCrear;
    // End of variables declaration//GEN-END:variables
}
