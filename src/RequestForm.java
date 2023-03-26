
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.text.SimpleDateFormat;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lahiru
 */
public class RequestForm extends javax.swing.JFrame {

    /**
     * Creates new form RequestForm
     */
    public RequestForm() {
        initComponents();
        DisplayTable();
    }

        public void DisplayTable(){
        PreparedStatement ps= null;
        ResultSet rs=null;
        
        String query ="SELECT  `ID`, `Number`, `Category`, `TypeCapacity`,`Site_ID`,`Status` FROM `vehicles_and_machines`";
        try {
            ps=databaseConnection.con().prepareStatement(query);
            rs=ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 650));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 173, 238));
        jLabel3.setText("Required date:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(640, 360, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 173, 238));
        jLabel4.setText("Retuning date:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(640, 430, 100, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VID/MID", "Number", "Category", "Capacity", "Site ID", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 130, 500, 410);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(null);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6);
        jButton6.setBounds(950, 30, 67, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("New Request");
        jPanel6.add(jLabel7);
        jLabel7.setBounds(10, 10, 130, 50);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 1050, 80);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(550, 90, 20, 520);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 173, 238));
        jLabel1.setText("VID/MID :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(640, 250, 60, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 173, 238));
        jLabel2.setText("Category :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(640, 300, 80, 30);

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehicle", "Machine" }));
        getContentPane().add(combobox);
        combobox.setBounds(790, 300, 190, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 173, 238));
        jLabel5.setText("EID :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(640, 130, 60, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 173, 238));
        jLabel6.setText("Requesting Site :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(640, 190, 120, 17);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(790, 360, 190, 30);
        getContentPane().add(jDateChooser2);
        jDateChooser2.setBounds(790, 420, 190, 30);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setForeground(new java.awt.Color(51, 173, 238));
        jPanel2.setLayout(null);

        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(790, 130, 130, 30);

        jPanel2.add(jComboBox3);
        jComboBox3.setBounds(790, 190, 130, 30);

        jPanel2.add(jComboBox4);
        jComboBox4.setBounds(790, 240, 130, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(720, 520, 90, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Reserve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(870, 520, 100, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1050, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
        RequestsE a = new RequestsE();
        a.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PreparedStatement ps=null;
            ResultSet rs1=null;
            
            String a=String.valueOf(jComboBox2.getSelectedItem());
            String b=String.valueOf(jComboBox3.getSelectedItem());
            String c=String.valueOf(jComboBox4.getSelectedItem());
            String d=String.valueOf(combobox.getSelectedItem());
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            String e=sdf.format(jDateChooser1.getDate());
            String f=sdf.format(jDateChooser2.getDate());
            
            //String g=String.valueOf(jComboBox1.getSelectedItem());
            
            if(a.equals("") || b.equals("") || c.equals("") || d.equals("") || f.equals("")  ){
               JOptionPane.showMessageDialog(this, "Please Fill all Fields !");
               
            } else{  
            try {
                String query_A="SELECT * FROM `requestsn` WHERE `VID/MID`=? ";
                ps=databaseConnection.con().prepareStatement(query_A);
                ps.setString(1, c);
                rs1=ps.executeQuery();
                
                if(rs1.next()){
                    JOptionPane.showMessageDialog(this,"Already Requested!");
                     jComboBox2.setSelectedItem(null);
                     jComboBox3.setSelectedItem(null);
                     jComboBox4.setSelectedItem(null);
                }
                else{
                    String query= "INSERT INTO  `requestsn`"
                            +"(`SiteID`, `EngineerID`, `VID/MID`, `Category`, `Requestdate`, `Returndate`, `Status`)"
                            +"VALUES (?,?,?,?,?,?,?)";
                    ps=databaseConnection.con().prepareStatement(query);
                    
                    
                    ps.setString(1,b);
                    ps.setString(2,a);
                    ps.setString(3,c);
                    ps.setString(4,d);
                    ps.setString(5,e);
                    ps.setString(6,f);
                    ps.setString(7,"Request");
                    
                    ps.execute();
                    
                    JOptionPane.showMessageDialog(this, "Request has made!");
                    jComboBox2.setSelectedItem(null);
                    jComboBox3.setSelectedItem(null);
                    jComboBox4.setSelectedItem(null);
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
            } 
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            PreparedStatement ps= null;
            ResultSet rs= null;
            
            String query="SELECT * FROM vehicles_and_machines ";
            ps=databaseConnection.con().prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                jComboBox4.addItem(rs.getString("ID"));  
            }
            PreparedStatement ps2= null;
            ResultSet rs2= null;
            
            String query2="SELECT * FROM site WHERE Status='Not completed'";
            ps=databaseConnection.con().prepareStatement(query2);
            rs=ps.executeQuery();
            while(rs.next()){
                jComboBox3.addItem(rs.getString("Site_ID"));
            }
            
            PreparedStatement ps3= null;
            ResultSet rs3= null;
            
            String query3="SELECT * FROM employee";
            ps=databaseConnection.con().prepareStatement(query3);
            rs=ps.executeQuery();
            while(rs.next()){
                jComboBox2.addItem(rs.getString("EmID"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PreparedStatement ps=null;
            ResultSet rs1=null;
            
            String a=String.valueOf(jComboBox2.getSelectedItem());
            String b=String.valueOf(jComboBox3.getSelectedItem());
            String c=String.valueOf(jComboBox4.getSelectedItem());
            String d=String.valueOf(combobox.getSelectedItem());
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            String e=sdf.format(jDateChooser1.getDate());
            String f=sdf.format(jDateChooser2.getDate());
            
           // String g=String.valueOf(jComboBox1.getSelectedItem());
            
            if(a.equals("") || b.equals("") || c.equals("") || d.equals("") || f.equals("")  ){
               JOptionPane.showMessageDialog(this, "Please Fill all Fields !");
               
            } else{  
            try {
                String query_A="SELECT * FROM `requestsn` WHERE `VID/MID`=? ";
                ps=databaseConnection.con().prepareStatement(query_A);
                ps.setString(1, c);
                rs1=ps.executeQuery();
                
                if(rs1.next()){
                    JOptionPane.showMessageDialog(this,"Already Requested!");
                     jComboBox2.setSelectedItem(null);
                     jComboBox3.setSelectedItem(null);
                     jComboBox4.setSelectedItem(null);
                }
                else{
                    String query= "INSERT INTO  `requestsn`"
                            +"(`SiteID`, `EngineerID`, `VID/MID`, `Category`, `Requestdate`, `Returndate`, `Status`)"
                            +"VALUES (?,?,?,?,?,?,?)";
                    ps=databaseConnection.con().prepareStatement(query);
                    
                    
                    ps.setString(1,b);
                    ps.setString(2,a);
                    ps.setString(3,c);
                    ps.setString(4,d);
                    ps.setString(5,e);
                    ps.setString(6,f);
                    ps.setString(7,"Reserve");
                    
                    ps.execute();
                    
                    JOptionPane.showMessageDialog(this, "Request has made!");
                    jComboBox2.setSelectedItem(null);
                    jComboBox3.setSelectedItem(null);
                    jComboBox4.setSelectedItem(null);
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
            } 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RequestForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
