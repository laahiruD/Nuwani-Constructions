import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.ParseException;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lahiru
 */
public class addMachinesvehicles extends javax.swing.JFrame {

    /**
     * Creates new form addMachinesvehicles
     */
    public addMachinesvehicles() throws SQLException {
        initComponents();
        //InvoiceNo();
    }
        public void InvoiceNo() throws SQLException{
            
            String cat=String.valueOf(combobox.getSelectedItem());
            if(cat.equals("Vehicle")){
                 String query = "SELECT MAX(ID) FROM `vehicles_and_machines` WHERE ID LIKE 'v%'";
                   PreparedStatement ps = null;
                   ResultSet rs = null;
                   ps = databaseConnection.con().prepareStatement(query);
                    rs = ps.executeQuery();
                        if(rs.next()){
                            rs.getString("MAX(ID)");
            
                            if(rs.getString("MAX(ID)")==null){
                                jTextFielda.setText("V001");
                            }else{
                                 String id=String.valueOf(rs.getString("MAX(ID)"));
                                String id1=id.substring(0,1);
                                String id2=id.substring(2,4);
                               long n= Long.parseLong(id2);
                                n++;
                                String num1=Long.toString(n);
                                jTextFielda.setText(id1+String.format("%03d",n));
                            }
                            }  
            }else{
                String query = "SELECT MAX(ID) FROM `vehicles_and_machines` WHERE ID LIKE 'M%'";
                   PreparedStatement ps = null;
                   ResultSet rs = null;
                   ps = databaseConnection.con().prepareStatement(query);
                    rs = ps.executeQuery();
                        if(rs.next()){
                            rs.getString("MAX(ID)");
            
                            if(rs.getString("MAX(ID)")==null){
                                jTextFielda.setText("M001");
                            }else{
                                 String id=String.valueOf(rs.getString("MAX(ID)"));
                                String id1=id.substring(0,1);
                                String id2=id.substring(2,4);
                               long n= Long.parseLong(id2);
                                n++;
                                String num1=Long.toString(n);
                                jTextFielda.setText(id1+String.format("%03d",n));
                            }
                            }  
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
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextFielda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldd = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(714, 590));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("New Machine\\Vehicle ");
        jPanel6.add(jLabel7);
        jLabel7.setBounds(20, 20, 260, 50);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6);
        jButton6.setBounds(620, 30, 67, 30);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 720, 90);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 210, 90, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(560, 300, 90, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(560, 380, 90, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Site details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel1.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("ID:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 90, 90, 30);

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
        jPanel1.add(jTextFielda);
        jTextFielda.setBounds(190, 90, 160, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Number :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 110, 70, 60);

        jTextFieldb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldbActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldb);
        jTextFieldb.setBounds(190, 130, 250, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Category :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 40, 67, 50);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Site ID :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 370, 110, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Reqirement of Lowbeds:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 217, 150, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Type & capacity :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 180, 110, 17);
        jPanel1.add(jTextFieldd);
        jTextFieldd.setBounds(190, 170, 250, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(360, 90, 80, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Purchased Date :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 270, 120, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Status :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 320, 100, 30);

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehicle", "Machine" }));
        combobox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comboboxMouseExited(evt);
            }
        });
        jPanel1.add(combobox);
        combobox.setBounds(190, 50, 250, 30);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(190, 270, 250, 30);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(190, 370, 110, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Require");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(190, 220, 93, 30);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Not require");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(310, 220, 100, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Exist", "Not exist" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(190, 320, 250, 30);

        jButton5.setText("Get Site");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(310, 370, 71, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 110, 470, 420);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 80, 720, 510);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
        MachineDetials a = new MachineDetials();
        a.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            PreparedStatement ps=null;
            ResultSet rs1=null;
            ResultSet rs2=null;

            String a=jTextFielda.getText();
            String b=jTextFieldb.getText();
            String c=String.valueOf(combobox.getSelectedItem());
            String d=jTextFieldd.getText();
           // String e=jTextFielde.getText();
            String e="";
            if(jRadioButton1.isSelected()){
                 e="Require";
            }else{
                e="Not require";
            }
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
                String f=sdf.format(jDateChooser1.getDate());
            //String g=jTextFieldg.getText();
           String h=String.valueOf(jComboBox1.getSelectedItem());
           String g=String.valueOf(jComboBox2.getSelectedItem());
            

            if(a.equals("") || b.equals("") || c.equals("") || d.equals("") || f.equals("") || g.equals("")){
                JOptionPane.showMessageDialog(this, "Please Fill all Fields !");
               
            } else{
                String query_A="SELECT * FROM `vehicles_and_machines` WHERE ID=? ";
                ps=databaseConnection.con().prepareStatement(query_A);
                ps.setString(1, a);
                rs1=ps.executeQuery();

                if(rs1.next()){
                    JOptionPane.showMessageDialog(this,"Invalid ID");
                }
                else{
                    String query= "INSERT INTO `vehicles_and_machines`"
                            +"(`ID`, `Number`, `Category`, `TypeCapacity`, `Requirement_of_lowbed`, `Purchased_date`, `Status`, `Site_ID`)"
                    +"VALUES (?,?,?,?,?,?,?,?)";
                    ps=databaseConnection.con().prepareStatement(query);

                    ps.setString(1,a);
                    ps.setString(2,b);
                    ps.setString(3,c);
                    ps.setString(4,d);
                    ps.setString(5,e);
                    ps.setString(6,f);
                    ps.setString(7,g);
                    ps.setString(8,h);
                   

                    ps.execute();

                    JOptionPane.showMessageDialog(this, "New Machine/vehicle has been added");
                    jTextFielda.setText("");
                    jTextFieldb.setText("");
                    jTextFieldd.setText("");
                    //jTextFielde.setText("");
                     jRadioButton1.setSelected(false);
                     jRadioButton2.setSelected(false);
                    //jTextFieldg.setText("");
                     jComboBox2.setSelectedItem(null);
                    jComboBox1.setSelectedItem(null);
                    combobox.setSelectedItem(null);
                   jDateChooser1.setDate(null);
                    
                    
                }
            }

        }catch (SQLException ex) {
            Logger.getLogger(Sites.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {

            String a=jTextFielda.getText();
            String b=jTextFieldb.getText();
            String c=String.valueOf(combobox.getSelectedItem());
            String d=jTextFieldd.getText();
            //String e=jTextFielde.getText();
            String e="";
             if(jRadioButton1.isSelected()){
                 e="Require";
            }else{
                e="Not require";
            }
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
                String f=sdf.format(jDateChooser1.getDate());
           // String g=jTextFieldg.getText();
             String g=String.valueOf(jComboBox2.getSelectedItem());
            String h=String.valueOf(jComboBox1.getSelectedItem());
           

            if(a.equals("") || b.equals("") || c.equals("") || d.equals("") || f.equals("") || g.equals("") ||  h.equals("")){
                JOptionPane.showMessageDialog(this, "Please Fill all Fields !");
                
            }
            else{
                String query= "UPDATE `vehicles_and_machines` SET `Number`=?,`Category`=?,`TypeCapacity`=?,`Requirement_of_lowbed`=?,`Purchased_date`=?,`Status`=?,`Site_ID`=? WHERE ID =?";
                PreparedStatement ps1=null;

                ps1=databaseConnection.con().prepareStatement(query);

                ps1.setString(1,b);
                ps1.setString(2,c);
                ps1.setString(3,d);
                ps1.setString(4,e);
                ps1.setString(5,f);
                ps1.setString(6,g);
                ps1.setString(7,h);
                ps1.setString(8,a);
                
                

                ps1.executeUpdate();
                JOptionPane.showMessageDialog(this,"Updated");

                jTextFielda.setText("");
                    jTextFieldb.setText("");
                    jTextFieldd.setText("");
                    //jTextFielde.setText("");
                     jRadioButton1.setSelected(false);
                     jRadioButton2.setSelected(false);
                    //jTextFieldg.setText("");
                    jComboBox1.setSelectedItem(null);
                    jComboBox2.setSelectedItem(null);
                    combobox.setSelectedItem(null);
                   jDateChooser1.setDate(null);
                
                
            }

        }catch (SQLException ex) {
            Logger.getLogger(Sites.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextFielda.setText("");
                    jTextFieldb.setText("");
                    jTextFieldd.setText("");
                    //jTextFielde.setText("");
                     jRadioButton1.setSelected(false);
                     jRadioButton2.setSelected(false);
                    //jTextFieldg.setText("");
                    jComboBox1.setSelectedItem(null);
                     jComboBox2.setSelectedItem(null);
                    combobox.setSelectedItem(null);
                   jDateChooser1.setDate(null);
        
       

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldaActionPerformed

    private void jTextFieldbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldbActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ResultSet rs=null;
        try {
            String cat=String.valueOf(combobox.getSelectedItem());
            if(cat.equals("Vehicle")){
                        String a= jTextFielda.getText();
                        String query ="SELECT  * FROM `vehicles_and_machines`  WHERE ID = ? AND Category='Vehicle' ";
                        PreparedStatement ps=null;
                        ps=databaseConnection.con().prepareStatement(query);
                        ps.setString(1, a);
                        rs=ps.executeQuery();
                                    if(rs.next()){
                                        jTextFieldb.setText(rs.getString("Number"));
                                        combobox.setSelectedItem(rs.getString("Category"));
                                        jTextFieldd.setText(rs.getString("TypeCapacity"));
                                       // jTextFielde.setText(rs.getString("Requirement_of_lowbed"));
                                       String c=(rs.getString("Requirement_of_lowbed"));
                                            if(c.equals("Require")){
                                                jRadioButton1.setSelected(true);
                                            }else{
                                                jRadioButton2.setSelected(true);
                                            } 
                                                String date=rs.getString("Purchased_date");
                                             if(rs.getString("Status").equals("Exist")){
                                                  jComboBox2.setSelectedItem("Exist");
                                             }else{

                                                jComboBox2.setSelectedItem("Not exist"); 
                                             }
                                                 String f=(rs.getString("Site_ID"));
                                                jComboBox1.setSelectedItem(f);
                                                try {
                                                    java.util.Date date1= new SimpleDateFormat("yyyy-MM-dd").parse(date);
                                                    jDateChooser1.setDate(date1);
                                                } catch (ParseException ex) {
                                                    Logger.getLogger(addMachinesvehicles.class.getName()).log(Level.SEVERE, null, ex);
                                                }  
                                    }else{
                JOptionPane.showMessageDialog(this, "Incorrect Category or ID!");
                jTextFielda.setText("");
            }
           
                //jTextFieldg.setText(rs.getString("Status"));
//                
//               jComboBox1.setSelectedItem("");
//               jComboBox2.setSelectedItem("");
//                

            }else if(cat.equals("Machine")){
                String a= jTextFielda.getText();
                        String query ="SELECT  * FROM `vehicles_and_machines`  WHERE ID = ? AND Category='Machine'";
                        PreparedStatement ps=null;
                        ps=databaseConnection.con().prepareStatement(query);
                        ps.setString(1, a);
                        rs=ps.executeQuery();
                                    if(rs.next()){
                                        jTextFieldb.setText(rs.getString("Number"));
                                        combobox.setSelectedItem(rs.getString("Category"));
                                        jTextFieldd.setText(rs.getString("TypeCapacity"));
                                       // jTextFielde.setText(rs.getString("Requirement_of_lowbed"));
                                       String c=(rs.getString("Requirement_of_lowbed"));
                                            if(c.equals("Require")){
                                                jRadioButton1.setSelected(true);
                                            }else{
                                                jRadioButton2.setSelected(true);
                                            } 
                                                String date=rs.getString("Purchased_date");
                                             if(rs.getString("Status").equals("Exist")){
                                                  jComboBox2.setSelectedItem("Exist");
                                             }else{

                                                jComboBox2.setSelectedItem("Not exist"); 
                                             }
                                                 String f=(rs.getString("Site_ID"));
                                                jComboBox1.setSelectedItem(f);
                                                try {
                                                    java.util.Date date1= new SimpleDateFormat("yyyy-MM-dd").parse(date);
                                                    jDateChooser1.setDate(date1);
                                                } catch (ParseException ex) {
                                                    Logger.getLogger(addMachinesvehicles.class.getName()).log(Level.SEVERE, null, ex);
                                                }  
                                    }else{
                JOptionPane.showMessageDialog(this, "Incorrect Category or ID!");
                jTextFielda.setText("");
            }
           
                //jTextFieldg.setText(rs.getString("Status"));
                
//               jComboBox1.setSelectedItem("");
//               jComboBox2.setSelectedItem("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sites.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//       try {
//            PreparedStatement ps= null;
//            ResultSet rs= null;
//            
//            String query="SELECT * FROM site ";
//            ps=databaseConnection.con().prepareStatement(query);
//            rs=ps.executeQuery();
//           
//             while(rs.next()){
//                jComboBox2.addItem(rs.getString("Status"));
//                
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_formWindowOpened

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            PreparedStatement ps= null;
            ResultSet rs= null;
            
            String query="SELECT * FROM site WHERE Status='Not completed' ";
            ps=databaseConnection.con().prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                jComboBox1.addItem(rs.getString("Site_ID"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(addMachinesvehicles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void comboboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboboxMouseExited
        
    }//GEN-LAST:event_comboboxMouseExited

    private void jTextFieldaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldaMouseClicked
       try {
            InvoiceNo();
        } catch (SQLException ex) {
            Logger.getLogger(addMachinesvehicles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextFieldaMouseClicked

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
            java.util.logging.Logger.getLogger(addMachinesvehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addMachinesvehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addMachinesvehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addMachinesvehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new addMachinesvehicles().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(addMachinesvehicles.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextFielda;
    private javax.swing.JTextField jTextFieldb;
    private javax.swing.JTextField jTextFieldd;
    // End of variables declaration//GEN-END:variables
}