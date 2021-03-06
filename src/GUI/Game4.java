/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Services.Answer;
import Services.TempanswerService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JOptionPane;

/**
 *
 * @author budar
 */
public class Game4 extends javax.swing.JFrame {

    /**
     * Creates new form Game4
     */
    public Game4() {
        initComponents();
        this.TI = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i--;

                if (i >= 0) {
                    Timer.setText("TimeLeft:" + i);
                }
                if (i == 0) {
                    
                    Answer ans2 = new Answer(4, "Over Due");
                    TempanswerService anssv2 = new TempanswerService();
                    anssv2.saveProAnswer(4, ans2);
                    new Game5().setVisible(true);
                    TI.stop();
                    dispose();
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
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        level1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAnswerProvided = new javax.swing.JTextField();
        answer = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Timer = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/q4.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 900, 500));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/qlogo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gquite.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 170, 50));

        level1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/level1.png"))); // NOI18N
        jPanel1.add(level1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 170, 100));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Answer:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 670, 170, 40));

        txtAnswerProvided.setBackground(new java.awt.Color(204, 204, 204));
        txtAnswerProvided.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(txtAnswerProvided, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 680, 180, 40));

        answer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        answer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bar.png"))); // NOI18N
        jPanel1.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 660, 730, 70));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 670, 170, 60));

        Timer.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Timer.setForeground(new java.awt.Color(255, 0, 0));
        Timer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Timer.setText("COUNTDOWN:");
        jPanel1.add(Timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 310, 90));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/qback.png"))); // NOI18N
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            this.dispose();
            TI.stop();
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String answer;
        Answer ans1;
        answer = txtAnswerProvided.getText();
        /**
         * *
         * get answer validation part to if answer empty database goes as
         * skipped
         */

        if (!(answer.isEmpty() || answer.equals(null))) {
            if (answer.equals("99")) {//question ake answer eka 
                ans1 = new Answer(4, "True");
            } else {
                ans1 = new Answer(4, "False");
            }
        } else {
            ans1 = new Answer(4, "Skipped");
        }

        TempanswerService ansSv = new TempanswerService();
        ansSv.saveProAnswer(4, ans1);
        new Game5().setVisible(true);
        TI.stop();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        TI.start();
    }//GEN-LAST:event_formWindowOpened
int i = 21;// Give Time to Timer
    Timer TI;
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
            java.util.logging.Logger.getLogger(Game4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game4().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel level1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtAnswerProvided;
    // End of variables declaration//GEN-END:variables
}
