/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import Buisness.EcoSystem;
import Buisness.Organisation.Organisation;
import Buisness.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sarthakgoel
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel 
{
    private JPanel displayJPanel;
    private EcoSystem system;
    private UserAccount account;
    private Organisation organisation;
    /**
     * Creates new form PatientWorkAreaJPanel
     */
    public PatientWorkAreaJPanel(JPanel displayJPanel,UserAccount account, Organisation organisation,EcoSystem ecosystem) 
    {
        initComponents();
        this.system=ecosystem;
        this.displayJPanel=displayJPanel;
        this.account = account;
        this.organisation = organisation;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnNewAppointment = new javax.swing.JButton();
        btnAppointmentHistory = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Patient"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setText("PATIENT WORK AREA");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 24, 184, 29));

        btnNewAppointment.setText("Book an Appointment");
        btnNewAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAppointmentActionPerformed(evt);
            }
        });
        add(btnNewAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 92, 200, 30));

        btnAppointmentHistory.setText("See Appoinyment History");
        btnAppointmentHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentHistoryActionPerformed(evt);
            }
        });
        add(btnAppointmentHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 149, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAppointmentActionPerformed
        BookNewAppointmentJPanel bookAppointment = new BookNewAppointmentJPanel(displayJPanel,account,organisation ,system);
        displayJPanel.add("bookNewAppointmentJPanel", bookAppointment);
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.next(displayJPanel);
    }//GEN-LAST:event_btnNewAppointmentActionPerformed

    private void btnAppointmentHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentHistoryActionPerformed
        PatientAppointmentHistoryJPanel patientAppointment = new PatientAppointmentHistoryJPanel(displayJPanel,account,organisation ,system);
        displayJPanel.add("PatientAppointmentHistoryJPanel", patientAppointment);
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.next(displayJPanel);
    }//GEN-LAST:event_btnAppointmentHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppointmentHistory;
    private javax.swing.JButton btnNewAppointment;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}