/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.projektet;

import java.util.ArrayList;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author oskarjolesjo
 */
public class Utrustning extends javax.swing.JFrame {
    private final String agentID;
    private InfDB idb;
    /**
     * Creates new form Utrustning
     */
    public Utrustning(InfDB idb, String agentID) {
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
        laggTillUtrustning = new javax.swing.JButton();
        visaUtrustning = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textRuta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Kaiti SC", 1, 24)); // NOI18N
        jLabel1.setText("Utrustning");

        laggTillUtrustning.setText("Lägg till utrustning");

        visaUtrustning.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        visaUtrustning.setText("Visa Utrustning");
        visaUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaUtrustningActionPerformed(evt);
            }
        });

        textRuta.setColumns(20);
        textRuta.setRows(5);
        jScrollPane1.setViewportView(textRuta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(laggTillUtrustning))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(visaUtrustning))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(laggTillUtrustning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(visaUtrustning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visaUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaUtrustningActionPerformed
        textRuta.setText("");
        ArrayList<String> allUtrustning;
        try {
           
            String sqlFraga = "select Benamning from Utrustning join Innehar_Utrustning IU on Utrustning.Utrustnings_ID = IU.Utrustnings_ID where Agent_ID ='" +agentID + "'";
            allUtrustning = idb.fetchColumn(sqlFraga);

            for (String utrustning : allUtrustning) {
                textRuta.append(utrustning + "\n");
            }
        } catch (InfException e) {
            System.out.println("fel" + e.getMessage());

        }
    }//GEN-LAST:event_visaUtrustningActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton laggTillUtrustning;
    private javax.swing.JTextArea textRuta;
    private javax.swing.JButton visaUtrustning;
    // End of variables declaration//GEN-END:variables
}
