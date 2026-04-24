package laboratorio2_luis_sanchez;

public class LoginScreen extends javax.swing.JPanel {

    public LoginScreen() {
        initComponents();
   
    javax.swing.SwingUtilities.invokeLater(() -> {
        javax.swing.JRootPane root = javax.swing.SwingUtilities.getRootPane(jButton1);
        if (root != null) {
            root.setDefaultButton(jButton1);
        }
    });
     jPasswordField1.addActionListener(e -> jButton1.doClick());
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Username:");

        jLabel3.setText("Password:");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/login-icon-vector.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Manager System");
        jLabel1.setToolTipText("");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPasswordField1)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    String usuario = jTextField1.getText().trim();
    String clave = new String(jPasswordField1.getPassword());
    
    boolean usuarioEncontrado = false;
    boolean loginCorrecto = false;
    boolean esAdmin = false;
    
    for (int i = 0; i < Mainmenu.usuarios.length; i++) {

    String usuarioGuardado = Mainmenu.usuarios[i][0];
    String estadoGuardado = Mainmenu.usuarios[i][2];
    String claveGuardada = Mainmenu.usuarios[i][3];

    if (usuario.equals(usuarioGuardado)) {

        usuarioEncontrado = true;

        boolean usuarioEsAdmin = usuario.equals("luispedro07");

        if (!estadoGuardado.equals("Active")) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "User blocked or inactive, please contact your administrator.",
                    "Access denied",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (clave.equals(claveGuardada)) {

            loginCorrecto = true;
            esAdmin = usuarioEsAdmin;

            Mainmenu.usuarios[i][4] = "0";

        } else {

            if (!usuarioEsAdmin) {
                int intentos = Integer.parseInt(Mainmenu.usuarios[i][4]);
                intentos++;

                Mainmenu.usuarios[i][4] = String.valueOf(intentos);

                if (intentos >= 3) {
                    Mainmenu.usuarios[i][2] = "Inactive";

                    javax.swing.JOptionPane.showMessageDialog(this,
                            "User blocked or inactive, please contact your administrator.",
                            "User blocked",
                            javax.swing.JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            javax.swing.JOptionPane.showMessageDialog(this,
                    "Username or password are incorrect",
                    "Login error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        break;
    }
}

if (loginCorrecto) {

    Mainmenu menu = new Mainmenu(usuario, esAdmin);
    menu.setVisible(true);

    java.awt.Window ventanaActual = javax.swing.SwingUtilities.getWindowAncestor(this);
    if (ventanaActual != null) {
        ventanaActual.dispose();
    }

} else {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Username or password are incorrect",
            "Login error",
            javax.swing.JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    
}
