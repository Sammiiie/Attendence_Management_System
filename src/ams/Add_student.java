/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ams;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPTemplate;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import com.digitalpersona.onetouch.ui.swing.*;
import java.awt.Color;
//import static java.awt.Color.black;
import static java.awt.Color.white;



/**
 *
 * @author Ejiga Samuel
 */
public class Add_student extends javax.swing.JFrame {
    
    private java.util.List <javax.swing.JCheckBox> checks = new java.util.ArrayList<>();;
    
    private static final String print1Column = "print1";

    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form Add_student
     */
    public Add_student() {
        
        initComponents();
        fPrintpan.setBackground(white);
    }
    
    
    
    private void retrieve()
    {
     DefaultTableModel dm = new DBUpdaterS().getData();

        dtable.setModel(dm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        studNameT = new javax.swing.JLabel();
        studNoT = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        studName = new javax.swing.JTextField();
        studentNo = new javax.swing.JTextField();
        bReturn = new javax.swing.JButton();
        adStud = new javax.swing.JButton();
        buDel = new javax.swing.JButton();
        selCor = new javax.swing.JPanel();
        fPrintpan = new javax.swing.JPanel();
        fScan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student no", "Name", "Courses"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dtable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Add Student");

        studNameT.setText("Name:");

        studNoT.setText("Student no:");

        jLabel4.setText("Course:");

        studName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studNameActionPerformed(evt);
            }
        });

        studentNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNoActionPerformed(evt);
            }
        });

        bReturn.setText("Back");
        bReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReturnActionPerformed(evt);
            }
        });

        adStud.setText("Add");
        adStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adStudActionPerformed(evt);
            }
        });

        buDel.setText("Delete");
        buDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buDelActionPerformed(evt);
            }
        });

        selCor.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout selCorLayout = new javax.swing.GroupLayout(selCor);
        selCor.setLayout(selCorLayout);
        selCorLayout.setHorizontalGroup(
            selCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        selCorLayout.setVerticalGroup(
            selCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        fPrintpan.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout fPrintpanLayout = new javax.swing.GroupLayout(fPrintpan);
        fPrintpan.setLayout(fPrintpanLayout);
        fPrintpanLayout.setHorizontalGroup(
            fPrintpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        fPrintpanLayout.setVerticalGroup(
            fPrintpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );

        fScan.setText("Scan");
        fScan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fScanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studNameT)
                    .addComponent(studNoT)
                    .addComponent(jLabel4))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adStud)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buDel)
                        .addGap(18, 18, 18)
                        .addComponent(bReturn)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(selCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(studentNo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(studName, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fPrintpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fScan)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studNameT)
                            .addComponent(studName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studNoT))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(173, 173, 173))
                            .addComponent(selCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fPrintpan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(fScan)
                                .addGap(22, 22, 22))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bReturn)
                    .addComponent(adStud)
                    .addComponent(buDel))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReturnActionPerformed
        // TODO add your handling code here:
        Admin f2 = new Admin();
        f2.setVisible(true);
        dispose();
    }//GEN-LAST:event_bReturnActionPerformed

    private void studNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studNameActionPerformed
    
    
    private void populateTable(){
        String sql = "select * from student";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            dtable.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void selCor() {
        // to auto generate courses with info from database
        
    }
    
    
    
    private void adStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adStudActionPerformed
       
        if(fPrintpan.getBackground() == Color.white){
           JOptionPane.showMessageDialog(null, "Collect finger print data");
       }
       else{
           
           try {
            conn = Connection1.connectDB();
            String sql = "insert into student (idstud, studname, studbio_bio) values(?,?,?)";
            pst = conn.prepareStatement(sql);
            String id = studentNo.getText();
            String name = studName.getText();
            byte[] digital = DigitalPersona.temp;
            pst.setString(1,id);
            pst.setString(2, name);
            pst.setBytes(3, digital);
            //System.out.println(""+id + "  " + pass);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved in Student");
   
        } catch (SQLException e ) {
            System.out.println("no");
            JOptionPane.showMessageDialog(null, e);

        }
           
       }
        populateTable();
       // createCheckboxes();
    }//GEN-LAST:event_adStudActionPerformed

    //SET SELECTED VALUE TO TEXTFIELDS
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        String id = dtable.getValueAt(dtable.getSelectedRow(), 1).toString();
        String name = dtable.getValueAt(dtable.getSelectedRow(), 2).toString();
        //String team = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        studNameT.setText(id);
        studNoT.setText(name);
        //teamTxt.setText(team);

    }
    
    private void buDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buDelActionPerformed
        // TODO add your handling code here:
        String[] options = {"Yes", "No"};
        int answ = JOptionPane.showOptionDialog(null, "Sure To Delete??", "Delete Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

        if (answ == 0) {
            int index = dtable.getSelectedRow();
            String id = dtable.getValueAt(index, 0).toString();

            if (new DBUpdaterS().delete(id)) {
                JOptionPane.showMessageDialog(null, "Deleted Updated");

                //CLEAR TXT
                studNameT.setText("");
                studNoT.setText("");
                //teamTxt.setText("");

           retrieve();
            } 
            else
            {
                JOptionPane.showMessageDialog(null, "Not Deleted");
            }

        }
    }//GEN-LAST:event_buDelActionPerformed

    private void studentNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentNoActionPerformed

    private void fScanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fScanActionPerformed
        //Scanner for finger print
        DigitalPersona.listReaders();
        DigitalPersona dp = new DigitalPersona();
        DPFPTemplate temp = dp.getTemplate(null, 1);
        byte[] b = temp.serialize();
        dp.insert(1, b);

        b = dp.get();

        DPFPTemplate temp2 = DPFPGlobal.getTemplateFactory().createTemplate();
        temp2.deserialize(b);

        if (dp.verify(null, temp)){
            JOptionPane.showMessageDialog(null, "Finger Verified!");
            fPrintpan.setBackground(Color.green);
        }
        else{
            JOptionPane.showMessageDialog(null, "Finger not verified!");
            fPrintpan.setBackground(Color.red);
        }
    }//GEN-LAST:event_fScanActionPerformed

    
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
            java.util.logging.Logger.getLogger(Add_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adStud;
    private javax.swing.JButton bReturn;
    private javax.swing.JButton buDel;
    private javax.swing.JTable dtable;
    private javax.swing.JPanel fPrintpan;
    private javax.swing.JButton fScan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel selCor;
    public javax.swing.JTextField studName;
    private javax.swing.JLabel studNameT;
    private javax.swing.JLabel studNoT;
    public javax.swing.JTextField studentNo;
    // End of variables declaration//GEN-END:variables
}
