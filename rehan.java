import java.io.File;
import javax.swing.*;
public class rehan extends javax.swing.JFrame
{
    String s;
    public rehan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        text1 = new javax.swing.JTextField();
        choose = new javax.swing.JButton();
        msg = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("ENCRYPTION SYSTEM");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(200, 200));

        jPanel1.setBackground(new java.awt.Color(9, 15, 9));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("ENCYRPTION SYSTEM");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 10, 280, 30);

        jPanel2.setBackground(new java.awt.Color(240, 15, 10));
        jPanel2.setLayout(null);

        text1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(text1);
        text1.setBounds(54, 114, 180, 31);

        choose.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        choose.setText("choose");
        choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseActionPerformed(evt);
            }
        });
        jPanel2.add(choose);
        choose.setBounds(279, 111, 112, 38);

        msg.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jPanel2.add(msg);
        msg.setBounds(180, 296, 180, 11);

        jButton2.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jButton2.setText("SEND");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(270, 243, 108, 38);

        jButton3.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jButton3.setText("ENCRYPT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(90, 240, 112, 38);

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("ENTER URL");
        jLabel2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel2PropertyChange(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(160, 30, 290, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\abc\\waterpark\\19abc0ee-87b1-49d2-9085-d32ba232331dbkimage-FCE5F1DF.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 480, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseActionPerformed
           JFileChooser jf=new JFileChooser();
           jf.showOpenDialog(null);
          File f= jf.getSelectedFile();
           text1.setText(f.getAbsolutePath());
    }//GEN-LAST:event_chooseActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
     email eml=new email();
     eml.fun(s);
     eml.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String s=text1.getText();
        this.s=s;
        String extention=s.substring(s.length()-3,s.length());
        String mode="encryption";
        if(s.length()==0){
            JFrame f= new JFrame();
            JOptionPane.showMessageDialog(f,"enter url first");
        }  
        else
        {        
            mode="encryption";
                   new DES(s,mode,extention);
        }
                   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel2PropertyChange
  
    }//GEN-LAST:event_jLabel2PropertyChange

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(rehan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rehan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rehan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rehan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rehan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton choose;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel msg;
    private javax.swing.JTextField text1;
    // End of variables declaration//GEN-END:variables
}
