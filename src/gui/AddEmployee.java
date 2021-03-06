/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import logic.*;

/**
 * Name: AddEmployee
 *
 * @author Moosa Hammad
 */
public class AddEmployee extends javax.swing.JFrame {

    private DecimalFormat df2 = new DecimalFormat("BD #,##0.00");

    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
        initComponents(); //initiate components
        //code to change the background of the jframe
        java.awt.Color recursiveBG = new java.awt.Color(240, 240, 240);
        getContentPane().setBackground(recursiveBG);
        //centerting the window
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
        // loading the payScales
        loadPayScale();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpGen = new javax.swing.ButtonGroup();
        lblGender = new javax.swing.JLabel();
        txtLName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        lblPayLevel = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblLName = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        rdbtnMale = new javax.swing.JRadioButton();
        rdbtnFemale = new javax.swing.JRadioButton();
        lblEmpId = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        lblFName = new javax.swing.JLabel();
        txtEmpId = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        cmbPayLevel = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblGender.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblGender.setText("Gender: ");
        lblGender.setToolTipText("");

        txtLName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel5.setText("Address: ");
        jLabel5.setToolTipText("");

        txtAdress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblPayLevel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblPayLevel.setText("Pay Level: ");
        lblPayLevel.setToolTipText("");

        btnClose.setBackground(new java.awt.Color(255, 153, 153));
        btnClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 204));
        lblTitle.setText("Add Employee to System");

        lblLName.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblLName.setText("Last Name: ");
        lblLName.setToolTipText("");

        btnAdd.setBackground(new java.awt.Color(153, 255, 153));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnGrpGen.add(rdbtnMale);
        rdbtnMale.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rdbtnMale.setText("Male");

        btnGrpGen.add(rdbtnFemale);
        rdbtnFemale.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rdbtnFemale.setText("Female");

        lblEmpId.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblEmpId.setForeground(new java.awt.Color(255, 0, 0));
        lblEmpId.setText("Employee ID: ");
        lblEmpId.setToolTipText("");

        txtFName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblFName.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblFName.setText("First Name: ");
        lblFName.setToolTipText("");

        txtEmpId.setEditable(false);
        txtEmpId.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtEmpId.setText("(Auto generated)");
        txtEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpIdActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 153, 153));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearjButton1ActionPerformed(evt);
            }
        });

        cmbPayLevel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbPayLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPayLevelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblLName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblFName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPayLevel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbPayLevel, 0, 248, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGender)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbtnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbtnFemale))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmpId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(307, 307, 307))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblTitle)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPayLevel)
                        .addComponent(cmbPayLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(rdbtnMale)
                    .addComponent(rdbtnFemale))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmpId, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(txtEmpId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        // validation for the input 
        if (txtFName.getText().length() <= 2) {
            JOptionPane.showMessageDialog(null,
                    "First Name is Empty or less than two characters long", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (txtLName.getText().length() <= 2) {
            JOptionPane.showMessageDialog(null,
                    "Last Name is Empty or less than two characters long", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (txtAdress.getText().length() <= 2) {
            JOptionPane.showMessageDialog(null,
                    "Address is Empty or less than two characters long", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (this.cmbPayLevel.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null,
                    "Pay Level is not selected", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (this.btnGrpGen.getSelection() == null) {
            JOptionPane.showMessageDialog(null,
                    "You should select a gender for the employee", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            // get the values of the fileds 
            String fName = txtFName.getText();
            String lName = txtLName.getText();
            String address = txtAdress.getText();
            int payLvl = this.cmbPayLevel.getSelectedIndex();

            char gender = 0;

            //get the text of selected gender
            if (rdbtnMale.isSelected()) {
                gender = 'M';
            } else if (rdbtnFemale.isSelected()) {
                gender = 'F';
            }
            // create the employee object ang get back the id
            int empId = HrSystem.addEmployee(fName, lName, address, gender, payLvl);

            try {
                this.txtEmpId.setText(Integer.toString(empId));
            } // Exception Handling
            catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,
                        "The employee's ID cannot be converted to integers. Error: " + ex, "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            // display sucssess message
            JOptionPane.showMessageDialog(null,
                    "Employee added successfully", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed
    /**
     * @author Mohammad Madan Purpose: loading the payScales
     */
    private void loadPayScale() {
        this.cmbPayLevel.removeAllItems(); // Reset the combo box
        if (!HrSystem.getPayScales().isEmpty()) { // check if the payscale arrayList is not empty
            // loop for getting the data of the ArrayList
            for (int i = 0; i < HrSystem.getPayScales().size(); i++) {
                this.cmbPayLevel.addItem(HrSystem.getPayScales().get(i).getLevel() + " - "
                        + df2.format(HrSystem.getPayScales().get(i).getValue()));
            }
        }
        // set selected item to null 
        this.cmbPayLevel.setSelectedItem(null);
    }
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // Show conformation message 
        int reply = JOptionPane.showConfirmDialog(
                null,
                "Are you sure you want to close this window?",
                "Warning", JOptionPane.YES_OPTION);
        // check the choice of the user
        if (reply == JOptionPane.YES_OPTION) { // if yes
            this.dispose();//dispose this window
        }
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLNameActionPerformed

    private void btnClearjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearjButton1ActionPerformed
        // Show conformation message 
        int reply = JOptionPane.showConfirmDialog(
                null,
                "Are you sure you want to clear fields?",
                "Warning", JOptionPane.YES_OPTION);
        // check the user input
        if (reply == JOptionPane.YES_OPTION) {
            // clear everything
            this.btnGrpGen.clearSelection();
            this.txtAdress.setText(null);
            this.txtFName.setText(null);
            this.txtLName.setText(null);
            this.cmbPayLevel.setSelectedIndex(-1);
            this.txtEmpId.setText(null);
        }
    }//GEN-LAST:event_btnClearjButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        // Show conformation message 
        int reply = JOptionPane.showConfirmDialog(
                null,
                "Are you sure you want to close this window?",
                "Warning", JOptionPane.YES_OPTION);
        // check the choice of the user
        if (reply == JOptionPane.YES_OPTION) {
            this.dispose();//dispose this window
        }
    }//GEN-LAST:event_formWindowClosing

    private void cmbPayLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPayLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPayLevelActionPerformed

    private void txtEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpIdActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.ButtonGroup btnGrpGen;
    private javax.swing.JComboBox<String> cmbPayLevel;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLName;
    private javax.swing.JLabel lblPayLevel;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton rdbtnFemale;
    private javax.swing.JRadioButton rdbtnMale;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    // End of variables declaration//GEN-END:variables
}
