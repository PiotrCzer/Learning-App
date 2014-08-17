/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nciapp;

/**
 *
 * @author x12488942
 */
public class GUILearningSupport extends javax.swing.JFrame {

    /**
     * Creates new form LearningSupportGUI
     */
    public GUILearningSupport() {
        initComponents();
        
        
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JLabel();
        backwardButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        info = new javax.swing.JLabel();
        appointments = new javax.swing.JButton();
        menuBar = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(374, 535));
        setPreferredSize(new java.awt.Dimension(374, 535));
        getContentPane().setLayout(null);

        heading.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setText("Learning Support");
        getContentPane().add(heading);
        heading.setBounds(50, 10, 270, 60);

        backwardButton.setBorderPainted(false);
        backwardButton.setContentAreaFilled(false);
        backwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backwardButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backwardButton);
        backwardButton.setBounds(0, 450, 50, 50);

        homeButton.setContentAreaFilled(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton);
        homeButton.setBounds(160, 450, 40, 50);

        info.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        info.setForeground(new java.awt.Color(255, 255, 255));
        info.setText("<html>This is a ‘drop-in’ academic support service available to all registered students.\n<br/>\nThe objective of the academic support service is to equip students with the necessary skills to help them become more effective and efficient learners. Academic Support at National College of Ireland is an open door, fluid service, conceived to meet the individual needs of learners while addressing key issues in academic development.<html/>");
        getContentPane().add(info);
        info.setBounds(50, 60, 290, 300);

        appointments.setText("Appointments");
        appointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentsActionPerformed(evt);
            }
        });
        getContentPane().add(appointments);
        appointments.setBounds(120, 390, 120, 40);

        menuBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nciapp/menuBar.png"))); // NOI18N
        menuBar.setText("jLabel3");
        getContentPane().add(menuBar);
        menuBar.setBounds(0, 450, 360, 50);

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nciapp/wallpaper3.png"))); // NOI18N
        wallpaper.setText("jLabel1");
        wallpaper.setPreferredSize(new java.awt.Dimension(360, 500));
        getContentPane().add(wallpaper);
        wallpaper.setBounds(0, 0, 360, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backwardButtonActionPerformed
        GUIDisabilitySupport Disability = new GUIDisabilitySupport();
        Disability.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_backwardButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        GUIMainMenu myMainMenu = new GUIMainMenu();
        myMainMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void appointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentsActionPerformed
       ArrayGUI a = new ArrayGUI();
       a.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_appointmentsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUILearningSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUILearningSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUILearningSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUILearningSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GUILearningSupport().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointments;
    private javax.swing.JButton backwardButton;
    private javax.swing.JLabel heading;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel info;
    private javax.swing.JLabel menuBar;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}