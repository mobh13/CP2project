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
 * Name Delete Department
 *
 * @author Abdulla Ali
 *
 * Purpose: used to provide an interface to delete a department with checking of
 * set of conditions.
 * @version 1
 */
public class DeleteDepartment extends javax.swing.JFrame {

    /**
     * Creates new form DeleteDepartment
     *
     * @author: Abdulla Ali
     */
    public DeleteDepartment() {
        initComponents();
        //code to change the background of the jframe
        java.awt.Color recursiveBG = new java.awt.Color(240, 240, 240);
        getContentPane().setBackground(recursiveBG);
        //calling a method to load deps in combo box
        loadDepartments();
        //centerting the window
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
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
        lblDepId = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cmbDepId = new javax.swing.JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 204));
        lblTitle.setText("Delete a Department");

        lblDepId.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblDepId.setForeground(new java.awt.Color(255, 0, 0));
        lblDepId.setText("Department ID: ");

        btnClose.setBackground(new java.awt.Color(255, 153, 153));
        btnClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 255, 153));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        cmbDepId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbDepId.setMaximumRowCount(100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblDepId)
                                .addGap(18, 18, 18)
                                .addComponent(cmbDepId, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblTitle)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDepId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Name: action to be performed when the button of delete employee is
     * clicked.
     *
     * @param evt
     */
    //method that would run after clicking delete button
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        //if statment to check if the user selected something
        if (this.cmbDepId.getSelectedItem() != null) {
            //checking if there is no employes in the department 
            if (HrSystem.getAllDepartments().get(this.cmbDepId.getSelectedIndex() + 1).getListOfEmployees().isEmpty()) {
                //asking confirmation
                int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete department "
                        + HrSystem.getAllDepartments().get(this.cmbDepId.getSelectedIndex() + 1).getName() + "?",
                        "Warning", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    //deleting the department and validating results
                    if (HrSystem.deleteDepartment(HrSystem.getAllDepartments().get(this.cmbDepId.getSelectedIndex() + 1)) == true) {
                        JOptionPane.showMessageDialog(null, "The department have been deleted successfully.",
                                "Message", 1);
                        loadDepartments();
                    } else {
                        JOptionPane.showMessageDialog(null, "The department " + HrSystem.getAllDepartments().get(this.cmbDepId.getSelectedIndex() + 1).getName()
                                + "Could not have been deleted",
                                "Message", 2);
                    }
                    //if there are still employes working at the department
                }
            } else {
                JOptionPane.showMessageDialog(null, "The department " + HrSystem.getAllDepartments().get(this.cmbDepId.getSelectedIndex() + 1).getName()
                        + " still have employees assigned to it, please remove employees before deleting department.",
                        "Error", 2);
            }

            //if the user did not choose anything
        } else {
            JOptionPane.showMessageDialog(this, "Please select a department from combo box.",
                    "Error", 2);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        //confirmation before exiting the window by clikcing on close button
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
        //confirmation before exiting the window by clikcing on X (top right) button
        int reply = JOptionPane.showConfirmDialog(
                null,
                "Are you sure you want to close this window?",
                "Warning", JOptionPane.YES_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing
    //method to populate combo box
    /**
     * @Author: abdulla ali purpose: to load departments in the combo box
     */
    private void loadDepartments() {
        //checking if the system has departments entered 
        if (!HrSystem.getAllDepartments().isEmpty()) {
            //clearing coombo box
            this.cmbDepId.removeAllItems();
            try {
                //for loop to add all departments
                for (int i = 1; i < HrSystem.getAllDepartments().size(); i++) {
                    String info = HrSystem.getAllDepartments().get(i).getId() + " - "
                            + HrSystem.getAllDepartments().get(i).getName();
                    this.cmbDepId.addItem(info);
                }
                //to catch the exception of array's index out of bound
            } catch (IndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(this, "While loading the departments in "
                        + "the combo box, an error has occured:\n" + ex, null, 0);
                //general exception to prvent the application from crashing 
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "An error has occured:\n" + ex, null, 0);
            }

            //setting the initial selected item null
            this.cmbDepId.setSelectedItem(null);
        }

    }

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
            java.util.logging.Logger.getLogger(DeleteDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteDepartment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<String> cmbDepId;
    private javax.swing.JLabel lblDepId;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
