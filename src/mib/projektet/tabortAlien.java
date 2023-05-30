/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.projektet;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author oskarjolesjo
 */
public class tabortAlien extends javax.swing.JFrame {

    private final String agentID;
    private InfDB idb;

    /**
     * Creates new form Utrustning
     */
    public tabortAlien(InfDB idb, String agentID) {
        initComponents();
        this.idb = idb;
        this.agentID = agentID;
//        fyllCombo();
        fyllCombo2();
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
        btnTabortAlien = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textRuta = new javax.swing.JTextArea();
        lblSkrivInUtrustning = new javax.swing.JLabel();
        comboValjTabortAlien = new javax.swing.JComboBox<>();
        btnVisaIdNamn = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Kaiti SC", 1, 24)); // NOI18N
        jLabel1.setText("Ta bort Alien");

        btnTabortAlien.setText("Ta bort");
        btnTabortAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabortAlienActionPerformed(evt);
            }
        });

        textRuta.setColumns(20);
        textRuta.setRows(5);
        jScrollPane1.setViewportView(textRuta);

        lblSkrivInUtrustning.setText("Välj Alien ID att ta bort:");

        comboValjTabortAlien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboValjTabortAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboValjTabortAlienActionPerformed(evt);
            }
        });

        btnVisaIdNamn.setText("Visa Aliens ID och namn:");
        btnVisaIdNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaIdNamnActionPerformed(evt);
            }
        });

        btnAvbryt.setText("Avbryt");
        btnAvbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvbrytActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVisaIdNamn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblSkrivInUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(comboValjTabortAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAvbryt)
                            .addGap(18, 18, 18)
                            .addComponent(btnTabortAlien)))
                    .addComponent(jLabel1))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnVisaIdNamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSkrivInUtrustning)
                    .addComponent(comboValjTabortAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTabortAlien)
                    .addComponent(btnAvbryt))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTabortAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabortAlienActionPerformed
        String valdAlien = comboValjTabortAlien.getSelectedItem().toString();
//   String agentensID = comboValjAgent.getSelectedItem().toString();

        if (valdAlien != null)
try {
            idb.delete("DELETE FROM boglodite WHERE Alien_ID = " + valdAlien);
            idb.delete("DELETE FROM squid WHERE Alien_ID = " + valdAlien);
            idb.delete("DELETE FROM worm WHERE Alien_ID = " + valdAlien);
            idb.delete("Delete from Alien where Alien.Alien_ID = " + valdAlien);
            JOptionPane.showMessageDialog(this, "Alien har tagits bort!");
//        return;

//    JOptionPane.showMessageDialog(this, "Utrustningen har tagits bort");
        } catch (InfException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ett fel uppstod: " + e.getMessage());
        }


    }//GEN-LAST:event_btnTabortAlienActionPerformed

    private void comboValjTabortAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboValjTabortAlienActionPerformed

        String valdAlien = comboValjTabortAlien.getSelectedItem().toString();
        fyllCombo2();
        comboValjTabortAlien.setSelectedItem(valdAlien);
    }//GEN-LAST:event_comboValjTabortAlienActionPerformed

    private void btnVisaIdNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaIdNamnActionPerformed
        textRuta.setText("");

        ArrayList<HashMap<String, String>> soktAlien;

        try {

            String sqlFraga = "select Alien_ID, Namn from Alien ORDER BY Alien_ID ASC";
            soktAlien = idb.fetchRows(sqlFraga);

            for (HashMap<String, String> aliens : soktAlien) {

                textRuta.append(aliens.get("Alien_ID") + " " + aliens.get("Namn") + "\n");

            }
        } catch (InfException e) {
            System.out.println("fel" + e.getMessage());
        }

    }//GEN-LAST:event_btnVisaIdNamnActionPerformed

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAvbrytActionPerformed

    private void fyllCombo2() {

        String sqlFraga = "select Alien_ID from Alien ORDER BY Alien_ID ASC";
        ArrayList<String> allaAliens;

        try {
            allaAliens = idb.fetchColumn(sqlFraga);

            comboValjTabortAlien.setModel(new DefaultComboBoxModel<>(allaAliens.toArray(new String[0])));
        } catch (InfException e) {
            System.out.println("fel" + e.getMessage());
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnTabortAlien;
    private javax.swing.JButton btnVisaIdNamn;
    private javax.swing.JComboBox<String> comboValjTabortAlien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSkrivInUtrustning;
    private javax.swing.JTextArea textRuta;
    // End of variables declaration//GEN-END:variables
}
