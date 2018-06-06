/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import logic.HrSystem;

/**
 *
 * @author A.A
 */
public class EditDepartment extends javax.swing.JFrame {

    /**
     * Creates new form EditDepartment
     */
    public EditDepartment() {
        initComponents();
        java.awt.Color recursiveBG = new java.awt.Color(240, 240, 240);
        getContentPane().setBackground(recursiveBG);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);


        //call methods to load combo box with departments
        loadDepartments();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLocation = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        lblEditDep = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblDepID = new javax.swing.JLabel();
        cmbDepId = new javax.swing.JComboBox<>();
        lblDepName = new javax.swing.JLabel();
        txtDepName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblLocation.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblLocation.setText("Location:");
        lblLocation.setToolTipText("");

        txtLocation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnClose.setBackground(new java.awt.Color(255, 153, 153));
        btnClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        lblEditDep.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblEditDep.setForeground(new java.awt.Color(0, 0, 204));
        lblEditDep.setText("Edit Information of Department");

        btnSave.setBackground(new java.awt.Color(153, 255, 153));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblDepID.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblDepID.setForeground(new java.awt.Color(255, 0, 0));
        lblDepID.setText("Department ID: ");

        cmbDepId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbDepId.setMaximumRowCount(100);
        cmbDepId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepIdActionPerformed(evt);
            }
        });

        lblDepName.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblDepName.setText("Department Name: ");
        lblDepName.setToolTipText("");

        txtDepName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 175, Short.MAX_VALUE)
                .addComponent(lblEditDep)
                .addGap(142, 142, 142))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDepName)
                            .addComponent(lblDepID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLocation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtLocation, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDepName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbDepId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(295, 295, 295))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblEditDep)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDepId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadDepartments(){
        this.cmbDepId.removeAllItems();
        //for loop to put all the departments into the combo box
        if(!HrSystem.getAllDepartments().isEmpty()){
            for (int i = 0; i < HrSystem.getAllDepartments().size(); i++) {
            cmbDepId.addItem(HrSystem.getAllDepartments().get(i).getId() + " - "
                    + HrSystem.getAllDepartments().get(i).getName());
        }
        }
        
        this.cmbDepId.setSelectedItem(null);
        this.txtDepName.setText(null);
        this.txtLocation.setText(null);
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //Save selected department in a String variable to use for checking
        String selected = (String) cmbDepId.getSelectedItem();
        //boolean condition to exit the do/while loop if met
        boolean cond = false;
        //counter to go through all the departments
        int i = 0;
        //do loop to go throw all the departments and check for the department that checks the requirements (name)
        do {
            
            //check if the name of department equals the name of selected
            if (selected.equalsIgnoreCase(HrSystem.getAllDepartments().get(i).getName())) {
                //get the input variables from the text fields 
                String depName = txtDepName.getText();
                String depLoc = txtLocation.getText();

                if (depName.length() > 3 && depLoc.length() > 3
                        && !txtDepName.getText().isEmpty() && !txtLocation.getText().isEmpty()) {
                    //update the department with the new data
                    HrSystem.getAllDepartments().get(i).setName(depName);
                    HrSystem.getAllDepartments().get(i).setLocation(depLoc);
                    //message confirming the update of the department
                    JOptionPane.showMessageDialog(null,
                            "Department has been updated successfully", "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                    //set the selected item to the updated version 
                    cmbDepId.setSelectedItem(HrSystem.getAllDepartments().get(i).getName());
                    //clearing the text boxes after insert/search
                    txtDepName.setText(null);
                    txtLocation.setText(null);
                    //exit the loop
                    cond = true;
                } else if (depName.length() <= 3) {
                    JOptionPane.showMessageDialog(null,
                            "Department Name is Invalid", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    //exit the loop
                    cond = true;
                } else if (depLoc.length() <= 3) {
                    JOptionPane.showMessageDialog(null,
                            "Department Location is Invalid", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    //exit the loop
                    cond = true;
                } else if (txtDepName.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Department Name is Empty", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    //exit the loop
                    cond = true;
                } else if (txtLocation.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Department Location is Empty", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    //exit the loop
                    cond = true;
                }
            } else {
                i++;
            }
        } while (cond == false && i < HrSystem.getAllDepartments().size());
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbDepIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepIdActionPerformed
         //TODO add your handling code here:
        if(this.cmbDepId.getSelectedItem() != null){
            this.txtDepName.setText(HrSystem.getAllDepartments().get(this.cmbDepId.getSelectedIndex()).getName());
            this.txtLocation.setText(HrSystem.getAllDepartments().get(this.cmbDepId.getSelectedIndex()).getLocation());
        }
    }//GEN-LAST:event_cmbDepIdActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        int reply = JOptionPane.showConfirmDialog(
                null,
                "Are you sure you want to close this window?",
                "Warning", JOptionPane.YES_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCloseActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(
                null,
                "Are you sure you want to close this window?",
                "Warning", JOptionPane.YES_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(EditDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditDepartment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbDepId;
    private javax.swing.JLabel lblDepID;
    private javax.swing.JLabel lblDepName;
    private javax.swing.JLabel lblEditDep;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JTextField txtDepName;
    private javax.swing.JTextField txtLocation;
    // End of variables declaration//GEN-END:variables
}
