
package nciapp;

/**
 * NCI App
 * @author Sean Keeley 
 */
public class GUIMathSupport extends javax.swing.JFrame {

    /**
     * Creates new form Maths
     */
    public GUIMathSupport() {
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

        Quiz = new javax.swing.JButton();
        Support = new javax.swing.JButton();
        Contact = new javax.swing.JButton();
        Events = new javax.swing.JButton();
        TextTitle = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        forwardButton = new javax.swing.JButton();
        plusSign = new javax.swing.JLabel();
        menuBar = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(360, 500));
        setPreferredSize(new java.awt.Dimension(374, 535));
        getContentPane().setLayout(null);

        Quiz.setText("Quiz");
        Quiz.setToolTipText("");
        Quiz.setOpaque(false);
        Quiz.setPreferredSize(new java.awt.Dimension(50, 23));
        Quiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuizActionPerformed(evt);
            }
        });
        getContentPane().add(Quiz);
        Quiz.setBounds(60, 220, 100, 60);

        Support.setText("Support");
        Support.setToolTipText("");
        Support.setOpaque(false);
        Support.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupportActionPerformed(evt);
            }
        });
        getContentPane().add(Support);
        Support.setBounds(200, 220, 100, 60);

        Contact.setText("Contact");
        Contact.setToolTipText("");
        Contact.setOpaque(false);
        Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactActionPerformed(evt);
            }
        });
        getContentPane().add(Contact);
        Contact.setBounds(60, 290, 100, 60);

        Events.setText("Events");
        Events.setToolTipText("");
        Events.setOpaque(false);
        Events.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventsActionPerformed(evt);
            }
        });
        getContentPane().add(Events);
        Events.setBounds(200, 290, 100, 60);

        TextTitle.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        TextTitle.setForeground(new java.awt.Color(255, 255, 255));
        TextTitle.setText("Maths Support");
        getContentPane().add(TextTitle);
        TextTitle.setBounds(200, 0, 230, 80);

        backButton.setContentAreaFilled(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(0, 450, 60, 50);

        homeButton.setContentAreaFilled(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton);
        homeButton.setBounds(150, 450, 60, 50);

        forwardButton.setContentAreaFilled(false);
        getContentPane().add(forwardButton);
        forwardButton.setBounds(310, 450, 50, 50);

        plusSign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nciapp/plus_sign.jpg"))); // NOI18N
        getContentPane().add(plusSign);
        plusSign.setBounds(-50, -100, 440, 450);

        menuBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nciapp/menuBar.png"))); // NOI18N
        getContentPane().add(menuBar);
        menuBar.setBounds(0, 450, 360, 50);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nciapp/wallpaper3.png"))); // NOI18N
        Background.setPreferredSize(new java.awt.Dimension(374, 535));
        getContentPane().add(Background);
        Background.setBounds(0, -20, 699, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventsActionPerformed
        // TODO add your handling code here:
        GUIEvents myEvent = new GUIEvents();
        myEvent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EventsActionPerformed

    private void ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactActionPerformed
        // TODO add your handling code here:
        GUIContact myContact = new GUIContact();
        int count = 2;
        myContact.setCount(count);
        myContact.setFields();
        myContact.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ContactActionPerformed

    private void SupportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupportActionPerformed
        // TODO add your handling code here:
        GUISupport mySupport = new GUISupport();
        mySupport.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_SupportActionPerformed

    private void QuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuizActionPerformed
        // TODO add your handling code here:
        GUIQuiz myQuiz = new GUIQuiz();
        myQuiz.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_QuizActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        GUIMathSupport myMaths = new GUIMathSupport();
        myMaths.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        GUIMainMenu myMenu = new GUIMainMenu();
        myMenu.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_homeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUIMathSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMathSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMathSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMathSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GUIMathSupport().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Contact;
    private javax.swing.JButton Events;
    private javax.swing.JButton Quiz;
    private javax.swing.JButton Support;
    private javax.swing.JLabel TextTitle;
    private javax.swing.JButton backButton;
    private javax.swing.JButton forwardButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel menuBar;
    private javax.swing.JLabel plusSign;
    // End of variables declaration//GEN-END:variables
}
