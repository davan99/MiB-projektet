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
public class infoAngivenPlats extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form infoAngivenPlats
     */
    public infoAngivenPlats(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllCombo();
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
        jLabel2 = new javax.swing.JLabel();
        comboPlats = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textRuta = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 24)); // NOI18N
        jLabel1.setText("Visa aliens över angiven plats");

        jLabel2.setText("Välj plats");

        comboPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPlatsActionPerformed(evt);
            }
        });

        textRuta.setColumns(20);
        textRuta.setRows(5);
        jScrollPane1.setViewportView(textRuta);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(comboPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPlatsActionPerformed

        textRuta.setText("");
        ArrayList<String> soktaAliens;

        try {

            String valdPlats = comboPlats.getSelectedItem().toString();
            String sqlFraga = "SELECT Namn from Alien join plats on Plats_ID = Alien.Plats where benamning = '" + valdPlats + "'";
            soktaAliens = idb.fetchColumn(sqlFraga);

            for (String alienNamn : soktaAliens) {
                textRuta.append(alienNamn + "\n");
            }
        } catch (InfException e) {
            System.out.println("fel" + e.getMessage());

        }

    }//GEN-LAST:event_comboPlatsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fyllCombo() {
        String sqlFraga = " select benamning from plats";
        ArrayList<String> allaPlatser;

        try {
            allaPlatser = idb.fetchColumn(sqlFraga);

            for (String plats : allaPlatser) {
                comboPlats.addItem(plats);
            }
        } catch (InfException e) {
            System.out.println("fel" + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboPlats;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textRuta;
    // End of variables declaration//GEN-END:variables
}
