/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;
import java.awt.Color;
import java.sql.*;
/**
 *
 * @author ezhilnero
 */
public class gen_ward extends javax.swing.JFrame {

    int pno;
    int bedno;
    int bedflag;
    String flag;
    
    static Connection conn = null;
    Statement stmt = null;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String conn_str = "jdbc:mysql://localhost:3306/HMS";
    
    /**
     * Creates new form gen_ward
     */
    public gen_ward() {
        initComponents();
        try{
      conn = DriverManager.getConnection(conn_str, USERNAME, PASSWORD);
      System.out.println("connected to DB");      
      stmt = conn.createStatement();
      String sql = "SELECT avail from ward where bed_no = 1;";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==1)  
             {
                 bed_tf.addItem("1");
             }
      }
      sql = "SELECT avail from ward where bed_no = 2;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==1)  
             {
                 bed_tf.addItem("2");
             }
      }
      sql = "SELECT avail from ward where bed_no = 3;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==1)  
             {
                 bed_tf.addItem("3");
             }
      }
      sql = "SELECT avail from ward where bed_no = 4;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==1)  
             {
                 bed_tf.addItem("4");
             }
      }
      sql = "SELECT avail from ward where bed_no = 5;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==1)  
             {
                 bed_tf.addItem("5");
             }
      }
      sql = "SELECT avail from ward where bed_no = 6;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==1)  
             {
                 bed_tf.addItem("6");
             }
      }
      sql = "SELECT avail from ward where bed_no = 7;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==1)  
             {
                 bed_tf.addItem("7");
             }
      }
      sql = "SELECT avail from ward where bed_no = 8;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==1)  
             {
                 bed_tf.addItem("8");
             }
      }
sql = "SELECT avail from ward where bed_no = 9;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==1)  
             {
                 bed_tf.addItem("9");
             }
      }
sql = "SELECT avail from ward where bed_no =10;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==1)  
             {
                 bed_tf.addItem("10");
             }
      }
sql = "SELECT avail from ward where bed_no = 11;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==1)  
             {
                 bed_tf.addItem("11");
             }
      }
sql = "SELECT avail from ward where bed_no = 12;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==1)  
             {
                 bed_tf.addItem("12");
             }
      }
     
      rs.close();
      conn.close();

   }catch(Exception se){
      //Handle errors for JDBC
      System.out.println("ERROR IS : " +se.toString());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pno_tf = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        B4 = new javax.swing.JLabel();
        bed_tf = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        B7 = new javax.swing.JLabel();
        B10 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        B5 = new javax.swing.JLabel();
        B8 = new javax.swing.JLabel();
        B11 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        B6 = new javax.swing.JLabel();
        B9 = new javax.swing.JLabel();
        B12 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        hint_tf = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel5.setText("bed no :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(150, 210, 90, 19);

        jLabel2.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 16)); // NOI18N
        jLabel2.setText("General Ward");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 90, 160, 30);
        jPanel1.add(pno_tf);
        pno_tf.setBounds(230, 150, 90, 29);

        jButton2.setText("Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(200, 250, 100, 40);

        B4.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 16)); // NOI18N
        B4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B4.setText("B4");
        B4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(B4);
        B4.setBounds(410, 160, 40, 40);

        jPanel1.add(bed_tf);
        bed_tf.setBounds(230, 200, 90, 29);

        jLabel3.setText("pno :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 160, 90, 19);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(200, 310, 100, 40);

        B7.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 16)); // NOI18N
        B7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B7.setText("B7");
        B7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(B7);
        B7.setBounds(410, 210, 40, 40);

        B10.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 14)); // NOI18N
        B10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B10.setText("B10");
        B10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(B10);
        B10.setBounds(410, 260, 40, 40);

        B2.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 16)); // NOI18N
        B2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B2.setText("B2");
        B2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(B2);
        B2.setBounds(470, 110, 40, 40);

        B5.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 16)); // NOI18N
        B5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B5.setText("B5");
        B5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(B5);
        B5.setBounds(470, 160, 40, 40);

        B8.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 16)); // NOI18N
        B8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B8.setText("B8");
        B8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(B8);
        B8.setBounds(470, 210, 40, 40);

        B11.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 14)); // NOI18N
        B11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B11.setText("B11");
        B11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(B11);
        B11.setBounds(470, 260, 40, 40);

        B3.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 16)); // NOI18N
        B3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B3.setText("B3");
        B3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(B3);
        B3.setBounds(530, 110, 40, 40);

        B6.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 16)); // NOI18N
        B6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B6.setText("B6");
        B6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(B6);
        B6.setBounds(530, 160, 40, 40);

        B9.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 16)); // NOI18N
        B9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B9.setText("B9");
        B9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(B9);
        B9.setBounds(530, 210, 40, 40);

        B12.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 14)); // NOI18N
        B12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B12.setText("B12");
        B12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(B12);
        B12.setBounds(530, 260, 40, 40);

        B1.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 16)); // NOI18N
        B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B1.setText("B1");
        B1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(B1);
        B1.setBounds(410, 110, 40, 40);

        jLabel28.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 16)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("B1");
        jLabel28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jLabel28);
        jLabel28.setBounds(410, 110, 40, 40);

        jButton3.setText("check");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(450, 320, 80, 31);

        hint_tf.setFont(new java.awt.Font("URW Palladio L", 1, 14)); // NOI18N
        hint_tf.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(hint_tf);
        hint_tf.setBounds(330, 150, 60, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/ward.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        super.dispose();
        new other_opt().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try{
      conn = DriverManager.getConnection(conn_str, USERNAME, PASSWORD);
      System.out.println("connected to DB");      
      stmt = conn.createStatement();
      String sql = "SELECT avail from ward where bed_no = 1;";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==0)  
             {
                 B1.setForeground(Color.RED);
             }else{
B1.setForeground(Color.BLACK);
}
      }
      sql = "SELECT avail from ward where bed_no = 2;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==0)  
             {
                 B2.setForeground(Color.RED);
             }else{
B2.setForeground(Color.BLACK);
}
      }
      sql = "SELECT avail from ward where bed_no = 3;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==0)  
             {
                 B3.setForeground(Color.RED);
             }else{
B3.setForeground(Color.BLACK);
}
      }
      sql = "SELECT avail from ward where bed_no = 4;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==0)  
             {
                 B4.setForeground(Color.RED);
             }else{
B4.setForeground(Color.BLACK);
}
      }
      sql = "SELECT avail from ward where bed_no = 5;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==0)  
             {
                 B5.setForeground(Color.RED);
             }else{
B5.setForeground(Color.BLACK);
}
      }
      sql = "SELECT avail from ward where bed_no = 6;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==0)  
             {
                 B6.setForeground(Color.RED);
             }else{
B6.setForeground(Color.BLACK);
}
      }
      sql = "SELECT avail from ward where bed_no = 7;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==0)  
             {
                 B7.setForeground(Color.RED);
             }else{
B7.setForeground(Color.BLACK);
}
      }
      sql = "SELECT avail from ward where bed_no = 8;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==0)  
             {
                 B8.setForeground(Color.RED);
             }else{
B8.setForeground(Color.BLACK);
}
      }
sql = "SELECT avail from ward where bed_no = 9;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==0)  
             {
                 B9.setForeground(Color.RED);
             }else{
B9.setForeground(Color.BLACK);
}
      }
sql = "SELECT avail from ward where bed_no = 10;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==0)  
             {
                 B10.setForeground(Color.RED);
             }else{
B10.setForeground(Color.BLACK);
}
      }
sql = "SELECT avail from ward where bed_no = 11;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==0)  
             {
                 B11.setForeground(Color.RED);
             }else{
B11.setForeground(Color.BLACK);
}
      }
sql = "SELECT avail from ward where bed_no = 12;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){       
             if(rs.getInt("avail")==0)  
             {
                 B12.setForeground(Color.RED);
             }else{
B12.setForeground(Color.BLACK);
}
      }
     
      rs.close();
      conn.close();

   }catch(Exception se){
      //Handle errors for JDBC
      System.out.println("ERROR IS : " +se.toString());
   }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pno =Integer.parseInt(pno_tf.getText().toString());
        bedno =Integer.parseInt(bed_tf.getSelectedItem().toString());
              
       
       try{
      conn = DriverManager.getConnection(conn_str, USERNAME, PASSWORD);
      System.out.println("connected to DB");      
      stmt = conn.createStatement();
      String sql = "SELECT ptype from Patients WHERE pid = "+pno+" ;";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){
         flag = rs.getString("ptype");
      }
      sql = "SELECT wardno from Patients WHERE pid = "+pno+" ;";
      rs = stmt.executeQuery(sql);
      while(rs.next()){
         bedflag = rs.getInt("wardno");
      }
      if(bedflag>0)
      {
        sql = "UPDATE ward SET avail = 1  WHERE bed_no = "+bedflag+" ;";
        stmt.executeUpdate(sql);
        sql = "UPDATE ward SET pno = null  WHERE bed_no = "+bedflag+" ;";
        stmt.executeUpdate(sql);
      }
      if(flag.equals("out"))
      {
          hint_tf.setText("*error");
      }else{
      sql = "UPDATE ward SET avail = 0  WHERE bed_no = "+bedno+" ;";
      stmt.executeUpdate(sql);
      sql = "UPDATE ward SET pno = "+ pno +" WHERE bed_no = "+bedno+" ;";
      stmt.executeUpdate(sql);
      sql = "UPDATE Patients SET wardno ="+bedno+" WHERE pid = "+pno+" ;";
      stmt.executeUpdate(sql);
      System.out.println("update success");
      }

      
      

   }catch(Exception se){
      //Handle errors for JDBC
      System.out.println("ERROR IS : " +se.toString());
   }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(gen_ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gen_ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gen_ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gen_ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gen_ward().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B10;
    private javax.swing.JLabel B11;
    private javax.swing.JLabel B12;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B4;
    private javax.swing.JLabel B5;
    private javax.swing.JLabel B6;
    private javax.swing.JLabel B7;
    private javax.swing.JLabel B8;
    private javax.swing.JLabel B9;
    private javax.swing.JComboBox<String> bed_tf;
    private javax.swing.JLabel hint_tf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pno_tf;
    // End of variables declaration//GEN-END:variables
}
