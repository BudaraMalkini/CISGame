/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.util.regex.*;
import javax.swing.JOptionPane;

/**
 *
 * @author budar
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        txtusername.setBackground(new Color(0,0,0,1));
        txtemail.setBackground(new Color(0,0,0,1));
        Jpassword.setBackground(new Color(0,0,0,1));
        jcpassword.setBackground(new Color(0,0,0,1));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Jpassword = new javax.swing.JPasswordField();
        jcpassword = new javax.swing.JPasswordField();
        txtemail = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        uname = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/R1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 161, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setText("Create An Account");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 420, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/line.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 600, -1, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/line.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, -1, 10));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/line.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, -1, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/line.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, -1, 10));

        Jpassword.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Jpassword.setText("jPasswordField1");
        Jpassword.setBorder(null);
        Jpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JpasswordFocusGained(evt);
            }
        });
        Jpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JpasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JpasswordKeyReleased(evt);
            }
        });
        jPanel1.add(Jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 360, 40));

        jcpassword.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jcpassword.setText("jPasswordField2");
        jcpassword.setBorder(null);
        jcpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcpasswordFocusGained(evt);
            }
        });
        jcpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jcpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, 360, 40));

        txtemail.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        txtemail.setBorder(null);
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailFocusGained(evt);
            }
        });
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 360, 40));

        txtusername.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        txtusername.setBorder(null);
        txtusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusernameFocusGained(evt);
            }
        });
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        txtusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusernameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtusernameKeyReleased(evt);
            }
        });
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 360, 40));

        jButton1.setBackground(new java.awt.Color(255, 234, 48));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 690, 140, 40));

        jButton2.setBackground(new java.awt.Color(255, 234, 48));
        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jButton2.setText("CLEARE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 690, 150, 40));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel8.setText("<html><body><u>Already have an Account. LOGIN HERE</u></body></html> ");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 630, -1, 40));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel9.setText("User Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel10.setText("Email:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel11.setText("Password:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel12.setText("Confirm Password:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, -1, -1));

        uname.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 210, 160, 30));

        email.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 330, 150, 30));

        pass.setForeground(new java.awt.Color(204, 0, 51));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 436, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void jcpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcpasswordActionPerformed

    private void txtusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusernameKeyPressed
         if (evt.getKeyCode()==KeyEvent.VK_ENTER)
        txtemail.requestFocus();
    }//GEN-LAST:event_txtusernameKeyPressed

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
        Jpassword.requestFocus();
    }//GEN-LAST:event_txtemailKeyPressed

    private void JpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JpasswordKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
        jcpassword.requestFocus();
    }//GEN-LAST:event_JpasswordKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtemail.setText("");
        Jpassword.setText("");
        txtusername.setText("");
        jcpassword.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            /***
             * Validating check whether the user has enter all data
             */
            if (txtusername != null && txtemail != null && !txtusername.getText().equals("") && !txtemail.getText().equals("")) {
                /***
                 * Submit the user answers into the server.
                 */
                String response1 = new RMIconnection().getServer().Register(txtusername.getText(), txtemail.getText(), Jpassword.getText(), jcpassword.getText());
                System.out.println("Reg ? " + response1);
                /***
                 * if the sign up success user redirect to the login page.
                 */
                if (response1.equals("SignUp Successfull.")) {
                    Login.userName = txtusername.getText();
                    new Login().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, response1);
                }
            } else {
                /***
                 * if not show the error message.
                 */
                JOptionPane.showMessageDialog(this, "Please fill the Details correctly.");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void txtusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusGained
        txtusername.setText("");
    }//GEN-LAST:event_txtusernameFocusGained

    private void txtemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusGained
        txtemail.setText("");
    }//GEN-LAST:event_txtemailFocusGained

    private void JpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JpasswordFocusGained
        Jpassword.setText("");
    }//GEN-LAST:event_JpasswordFocusGained

    private void jcpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcpasswordFocusGained
        jcpassword.setText("");
    }//GEN-LAST:event_jcpasswordFocusGained

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtusernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusernameKeyReleased
        /*
        validation user name cant use numbers to user name 
        */
        
        String PATTERN="^[a-zA-Z]{0,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtusername.getText());
        if (!match.matches()){
            uname.setText("insert valid user name ");
        }
        else{
            uname.setText(null);
        }
    }//GEN-LAST:event_txtusernameKeyReleased

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
        /*
        Validate the email example@gmail.com
        */
        String PATTERN="^[a-zA-Z0-9]{0,30}[@][a-zA-Z]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtemail.getText());
        if (!match.matches()){
            email.setText("inser valid email");
        }
        else{
            email.setText(null);
        }
    }//GEN-LAST:event_txtemailKeyReleased

    private void JpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JpasswordKeyReleased
         /*
        Minimum eight characters, at least one letter and one number:
        */
        String PATTERN="^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(Jpassword.getText());
        if (!match.matches()){
            pass.setText("insert valid password");
        }
        else{
            pass.setText(null);
        }
    }//GEN-LAST:event_JpasswordKeyReleased

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Jpassword;
    private javax.swing.JLabel email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jcpassword;
    private javax.swing.JLabel pass;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtusername;
    private javax.swing.JLabel uname;
    // End of variables declaration//GEN-END:variables
}
