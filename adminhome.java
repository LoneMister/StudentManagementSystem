
package sms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class adminhome extends javax.swing.JFrame {

    
    public adminhome() {
        initComponents();
        sm = new Connection() ;
        if(sm == null)
        {
            JOptionPane.showMessageDialog(this, "C Connection not available", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
Connection sm;
PreparedStatement t;
ResultSet r;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtadn = new javax.swing.JTextField();
        txtn = new javax.swing.JTextField();
        cbc = new javax.swing.JComboBox<>();
        cbg = new javax.swing.JComboBox<>();
        txtpn = new javax.swing.JTextField();
        addstudents = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        feemodule = new javax.swing.JButton();
        registredstudents = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AdmissionNumber:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Course:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PhoneNumber:");

        cbc.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        cbc.setForeground(new java.awt.Color(0, 153, 51));
        cbc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMPUTER SCIENCE", "IT", "ELECTRICAL ENGINEERING", "MECHANICAL ENGINEERING", "COMMERCE", " " }));

        cbg.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        cbg.setForeground(new java.awt.Color(0, 102, 51));
        cbg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));

        addstudents.setBackground(new java.awt.Color(255, 102, 0));
        addstudents.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        addstudents.setForeground(new java.awt.Color(102, 0, 102));
        addstudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms/add-student.png"))); // NOI18N
        addstudents.setText("ADD STUDENTS");
        addstudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstudentsActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(0, 102, 255));
        logout.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        logout.setForeground(new java.awt.Color(204, 0, 0));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms/logout.png"))); // NOI18N
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        feemodule.setBackground(new java.awt.Color(153, 0, 0));
        feemodule.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        feemodule.setForeground(new java.awt.Color(0, 51, 204));
        feemodule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms/budget.png"))); // NOI18N
        feemodule.setText("FEES MODULE");
        feemodule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feemoduleActionPerformed(evt);
            }
        });

        registredstudents.setBackground(new java.awt.Color(102, 0, 102));
        registredstudents.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        registredstudents.setForeground(new java.awt.Color(255, 153, 0));
        registredstudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms/student.png"))); // NOI18N
        registredstudents.setText("REGISTERED STUDENTS");
        registredstudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registredstudentsActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 204, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms/exam.png"))); // NOI18N
        jButton1.setText("EXAM MODULE");

        exit.setBackground(new java.awt.Color(204, 0, 51));
        exit.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 255, 102));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms/exit2.jpg"))); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        home.setBackground(new java.awt.Color(0, 204, 153));
        home.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        home.setForeground(new java.awt.Color(0, 153, 153));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms/home2.jpg"))); // NOI18N
        home.setText("HOME");
        home.setMaximumSize(new java.awt.Dimension(579, 521));
        home.setMinimumSize(new java.awt.Dimension(579, 521));
        home.setPreferredSize(new java.awt.Dimension(579, 521));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(476, 517, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(addstudents)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtadn, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(feemodule)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(430, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registredstudents)
                .addGap(127, 127, 127)
                .addComponent(logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtadn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(addstudents)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(feemodule))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registredstudents)
                    .addComponent(logout)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        setVisible(false);
        new admin().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void addstudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstudentsActionPerformed
        
        String AdmissionNumber = txtadn.getText();
        String Name = txtn.getText();
        String Course = cbc.getSelectedItem().toString();
        String Gender =  cbg.getSelectedItem().toString();
        String PhoneNumber = txtpn.getText();
        if(AdmissionNumber.isEmpty()||Name.isEmpty()||Course.isEmpty()||Gender.isEmpty()||PhoneNumber.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"details not fully filled","error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            addStudent(AdmissionNumber,Name,Course,Gender,PhoneNumber);
        }
    }//GEN-LAST:event_addstudentsActionPerformed

    private void registredstudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registredstudentsActionPerformed
        setVisible(false);
        new Registered_Students().setVisible(true);
    }//GEN-LAST:event_registredstudentsActionPerformed

    private void feemoduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feemoduleActionPerformed
        setVisible(false);
        new FeeModule().setVisible(true);
    }//GEN-LAST:event_feemoduleActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        
        
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "The Student System", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        setVisible(false);
        new index().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminhome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addstudents;
    private javax.swing.JComboBox<String> cbc;
    private javax.swing.JComboBox<String> cbg;
    private javax.swing.JButton exit;
    private javax.swing.JButton feemodule;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton registredstudents;
    private javax.swing.JTextField txtadn;
    private javax.swing.JTextField txtn;
    private javax.swing.JTextField txtpn;
    // End of variables declaration//GEN-END:variables

    private void addStudent(String AdmissionNumber, String Name, String Course, String Gender, String PhoneNumber) {
       java.sql.Connection sm = Connection.C();
        if(sm != null){
            try
            {
            t= sm.prepareStatement("INSERT INTO students(AdmissionNumber,Name,Course,Gender,PhoneNumber) VALUES(?,?,?,?,?)");
            t.setString(1, AdmissionNumber);
            t.setString(2, Name);
            t.setString(3, Course);
            t.setString(4, Gender);
            t.setString(5, PhoneNumber);
            t.executeUpdate();
             JOptionPane.showMessageDialog(this, "users data successfully inserted", "Error",JOptionPane.INFORMATION_MESSAGE);
            txtadn.setText("");
            txtn.setText("");
            cbc.setSelectedIndex(-1);
            cbg.setSelectedIndex(-1);
            txtpn.setText("");
            
        }catch(SQLException ex){
        Logger.getLogger(adminhome.class.getName()).log(Level.SEVERE,null,ex);
    }
        } else
        {
            System.out.println("The connection not available");
        }
        }
    }

