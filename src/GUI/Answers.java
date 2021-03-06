/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Server.sendEmail;
import java.awt.Color;
import javax.swing.JOptionPane;
import Services.Answer;
import Services.QandAns;
import Services.User;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author budar
 */
public class Answers extends javax.swing.JFrame {

    static String userName;

    /**
     *
     */
    public Answers() {
        initComponents();
        getDetailsUser();
       
        result.setBackground(new  Color(0,0,0,60));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        result = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Marks = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        markback = new javax.swing.JLabel();
        markback1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/qlogo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 120));

        result.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        result.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jScrollPane1.setViewportView(result);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 650, 620));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton1.setText("SEND MAIL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 140, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/send-mail.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 460, 200));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/answer back.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 302, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gquite.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, 170, 60));

        Marks.setBackground(new java.awt.Color(255, 255, 255));
        Marks.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        Marks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(Marks, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 700, 210, 40));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        jLabel5.setText("Total Marks:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 710, 170, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setText("Result");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, -1, -1));

        markback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/total mark.png"))); // NOI18N
        markback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(markback, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 260, 40));

        markback1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/total mark.png"))); // NOI18N
        markback1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(markback1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 700, 410, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        int pop = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout", pop);
        if (result == 0) {
            Login frame = new Login();
            frame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            /***
             * send the response output into the email server.
             */
            
            sendEmail.sendMail(Login.userName, result.getText(), "Quiz Dashboard");
            JOptionPane.showMessageDialog(this, "Email send Succesfully.");
        } catch (Exception ex) {
            ex.printStackTrace();
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
            java.util.logging.Logger.getLogger(Answers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Answers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Answers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Answers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Answers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Marks;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel markback;
    private javax.swing.JLabel markback1;
    private javax.swing.JTextPane result;
    // End of variables declaration//GEN-END:variables

    private void getDetailsUser() {
        Registry reg;
        try {
            String res = null;
            ArrayList<QandAns> response = new ArrayList<>();
            response = new RMIconnection().getServer().getDetailsUser(Login.userName123);
            /***
             * Get user name from cookie 
             * from local disk file 
             */
            FileInputStream fileInput = null;
            ObjectInputStream objInput = null;
            fileInput = new FileInputStream(new File("D:\\mathsmasterTemp\\userCookie.iq"));
            objInput = new ObjectInputStream(fileInput);
            User u1 = null;
            u1 = (User) objInput.readObject();
            /***
             * Get user total marks 
             */
            String Tot = null;
            Tot = new RMIconnection().getServer().getUmarks(u1.getEmail());
            if (Tot.isEmpty() || Tot.equals(null)) {
                Marks.setText("you have no marks");
            } else {
                Marks.setText(Tot);
            }
            
            fileInput = null;
            objInput = null;
            
            /***
             * get All answers save to the temporary values from local disk
             */
            for (int x = 1; x <= 10; x++) {
                try {
                    try {
                        fileInput = new FileInputStream(new File("D:\\mathsmasterTemp\\ans" + x + ".iq"));
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Game10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    /***
                     * if question answer is false fetch the correct answer 
                     */
                    objInput = new ObjectInputStream(fileInput);
                    Answer finAns = (Answer) objInput.readObject();
                    if (!finAns.getProAnswer().equals("True")) {
                        res = res + "Question Number: " + x + "\n" + response.get(x - 1).getQuestion() + "\n Answer: " + response.get(x - 1).getAnswer() + "\n\n";
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Game10.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Game10.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        objInput.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Game10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if (res.isEmpty() || res.equals(null)) {
                result.setText("Congratulations !!!\n You have successfully answers to the questions.....");
            } else {
                result.setText(res);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
