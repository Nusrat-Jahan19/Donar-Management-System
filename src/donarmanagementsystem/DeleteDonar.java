/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donarmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nusrat
 */
public class DeleteDonar extends javax.swing.JFrame {

    /**
     * Creates new form DeleteDonar
     */
    public DeleteDonar() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Id_delete = new javax.swing.JTextField();
        delete_search = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        BD_DELETE = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtable5 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        plasma_search = new javax.swing.JButton();
        qpd_id = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Plasma_Deletebtn = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        plasma_table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        AddDonor = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setPreferredSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("BD_ID:");

        Id_delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Id_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Id_deleteActionPerformed(evt);
            }
        });

        delete_search.setBackground(new java.awt.Color(190, 190, 233));
        delete_search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delete_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/search1.png"))); // NOI18N
        delete_search.setText("SEARCH");
        delete_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_searchActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(190, 190, 233));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Logout.png"))); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(190, 190, 233));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Exit application.png"))); // NOI18N
        jButton3.setText("CLOSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        BD_DELETE.setBackground(new java.awt.Color(190, 190, 233));
        BD_DELETE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BD_DELETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/delete.png"))); // NOI18N
        BD_DELETE.setText("DELETE");
        BD_DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BD_DELETEActionPerformed(evt);
            }
        });

        jtable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BD_ID", "Name", "Age", "Blood Group", "Gender", "Contact NO", "Address", "District", "Last Donation"
            }
        ));
        jScrollPane4.setViewportView(jtable5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(Id_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delete_search)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(BD_DELETE)
                .addGap(265, 265, 265)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(delete_search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 449, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BD_DELETE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(163, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("BLOOD", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("QPD_ID:");

        plasma_search.setBackground(new java.awt.Color(190, 190, 233));
        plasma_search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        plasma_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/search1.png"))); // NOI18N
        plasma_search.setText("SEARCH");
        plasma_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plasma_searchActionPerformed(evt);
            }
        });

        qpd_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton5.setBackground(new java.awt.Color(190, 190, 233));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Logout.png"))); // NOI18N
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(190, 190, 233));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Exit application.png"))); // NOI18N
        jButton6.setText("CLOSE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        Plasma_Deletebtn.setBackground(new java.awt.Color(190, 190, 233));
        Plasma_Deletebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Plasma_Deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/delete.png"))); // NOI18N
        Plasma_Deletebtn.setText("DELETE");
        Plasma_Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Plasma_DeletebtnActionPerformed(evt);
            }
        });

        plasma_table.setBackground(new java.awt.Color(204, 204, 255));
        plasma_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "QPD_ID", "RCL_ID", "Name", "Blood Group", "Age", "Gender", "Contact", "Address", "District"
            }
        ));
        jScrollPane5.setViewportView(plasma_table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Plasma_Deletebtn)
                        .addGap(283, 283, 283)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 220, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(qpd_id, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(plasma_search)
                        .addGap(373, 373, 373))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(plasma_search)
                    .addComponent(qpd_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 449, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Plasma_Deletebtn)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(67, 67, 67))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(158, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("PLASMA", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 65, 1000, 630));

        jPanel3.setBackground(new java.awt.Color(57, 51, 81));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 700));

        AddDonor.setBackground(new java.awt.Color(57, 51, 81));
        AddDonor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddDonor.setForeground(new java.awt.Color(255, 255, 255));
        AddDonor.setText("ADD DONAR");
        AddDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDonorActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("         DASHBOARD");

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jButton7.setBackground(new java.awt.Color(57, 51, 81));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("SEARCH DONAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(57, 51, 81));
        jButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("UPDATE DONAR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(57, 51, 81));
        jButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("DELETE DONAR");

        jButton13.setBackground(new java.awt.Color(57, 51, 81));
        jButton13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("ADD STOCK");

        jButton14.setBackground(new java.awt.Color(57, 51, 81));
        jButton14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("NGO");

        jButton15.setBackground(new java.awt.Color(57, 51, 81));
        jButton15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("EXIT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddDonor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(jSeparator4))
                .addContainerGap())
            .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(AddDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 700));

        jPanel4.setBackground(new java.awt.Color(190, 190, 233));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setText("delete donar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel1)
                .addContainerGap(460, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(643, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1000, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
         new home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
         new home().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       setVisible(false);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void BD_DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BD_DELETEActionPerformed
        // TODO add your handling code here:
           String value=Id_delete.getText();
        try{
         Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=donorManagementSQLServer;selectMethod=cursor", "sa", "12");
             Statement st = connection.createStatement();
           
           String query = "DELETE  from BLOOD_DONAR where BD_Id="+value;
            PreparedStatement pst  = connection.prepareStatement(query);
            pst.executeUpdate();
             jtable5.setVisible(false);
             JOptionPane.showMessageDialog(null,"Deleted Successfully!");
             
            
        }
             
             
              
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_BD_DELETEActionPerformed

    private void delete_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_searchActionPerformed
        // TODO add your handling code here:
         String value=Id_delete.getText();
        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=donorManagementSQLServer;selectMethod=cursor", "sa", "12");
             Statement st = connection.createStatement();
             ResultSet rs= st.executeQuery("select * from BLOOD_DONAR where BD_Id='"+value+"'");
             while(rs.next())
             {
                 String BD_id = String.valueOf(rs.getInt("BD_ID"));
                 String Name= rs.getString("Name");
                 String age = String.valueOf(rs.getInt("Age"));
                 String bloodGroup= rs.getString("Blood_Group");
                 String Gender= rs.getString("Gender");
                 String contact= rs.getString("Contact");
                 String address= rs.getString("Address");
                 String district= rs.getString("District");
                 String lastDonation= rs.getString("Last_Donation_Date");
                 //string array for store data into jtable
                 
                 String tbData[]={BD_id,Name,age,bloodGroup,Gender,contact,address,district,lastDonation};
                 DefaultTableModel tblModel = (DefaultTableModel) jtable5.getModel();
                 tblModel.addRow(tbData);
        
                 
             }
             connection.close();
             }
             
              
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_delete_searchActionPerformed

    private void Plasma_DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Plasma_DeletebtnActionPerformed
            String value=qpd_id.getText();
        try{
         Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=donorManagementSQLServer;selectMethod=cursor", "sa", "12");
             Statement st = connection.createStatement();
           
           String query = "DELETE  from QUALIFIED_PLASMA_DONAR where QPD_Id="+value;
            PreparedStatement pst  = connection.prepareStatement(query);
            pst.executeUpdate();
            plasma_table.setVisible(false);
             JOptionPane.showMessageDialog(null,"Deleted Successfully!");
             
            
        }
             
             
              
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_Plasma_DeletebtnActionPerformed

    private void Id_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Id_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Id_deleteActionPerformed

    private void plasma_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plasma_searchActionPerformed
           String value=qpd_id.getText();
        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=donorManagementSQLServer;selectMethod=cursor", "sa", "12");
             Statement st = connection.createStatement();
             ResultSet rs= st.executeQuery("select * from QUALIFIED_PLASMA_DONAR where QPD_Id='"+value+"'");
             while(rs.next())
             {
                 String qpd_id = String.valueOf(rs.getInt("QPD_Id"));
                 String rcl_id = String.valueOf(rs.getInt("RCL_Id"));
                 String Name= rs.getString("Name");
                 String age = String.valueOf(rs.getInt("Age"));
                 String bloodGroup= rs.getString("Blood_Group");
                 String Gender= rs.getString("Gender");
                 String contact= rs.getString("Contact");
                 String address= rs.getString("Address");
                 String district= rs.getString("District");
                 
                 //string array for store data into jtable
                 
                 String tbData[]={ qpd_id,rcl_id,Name,bloodGroup,age,Gender,contact,address,district};
                 DefaultTableModel tblModel = (DefaultTableModel) plasma_table.getModel();
                 tblModel.addRow(tbData);
        
                 
             }
             connection.close();
             }
             
              
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_plasma_searchActionPerformed

    private void AddDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDonorActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AddNewDonar().setVisible(true);
    }//GEN-LAST:event_AddDonorActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new SearchDonarDistrict().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteDonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteDonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteDonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteDonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteDonar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDonor;
    private javax.swing.JButton BD_DELETE;
    private javax.swing.JTextField Id_delete;
    private javax.swing.JButton Plasma_Deletebtn;
    private javax.swing.JButton delete_search;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtable5;
    private javax.swing.JButton plasma_search;
    private javax.swing.JTable plasma_table;
    private javax.swing.JTextField qpd_id;
    // End of variables declaration//GEN-END:variables
}
