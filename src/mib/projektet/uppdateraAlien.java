/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.projektet;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author oskarjolesjo
 */
public class uppdateraAlien extends javax.swing.JFrame {
private InfDB idb;
    /**
     * Creates new form uppdateraAgent
     */
    public uppdateraAlien(InfDB idb) {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboAlien = new javax.swing.JComboBox<>();
        alienid = new javax.swing.JTextField();
        regdatum = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        namn = new javax.swing.JTextField();
        telefon = new javax.swing.JTextField();
        plats = new javax.swing.JTextField();
        losenord = new javax.swing.JTextField();
        ansvarigAgent = new javax.swing.JTextField();
        visaUppgifter = new javax.swing.JButton();
        uppdateraAlien = new javax.swing.JButton();
        nuvarandeAlienID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Uppdatera Alien");

        jLabel2.setText("Alien-ID");

        jLabel3.setText("Reg-Datum");

        jLabel4.setText("Lösenord");

        jLabel5.setText("Namn");

        jLabel6.setText("Telefon");

        jLabel7.setText("Plats");

        jLabel8.setText("Ansvarig Agent");

        jLabel9.setText("Välj Alien");

        alienid.setColumns(8);
        alienid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienidActionPerformed(evt);
            }
        });

        regdatum.setColumns(8);
        regdatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regdatumActionPerformed(evt);
            }
        });

        jTextField3.setText("jTextField2");

        namn.setColumns(8);

        telefon.setColumns(8);

        plats.setColumns(8);

        losenord.setColumns(8);

        ansvarigAgent.setColumns(8);

        visaUppgifter.setText("Visa Uppgifter");
        visaUppgifter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaUppgifterActionPerformed(evt);
            }
        });

        uppdateraAlien.setText("Uppdatera Alien");
        uppdateraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uppdateraAlienActionPerformed(evt);
            }
        });

        nuvarandeAlienID.setText("Nuvarande ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(ansvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(uppdateraAlien)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(visaUppgifter)
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(losenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alienid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(comboAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addGap(0, 404, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(nuvarandeAlienID)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(571, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(alienid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(regdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(visaUppgifter)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(losenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuvarandeAlienID))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(plats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ansvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(uppdateraAlien)
                        .addGap(37, 37, 37))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(246, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alienidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alienidActionPerformed

    private void regdatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regdatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regdatumActionPerformed

    private void visaUppgifterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaUppgifterActionPerformed
        nuvarandeAlienID.setText("");
        alienid.setText("");
        regdatum.setText("");
        telefon.setText("");
        namn.setText("");
        plats.setText("");
        losenord.setText("");
        ansvarigAgent.setText("");
        ArrayList<HashMap<String, String>> soktaAliens;

        try {
            String valdAlien = comboAlien.getSelectedItem().toString();
            String sqlFraga = "SELECT * FROM alien WHERE alien.Namn = '" + valdAlien + "'";
            soktaAliens = idb.fetchRows(sqlFraga);

            for (HashMap<String, String> alien : soktaAliens) {
                nuvarandeAlienID.setText(alien.get("Alien_ID"));
                alienid.setText(alien.get("Alien_ID"));
                regdatum.setText(alien.get("Registreringsdatum"));
                telefon.setText(alien.get("Telefon"));
                namn.setText(alien.get("Namn"));
                plats.setText(alien.get("Plats"));
                losenord.setText(alien.get("Losenord"));
                ansvarigAgent.setText(alien.get("Ansvarig_Agent"));

            }
        } catch (InfException e) {
            System.out.println("fel" + e.getMessage());
        }
    }//GEN-LAST:event_visaUppgifterActionPerformed

    private void uppdateraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uppdateraAlienActionPerformed
        try {
        String alienID = nuvarandeAlienID.getText();
        String nyttAlienID = alienid.getText();
        String nyttRegDatum = regdatum.getText();
        String nyTelefon = telefon.getText();
        String nyttNamn = namn.getText();
        String nyPlats = plats.getText();
        String nyttLosenord = losenord.getText();
        String nyttAnsvarigAgent = ansvarigAgent.getText();
        
   String sqlFraga = "UPDATE alien SET Alien_ID = '" + nyttAlienID + "', Registreringsdatum = '" + nyttRegDatum + "', Telefon = '" + nyTelefon + "', Namn = '" + nyttNamn + "', Plats = '" + nyPlats + "', Losenord = '" + nyttLosenord + "', Ansvarig_Agent = '" + nyttAnsvarigAgent + "' WHERE Alien_ID = " + alienID;
        idb.update(sqlFraga);

        JOptionPane.showMessageDialog(null, "Alien har uppdaterats.");
    } catch (InfException e) {
        System.out.println("Fel: " + e.getMessage());
    }

    }//GEN-LAST:event_uppdateraAlienActionPerformed

    /**
     * @param args the command line arguments
     */
    private void fyllCombo() {
        String sqlFraga = " SELECT namn from alien";
        ArrayList<String> allaAlien;

        try {
            allaAlien = idb.fetchColumn(sqlFraga);

            for (String alien : allaAlien) {
                comboAlien.addItem(alien);
            }
        } 
        catch (InfException e) {
            System.out.println("fel" + e.getMessage());
        }
    }
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alienid;
    private javax.swing.JTextField ansvarigAgent;
    private javax.swing.JComboBox<String> comboAlien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField losenord;
    private javax.swing.JTextField namn;
    private javax.swing.JLabel nuvarandeAlienID;
    private javax.swing.JTextField plats;
    private javax.swing.JTextField regdatum;
    private javax.swing.JTextField telefon;
    private javax.swing.JButton uppdateraAlien;
    private javax.swing.JButton visaUppgifter;
    // End of variables declaration//GEN-END:variables
}