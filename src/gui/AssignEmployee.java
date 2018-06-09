/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import logic.*;

/**
 *
 * @author A.A
 */

public class AssignEmployee extends javax.swing.JFrame {
    /**
     * Creates new form AssignEmployee
     */
public AssignEmployee() {
        initComponents();
        java.awt.Color recursiveBG = new java.awt.Color(240, 240, 240);
        getContentPane().setBackground(recursiveBG);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
        depsLoad();
    }
/**
  * This method is called from within the constructor to initialize the form.
  * WARNING: Do NOT modify this code. The content of this method is always
  * regenerated by the Form Editor.
*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jOptionPane1 = new javax.swing.JOptionPane();
        cmbEmpId = new javax.swing.JComboBox<>();
        btnClose = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblEmpId = new javax.swing.JLabel();
        cmbDepIdto = new javax.swing.JComboBox<>();
        lblDepId = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        cmbDepIdfrom = new javax.swing.JComboBox<>();
        lblDepId1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        cmbEmpId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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
        lblTitle.setText("Assign an Employee to a Department");

        lblEmpId.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblEmpId.setForeground(new java.awt.Color(255, 0, 0));
        lblEmpId.setText("Employee ID: ");

        cmbDepIdto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbDepIdto.setMaximumRowCount(100);

        lblDepId.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblDepId.setForeground(new java.awt.Color(255, 0, 0));
        lblDepId.setText("Department ID:");

        btnAssign.setBackground(new java.awt.Color(153, 255, 153));
        btnAssign.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        cmbDepIdfrom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbDepIdfrom.setMaximumRowCount(100);
        cmbDepIdfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepIdfromActionPerformed(evt);
            }
        });

        lblDepId1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblDepId1.setForeground(new java.awt.Color(255, 0, 0));
        lblDepId1.setText("Department ID:");

        jLabel1.setText("* Assign to");

        jLabel2.setText("* Assign from");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(lblTitle)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(347, 347, 347))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDepId1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbDepIdfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDepId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbDepIdto, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEmpId)
                        .addGap(20, 20, 20)
                        .addComponent(cmbEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblTitle)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDepId1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDepIdfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDepId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDepIdto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void depsLoad() {
        cmbDepIdfrom.removeAllItems(); //remove all itemsz
        //while loop to add Departments names to combo box
        for (int i = 0; i < HrSystem.getAllDepartments().size(); i++) {
            if (HrSystem.getAllDepartments().get(i).getId() == 0) {
                cmbDepIdfrom.addItem(HrSystem.getAllDepartments().get(i).getName());
            } else {
                cmbDepIdfrom.addItem(HrSystem.getAllDepartments().get(i).getId() + " - "
                        + HrSystem.getAllDepartments().get(i).getName());
            }
        }
        cmbDepIdfrom.setSelectedItem(null); //set selected Department to null
    }

    private void empsLoad() {
        cmbEmpId.removeAllItems(); //remove all items
        //while loop to add employees ids and names to combo box
        if (cmbDepIdfrom.getSelectedItem() != null) {
            for (int i = 0; i < HrSystem.getAllDepartments().get(cmbDepIdfrom.getSelectedIndex()).getListOfEmployees().size(); i++) {
                cmbEmpId.addItem(HrSystem.getAllDepartments().get(cmbDepIdfrom.getSelectedIndex()).getListOfEmployees().get(i).getId()
                        + " - " + HrSystem.getAllDepartments().get(cmbDepIdfrom.getSelectedIndex()).getListOfEmployees().get(i).getFirstName()
                        + " " + HrSystem.getAllDepartments().get(cmbDepIdfrom.getSelectedIndex()).getListOfEmployees().get(i).getLastName());
            }
        }
        this.cmbEmpId.setSelectedItem(null); //set selected Department to null
    }

    private void toDepsLoad() {
        cmbDepIdto.removeAllItems(); //remove all itemes
        //for loop to add Departments names to combo box
        for (int counter = 0; counter < HrSystem.getAllDepartments().size(); counter++) {
            if (HrSystem.getAllDepartments().get(counter).getId() == 0 && HrSystem.getAllDepartments().get(counter).getId() != cmbDepIdfrom.getSelectedIndex()) {
                cmbDepIdto.addItem(HrSystem.getAllDepartments().get(counter).getName());
            } else if (counter == cmbDepIdfrom.getSelectedIndex()) {
                //do nothing
            } else {
                cmbDepIdto.addItem(HrSystem.getAllDepartments().get(counter).getId() + " - "
                        + HrSystem.getAllDepartments().get(counter).getName());
            }
        }
        cmbDepIdto.setSelectedItem(null); //set selected Department to null
    }

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

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        if (cmbDepIdfrom.getSelectedItem() != null) {
            if (cmbEmpId.getSelectedItem() != null) {
                if (cmbDepIdto.getSelectedItem() != null) {
                    if (HrSystem.getAllDepartments().get(cmbDepIdfrom.getSelectedIndex()).getHead() != null) {
                        if (HrSystem.getAllDepartments().get(cmbDepIdfrom.getSelectedIndex()).getListOfEmployees().get(cmbEmpId.getSelectedIndex())
                                .getId() != HrSystem.getAllDepartments().get(cmbDepIdfrom.getSelectedIndex()).getHead().getId()) {
                            assigningEmployee();
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "The Employee is the head of a department, you can't assign him/her", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        assigningEmployee();
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                            "No Department  was  selected to assign the employee to", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "No Employee Was selected", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "No Department  was  selected", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAssignActionPerformed

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

    private void cmbDepIdfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepIdfromActionPerformed
        toDepsLoad();
        empsLoad();
    }//GEN-LAST:event_cmbDepIdfromActionPerformed

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
            java.util.logging.Logger.getLogger(AssignEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignEmployee().setVisible(true);
            }
        });
    }

    private void assigningEmployee() {
        Employee emp = HrSystem.getAllDepartments().get(cmbDepIdfrom.getSelectedIndex()).getListOfEmployees().remove(cmbEmpId.getSelectedIndex());
        
        if (cmbDepIdfrom.getSelectedIndex() <= cmbDepIdto.getSelectedIndex()) {
            HrSystem.getAllDepartments().get(cmbDepIdto.getSelectedIndex() + 1).getListOfEmployees().add(emp);
        }else {
            HrSystem.getAllDepartments().get(cmbDepIdto.getSelectedIndex()).getListOfEmployees().add(emp);
        }
        JOptionPane.showMessageDialog(null,
                "Employee assigned successfully", "Success",
                JOptionPane.INFORMATION_MESSAGE);
        cmbDepIdfrom.setSelectedItem(null);
        cmbDepIdto.setSelectedItem(null);
        cmbEmpId.setSelectedItem(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnClose;
    private javax.swing.JComboBox<String> cmbDepIdfrom;
    private javax.swing.JComboBox<String> cmbDepIdto;
    private javax.swing.JComboBox<String> cmbEmpId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblDepId;
    private javax.swing.JLabel lblDepId1;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
