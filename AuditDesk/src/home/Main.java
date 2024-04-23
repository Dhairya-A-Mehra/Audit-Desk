/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package home;

/**
 *
 * @author Rutu Bhanderi
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
        setButtonTooltips();
    }
    private String loggedInUsername; // Variable to store the logged-in username
    
    // Constructor with parameter to set the logged-in username
    public Main(String username) {
        this.loggedInUsername = username;
        
        initComponents();
        MidSemButton.setEnabled(true);
        EndSemButton.setEnabled(true);
        setButtonTooltips();
        user_name.setText(loggedInUsername);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void setButtonTooltips() {
        if (!MidSemButton.isEnabled()) {
            MidSemButton.setToolTipText("Sign In to perform Mid Semester audit");
        } else {
            MidSemButton.setToolTipText("Click to perform Mid Semester audit"); // Remove tooltip if button is enabled
        }
        
        if (!EndSemButton.isEnabled()) {
            EndSemButton.setToolTipText("Sign In to perform End Semester audit");
        } else {
            EndSemButton.setToolTipText("Click to perform End Semester audit"); // Remove tooltip if button is enabled
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        HeaderName = new javax.swing.JLabel();
        headerIcon = new javax.swing.JLabel();
        page = new javax.swing.JPanel();
        header2 = new javax.swing.JPanel();
        SignUp = new javax.swing.JLabel();
        SignIn = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        AddFacultyLabel = new javax.swing.JLabel();
        auditTypePanel = new javax.swing.JPanel();
        AuditTypeLabel = new javax.swing.JLabel();
        MidSemButton = new javax.swing.JButton();
        EndSemButton = new javax.swing.JButton();
        auditImagePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));
        setResizable(false);

        Header.setBackground(new java.awt.Color(255, 204, 204));
        Header.setPreferredSize(new java.awt.Dimension(800, 125));

        HeaderName.setBackground(new java.awt.Color(255, 255, 255));
        HeaderName.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        HeaderName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderName.setText("Audit Desk");

        headerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo1.png"))); // NOI18N

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(headerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HeaderName, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(headerIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        page.setBackground(new java.awt.Color(255, 204, 255));

        header2.setBackground(new java.awt.Color(204, 204, 255));

        SignUp.setForeground(new java.awt.Color(51, 0, 204));
        SignUp.setText("Sign Up");
        SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpMouseClicked(evt);
            }
        });

        SignIn.setForeground(new java.awt.Color(0, 51, 204));
        SignIn.setText("Sign In");
        SignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInMouseClicked(evt);
            }
        });

        username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/UserProfile.png"))); // NOI18N

        user_name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        user_name.setText("Unsigned User");
        user_name.setToolTipText("");

        AddFacultyLabel.setForeground(new java.awt.Color(0, 51, 204));
        AddFacultyLabel.setText("Add Faculty");
        AddFacultyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddFacultyLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout header2Layout = new javax.swing.GroupLayout(header2);
        header2.setLayout(header2Layout);
        header2Layout.setHorizontalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddFacultyLabel)
                .addGap(40, 40, 40)
                .addComponent(SignIn)
                .addGap(37, 37, 37)
                .addComponent(SignUp)
                .addGap(16, 16, 16))
        );
        header2Layout.setVerticalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SignUp)
                        .addComponent(SignIn)
                        .addComponent(user_name)
                        .addComponent(AddFacultyLabel)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        auditTypePanel.setBackground(new java.awt.Color(153, 255, 204));

        AuditTypeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AuditTypeLabel.setText("Select Audit Type :");

        MidSemButton.setBackground(new java.awt.Color(204, 204, 255));
        MidSemButton.setText("Mid Semester");
        MidSemButton.setEnabled(false);
        MidSemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MidSemButtonActionPerformed(evt);
            }
        });

        EndSemButton.setBackground(new java.awt.Color(204, 204, 255));
        EndSemButton.setText("End Semester");
        EndSemButton.setToolTipText("");
        EndSemButton.setEnabled(false);

        javax.swing.GroupLayout auditTypePanelLayout = new javax.swing.GroupLayout(auditTypePanel);
        auditTypePanel.setLayout(auditTypePanelLayout);
        auditTypePanelLayout.setHorizontalGroup(
            auditTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(auditTypePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(AuditTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(auditTypePanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(MidSemButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(EndSemButton)
                .addGap(98, 98, 98))
        );
        auditTypePanelLayout.setVerticalGroup(
            auditTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(auditTypePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(AuditTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(auditTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MidSemButton)
                    .addComponent(EndSemButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        auditImagePanel.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/audit.png"))); // NOI18N

        javax.swing.GroupLayout auditImagePanelLayout = new javax.swing.GroupLayout(auditImagePanel);
        auditImagePanel.setLayout(auditImagePanelLayout);
        auditImagePanelLayout.setHorizontalGroup(
            auditImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );
        auditImagePanelLayout.setVerticalGroup(
            auditImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pageLayout = new javax.swing.GroupLayout(page);
        page.setLayout(pageLayout);
        pageLayout.setHorizontalGroup(
            pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(header2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pageLayout.createSequentialGroup()
                .addComponent(auditTypePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(auditImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pageLayout.setVerticalGroup(
            pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageLayout.createSequentialGroup()
                .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(auditTypePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(auditImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(page, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInMouseClicked
        
        new SignIn().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SignInMouseClicked

    private void SignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpMouseClicked
        //new SignUp().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SignUpMouseClicked

    private void MidSemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MidSemButtonActionPerformed
        new FacultyInfo().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MidSemButtonActionPerformed

    private void AddFacultyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddFacultyLabelMouseClicked
            new AddFaculty().setVisible(true);
            this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_AddFacultyLabelMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddFacultyLabel;
    private javax.swing.JLabel AuditTypeLabel;
    private javax.swing.JButton EndSemButton;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel HeaderName;
    private javax.swing.JButton MidSemButton;
    private javax.swing.JLabel SignIn;
    private javax.swing.JLabel SignUp;
    private javax.swing.JPanel auditImagePanel;
    private javax.swing.JPanel auditTypePanel;
    private javax.swing.JPanel header2;
    private javax.swing.JLabel headerIcon;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel page;
    private javax.swing.JLabel user_name;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
