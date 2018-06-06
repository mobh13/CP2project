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
public class DesignateHead extends javax.swing.JFrame {

    /**
     * Creates new form DesignateHead
     */
    public DesignateHead() {
        initComponents();
        java.awt.Color recursiveBG = new java.awt.Color(240, 240, 240);
        getContentPane().setBackground(recursiveBG);
        loadDepartments();
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

        btnClose = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnDesignate = new javax.swing.JButton();
        lblEmpId = new javax.swing.JLabel();
        lblDepId = new javax.swing.JLabel();
        lblInstructionos = new javax.swing.JLabel();
        cmbDepId = new javax.swing.JComboBox<>();
        cmbEmpID = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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
        lblTitle.setText("Designate Department Head");

        btnDesignate.setBackground(new java.awt.Color(153, 255, 153));
        btnDesignate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDesignate.setText("Designate");
        btnDesignate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesignateActionPerformed(evt);
            }
        });

        lblEmpId.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblEmpId.setForeground(new java.awt.Color(255, 0, 0));
        lblEmpId.setText("Employee ID: ");

        lblDepId.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblDepId.setForeground(new java.awt.Color(255, 0, 0));
        lblDepId.setText("Department ID:");

        lblInstructionos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblInstructionos.setText("* Select a department first to show employees of that department");

        cmbDepId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbDepId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepIdActionPerformed(evt);
            }
        });

        cmbEmpID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(lblTitle)
                .addGap(0, 243, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDepId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnDesignate, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(cmbEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblInstructionos)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblDepId)
                            .addGap(289, 289, 289)
                            .addComponent(lblEmpId)))
                    .addContainerGap(314, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblTitle)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDepId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesignate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(178, 178, 178)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDepId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(lblInstructionos)
                    .addContainerGap(181, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnDesignateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesignateActionPerformed
        // TODO add your handling code here:
        if (this.cmbEmpID.getSelectedItem() != null) {
            int empId = this.cmbEmpID.getSelectedIndex();
            int depId = this.cmbDepId.getSelectedIndex();

            if (HrSystem.getAllDepartments().get(depId).getHead() != null) {
                int reply = JOptionPane.showConfirmDialog(
                        null, "The department already has a head, are you sure you want to replace?",
                        "Warning", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    HrSystem.designateHead(empId, depId);
                    JOptionPane.showMessageDialog(this, "Employee: " + HrSystem.getAllEmployees().get(empId).getFirstName() + " "
                            + HrSystem.getAllEmployees().get(empId).getLastName() + " is now the head of "
                            + HrSystem.getAllDepartments().get(depId).getName() + " Department.", "Designation is successul", 1);
                    this.cmbDepId.setSelectedItem(null);
                    this.cmbEmpID.setSelectedItem(null);
                } else if (reply == JOptionPane.NO_OPTION) {
                    //do nothing
                }
            } else {
                HrSystem.designateHead(empId, depId);
                JOptionPane.showMessageDialog(this, "Employee: " + HrSystem.getAllEmployees().get(empId).getFirstName() + " "
                        + HrSystem.getAllEmployees().get(empId).getLastName() + " is now the head of "
                        + HrSystem.getAllDepartments().get(depId).getName() + " Department.", "Designation is successul", 1);
                this.cmbDepId.setSelectedItem(null);
                this.cmbEmpID.setSelectedItem(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select items in both boxes", "Items not Selected", 2);
        }
    }//GEN-LAST:event_btnDesignateActionPerformed

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

    private void cmbDepIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepIdActionPerformed
        // TODO add your handling code here
        int index = this.cmbDepId.getSelectedIndex();
        this.cmbEmpID.removeAllItems();
        if(this.cmbDepId.getSelectedItem() != null){
            try {
            for (int i = 0; i < HrSystem.getAllDepartments().get(index).getListOfEmployees().size(); i++) {
                String info = HrSystem.getAllDepartments().get(index).getListOfEmployees().get(i).getId() + " - "
                        + HrSystem.getAllDepartments().get(index).getListOfEmployees().get(i).getFirstName() + " "
                        + HrSystem.getAllDepartments().get(index).getListOfEmployees().get(i).getLastName();
                this.cmbEmpID.addItem(info);
            }
            this.cmbEmpID.setSelectedItem(null);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null,
                    "There are no employees in the department selected.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        }
        
    }//GEN-LAST:event_cmbDepIdActionPerformed

    private void loadDepartments() {
        if (!HrSystem.getAllDepartments().isEmpty()) {
            this.cmbDepId.removeAllItems();
            for (int i = 0; i < HrSystem.getAllDepartments().size(); i++) {
                String info = HrSystem.getAllDepartments().get(i).getId() + " - "
                        + HrSystem.getAllDepartments().get(i).getName();
                this.cmbDepId.addItem(info);
            }
            this.cmbDepId.setSelectedIndex(-1);
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
            java.util.logging.Logger.getLogger(DesignateHead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesignateHead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesignateHead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesignateHead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesignateHead().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDesignate;
    private javax.swing.JComboBox<String> cmbDepId;
    private javax.swing.JComboBox<String> cmbEmpID;
    private javax.swing.JLabel lblDepId;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblInstructionos;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
