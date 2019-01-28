/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CharityManager;

import Buisness.EcoSystem;
import Buisness.Enterprise.CharityEnterprise;
import Buisness.Enterprise.Enterprise;
import Buisness.Network.Network;
import Buisness.Organisation.Organisation;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.CharityAcknowledgedWorkRequest;
import Buisness.WorkQueue.HospitalCharityRequestWorkQueue;
import Buisness.WorkQueue.WorkRequest;
import Business.Hospital.Organisation.ReceptionistOrganisation;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sarthakgoel
 */
public class ViewPatienttoSponsorJPanel extends javax.swing.JPanel 
{
    private JPanel displayJPanel;
    private CharityEnterprise enterprise;
    private Network network;
    private EcoSystem system;
    private UserAccount account;
    String funds;
    Float charityFunds;
    /**
     * Creates new form ViewPatienttoSponsorJPanel
     */
    public ViewPatienttoSponsorJPanel(JPanel displayJPanel,CharityEnterprise entreprise, Network network,EcoSystem system, UserAccount ua, String funds ) 
    {
        initComponents();
        this.displayJPanel = displayJPanel;
        this.enterprise = entreprise;
        this.network = network;
        this.system = system;
        this.account = ua;
        this.funds = funds;
        
        charityFunds = Float.parseFloat(funds);
        
        populateJTable();
    }
    
    public void populateJTable()
    {
        DefaultTableModel model = (DefaultTableModel) patientSponsorshipJTable.getModel();
        
            model.setRowCount(0);
        
            for(WorkRequest request : network.getCharityRequests().getWorkRequestList())
            {
                HospitalCharityRequestWorkQueue hcrwq;// = new HospitalCharityRequestWorkQueue();
                hcrwq = (HospitalCharityRequestWorkQueue)request;
                Object[] row = new Object[5];
                row[0] = hcrwq;
                row[1] = hcrwq.getAmount();
                row[2] = hcrwq.getMessage();
                row[3] = hcrwq.getHospitalName();
                row[4] = hcrwq.getCity();
                
                model.addRow(row);
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

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientSponsorshipJTable = new javax.swing.JTable();
        btnSelectSponsor = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("View Patients"));

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setText("SPONSOR PATIENTS TREATMENT");

        patientSponsorshipJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Amount", "Message", "Hospital", "Hospital Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientSponsorshipJTable);
        if (patientSponsorshipJTable.getColumnModel().getColumnCount() > 0) {
            patientSponsorshipJTable.getColumnModel().getColumn(0).setResizable(false);
            patientSponsorshipJTable.getColumnModel().getColumn(1).setResizable(false);
            patientSponsorshipJTable.getColumnModel().getColumn(2).setResizable(false);
            patientSponsorshipJTable.getColumnModel().getColumn(3).setResizable(false);
            patientSponsorshipJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        btnSelectSponsor.setText("Sponsor>>");
        btnSelectSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectSponsorActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(355, 355, 355)
                                .addComponent(btnSelectSponsor))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelectSponsor)
                    .addComponent(btnBack))
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectSponsorActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) patientSponsorshipJTable.getModel();
        int selectedRow = patientSponsorshipJTable.getSelectedRow();
        if (selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Select a case to sponsor", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            HospitalCharityRequestWorkQueue request = (HospitalCharityRequestWorkQueue)patientSponsorshipJTable.getValueAt(selectedRow,0);
            float amount = request.getAmount();
            
            if(amount<charityFunds)
            {
                if(request.getMessage().equals("Acknowledged"))
                {
                    JOptionPane.showMessageDialog(null,"Request Already acknowledged.\nSelect a different case","Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    request.setMessage("Acknowledged");
                    request.setReceiver(account);
                    request.setCharityName(enterprise.getName());
                    populateJTable();
                    charityFunds = charityFunds-amount;
                    CharityAcknowledgedWorkRequest cawq = new CharityAcknowledgedWorkRequest();
                    
                    cawq.setPatientName(request.getPatientName());
                    cawq.setCharityName(enterprise.getName());
                    cawq.setCity(network.getName());
                    cawq.setDateAcknowledged(new Date());
                    cawq.setHospitalName(request.getHospitalName());
                    cawq.setSender(account);
                    cawq.setFundsSponsored(String.valueOf(request.getAmount()));
                
                    Enterprise e = null;
                    for(Network n: system.getNetworkList())
                    {
                        for(Enterprise ent : n.getEnterpriseDirectory().getEnterpriseList())
                        {
                            if(ent.getName().equalsIgnoreCase(request.getHospitalName()))
                            {
                                e = ent;
                                break;
                            }
                        }
                    }
            
                    ReceptionistOrganisation org = null;
                    for (Organisation o : e.getOrganizationDirectory().getOrganizationList())
                    {
                        if(o instanceof ReceptionistOrganisation)
                        {
                            for(UserAccount uacnt : o.getUserAccountDirectory().getUserAccountList())
                            {
                                if(uacnt.getUsername().equalsIgnoreCase(request.getSender().getUsername()))
                                {
                                    org = (ReceptionistOrganisation)o;
                                    break;
                                }
                            }
                        }
                    }
                    org.getCharityAcknowledgment().getWorkRequestList().add(cawq);
                    account.getWorkQueue().getWorkRequestList().add(cawq);
                
                    JOptionPane.showMessageDialog(null, "Hospital Request successfully acknowledged by hospital", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Charity has insufficient funds to sponsor the treatment", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSelectSponsorActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        displayJPanel.remove(this);
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.previous(displayJPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSelectSponsor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable patientSponsorshipJTable;
    // End of variables declaration//GEN-END:variables
}