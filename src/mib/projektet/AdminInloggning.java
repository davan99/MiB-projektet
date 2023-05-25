
package mib.projektet;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AdminInloggning extends javax.swing.JFrame {

    private InfDB idb;
    
    public AdminInloggning(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAdminInlogg = new javax.swing.JLabel();
        txtEpost = new javax.swing.JLabel();
        txtLösenord = new javax.swing.JLabel();
        angeLosenord = new javax.swing.JPasswordField();
        angeEpost = new javax.swing.JTextField();
        btnLoggaIn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAdminInlogg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAdminInlogg.setText("Inloggning Administratör ");

        txtEpost.setText("Epost:");

        txtLösenord.setText("Lösenord:");

        angeLosenord.setText("planka");

        angeEpost.setColumns(5);
        angeEpost.setText("ao@mib.net");
        angeEpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angeEpostActionPerformed(evt);
            }
        });

        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLösenord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEpost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btnLoggaIn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(angeLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angeEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblAdminInlogg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblAdminInlogg, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angeEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEpost))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angeLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLösenord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoggaIn)
                    .addComponent(jButton1))
                .addGap(107, 107, 107))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
      
        // Jämför inmatad info mot databasen och kontrollerar så att användaren har adminbehörighet.

        String epost = angeEpost.getText();
        char[] charLosenord = angeLosenord.getPassword();
        String losenord = new String(charLosenord);

        if ( Validering.kollaTomRuta(angeEpost) && ( Validering.kollaTomRuta2(angeLosenord)))
        
        try {
            String sqlFraga = "SELECT losenord FROM agent WHERE Epost = '" + epost + "'";
            String getAgentID = "SELECT Agent_ID FROM agent WHERE Epost = '" + epost + "'";
            String agentID = idb.fetchSingle(getAgentID);
            String sqlFragaAdmin = "SELECT Administrator FROM agent WHERE Agent_ID = " + agentID;
            String sqlSvarLosenord = idb.fetchSingle(sqlFraga);
            String sqlSvarAdmin = idb.fetchSingle(sqlFragaAdmin);

            if (sqlSvarLosenord != null && losenord.equals(sqlSvarLosenord) && sqlSvarAdmin.equals("J")) {
                dispose();
                new AdminStartsida(idb, agentID).setVisible(true);
            } else if (sqlSvarLosenord != null && losenord.equals(sqlSvarLosenord) && sqlSvarAdmin.equals("N")) {
                JOptionPane.showMessageDialog(null, "Du är inte en administratör, byt till agent inlogg.");
            } else {
                JOptionPane.showMessageDialog(null, "E-post eller lösenord är felaktigt.");
            }
        } catch (InfException e) {
            System.out.println("fel" + e.getMessage());
        }

    }//GEN-LAST:event_btnLoggaInActionPerformed

    private void angeEpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angeEpostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_angeEpostActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angeEpost;
    private javax.swing.JPasswordField angeLosenord;
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAdminInlogg;
    private javax.swing.JLabel txtEpost;
    private javax.swing.JLabel txtLösenord;
    // End of variables declaration//GEN-END:variables
}
