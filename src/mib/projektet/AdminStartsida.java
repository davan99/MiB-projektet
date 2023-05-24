/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.projektet;
import oru.inf.InfDB;
/**
 *
 * @author oskarjolesjo
 */
public class AdminStartsida extends javax.swing.JFrame {
private InfDB idb;
private final String agentID;
    /**
     * Creates new form AdminStartsida
     */
    public AdminStartsida(InfDB idb, String agentID) {
        initComponents();
        this.idb = idb;
        this.agentID = agentID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        informationAdmin = new javax.swing.JButton();
        Agentreg = new javax.swing.JButton();
        uppdateraAlien = new javax.swing.JButton();
        omradesKontorChef = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Välkommen Administratör");

        jButton1.setText("Ändra lösenord");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrera Alien");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Uppdatera Agent");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        informationAdmin.setText("Information");
        informationAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationAdminActionPerformed(evt);
            }
        });

        Agentreg.setText("Registera Agent");
        Agentreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgentregActionPerformed(evt);
            }
        });

        uppdateraAlien.setText("Uppdatera Alien");
        uppdateraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uppdateraAlienActionPerformed(evt);
            }
        });

        omradesKontorChef.setText("Ändra Områdeschef & kontrorchef");
        omradesKontorChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omradesKontorChefActionPerformed(evt);
            }
        });

        jButton4.setText("Logga ut");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(omradesKontorChef)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uppdateraAlien)
                            .addComponent(jButton3)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(informationAdmin)
                            .addComponent(Agentreg)
                            .addComponent(jButton2))
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(informationAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uppdateraAlien)
                    .addComponent(Agentreg))
                .addGap(18, 18, 18)
                .addComponent(omradesKontorChef)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new andraLosenord(idb, agentID).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new hanteraAlien(idb).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AgentregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgentregActionPerformed
     new hanteraAgenter(idb).setVisible(true);
    }//GEN-LAST:event_AgentregActionPerformed

    private void informationAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informationAdminActionPerformed
       new informationAdmin(idb).setVisible(true);
    }//GEN-LAST:event_informationAdminActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new uppdateraAgent(idb).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void uppdateraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uppdateraAlienActionPerformed
       new uppdateraAlien(idb).setVisible(true);
    }//GEN-LAST:event_uppdateraAlienActionPerformed

    private void omradesKontorChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omradesKontorChefActionPerformed
        new andraOmradesKontorsChef(idb).setVisible(true);
    }//GEN-LAST:event_omradesKontorChefActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agentreg;
    private javax.swing.JButton informationAdmin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton omradesKontorChef;
    private javax.swing.JButton uppdateraAlien;
    // End of variables declaration//GEN-END:variables
}
