
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lahiru
 */
public class AddEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddEngineer
     */
    public AddEmployee() {
        initComponents();
    }
     
    
    public void InvoiceNo() throws SQLException{
            
            String cat=String.valueOf(jComboBox1.getSelectedItem());
            if(cat.equals("Engineer")){
                 String query = "SELECT MAX(EmID) FROM `employee` WHERE EmID LIKE 'E%'";
                   PreparedStatement ps = null;
                   ResultSet rs = null;
                   ps = databaseConnection.con().prepareStatement(query);
                    rs = ps.executeQuery();
                        if(rs.next()){
                            rs.getString("MAX(EmID)");
            
                            if(rs.getString("MAX(EmID)")==null){
                                jTextFielda.setText("E001");
                            }else{
                                 String id=String.valueOf(rs.getString("MAX(EmID)"));
                                String id1=id.substring(0,1);
                                String id2=id.substring(2,4);
                               long n= Long.parseLong(id2);
                                n++;
                                String num1=Long.toString(n);
                                jTextFielda.setText(id1+String.format("%03d",n));
                            }
                            }  
            }else if(cat.equals("Driver")){
                String query = "SELECT MAX(EmID) FROM `employee` WHERE EmID LIKE 'D%'";
                   PreparedStatement ps = null;
                   ResultSet rs = null;
                   ps = databaseConnection.con().prepareStatement(query);
                    rs = ps.executeQuery();
                        if(rs.next()){
                            rs.getString("MAX(EmID)");
            
                            if(rs.getString("MAX(EmID)")==null){
                                jTextFielda.setText("D001");
                            }else{
                                 String id=String.valueOf(rs.getString("MAX(EmID)"));
                                String id1=id.substring(0,1);
                                String id2=id.substring(2,4);
                               long n= Long.parseLong(id2);
                                n++;
                                String num1=Long.toString(n);
                                jTextFielda.setText(id1+String.format("%03d",n));
                            }
                            }  
            }else if(cat.equals("Machine_Operator")){
                String query = "SELECT MAX(EmID) FROM `employee` WHERE EmID LIKE 'MOP%'";
                   PreparedStatement ps = null;
                   ResultSet rs = null;
                   ps = databaseConnection.con().prepareStatement(query);
                    rs = ps.executeQuery();
                        if(rs.next()){
                            String a=rs.getString("MAX(EmID)");
                                
                            if(rs.getString("MAX(EmID)")==null){
                                jTextFielda.setText("MOP001");
                            }else{
                                 String id=String.valueOf(rs.getString("MAX(EmID)"));
                                String id1=id.substring(0,3);
                                String id2=id.substring(3,6);
                               long n= Long.parseLong(id2);
                                n++;
                                String num1=Long.toString(n);
                                jTextFielda.setText(id1+String.format("%03d",n));
                            }
                            }  
            }else if(cat.equals("Mechanic")){
                String query = "SELECT MAX(EmID) FROM `employee` WHERE EmID LIKE 'MC%'";
                   PreparedStatement ps = null;
                   ResultSet rs = null;
                   ps = databaseConnection.con().prepareStatement(query);
                    rs = ps.executeQuery();
                        if(rs.next()){
                            rs.getString("MAX(EmID)");
            
                            if(rs.getString("MAX(EmID)")==null){
                                jTextFielda.setText("MC001");
                            }else{
                                 String id=String.valueOf(rs.getString("MAX(EmID)"));
                                String id1=id.substring(0,2);
                                String id2=id.substring(2,5);
                               long n= Long.parseLong(id2);
                                n++;
                                String num1=Long.toString(n);
                                jTextFielda.setText(id1+String.format("%03d",n));
                            }
                            }  
            }else if(cat.equals("Project Manager")){
                String query = "SELECT MAX(PM_ID) FROM `project_manager` WHERE PM_ID LIKE 'PM%'";
                   PreparedStatement ps = null;
                   ResultSet rs = null;
                   ps = databaseConnection.con().prepareStatement(query);
                    rs = ps.executeQuery();
                        if(rs.next()){
                            rs.getString("MAX(PM_ID)");
            
                            if(rs.getString("MAX(PM_ID)")==null){
                                jTextFielda.setText("PM001");
                            }else{
                                 String id=String.valueOf(rs.getString("MAX(PM_ID)"));
                                String id1=id.substring(0,2);
                                String id2=id.substring(2,5);
                               long n= Long.parseLong(id2);
                                n++;
                                String num1=Long.toString(n);
                                jTextFielda.setText(id1+String.format("%03d",n));
                            }
                            }  
            }else{
                JOptionPane.showMessageDialog(this,"Please select a category!");
            }
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFielda = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextFieldb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldd = new javax.swing.JTextField();
        jTextFielde = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(504, 700));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setMinimumSize(new java.awt.Dimension(504, 80));
        jPanel6.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Add Employee");
        jPanel6.add(jLabel7);
        jLabel7.setBounds(10, 10, 130, 50);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6);
        jButton6.setBounds(950, 30, 67, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4);
        jButton4.setBounds(420, 23, 60, 30);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 504, 80);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(null);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 204, 204));
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(310, 170, 93, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 204, 204));
        jRadioButton1.setText("Male");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(160, 170, 60, 30);

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(160, 390, 160, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 173, 238));
        jLabel3.setText("Gender :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 160, 70, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("ADD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(150, 530, 70, 30);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("UPDATE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(230, 530, 80, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 530, 80, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 173, 238));
        jLabel1.setText("EmID :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 70, 70, 30);

        jTextFielda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldaMouseClicked(evt);
            }
        });
        jTextFielda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldaActionPerformed(evt);
            }
        });
        jTextFielda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldaKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFielda);
        jTextFielda.setBounds(160, 70, 120, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 70, 80, 30);

        jTextFieldb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldbActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldb);
        jTextFieldb.setBounds(160, 120, 250, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 173, 238));
        jLabel2.setText("Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 120, 90, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 173, 238));
        jLabel4.setText("Address :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 220, 60, 30);

        jTextFieldd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddActionPerformed(evt);
            }
        });
        jTextFieldd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFielddKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldd);
        jTextFieldd.setBounds(160, 220, 250, 30);

        jTextFielde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldeActionPerformed(evt);
            }
        });
        jTextFielde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldeKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFielde);
        jTextFielde.setBounds(160, 270, 250, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 173, 238));
        jLabel5.setText("Telephone:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 260, 150, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 173, 238));
        jLabel6.setText("E mail :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 330, 90, 30);

        jTextFieldf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldfActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldf);
        jTextFieldf.setBounds(160, 330, 250, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 173, 238));
        jLabel8.setText("Site :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 390, 110, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 173, 238));
        jLabel9.setText("Category :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 20, 110, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Engineer", "Driver", "Machine_Operator", "Mechanic", "Project Manager" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(160, 20, 200, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 173, 238));
        jLabel10.setText("Status :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 450, 70, 30);

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(0, 204, 204));
        jRadioButton3.setText("Exist");
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(160, 450, 70, 25);

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(0, 204, 204));
        jRadioButton4.setText("Not Exist");
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(300, 450, 90, 25);

        jButton3.setText("Get Site");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(330, 390, 71, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 80, 500, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextFieldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldaActionPerformed

    private void jTextFieldbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldbActionPerformed

    private void jTextFielddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielddActionPerformed

    private void jTextFieldeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldeActionPerformed
      
    }//GEN-LAST:event_jTextFieldeActionPerformed

    private void jTextFieldfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jTextFielda.setText("");
       jTextFieldb.setText("");
       //jRadioButton1.setSelected(false);
       //jRadioButton2.setSelected(false);
       buttonGroup1.clearSelection();
       buttonGroup2.clearSelection();
       jTextFieldd.setText("");
       jTextFielde.setText("");
       jTextFieldf.setText("");
       jComboBox2.setSelectedItem(null);
       jComboBox1.setSelectedItem(null);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    
        try {
            PreparedStatement ps=null;
            ResultSet rs1=null;
            ResultSet rs2=null;
            
            String a=jTextFielda.getText();
            String b=jTextFieldb.getText();
            String c="";
            if(jRadioButton1.isSelected()){
                c="Male";
            }else{
                c="Female";
            }
            String d=jTextFieldd.getText();
            String e=jTextFielde.getText();
            String f=jTextFieldf.getText();
            String g=String.valueOf(jComboBox2.getSelectedItem());
            System.out.println(g);
            String h=String.valueOf(jComboBox1.getSelectedItem());
            String i="";
            if(jRadioButton3.isSelected()){
                i="Exist";
            }else{
                i="Not Exist";
            }
            String status=null;
            PreparedStatement ps1=null;
            String Q1="SELECT Status FROM `site` WHERE Site_ID=?";
            ResultSet rs4=null;
            ps1=databaseConnection.con().prepareStatement(Q1);
            ps1.setString(1,g);
            rs4=ps1.executeQuery();
            
            if(a.equals("") || b.equals("") || c.equals("") || d.equals("") || f.equals("") || g.equals("") || h.equals("") || i.equals("")){
                JOptionPane.showMessageDialog(this, "Please fill all the fields !");
                
            }else if(rs4.next()){
                //site available
                status=String.valueOf(rs4.getString("Status"));
                if(status.equals("Completed")){
                    JOptionPane.showMessageDialog(this, "Site has completed!");
                }else if(jComboBox1.getSelectedItem().equals("Project Manager")){
                    String query3= "INSERT INTO `project_manager`"
                            +"(`PM_ID`, `Name`, `Gender`, `Address`, `TP`, `Email`, `CurrentSite`,`Status`)"
                            +"VALUES (?,?,?,?,?,?,?,?)";
                    ps=databaseConnection.con().prepareStatement(query3);
                                      
                    ps.setString(1,a);
                    ps.setString(2,b);
                    ps.setString(3,c);
                    ps.setString(4,d);
                    ps.setString(5,e);
                    ps.setString(6,f);
                    ps.setString(7,"null");
                    ps.setString(8,i);
                    
                    ps.execute();
                    
                    JOptionPane.showMessageDialog(this, "New employee has been added!");
                    jTextFielda.setText("");
                    jTextFieldb.setText("");
                    buttonGroup1.clearSelection();
                    buttonGroup2.clearSelection();
                    jTextFieldd.setText("");
                    jTextFielde.setText("");
                    jTextFieldf.setText("");
                    jComboBox2.setSelectedItem(null);
                    jComboBox1.setSelectedItem(null);
                }else{
                    String query= "INSERT INTO `employee`"
                            +"(`EmID`, `Name`, `Gender`, `Address`, `TP`, `Email`, `CurrentSite`,`Category`,`Status`)"
                            +"VALUES (?,?,?,?,?,?,?,?,?)";
                    ps=databaseConnection.con().prepareStatement(query);
                    
                    ps.setString(1,a);
                    ps.setString(2,b);
                    ps.setString(3,c);
                    ps.setString(4,d);
                    ps.setString(5,e);
                    ps.setString(6,f);
                    ps.setString(7,g);
                    ps.setString(8,h);
                    ps.setString(9,i);
                    
                    ps.execute();
                    
                    JOptionPane.showMessageDialog(this, "New employee has added!");
                    jTextFielda.setText("");
                    jTextFieldb.setText("");
                    buttonGroup1.clearSelection();
                    jTextFieldd.setText("");
                    jTextFielde.setText("");
                    jTextFieldf.setText("");
                    jComboBox2.setSelectedItem(null);
                    jComboBox1.setSelectedItem(null);
                }   
            }
            //no site
            else if(jComboBox1.getSelectedItem().equals("Project Manager")){
                String query3= "INSERT INTO `project_manager`"
                        +"(`PM_ID`, `Name`, `Gender`, `Address`, `TP`, `Email`, `CurrentSite`,`Status`)"
                        +"VALUES (?,?,?,?,?,?,?,?)";
                ps=databaseConnection.con().prepareStatement(query3);
                
                ps.setString(1,a);
                ps.setString(2,b);
                ps.setString(3,c);
                ps.setString(4,d);
                ps.setString(5,e);
                ps.setString(6,f);
                ps.setString(7,"null");
                ps.setString(8,i);
                
                ps.execute();
                
                JOptionPane.showMessageDialog(this, "New employee has added!");
                jTextFielda.setText("");
                jTextFieldb.setText("");
                buttonGroup1.clearSelection();
                buttonGroup2.clearSelection();
                jTextFieldd.setText("");
                jTextFielde.setText("");
                jTextFieldf.setText("");
                jComboBox2.setSelectedItem(null);
                jComboBox1.setSelectedItem(null);
                
            }else{
                String query= "INSERT INTO `employee`"
                        +"(`EmID`, `Name`, `Gender`, `Address`, `TP`, `Email`, `CurrentSite`,`Category`,`Status`)"
                        +"VALUES (?,?,?,?,?,?,?,?,?)";
                ps=databaseConnection.con().prepareStatement(query);
                
                ps.setString(1,a);
                ps.setString(2,b);
                ps.setString(3,c);
                ps.setString(4,d);
                ps.setString(5,e);
                ps.setString(6,f);
                ps.setString(7,g);
                ps.setString(8,h);
                ps.setString(9,i);
                
                ps.execute();
                
                JOptionPane.showMessageDialog(this, "New employee has added!");
                jTextFielda.setText("");
                jTextFieldb.setText("");
                buttonGroup1.clearSelection();
                jTextFieldd.setText("");
                jTextFielde.setText("");
                jTextFieldf.setText("");
                jComboBox2.setSelectedItem(null);
                jComboBox1.setSelectedItem(null);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
          PreparedStatement ps=null;
            ResultSet rs1=null;  
        
            String a=jTextFielda.getText();
            String b=jTextFieldb.getText();
            String c="";
             if(jRadioButton1.isSelected()){
                 c="Male";
            }else{
                c="Female";
            }
            String d=jTextFieldd.getText();
            String e=jTextFielde.getText();
            String f=jTextFieldf.getText();
            String g=String.valueOf(jComboBox2.getSelectedItem());
            String h=String.valueOf(jComboBox1.getSelectedItem());
            String i="";
            if(jRadioButton3.isSelected()){
                 i="Exist";
            }else{
                i="Not Exist";
            }
            
            if(a.equals("") || b.equals("") || c.equals("") || d.equals("") || f.equals("") || g.equals("")|| h.equals("")|| i.equals("")){
               JOptionPane.showMessageDialog(this, "Please fill all the fields !"); 
            } else if(jComboBox1.getSelectedItem().equals("Project Manager")){
                try {
                    String query_b="SELECT * FROM `project_manager` WHERE PM_ID=? ";
                    ps=databaseConnection.con().prepareStatement(query_b);
                    ps.setString(1,h);
                    rs1=ps.executeQuery();
                    if(rs1.next()){
                        JOptionPane.showMessageDialog(this,"Invalid project manager");
                    }else{
                        try {
                            String query4= "UPDATE `project_manager` SET `Name`=?,`Gender`=?,`Address`=?,`TP`=?,`Email`=?,`CurrentSite`=?,`Status`=?  WHERE  PM_ID=?";
                            
                            PreparedStatement ps1=null;
                            ps1=databaseConnection.con().prepareStatement(query4);
                            ps1.setString(1,b);
                            ps1.setString(2,c);
                            ps1.setString(3,d);
                            ps1.setString(4,e);
                            ps1.setString(5,f);
                            ps1.setString(6,g);
                            ps1.setString(7,i);
                            ps1.setString(8,a);

                            ps1.execute();
                            
                            JOptionPane.showMessageDialog(this, "Updated!");
                            jTextFielda.setText("");
                            jTextFieldb.setText("");
                            buttonGroup1.clearSelection();
                            buttonGroup2.clearSelection();
                            jTextFieldd.setText("");
                            jTextFielde.setText("");
                            jTextFieldf.setText("");
                            jComboBox2.setSelectedItem(null);
                            jComboBox1.setSelectedItem(null);
                        } catch (SQLException ex) {
                            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{ 
                try {
                    String query= "UPDATE `employee` SET `Name`=?,`Gender`=?,`Address`=?,`TP`=?,`Email`=?,`CurrentSite`=? ,`Category`=?,`Status`=? WHERE  `EmID`=?";
                    PreparedStatement ps1=null;
                    
                    ps1=databaseConnection.con().prepareStatement(query);
                    ps1.setString(1,b);
                    ps1.setString(2,c);
                    ps1.setString(3,d);
                    ps1.setString(4,e);
                    ps1.setString(5,f);
                    ps1.setString(6,g);
                    ps1.setString(7,h);
                    ps1.setString(8,i);
                    ps1.setString(9,a);
                    
                    ps1.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Updated");
                    
                    jTextFielda.setText("");
                    jTextFieldb.setText("");
                    buttonGroup1.clearSelection();
                    jTextFieldd.setText("");
                    jTextFielde.setText("");
                    jTextFieldf.setText("");
                    jComboBox2.setSelectedItem(null);
                    jComboBox1.setSelectedItem(null);
                } catch (SQLException ex) {
                    Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
                   
            }   
                  
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String a= jTextFielda.getText();
            String query ="SELECT  * FROM `employee`  WHERE EmID = ? ";
            PreparedStatement ps=null;
            ResultSet rs=null;
            ps=databaseConnection.con().prepareStatement(query);
            ps.setString(1, a);
            rs=ps.executeQuery();
            if(rs.next()){
                jTextFieldb.setText(rs.getString("Name"));
                String c=(rs.getString("Gender"));
                if(c.equals("Male")){
                    jRadioButton1.setSelected(true);
                }else{
                    jRadioButton2.setSelected(true);
                }
                jTextFieldd.setText(rs.getString("Address"));
                jTextFielde.setText(rs.getString("TP"));
                jTextFieldf.setText(rs.getString("Email"));
                jComboBox2.setSelectedItem(rs.getString("CurrentSite"));
                jComboBox1.setSelectedItem(rs.getString("Category"));
                String k=(rs.getString("Status"));
                if(k.equals("Exist")){
                    jRadioButton3.setSelected(true);
                }else{
                    jRadioButton4.setSelected(true);
                }
            }
            else{
                String query5="SELECT  * FROM `project_manager`  WHERE PM_ID = ? ";
                ps=databaseConnection.con().prepareStatement(query5);
                ps.setString(1, a);
                rs=ps.executeQuery();
            if(rs.next()){               
                jTextFieldb.setText(rs.getString("Name"));
                String c=(rs.getString("Gender"));
                if(c.equals("Male")){
                    jRadioButton1.setSelected(true);
                }else{
                    jRadioButton2.setSelected(true);
                }
                jTextFieldd.setText(rs.getString("Address"));
                jTextFielde.setText(rs.getString("TP"));
                jTextFieldf.setText(rs.getString("Email"));
                jComboBox2.setSelectedItem(rs.getString("CurrentSite"));
                jComboBox1.setSelectedItem("Project Manager");
                String k=(rs.getString("Status"));
                if(k.equals("Exist")){
                    jRadioButton3.setSelected(true);
                }else{
                    jRadioButton4.setSelected(true);
                }
            }else{
                    JOptionPane.showMessageDialog(this, "Employee not found!");
                    jTextFielda.setText("");
                    }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.dispose();
       Employee e = new  Employee();
       e.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
       
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void jTextFieldaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jTextFieldb.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldaKeyPressed

    private void jTextFielddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielddKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jTextFielde.requestFocus();
        }
    }//GEN-LAST:event_jTextFielddKeyPressed

    private void jTextFieldeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldeKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jTextFieldf.requestFocus();
        }
          String ph=jTextFielde.getText();
     
      int len=ph.length();
     char c= evt.getKeyChar();
   // check the character
      if(evt.getKeyChar()>='0'&& evt.getKeyChar()<='9'){
        
     if(len<10){
  jTextFielde.setEditable(true);
    }else{
    jTextFielde.setEditable(false);
     

     }
    }
      else{
   //erase number 'backspace work'
     if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
      jTextFielde.setEditable(true);
   }else{
          jTextFielde.setEditable(false);
     }
      }
    }//GEN-LAST:event_jTextFieldeKeyPressed

    private void jTextFieldaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldaMouseClicked
        try {
            InvoiceNo();
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextFieldaMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            PreparedStatement ps= null;
            ResultSet rs= null;
            
            String query="SELECT DISTINCT(Site_ID) FROM site ";
            ps=databaseConnection.con().prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                jComboBox2.addItem(rs.getString("Site_ID"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextFielda;
    private javax.swing.JTextField jTextFieldb;
    private javax.swing.JTextField jTextFieldd;
    private javax.swing.JTextField jTextFielde;
    private javax.swing.JTextField jTextFieldf;
    // End of variables declaration//GEN-END:variables
}
