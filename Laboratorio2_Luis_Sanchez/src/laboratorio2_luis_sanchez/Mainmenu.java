
package laboratorio2_luis_sanchez;

public class Mainmenu extends javax.swing.JFrame {
    javax.swing.JTable tablaUsuarios;
    static String[][] usuarios = {
        {"luispedro07", "Administrador", "Active", "Quaresma", "0"},
        {"user07", "Usuario normal", "Active", "1234", "0"},
        {"pedro", "Pedro Cardona", "Active", "5678", "0"},
        {"Guest01", "Guest User", "Inactive", "guest123", "0"}
    };
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Mainmenu.class.getName());
    
    private String usuarioActual;
    private boolean esAdmin;
    
    public Mainmenu() {
    initComponents();
}
    public Mainmenu(String usuarioActual, boolean esAdmin) {
        initComponents();
        this.usuarioActual = usuarioActual;
        this.esAdmin = esAdmin;
        
         btnManageUsers.setVisible(false);
         btnAddUser.setVisible(false);
         btnSaveChanges.setVisible(false);
         
          if (!esAdmin) {
        btnManagement.setVisible(false);
    }
         panelContent.setLayout(new java.awt.BorderLayout());
    }

    private void mostrarTablaUsuarios(boolean editable) {

    panelContent.removeAll();

    String[] columnas = {"Username", "Name", "Status"};
    
    String[][] datosVisibles = new String[usuarios.length][3];

    for (int i = 0; i < usuarios.length; i++) {
        datosVisibles[i][0] = usuarios[i][0];
        datosVisibles[i][1] = usuarios[i][1];
        datosVisibles[i][2] = usuarios[i][2];
    }

    javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(usuarios, columnas) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return editable;
        }
    };

    tablaUsuarios = new javax.swing.JTable(modelo);
    javax.swing.JComboBox<String> comboStatus = new javax.swing.JComboBox<>();
    comboStatus.addItem("Active");
    comboStatus.addItem("Inactive");
    
    tablaUsuarios.getColumnModel().getColumn(2).setCellEditor(
        new javax.swing.DefaultCellEditor(comboStatus)
);
    javax.swing.JScrollPane scroll = new javax.swing.JScrollPane(tablaUsuarios);

    panelContent.setLayout(new java.awt.BorderLayout());
    panelContent.add(scroll, java.awt.BorderLayout.CENTER);

    panelContent.revalidate();
    panelContent.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDesktopPane = new javax.swing.JDesktopPane();
        panelContent = new javax.swing.JPanel();
        btnSaveChanges = new javax.swing.JButton();
        btnAddUser = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnManagement = new javax.swing.JButton();
        btnManageUsers = new javax.swing.JButton();
        btnResetPassword = new javax.swing.JButton();
        btnSeeList = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
        );

        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.addActionListener(this::btnSaveChangesActionPerformed);

        btnAddUser.setText("Add User");
        btnAddUser.addActionListener(this::btnAddUserActionPerformed);

        JDesktopPane.setLayer(panelContent, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktopPane.setLayer(btnSaveChanges, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktopPane.setLayer(btnAddUser, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JDesktopPaneLayout = new javax.swing.GroupLayout(JDesktopPane);
        JDesktopPane.setLayout(JDesktopPaneLayout);
        JDesktopPaneLayout.setHorizontalGroup(
            JDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDesktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(JDesktopPaneLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        JDesktopPaneLayout.setVerticalGroup(
            JDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDesktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        btnManagement.setText("Management");
        btnManagement.addActionListener(this::btnManagementActionPerformed);

        btnManageUsers.setText("Manage Users");
        btnManageUsers.addActionListener(this::btnManageUsersActionPerformed);

        btnResetPassword.setText("Reset Password");
        btnResetPassword.addActionListener(this::btnResetPasswordActionPerformed);

        btnSeeList.setText("See list");
        btnSeeList.addActionListener(this::btnSeeListActionPerformed);

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(this::btnLogOutActionPerformed);

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        jLabel1.setText("Main");

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        jLabel2.setText("Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnManageUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnResetPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSeeList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(btnManagement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageUsers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResetPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeeList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogOut)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JDesktopPane))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagementActionPerformed
        // TODO add your handling code here:
         boolean visible = btnManageUsers.isVisible();
    btnManageUsers.setVisible(!visible);
    btnResetPassword.setVisible(!visible);
    }//GEN-LAST:event_btnManagementActionPerformed

    private void btnManageUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUsersActionPerformed
        // TODO add your handling code here:
        mostrarTablaUsuarios(true);
        
         javax.swing.JOptionPane.showMessageDialog(this,
            "Now you are able to modify the existing users",
            "Manage Users",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);

    btnAddUser.setVisible(true);
    btnSaveChanges.setVisible(true);
    }//GEN-LAST:event_btnManageUsersActionPerformed

    private void btnResetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPasswordActionPerformed
        // TODO add your handling code here:
    javax.swing.JPasswordField txtCurrentPassword = new javax.swing.JPasswordField();
    javax.swing.JPasswordField txtNewPassword = new javax.swing.JPasswordField();
    javax.swing.JPasswordField txtConfirmPassword = new javax.swing.JPasswordField();

    Object[] formulario = {
        "Current Password:", txtCurrentPassword,
        "New Password:", txtNewPassword,
        "Confirm New Password:", txtConfirmPassword
    };

    int opcion = javax.swing.JOptionPane.showConfirmDialog(
            this,
            formulario,
            "Reset Password",
            javax.swing.JOptionPane.OK_CANCEL_OPTION,
            javax.swing.JOptionPane.PLAIN_MESSAGE
    );

    if (opcion == javax.swing.JOptionPane.OK_OPTION) {

        String currentPassword = new String(txtCurrentPassword.getPassword());
        String newPassword = new String(txtNewPassword.getPassword());
        String confirmPassword = new String(txtConfirmPassword.getPassword());

        if (currentPassword.isEmpty() || newPassword.isEmpty() || confirmPassword.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Please complete all fields.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (newPassword.length() < 6) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "New password must have at least 6 characters.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!newPassword.equals(confirmPassword)) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "New password and confirmation do not match.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (int i = 0; i < usuarios.length; i++) {

            if (usuarios[i][0].equals(usuarioActual)) {

                if (!usuarios[i][3].equals(currentPassword)) {
                    javax.swing.JOptionPane.showMessageDialog(this,
                            "Current password is incorrect.",
                            "Error",
                            javax.swing.JOptionPane.ERROR_MESSAGE);
                    return;
                }

                usuarios[i][3] = newPassword;

                javax.swing.JOptionPane.showMessageDialog(this,
                        "Password was changed successfully!",
                        "Success",
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);

                return;
            }
        }
    }
    }//GEN-LAST:event_btnResetPasswordActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        LoginScreen login = new LoginScreen();

javax.swing.JFrame frame = new javax.swing.JFrame("Login");
frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
frame.setContentPane(login);
frame.pack();
frame.setLocationRelativeTo(null);
frame.setVisible(true);

this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnSeeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeListActionPerformed
        // TODO add your handling code here:
        mostrarTablaUsuarios(false);

    }//GEN-LAST:event_btnSeeListActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        // TODO add your handling code here:
           if (tablaUsuarios.isEditing()) {
        tablaUsuarios.getCellEditor().stopCellEditing();
    }

    javax.swing.table.TableModel modelo = tablaUsuarios.getModel();

    for (int i = 0; i < modelo.getRowCount(); i++) {
        usuarios[i][0] = modelo.getValueAt(i, 0).toString();
        usuarios[i][1] = modelo.getValueAt(i, 1).toString();
        usuarios[i][2] = modelo.getValueAt(i, 2).toString();
    }

    javax.swing.JOptionPane.showMessageDialog(this,
            "Changes were saved!",
            "Saved",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);

    btnAddUser.setVisible(false);
    btnSaveChanges.setVisible(false);

    mostrarTablaUsuarios(false);
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        // TODO add your handling code here:
    javax.swing.JTextField txtUsername = new javax.swing.JTextField();
    javax.swing.JTextField txtName = new javax.swing.JTextField();
    javax.swing.JPasswordField txtPassword = new javax.swing.JPasswordField();

    while (true) {

        Object[] formulario = {
            "Username:", txtUsername,
            "Name:", txtName,
            "Password:", txtPassword
        };

        int opcion = javax.swing.JOptionPane.showConfirmDialog(
                this,
                formulario,
                "Add User",
                javax.swing.JOptionPane.OK_CANCEL_OPTION,
                javax.swing.JOptionPane.PLAIN_MESSAGE
        );

        if (opcion != javax.swing.JOptionPane.OK_OPTION) {
            return;
        }

        String username = txtUsername.getText().trim();
        String name = txtName.getText().trim();
        String password = new String(txtPassword.getPassword());

        if (username.isEmpty() || name.isEmpty() || password.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Please complete all fields.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            continue;
        }

        if (password.length() < 6) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Password must have at least 6 characters.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            continue;
        }

        String[][] nuevosUsuarios = new String[usuarios.length + 1][5];

        for (int i = 0; i < usuarios.length; i++) {
            nuevosUsuarios[i] = usuarios[i];
        }

        nuevosUsuarios[usuarios.length][0] = username;
        nuevosUsuarios[usuarios.length][1] = name;
        nuevosUsuarios[usuarios.length][2] = "Active";
        nuevosUsuarios[usuarios.length][3] = password;
        nuevosUsuarios[usuarios.length][4] = "0";

        usuarios = nuevosUsuarios;

        mostrarTablaUsuarios(true);

        javax.swing.JOptionPane.showMessageDialog(this,
                "User added successfully!",
                "Success",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);

        break;
    }
    }//GEN-LAST:event_btnAddUserActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Mainmenu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDesktopPane;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnManageUsers;
    private javax.swing.JButton btnManagement;
    private javax.swing.JButton btnResetPassword;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JButton btnSeeList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelContent;
    // End of variables declaration//GEN-END:variables
}
