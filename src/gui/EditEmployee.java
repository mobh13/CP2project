/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import logic.Employee;
import logic.HrSystem;
import logic.PayScale;

/**
 *
 * @author A.A
 */
public class EditEmployee extends javax.swing.JFrame {

    /**
     * Creates new form manageEmployee
     */
    
    public EditEmployee() {
        initComponents();
        java.awt.Color recursiveBG = new java.awt.Color(240, 240,240);
        getContentPane().setBackground(recursiveBG);
        loadEmp();
        loadPayScale();
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        lblEmpId = new javax.swing.JLabel();
        cmbEmpId = new javax.swing.JComboBox<>();
        lblFName = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtLName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPayLevel = new javax.swing.JLabel();
        lblLName = new javax.swing.JLabel();
        rdbtnMale = new javax.swing.JRadioButton();
        rdbtnFemale = new javax.swing.JRadioButton();
        btnClose = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        cmbPayScale = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage Employees");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 204));
        lblTitle.setText("Edit Information of Employee");

        lblEmpId.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblEmpId.setForeground(new java.awt.Color(255, 0, 0));
        lblEmpId.setText("Employee ID: ");

        cmbEmpId.setEditable(true);
        cmbEmpId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbEmpId.setMaximumRowCount(100);
        cmbEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmpIdActionPerformed(evt);
            }
        });

        lblFName.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblFName.setText("First Name: ");
        lblFName.setToolTipText("");

        txtFName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblGender.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblGender.setText("Gender: ");
        lblGender.setToolTipText("");

        txtLName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblAddress.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblAddress.setText("Address: ");
        lblAddress.setToolTipText("");

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblPayLevel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblPayLevel.setText("Pay Level: ");
        lblPayLevel.setToolTipText("");

        lblLName.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblLName.setText("Last Name: ");
        lblLName.setToolTipText("");

        buttonGroup2.add(rdbtnMale);
        rdbtnMale.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rdbtnMale.setText("Male");

        buttonGroup2.add(rdbtnFemale);
        rdbtnFemale.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rdbtnFemale.setText("Female");

        btnClose.setBackground(new java.awt.Color(255, 153, 153));
        btnClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(153, 255, 153));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        cmbPayScale.setEditable(true);
        cmbPayScale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbPayScale.setMaximumRowCount(100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPayLevel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbPayScale, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblEmpId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGender)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbtnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbtnFemale)))
                        .addGap(292, 292, 292))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblTitle)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPayLevel)
                        .addComponent(cmbPayScale, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(rdbtnMale)
                    .addComponent(rdbtnFemale))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (this.cmbEmpId.getSelectedItem() != null) {
            int temp_index = this.cmbEmpId.getSelectedIndex();
            if (this.txtFName.getText() != null && this.txtFName.getText().length() > 2) {
                if (this.txtLName.getText() != null && this.txtLName.getText().length() > 2) {
                    if (this.txtAddress.getText() != null && this.txtAddress.getText().length() > 2) {
                        if (this.cmbPayScale.getSelectedIndex() >= 0) {
                            if (this.rdbtnFemale.isSelected() || this.rdbtnMale.isSelected()) {
                                int indx = this.cmbEmpId.getSelectedIndex();
                                String f_name = this.txtFName.getText();
                                String l_name = this.txtLName.getText();
                                String adress = this.txtAddress.getText();
                                int payScale_indx = this.cmbPayScale.getSelectedIndex();
                                char gender = 0;
                                if (this.rdbtnFemale.isSelected()) {
                                    gender = 'F';
                                }
                                if (this.rdbtnMale.isSelected()) {
                                    gender = 'M';
                                }
                                HrSystem.editEmployee(indx, f_name, l_name, adress, gender, payScale_indx);
                                JOptionPane.showMessageDialog(this,
                                        "The updates have been saved successfully for employee "
                                        + HrSystem.getAllEmployees().get(temp_index).getFirstName() + " "
                                        + HrSystem.getAllEmployees().get(temp_index).getLastName() + ".",
                                        "Updated",
                                        JOptionPane.PLAIN_MESSAGE);
                                this.cmbEmpId.setSelectedItem(null);
                                this.cmbPayScale.setSelectedItem(null);
                                this.txtFName.setText(null);
                                this.txtLName.setText(null);
                                this.txtAddress.setText(null);
                                this.rdbtnFemale.setSelected(false);
                                this.rdbtnMale.setSelected(false);
                            } else {
                                JOptionPane.showMessageDialog(this, "Please select either one of the genders", "Error", 2);
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "Please select a payscale level from combo box", "Error", 2);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Please eneter an address", "Error", 2);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please enter a last name that is longer than two characters", "Error", 2);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a first name that is longer than two characters", "Error", 2);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please select an employee from combo box", "Error", 2);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmpIdActionPerformed
        // TODO add your handling code here:
        if (this.cmbEmpId.getSelectedItem() != null) {
            Employee temp_emp = HrSystem.getAllEmployees().get(this.cmbEmpId.getSelectedIndex());
            this.txtFName.setText(temp_emp.getFirstName());
            this.txtLName.setText(temp_emp.getLastName());
            this.txtAddress.setText(temp_emp.getAddress());
            if (temp_emp.getGender() == 'M' || temp_emp.getGender() == 'm') {
                this.rdbtnMale.setSelected(true);
            } else {
                this.rdbtnFemale.setSelected(true);
            }
            this.cmbPayScale.setSelectedIndex((temp_emp.getPayLevel().getLevel() - 1));
        }
    }//GEN-LAST:event_cmbEmpIdActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
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

    
    private void loadEmp() {
        this.cmbEmpId.removeAllItems();
        for (int i = 0; i < HrSystem.getAllEmployees().size(); i++) {
            String info = HrSystem.getAllEmployees().get(i).getId() + " - "
                    + HrSystem.getAllEmployees().get(i).getFirstName() + " "
                    + HrSystem.getAllEmployees().get(i).getLastName();
            this.cmbEmpId.addItem(info);
        }
        this.cmbEmpId.setSelectedItem(null);
    }

    private void loadPayScale() {
        this.cmbPayScale.removeAllItems();
        for (int i = 0; i < HrSystem.getPayScales().size(); i++) {
            PayScale temp_pay = HrSystem.getPayScales().get(i);
            String payScale = temp_pay.getLevel() + " - " + temp_pay.getValue();
            this.cmbPayScale.addItem(payScale);
        }
        this.cmbPayScale.setSelectedItem(null);
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
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbEmpId;
    private javax.swing.JComboBox<String> cmbPayScale;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLName;
    private javax.swing.JLabel lblPayLevel;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton rdbtnFemale;
    private javax.swing.JRadioButton rdbtnMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    // End of variables declaration//GEN-END:variables
}
