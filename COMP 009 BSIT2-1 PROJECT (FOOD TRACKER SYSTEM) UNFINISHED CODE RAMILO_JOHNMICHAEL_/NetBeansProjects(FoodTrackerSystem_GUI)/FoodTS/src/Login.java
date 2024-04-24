/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.Statement;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Chiiiii
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        try {
            Connection();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    Connection con;
    Statement st;
    PreparedStatement pst;
    
    
    private static final String DBname = "foodtrackingsystem";
    private static final String DBDriver = "com.mysql.cj.jdbc.Driver";
    private static final String DBUrl = "jdbc:mysql://localhost:3306/"+DBname;
    private static final String DBUsername = "root";
    private static final String DBPassword = "";
    
    
    public void Connection() throws SQLException{
        try {
            Class.forName(DBDriver);
             con = DriverManager.getConnection(DBUrl, DBUsername, DBPassword);
             st = con.createStatement();
            
            if(con != null){
                System.out.println("Connection Succes");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logTITLE = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        logEntUSERNAME = new javax.swing.JTextField();
        txtPass = new javax.swing.JLabel();
        logEntPASSWORD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRegBtn = new javax.swing.JButton();
        logSubmitBtn = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 246, 187));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(17, 66, 50));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        logTITLE.setBackground(new java.awt.Color(247, 246, 187));
        logTITLE.setFont(new java.awt.Font("Tw Cen MT", 0, 45)); // NOI18N
        logTITLE.setForeground(new java.awt.Color(247, 246, 187));
        logTITLE.setText("Login");

        txtEmail.setBackground(new java.awt.Color(247, 246, 187));
        txtEmail.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(247, 246, 187));
        txtEmail.setText("Enter Email");

        txtPass.setBackground(new java.awt.Color(247, 246, 187));
        txtPass.setForeground(new java.awt.Color(247, 246, 187));
        txtPass.setText("Enter Password");

        logEntPASSWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logEntPASSWORDActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(247, 246, 187));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(247, 246, 187));
        jLabel3.setText("Doesn't have an account yet? create one");

        txtRegBtn.setBackground(new java.awt.Color(247, 246, 187));
        txtRegBtn.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        txtRegBtn.setForeground(new java.awt.Color(17, 66, 50));
        txtRegBtn.setText("create account");
        txtRegBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegBtnActionPerformed(evt);
            }
        });

        logSubmitBtn.setBackground(new java.awt.Color(247, 246, 187));
        logSubmitBtn.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        logSubmitBtn.setForeground(new java.awt.Color(17, 66, 50));
        logSubmitBtn.setText("Log in");
        logSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logSubmitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logTITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logEntPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail)
                            .addComponent(logEntUSERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPass)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtRegBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(logSubmitBtn)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(logTITLE)
                .addGap(26, 26, 26)
                .addComponent(txtEmail)
                .addGap(18, 18, 18)
                .addComponent(logEntUSERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtPass)
                .addGap(18, 18, 18)
                .addComponent(logEntPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(logSubmitBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRegBtn))
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logEntPASSWORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logEntPASSWORDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logEntPASSWORDActionPerformed

    private void txtRegBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegBtnActionPerformed
        Registration register = new Registration();
        register.setVisible(true);
        register.pack();
        register.setLocationRelativeTo(null);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegBtnActionPerformed

    private void logSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logSubmitBtnActionPerformed
        String logUsername, logPassword;
    logUsername = logEntUSERNAME.getText();
    logPassword = logEntPASSWORD.getText();
    
    // Make sure to use prepared statement to avoid SQL injection
    String queryLogin = "SELECT * FROM accdetails WHERE accUsername = ? AND accPassword = ?";
    
    try {
        pst = con.prepareStatement(queryLogin);
        pst.setString(1, logUsername);
        pst.setString(2, logPassword);
        
        ResultSet rs = pst.executeQuery();
        
        if (!rs.next()) {
            JOptionPane.showMessageDialog(null, "Invalid Credentials");
        } else {
            JOptionPane.showMessageDialog(null, "Log in Successfully");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_logSubmitBtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField logEntPASSWORD;
    private javax.swing.JTextField logEntUSERNAME;
    private javax.swing.JButton logSubmitBtn;
    private javax.swing.JLabel logTITLE;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtPass;
    private javax.swing.JButton txtRegBtn;
    // End of variables declaration//GEN-END:variables

    void setVisble(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}