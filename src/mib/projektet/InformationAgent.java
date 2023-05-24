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
        jButton1 = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RasSortering, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DatumAlien))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(angivenPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOmrådeschef, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(allFaktaAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnTopplistaAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOmrådeschef, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTopplistaAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angivenPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allFaktaAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RasSortering, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DatumAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
