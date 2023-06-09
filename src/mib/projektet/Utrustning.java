/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.projektet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
        btnLaggTillUtrustning = new javax.swing.JButton();
        btnVisaUtrustning = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textRuta = new javax.swing.JTextArea();
        lblSkrivInUtrustning = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAngeDatum = new javax.swing.JTextField();
        txtAngeUtrustningId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Kaiti SC", 1, 24)); // NOI18N
        jLabel1.setText("Utrustning");

        btnLaggTillUtrustning.setText("Lägg till ");
        btnLaggTillUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillUtrustningActionPerformed(evt);
            }
        });

        btnVisaUtrustning.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        btnVisaUtrustning.setText("Visa befintlig utrustning");
        btnVisaUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaUtrustningActionPerformed(evt);
            }
        });

        textRuta.setColumns(20);
        textRuta.setRows(5);
        jScrollPane1.setViewportView(textRuta);

        lblSkrivInUtrustning.setText("Välj utrustning: 1-4");

        jLabel2.setText("Datum för utkvittering:");

        txtAngeDatum.setText("yyyy-MM-dd");
        txtAngeDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAngeDatumActionPerformed(evt);
            }
        });

        txtAngeUtrustningId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAngeUtrustningIdActionPerformed(evt);
            }
        });

        jLabel3.setText("1. Noisy Cricket");

        jLabel4.setText("2. Carbonizer");

        jLabel5.setText("3. Neuralyzer");

        jLabel6.setText("4. Communicater");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel7.setText("Utrusting du kan lägga till:");

        tillbaka.setText("Tillbaka");
        tillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSkrivInUtrustning, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAngeDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAngeUtrustningId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLaggTillUtrustning)))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tillbaka)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVisaUtrustning))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tillbaka))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAngeDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSkrivInUtrustning)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnLaggTillUtrustning)
                                .addComponent(txtAngeUtrustningId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addComponent(btnVisaUtrustning)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6)))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisaUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaUtrustningActionPerformed
        textRuta.setText("");
        ArrayList<String> allUtrustning;

        try {

            String sqlFraga = "select Benamning from Utrustning join Innehar_Utrustning IU on Utrustning.Utrustnings_ID = IU.Utrustnings_ID where Agent_ID ='" + agentID + "'";
            allUtrustning = idb.fetchColumn(sqlFraga);

            for (String utrustning : allUtrustning) {
                textRuta.append(utrustning + "\n");
            }
        } catch (InfException e) {
            System.out.println("fel" + e.getMessage());

        }
    }//GEN-LAST:event_btnVisaUtrustningActionPerformed

    private void btnLaggTillUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillUtrustningActionPerformed

        String valdUtrustning = txtAngeUtrustningId.getText();
        String datum = txtAngeDatum.getText();

        try {

            SimpleDateFormat datumFormat = new SimpleDateFormat("yyyy-MM-dd");
            datumFormat.parse(datum);
            datumFormat.setLenient(false);

            String sqlFragaFinnsUtrustning = "SELECT * FROM utrustning WHERE utrustnings_id = '" + valdUtrustning + "'";
            if (idb.fetchSingle(sqlFragaFinnsUtrustning) == null) {
                JOptionPane.showMessageDialog(this, "Ange ett tal mellan 1-4.");
                return;
            }

            String sqlFraga = "INSERT INTO innehar_utrustning (Utrustnings_ID, Agent_ID, Utkvitteringsdatum) "
                    + "VALUES (" + valdUtrustning + ", '" + agentID + "', '" + datum + "')";
            idb.insert(sqlFraga);
            JOptionPane.showMessageDialog(this, "Utrustningen har lagts till.");

        } catch (InfException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ett fel uppstod: " + e.getMessage());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Ange datum i rätt format, yyyy-MM-dd!");

        }


    }//GEN-LAST:event_btnLaggTillUtrustningActionPerformed

    private void txtAngeDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAngeDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAngeDatumActionPerformed

    private void txtAngeUtrustningIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAngeUtrustningIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAngeUtrustningIdActionPerformed

    private void tillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tillbakaActionPerformed
        this.dispose();
    }//GEN-LAST:event_tillbakaActionPerformed

//    private void fyllCombo() {
//        String sqlFraga = "SELECT Benamning FROM utrustning";
//        ArrayList<String> allUtrustning;
//
//        try {
//            allUtrustning = idb.fetchColumn(sqlFraga);
//
//            for (String utrustning : allUtrustning) {
//                comboAllUtrustning.addItem(utrustning);
//            }
//        } 
//        catch (InfException e) {
//            System.out.println("fel" + e.getMessage());
//        }
//
//    /**
//     * @param args the command line arguments
//     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTillUtrustning;
    private javax.swing.JButton btnVisaUtrustning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSkrivInUtrustning;
    private javax.swing.JTextArea textRuta;
    private javax.swing.JButton tillbaka;
    private javax.swing.JTextField txtAngeDatum;
    private javax.swing.JTextField txtAngeUtrustningId;
    // End of variables declaration//GEN-END:variables
}
