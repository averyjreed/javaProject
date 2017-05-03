/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.Enumeration;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.Color;
import javax.swing.AbstractButton;
import javax.swing.JTable;


public class PayrollPage extends javax.swing.JFrame {

    /**
     * Creates new form PayrollPage
     */
    public PayrollPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        homemenu = new javax.swing.JMenu();
        employeemenu = new javax.swing.JMenu();
        departmentmenu = new javax.swing.JMenu();
        assignmentmenu = new javax.swing.JMenu();
        payrollmenu = new javax.swing.JMenu();
        close = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel1.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reed-Bentley Construction Payroll");
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 600));

        homemenu.setText("Home");
        homemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homemenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(homemenu);

        employeemenu.setText("Employees");
        employeemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeemenuMouseClicked(evt);
            }
        });
        employeemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeemenuActionPerformed(evt);
            }
        });
        jMenuBar1.add(employeemenu);

        departmentmenu.setText("Departments");
        departmentmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departmentmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(departmentmenu);

        assignmentmenu.setText("Assignments");
        assignmentmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assignmentmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(assignmentmenu);

        payrollmenu.setText("Payroll");
        payrollmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payrollmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(payrollmenu);

        close.setText("Close");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jMenuBar1.add(close);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homemenuMouseClicked

        HomePage hp = new HomePage();
        hp.setVisible(true);
        dispose();
    }//GEN-LAST:event_homemenuMouseClicked

    private void employeemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeemenuMouseClicked
        EmployeePage ep = new EmployeePage();
        ep.setVisible(true);
        dispose();
    }//GEN-LAST:event_employeemenuMouseClicked

    private void employeemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeemenuActionPerformed

    }//GEN-LAST:event_employeemenuActionPerformed

    private void departmentmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentmenuMouseClicked
        DepartmentPage dp = new DepartmentPage();
        dp.setVisible(true);
        dispose();
    }//GEN-LAST:event_departmentmenuMouseClicked

    private void assignmentmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignmentmenuMouseClicked
        AssignmentPage ap = new AssignmentPage();
        ap.setVisible(true);
        dispose();
    }//GEN-LAST:event_assignmentmenuMouseClicked

    private void payrollmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payrollmenuMouseClicked
     
    }//GEN-LAST:event_payrollmenuMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed

    }//GEN-LAST:event_closeActionPerformed

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
            java.util.logging.Logger.getLogger(PayrollPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayrollPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayrollPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayrollPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayrollPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu assignmentmenu;
    private javax.swing.JMenu close;
    private javax.swing.JMenu departmentmenu;
    private javax.swing.JMenu employeemenu;
    private javax.swing.JMenu homemenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu payrollmenu;
    // End of variables declaration//GEN-END:variables
}
