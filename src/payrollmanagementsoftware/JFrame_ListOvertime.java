/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package payrollmanagementsoftware;

import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrame_ListOvertime extends javax.swing.JFrame {

    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public JFrame_ListOvertime() {
        initComponents();
        refreshTable();
    }
    
    private void refreshTable() {
        try {
            String sql = "select * from Overtime";
            pst = ConnectionDB.conDB().prepareStatement(sql);

            rs = pst.executeQuery();
            ResultSetMetaData data = rs.getMetaData();
            int q = data.getColumnCount();

            DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                Vector columnData = new Vector();
                for (int i = 1; i <= q; i++) {
                    columnData.add(rs.getString("overtime_id"));
                    columnData.add(rs.getString("emp_id"));
                    columnData.add(rs.getString("start_time"));
                    columnData.add(rs.getString("end_time"));
                    columnData.add(rs.getString("minute"));
                    columnData.add(rs.getString("rate_per_hour"));
                    columnData.add(rs.getString("total_amount"));
                }
                model.addRow(columnData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jRadioEmpDate = new javax.swing.JRadioButton();
        jRadioDate = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jDateChooserfrom = new com.toedter.calendar.JDateChooser();
        jButton6 = new javax.swing.JButton();
        jDateChooserto = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        empId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Overtime ID", "Emp ID.", "Start Time", "End Time", "Hour(s)", "Rate/Hr.", "Total"
            }
        ));
        jScrollPane3.setViewportView(jTable5);

        jPanel3.setBackground(new java.awt.Color(57, 105, 138));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("List Of Overtime Earnings");

        jRadioEmpDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioEmpDate.setForeground(new java.awt.Color(255, 255, 255));
        jRadioEmpDate.setText("Filter By Employee & Date");
        jRadioEmpDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEmpDateActionPerformed(evt);
            }
        });

        jRadioDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioDate.setForeground(new java.awt.Color(255, 255, 255));
        jRadioDate.setText("Filter By Date");
        jRadioDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioEmpDate)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioDate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioEmpDate)
                    .addComponent(jRadioDate))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jButton5.setBackground(new java.awt.Color(57, 105, 138));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("REFRESH");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("EMP. CODE");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("FROM");

        jDateChooserfrom.setDateFormatString("yyyy-MM-dd");

        jButton6.setBackground(new java.awt.Color(57, 105, 138));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("FIND");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jDateChooserto.setDateFormatString("yyyy-MM-dd");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("TO");

        jButton7.setBackground(new java.awt.Color(57, 105, 138));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("UPDATE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        empId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(empId, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooserfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooserto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooserfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                .addComponent(empId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooserto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        refreshTable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        refreshTable();
        try {
            String sql;
            String EmpID = empId.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String DateFrom = sdf.format(jDateChooserfrom.getDate());
            String DateTo = sdf.format(jDateChooserto.getDate());
            System.out.println(DateFrom);

            if (jRadioDate.isSelected()) {
                sql = "select * from Overtime where enroll_date BETWEEN '" + DateFrom + "' AND '" + DateTo + "'";
                pst = ConnectionDB.conDB().prepareStatement(sql);
                rs = pst.executeQuery();
            } else if ((jRadioEmpDate.isSelected())) {
                sql = "select * from Overtime where emp_id = ? AND enroll_date BETWEEN '" + DateFrom + "' AND '" + DateTo + "'";
                pst = ConnectionDB.conDB().prepareStatement(sql);
                pst.setString(1, EmpID);
                rs = pst.executeQuery();
            }

            ResultSetMetaData data = rs.getMetaData();
            int q = data.getColumnCount();

            DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                Vector columnData = new Vector();
                for (int i = 1; i <= q; i++) {
                    columnData.add(rs.getString("overtime_id"));
                    columnData.add(rs.getString("emp_id"));
                    columnData.add(rs.getString("start_time"));
                    columnData.add(rs.getString("end_time"));
                    columnData.add(rs.getString("minute"));
                    columnData.add(rs.getString("rate_per_hour"));
                    columnData.add(rs.getString("total_amount"));
                }
                model.addRow(columnData);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void empIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empIdActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) jTable5.getModel();
        int seletedRows = jTable5.getSelectedRow();
        try {
            int id = Integer.parseInt(tableModel.getValueAt(seletedRows, 0).toString());
            System.out.println("ID : " + id);
            String overtime_id = String.valueOf(id);

            JFrame_Overtime frame = new JFrame_Overtime();

            String sql = "SELECT * from Overtime INNER JOIN Employee ON Overtime.emp_id = Employee.emp_id AND Overtime.overtime_id = '" + id + "'";

            pst = ConnectionDB.conDB().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String add1 = rs.getString("emp_name");
                frame.emp_name.setText(add1);

                String add2 = rs.getString("emp_shift");
                frame.emp_shift.setSelectedItem(add2);

                String add6 = rs.getString("enroll_date");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date start = sdf.parse(add6);
                frame.overtime_date.setDate(start);

                String add7 = rs.getString("start_time");
                frame.start.setText(add7);
                
                String add8 = rs.getString("end_time");
                frame.end.setText(add8);

                String add9 = rs.getString("minute");
                frame.emp_shift.setSelectedItem(add9);

                String add10 = rs.getString("rate_per_hour");
                frame.rate.setText(add10);
                
                byte[] image = rs.getBytes("emp_img");
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(frame.img.getWidth(), frame.img.getHeight(), Image.SCALE_SMOOTH));
                frame.img.setIcon(imageIcon);
                
                frame.overtimeID.setText(overtime_id);  
                frame.emp_code1.setEditable(false);
                frame.jButton1.setEnabled(false);
                frame.jButton2.setEnabled(false);
                frame.jButton3.setEnabled(true);
                frame.setVisible(true);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jRadioEmpDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEmpDateActionPerformed
        jRadioEmpDate.setSelected(true);
        jRadioDate.setSelected(false);
        empId.setEditable(true);
    }//GEN-LAST:event_jRadioEmpDateActionPerformed

    private void jRadioDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioDateActionPerformed
        jRadioEmpDate.setSelected(false);
        jRadioDate.setSelected(true);
        empId.setEditable(false);
        empId.setText("");
    }//GEN-LAST:event_jRadioDateActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_ListOvertime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_ListOvertime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_ListOvertime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_ListOvertime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_ListOvertime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField empId;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private com.toedter.calendar.JDateChooser jDateChooserfrom;
    private com.toedter.calendar.JDateChooser jDateChooserto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioDate;
    private javax.swing.JRadioButton jRadioEmpDate;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable5;
    // End of variables declaration//GEN-END:variables
}
