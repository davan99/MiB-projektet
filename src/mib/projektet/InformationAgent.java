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
public class InformationAgent extends javax.swing.JFrame {
private InfDB idb;
private final String agentID;
    /**
     * Creates new form InformationAgent
     */
    public InformationAgent(InfDB idb, String agentID) {
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

        btnOmrådeschef = new javax.swing.JButton();
        btnTopplistaAgent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        angivenPlats = new javax.swing.JButton();
        RasSortering = new javax.swing.JButton();
        DatumAlien = new javax.swing.JButton();
        allFaktaAlien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOmrådeschef.setText("Se områdeschef - platser");
        btnOmrådeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOmrådeschefActionPerformed(evt);
            }
        });

        btnTopplistaAgent.setText("Toplista agenter");
        btnTopplistaAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopplistaAgentActionPerformed(evt);
            }
        });

        jLabel1.setText("Informations Center - Agent");

        angivenPlats.setText("Visa aliens på angiven plats");
        angivenPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angivenPlatsActionPerformed(evt);
            }
        });

        RasSortering.setText("Visa alla aliens av vis ras");
        RasSortering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RasSorteringActionPerformed(evt);
            }
        });

        DatumAlien.setText("Registerade aliens mellan vissa datum");
        DatumAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatumAlienActionPerformed(evt);
            }
        });

        allFaktaAlien.setText("All infomation om en alien");
        allFaktaAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allFaktaAlienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RasSortering, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DatumAlien)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(angivenPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnOmrådeschef, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTopplistaAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(allFaktaAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOmrådeschef, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(angivenPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RasSortering, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTopplistaAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(allFaktaAlien)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DatumAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DatumAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatumAlienActionPerformed
       new infoDatum(idb).setVisible(true);
    }//GEN-LAST:event_DatumAlienActionPerformed

    private void angivenPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angivenPlatsActionPerformed
        new infoAngivenPlats(idb).setVisible(true);
    }//GEN-LAST:event_angivenPlatsActionPerformed

    private void RasSorteringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RasSorteringActionPerformed
        new infoRas(idb).setVisible(true);
    }//GEN-LAST:event_RasSorteringActionPerformed

    private void btnTopplistaAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopplistaAgentActionPerformed
        new infoTopLista(idb).setVisible(true);
    }//GEN-LAST:event_btnTopplistaAgentActionPerformed

    private void allFaktaAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allFaktaAlienActionPerformed
       new infoAllFaktaAlien(idb).setVisible(true);
    }//GEN-LAST:event_allFaktaAlienActionPerformed

    private void btnOmrådeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOmrådeschefActionPerformed
        new infoOmradeschef(idb).setVisible(true);
    }//GEN-LAST:event_btnOmrådeschefActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DatumAlien;
    private javax.swing.JButton RasSortering;
    private javax.swing.JButton allFaktaAlien;
    private javax.swing.JButton angivenPlats;
    private javax.swing.JButton btnOmrådeschef;
    private javax.swing.JButton btnTopplistaAgent;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
