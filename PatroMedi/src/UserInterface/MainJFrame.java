/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;
import Buisness.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Buisness.Enterprise.*;
import Buisness.Network.Network;
import Buisness.Organisation.Organisation;
import Buisness.UserAccount.*;
import UserInterface.Donor.CreateDonorProfileJPanel;
import UserInterface.Patient.CreatePatientAccountJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public MainJFrame() 
    {
        initComponents();

system=dB4OUtil.retrieveSystem();




    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        controlJPanel = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        UnameTextField = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        btnDonorSignUp = new javax.swing.JButton();
        btnPatientSignUp = new javax.swing.JButton();
        displayJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 900));
        setPreferredSize(new java.awt.Dimension(2000, 700));

        jSplitPane.setDividerLocation(125);
        jSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        controlJPanel.setBackground(new java.awt.Color(255, 51, 51));
        controlJPanel.setMinimumSize(new java.awt.Dimension(2000, 109));
        controlJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setText("LogOut");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        controlJPanel.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 40, 90, -1));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        controlJPanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 90, -1));
        controlJPanel.add(UnameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 120, -1));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("patroMedi");
        controlJPanel.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 60));

        lblUserName.setText("UserName");
        controlJPanel.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, -1, -1));

        lblPassword.setText("Password");
        controlJPanel.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 50, -1, -1));

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        controlJPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 40, 120, -1));

        btnDonorSignUp.setText("SignUp Donor");
        btnDonorSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonorSignUpActionPerformed(evt);
            }
        });
        controlJPanel.add(btnDonorSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 80, 160, -1));

        btnPatientSignUp.setText("SignUp Patient");
        btnPatientSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientSignUpActionPerformed(evt);
            }
        });
        controlJPanel.add(btnPatientSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 80, 150, -1));

        jSplitPane.setTopComponent(controlJPanel);

        displayJPanel.setBackground(new java.awt.Color(255, 255, 255));
        displayJPanel.setPreferredSize(new java.awt.Dimension(2000, 700));
        displayJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane.setRightComponent(displayJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 2000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        
        btnLogout.setEnabled(false);
        btnDonorSignUp.setEnabled(true);
        btnPatientSignUp.setEnabled(true);
        UnameTextField.setEnabled(true);
        passwordField.setEnabled(true);
        btnLogin.setEnabled(true);
        
        UnameTextField.setText("");
        passwordField.setText("");

        displayJPanel.removeAll();
        JPanel blankJP = new JPanel();
        displayJPanel.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) displayJPanel.getLayout();
        crdLyt.next(displayJPanel);
        dB4OUtil.storeSystem(system);
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String userName = UnameTextField.getText();
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);
        UserAccount userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);
        Enterprise inEnterprise=null;
        Organisation inOrganisation=null;
        Network net = null;
        if(userAccount==null)
        {
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
                net = network;
                for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                       //Step 3:check against each organization for each enterprise
                       for(Organisation organisation:enterprise.getOrganizationDirectory().getOrganizationList()){
                           userAccount=organisation.getUserAccountDirectory().authenticateUser(userName, password);
                           if(userAccount!=null){
                               inEnterprise=enterprise;
                               inOrganisation=organisation;
                               break;
                           }
                       }
                        
                    }
                    
                    else
                    {
                       inEnterprise=enterprise;
                       break;
                    }
                    if(inOrganisation!=null){
                        break;
                    }  
                }
                if(inEnterprise!=null)
                {
                    break;
                }
            }
        }
        
        if(userAccount==null)
        {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else
        {
            CardLayout layout=(CardLayout)displayJPanel.getLayout();
            displayJPanel.add("workArea",userAccount.getRole().createWorkArea(displayJPanel, userAccount, inOrganisation, inEnterprise,net ,system));
            layout.next(displayJPanel);
        }
        
        btnLogin.setEnabled(false);
        btnDonorSignUp.setEnabled(false);
        btnPatientSignUp.setEnabled(false);
        btnLogout.setEnabled(true);
        UnameTextField.setEnabled(false);
        passwordField.setEnabled(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void btnPatientSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientSignUpActionPerformed
        
        CreatePatientAccountJPanel createPatient = new CreatePatientAccountJPanel(displayJPanel, system);
        displayJPanel.add("CreatePatientAccountJPanel", createPatient);
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.next(displayJPanel);
    }//GEN-LAST:event_btnPatientSignUpActionPerformed

    private void btnDonorSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonorSignUpActionPerformed
        CreateDonorProfileJPanel createDonor = new CreateDonorProfileJPanel(displayJPanel, system);
        displayJPanel.add("CreateDonorProfileJPanel", createDonor);
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.next(displayJPanel);
    }//GEN-LAST:event_btnDonorSignUpActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UnameTextField;
    private javax.swing.JButton btnDonorSignUp;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPatientSignUp;
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}
