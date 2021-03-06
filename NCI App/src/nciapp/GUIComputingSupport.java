/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nciapp;

/**
 *
 * @author x12383876
 */
public class GUIComputingSupport extends javax.swing.JFrame {

    /**
     * Creates new form Computing
     */
    public GUIComputingSupport() {
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

        ComputingBanner = new javax.swing.JLabel();
        Revision = new javax.swing.JButton();
        OneOnOneSupport = new javax.swing.JButton();
        Moodle = new javax.swing.JButton();
        Contact = new javax.swing.JButton();
        swat = new javax.swing.JButton();
        menuLeft = new javax.swing.JButton();
        menuMiddle = new javax.swing.JButton();
        menuRight = new javax.swing.JButton();
        MenuBar = new javax.swing.JLabel();
        suportIcon = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(374, 535));
        setPreferredSize(new java.awt.Dimension(374, 535));
        getContentPane().setLayout(null);

        ComputingBanner.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        ComputingBanner.setForeground(new java.awt.Color(255, 255, 255));
        ComputingBanner.setText("Computing Support");
        getContentPane().add(ComputingBanner);
        ComputingBanner.setBounds(60, 10, 290, 30);

        Revision.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Revision.setText("Revision");
        Revision.setMargin(new java.awt.Insets(2, -2, 2, -2));
        Revision.setOpaque(false);
        Revision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RevisionActionPerformed(evt);
            }
        });
        getContentPane().add(Revision);
        Revision.setBounds(140, 260, 80, 60);

        OneOnOneSupport.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        OneOnOneSupport.setText("<html>  1 on 1 <br> Support  </html>");
        OneOnOneSupport.setMargin(new java.awt.Insets(2, -2, 2, -2));
        OneOnOneSupport.setOpaque(false);
        OneOnOneSupport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneOnOneSupportActionPerformed(evt);
            }
        });
        getContentPane().add(OneOnOneSupport);
        OneOnOneSupport.setBounds(270, 330, 80, 60);

        Moodle.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Moodle.setText("Moodle");
        Moodle.setMargin(new java.awt.Insets(2, -2, 2, -2));
        Moodle.setOpaque(false);
        Moodle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoodleActionPerformed(evt);
            }
        });
        getContentPane().add(Moodle);
        Moodle.setBounds(270, 180, 80, 60);

        Contact.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Contact.setText("Contact");
        Contact.setMargin(new java.awt.Insets(2, -2, 2, -2));
        Contact.setOpaque(false);
        Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactActionPerformed(evt);
            }
        });
        getContentPane().add(Contact);
        Contact.setBounds(10, 330, 80, 60);

        swat.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        swat.setText("SWAT");
        swat.setMargin(new java.awt.Insets(2, -2, 2, -2));
        swat.setOpaque(false);
        swat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swatActionPerformed(evt);
            }
        });
        getContentPane().add(swat);
        swat.setBounds(10, 180, 80, 60);

        menuLeft.setContentAreaFilled(false);
        menuLeft.setPreferredSize(new java.awt.Dimension(50, 50));
        menuLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLeftActionPerformed(evt);
            }
        });
        getContentPane().add(menuLeft);
        menuLeft.setBounds(0, 450, 60, 50);

        menuMiddle.setContentAreaFilled(false);
        menuMiddle.setPreferredSize(new java.awt.Dimension(50, 50));
        menuMiddle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMiddleActionPerformed(evt);
            }
        });
        getContentPane().add(menuMiddle);
        menuMiddle.setBounds(150, 450, 60, 50);

        menuRight.setContentAreaFilled(false);
        menuRight.setPreferredSize(new java.awt.Dimension(50, 50));
        menuRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRightActionPerformed(evt);
            }
        });
        getContentPane().add(menuRight);
        menuRight.setBounds(310, 450, 50, 50);

        MenuBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nciapp/menuBar2.gif"))); // NOI18N
        MenuBar.setText("jLabel1");
        MenuBar.setPreferredSize(new java.awt.Dimension(360, 50));
        getContentPane().add(MenuBar);
        MenuBar.setBounds(0, 450, 360, 50);

        suportIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nciapp/mouse2.png"))); // NOI18N
        getContentPane().add(suportIcon);
        suportIcon.setBounds(100, 40, 270, 360);

        Wallpaper.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nciapp/wallpaper3.png"))); // NOI18N
        Wallpaper.setMaximumSize(new java.awt.Dimension(412, 500));
        getContentPane().add(Wallpaper);
        Wallpaper.setBounds(0, 0, 360, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RevisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RevisionActionPerformed
        // TODO add your handling code here:
        GUIRevision myRevision = new GUIRevision();
        myRevision.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RevisionActionPerformed

    private void menuLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLeftActionPerformed
        // TODO add your handling code here:
         GUIMainMenu myMainMenu = new GUIMainMenu();
        myMainMenu.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_menuLeftActionPerformed

    private void ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactActionPerformed
        // TODO add your handling code here:
        GUIContact myContact = new GUIContact();
        int count = 4;
        myContact.setCount(count);
        myContact.setFields();
        myContact.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ContactActionPerformed

    private void MoodleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoodleActionPerformed
        // TODO add your handling code here:
        GUIMoodle myMoodle = new GUIMoodle();
        myMoodle.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MoodleActionPerformed

    private void swatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swatActionPerformed
        // TODO add your handling code here:
        GUISWAT mySWAT = new GUISWAT();
        mySWAT.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_swatActionPerformed

    private void menuMiddleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMiddleActionPerformed
        // TODO add your handling code here:
        GUIMainMenu myMainMenu = new GUIMainMenu();
        myMainMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuMiddleActionPerformed

    private void OneOnOneSupportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneOnOneSupportActionPerformed
        // TODO add your handling code here:
        GUIOneOnOneSupport myOneOnOne = new GUIOneOnOneSupport();
        myOneOnOne.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_OneOnOneSupportActionPerformed

    private void menuRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRightActionPerformed
        // TODO add your handling code here:
        ArrayGUI myArrayGUI = new ArrayGUI();
        myArrayGUI.setVisible(true);
        this.setVisible(false);      
    }//GEN-LAST:event_menuRightActionPerformed

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
            java.util.logging.Logger.getLogger(GUIComputingSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIComputingSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIComputingSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIComputingSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GUIComputingSupport().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ComputingBanner;
    private javax.swing.JButton Contact;
    private javax.swing.JLabel MenuBar;
    private javax.swing.JButton Moodle;
    private javax.swing.JButton OneOnOneSupport;
    private javax.swing.JButton Revision;
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JButton menuLeft;
    private javax.swing.JButton menuMiddle;
    private javax.swing.JButton menuRight;
    private javax.swing.JLabel suportIcon;
    private javax.swing.JButton swat;
    // End of variables declaration//GEN-END:variables
}
