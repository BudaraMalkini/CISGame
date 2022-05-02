/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Services.Answer;
import Services.TempanswerService;
import Services.User;
import javax.swing.Timer;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Game10 extends javax.swing.JFrame {
   int i =21;
   Timer TI;
    /**
     * Creates new form Game10
     */
    public Game10() {
        initComponents();
         this.setLocationRelativeTo(null);
        this.TI = new Timer (1000, (ActionEvent e) -> {
            i--;
            
            if (i>=0)
                Timer.setText("TimeLeft:"+i);
            
                if (i == 0 ) {
                try {
                    /***
                     * save answer after the overdue
                     */
                    Answer ans2 = new Answer(10, "Over Due");
                    TempanswerService anssv2 = new TempanswerService();
                    anssv2.saveProAnswer(10, ans2);
                    
                    /***
                     * send values to other side before the overdue 
                     * Read saved answers temporary saved in local disk
                     */
                    Answer [] ansArray = new Answer[10];
                    FileInputStream fileInput = null;
                    ObjectInputStream objInput = null;
                    /***
                     * read local temp value file by file and make a array list
                     */
                    for (int x=1; x<=10; x++ ) {
                        try {
                            try {
                                fileInput = new FileInputStream(new File("D:\\iqQuizProTemp\\ans"+x+".iq"));
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(Game10.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            objInput = new ObjectInputStream(fileInput);
                            Answer finAns = (Answer) objInput.readObject();
                            ansArray [x-1] = finAns;
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
                    
                    /***
                     * read values from user cookie
                     */
                    fileInput = new FileInputStream(new File("D:\\iqQuizProTemp\\userCookie.iq"));
                    objInput = new ObjectInputStream(fileInput);
                    User u1 = null;
                    u1 = (User) objInput.readObject();
                    
                    
                    /***
                     * user cookie is read and the value is taken to the server
                     * send read values server side
                     */
                    new RMIconnection().getServer().saveAnswers(ansArray, u1.getEmail());
                    
                    new Answers().setVisible(true);
                    TI.stop();
                    dispose();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Game10.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Game10.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Game10.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
        });
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAnswerProvided = new javax.swing.JTextField();
        answer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Timer = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/q10.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 900, 500));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/qlogo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 120));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/leve2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 170, 110));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("Answer:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 670, 170, 40));

        txtAnswerProvided.setBackground(new java.awt.Color(204, 204, 204));
        txtAnswerProvided.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jPanel1.add(txtAnswerProvided, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 660, 160, 50));

        answer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        answer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bar.png"))); // NOI18N
        jPanel1.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 650, 730, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gquite.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, 170, 50));

        jButton1.setBackground(new java.awt.Color(51, 255, 255));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 670, 150, 50));

        Timer.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Timer.setForeground(new java.awt.Color(255, 0, 0));
        Timer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Timer.setText("COUNTDOWN:");
        jPanel1.add(Timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 320, 90));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/qbackground.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int pop = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout", pop);
        if (result == 0) {
            Login frame = new Login();
            frame.setVisible(true);
             TI.stop();
            this.dispose();
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
             // TODO add your handling code here:
             String answer;
             Answer ans1;
             answer = txtAnswerProvided.getText();
             
             if (!(answer.isEmpty() || answer.equals(null))) {
                 if (answer.equals("12")) {
                     ans1  = new Answer(10, "True");
                 } else {
                     ans1 = new Answer(10, "False");
                 }
             } else {
                 ans1 = new Answer(10, "Skipped");
             }
             
             /***
              * create object array for get saved temporary values to save in object array
              */
             
             TempanswerService ansSv = new TempanswerService();
             ansSv.saveProAnswer(10, ans1);
             
             Answer [] ansArray = new Answer[10];
             FileInputStream fileInput = null;
             ObjectInputStream objInput = null;
             for (int x=1; x<=10; x++ ) {
                 try {
                     try {
                         fileInput = new FileInputStream(new File("D:\\mathsmasterTemp\\ans"+x+".iq"));
                     } catch (FileNotFoundException ex) {
                         Logger.getLogger(Game10.class.getName()).log(Level.SEVERE, null, ex);
                     }
                     objInput = new ObjectInputStream(fileInput);
                     Answer finAns = (Answer) objInput.readObject();
                     ansArray [x-1] = finAns;
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
             
             /***
              * read values from user cookie 
              */
             fileInput = new FileInputStream(new File("D:\\mathsmasterTemp\\userCookie.iq"));
             objInput = new ObjectInputStream(fileInput);
             User u1 = null;
             u1 = (User) objInput.readObject();
             
             new RMIconnection().getServer().saveAnswers(ansArray, u1.getEmail());
            
            //System.exit(0);
            new Answers().setVisible(true);
              TI.stop();
              dispose();
              
             
            
         } catch (FileNotFoundException ex) {
             Logger.getLogger(Game10.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(Game10.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Game10.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        TI.start();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Game10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Timer;
    private javax.swing.JLabel answer;
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAnswerProvided;
    // End of variables declaration//GEN-END:variables
}
