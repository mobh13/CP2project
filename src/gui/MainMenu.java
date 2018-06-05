/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.*;
import java.util.ArrayList;

import logic.*;
import javafx.scene.paint.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author A.A
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form prog_gui_form
     */
    public MainMenu() {
        initComponents();
        java.awt.Color recursiveBG = new java.awt.Color(240, 240, 240);
        getContentPane().setBackground(recursiveBG);
        HrSystem hrSystem = new HrSystem();
        deSerialize();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        btnDepEditInfo = new javax.swing.JButton();
        btnDepDel = new javax.swing.JButton();
        btnDesigHead = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnEmpEditInfo = new javax.swing.JButton();
        btnDelEmp = new javax.swing.JButton();
        btnAssignEmptoDep = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnListEmployees = new javax.swing.JButton();
        btnAddDepartment = new javax.swing.JButton();
        btnAddEmployee = new javax.swing.JButton();
        btnPayReport = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnSaveChange = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnCleanInstall = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Humen Resources System");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Department", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 22), new java.awt.Color(153, 153, 0))); // NOI18N

        btnDepEditInfo.setBackground(new java.awt.Color(244, 219, 136));
        btnDepEditInfo.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnDepEditInfo.setText("Edit Information");
        btnDepEditInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepEditInfoActionPerformed(evt);
            }
        });

        btnDepDel.setBackground(new java.awt.Color(244, 219, 136));
        btnDepDel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnDepDel.setText("Delete Department");
        btnDepDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepDelActionPerformed(evt);
            }
        });

        btnDesigHead.setBackground(new java.awt.Color(244, 219, 136));
        btnDesigHead.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnDesigHead.setText("Designate Head");
        btnDesigHead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesigHeadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDepEditInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnDepDel, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDesigHead, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDepEditInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDepDel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesigHead, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 22), new java.awt.Color(0, 102, 0))); // NOI18N

        btnEmpEditInfo.setBackground(new java.awt.Color(139, 255, 126));
        btnEmpEditInfo.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnEmpEditInfo.setText("Edit Information");
        btnEmpEditInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpEditInfoActionPerformed(evt);
            }
        });

        btnDelEmp.setBackground(new java.awt.Color(139, 255, 126));
        btnDelEmp.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnDelEmp.setText("Delete Employee");
        btnDelEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelEmpActionPerformed(evt);
            }
        });

        btnAssignEmptoDep.setBackground(new java.awt.Color(139, 255, 126));
        btnAssignEmptoDep.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnAssignEmptoDep.setText("Assign Department");
        btnAssignEmptoDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignEmptoDepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(btnEmpEditInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssignEmptoDep, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmpEditInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssignEmptoDep, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "General", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 22), new java.awt.Color(102, 0, 0))); // NOI18N

        btnListEmployees.setBackground(new java.awt.Color(237, 157, 157));
        btnListEmployees.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnListEmployees.setText("List Employees ");
        btnListEmployees.setPreferredSize(new java.awt.Dimension(175, 35));
        btnListEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListEmployeesActionPerformed(evt);
            }
        });

        btnAddDepartment.setBackground(new java.awt.Color(237, 157, 157));
        btnAddDepartment.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnAddDepartment.setText("Add Department");
        btnAddDepartment.setPreferredSize(new java.awt.Dimension(175, 35));
        btnAddDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDepartmentActionPerformed(evt);
            }
        });

        btnAddEmployee.setBackground(new java.awt.Color(237, 157, 157));
        btnAddEmployee.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnAddEmployee.setText("Add Employee");
        btnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeeActionPerformed(evt);
            }
        });

        btnPayReport.setBackground(new java.awt.Color(237, 157, 157));
        btnPayReport.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnPayReport.setText("Preduce Pay Report");
        btnPayReport.setPreferredSize(new java.awt.Dimension(200, 35));
        btnPayReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnListEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPayReport, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPayReport, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnSaveChange.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSaveChange.setForeground(new java.awt.Color(0, 102, 0));
        btnSaveChange.setText("Save Cahnges");

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(250, 0, 0));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnCleanInstall.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCleanInstall.setForeground(new java.awt.Color(250, 0, 0));
        btnCleanInstall.setText("Clean Install");

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Main Menu");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Human Resource System");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/hrlogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(btnCleanInstall)
                                .addGap(18, 18, 18)
                                .addComponent(btnSaveChange, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveChange, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCleanInstall, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel2.getAccessibleContext().setAccessibleName("PayScale");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpEditInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpEditInfoActionPerformed
        // TODO add your handling code here:
        if (!HrSystem.getAllEmployees().isEmpty()) {
            EditEmployee ee1 = new EditEmployee();
            ee1.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No Employees exist", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEmpEditInfoActionPerformed

    private void btnDelEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelEmpActionPerformed
        //check if the employees exist to enter and if none then display an error message
        if (!HrSystem.getAllEmployees().isEmpty()) {
            DeleteEmployee deleteEmployee = new DeleteEmployee();
            deleteEmployee.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No Employees exist", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDelEmpActionPerformed

    private void btnAssignEmptoDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignEmptoDepActionPerformed

        if (!HrSystem.getAllDepartments().isEmpty()) {
            AssignEmployee assignEmployee = new AssignEmployee();
            assignEmployee.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No Departments exist", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAssignEmptoDepActionPerformed

    private void btnDepEditInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepEditInfoActionPerformed
        //check if the departments exist to enter and if none then display an error message
        if (!HrSystem.getAllDepartments().isEmpty()) {
            EditDepartment editDepartment = new EditDepartment();
            editDepartment.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No Departments exist", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDepEditInfoActionPerformed

    private void btnDepDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepDelActionPerformed
        // TODO add your handling code here:
        if (!HrSystem.getAllDepartments().isEmpty()) {
            DeleteDepartment del_dep = new DeleteDepartment();
            del_dep.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No Departments exist", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnDepDelActionPerformed

    private void btnDesigHeadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesigHeadActionPerformed
        // TODO add your handling code here:

        if (!HrSystem.getAllDepartments().isEmpty()) {
            DesignateHead dh1 = new DesignateHead();
            dh1.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No Departments exist", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDesigHeadActionPerformed

    private void btnListEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListEmployeesActionPerformed
        // TODO add your handling code here:
        if (!HrSystem.getAllEmployees().isEmpty()) {
            ListEmployees listEmployees = new ListEmployees();
            listEmployees.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No Employees exist", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnListEmployeesActionPerformed

    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed
        // TODO add your handling code here:
        AddEmployee addEmployee = new AddEmployee();
        addEmployee.setVisible(true);
    }//GEN-LAST:event_btnAddEmployeeActionPerformed

    private void btnAddDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDepartmentActionPerformed
        // TODO add your handling code here:
        AddDepartment addDepartment = new AddDepartment();
        addDepartment.setVisible(true);
    }//GEN-LAST:event_btnAddDepartmentActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        exitPreform();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        exitPreform();
    }//GEN-LAST:event_formWindowClosing

    private void btnPayReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPayReportActionPerformed

    private void exitPreform() {

        int reply = JOptionPane.showConfirmDialog(
                null,
                "Do you want to save changes you made to the system before exit?",
                "Warning", JOptionPane.YES_NO_CANCEL_OPTION);
        //if condition to check if the reply is yes
        if (reply == JOptionPane.YES_OPTION) {
            doSerialize(); //serialize system
            System.exit(0);//Exit the program after saving data
        } else if (reply == JOptionPane.NO_OPTION) {
            System.exit(0);//Exit the program after saving data
        }
    }

    private void doSerialize() {
        try {
            // create FileOuputStream & ObjectOutputStream objects to serialize
            FileOutputStream f = new FileOutputStream("hrsystemdata.data");
            ObjectOutputStream outt = new ObjectOutputStream(f);
            // serialize the data objects
            outt.writeObject(HrSystem.getAllEmployees());
            outt.writeObject(HrSystem.getAllDepartments());
            outt.writeObject(HrSystem.getPayScales());
        } catch (FileNotFoundException ex) { //error message
            JOptionPane.showMessageDialog(this, ex + "\nThe output file was "
                    + "not found!", "Output Error", 0);
        } catch (IOException ex) { //error message
            JOptionPane.showMessageDialog(this, ex + "\nThe output is not "
                    + "accessible!", "Output Error", 0);
        }
    }

    private void deSerialize() {

        try {

            FileInputStream file = new FileInputStream("hrsystemdata.data");
            ObjectInputStream in = new ObjectInputStream(file);
            HrSystem.setAllEmployees((ArrayList<Employee>) in.readObject());
            HrSystem.setAllDepartments((ArrayList<Department>) in.readObject());
            HrSystem.setPayScales((ArrayList<PayScale>) in.readObject());
            int payScaleId = 0;
            int departmentId = 0;
            int employeeId = 0;
            int counter = 0;
            int inCounter = 0;
            while (counter < HrSystem.getAllEmployees().size()) {

                if (HrSystem.getAllEmployees().get(counter).getId() > employeeId) {
                    employeeId = HrSystem.getAllEmployees().get(counter).getId();
                    counter++;

                }

            }
            counter = 0;
            while (counter < HrSystem.getAllDepartments().size()) {

                if (HrSystem.getAllDepartments().get(counter).getId() > departmentId) {
                    departmentId = HrSystem.getAllDepartments().get(counter).getId();
                    counter++;

                }

            }
            counter = 0;
            while (counter < HrSystem.getPayScales().size()) {

                if (HrSystem.getPayScales().get(counter).getId() > payScaleId) {
                    payScaleId = HrSystem.getPayScales().get(counter).getId();
                    counter++;

                }

            }
            departmentId++;
            employeeId++;
            payScaleId++;
            Department.setIdCounter(departmentId);
            Employee.setIdCounter(employeeId);
            PayScale.setIdCounter(payScaleId);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Are running the "
                    + "program for the first time? Please install the "
                    + "startup file in the main menu. \n" + ex);
        } catch (IOException ex) {// show error message
            JOptionPane.showMessageDialog(this, ex + "\nThe data file is not "
                    + "accessible!", "Input Error", 0);
        } catch (ClassNotFoundException ex) {// show error message
            JOptionPane.showMessageDialog(this, ex + "\nThe data cannot be "
                    + "loaded into the system!", "Internal Input Error", 0);
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDepartment;
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JButton btnAssignEmptoDep;
    private javax.swing.JButton btnCleanInstall;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelEmp;
    private javax.swing.JButton btnDepDel;
    private javax.swing.JButton btnDepEditInfo;
    private javax.swing.JButton btnDesigHead;
    private javax.swing.JButton btnEmpEditInfo;
    private javax.swing.JButton btnListEmployees;
    private javax.swing.JButton btnPayReport;
    private javax.swing.JButton btnSaveChange;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
