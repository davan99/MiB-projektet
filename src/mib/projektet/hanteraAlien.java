/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.projektet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author oskarjolesjo
 */
public class hanteraAlien extends javax.swing.JFrame {
private InfDB idb;
    /**
     * Creates new form hanteraAlien
     */
    public hanteraAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lblRegistreraNyAlien = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblEpost = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblOmrade = new javax.swing.JLabel();
        lblAnsvarigAgent = new javax.swing.JLabel();
        txtAngeNamn = new javax.swing.JTextField();
        txtAngeEpost = new javax.swing.JTextField();
        txtAngeTelefon = new javax.swing.JTextField();
        btnLaggTill = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();
        pwAngeLosenord = new javax.swing.JPasswordField();
        lblRegDatum = new javax.swing.JLabel();
        txtRegDatum = new javax.swing.JTextField();
        txtAngeOmrade = new javax.swing.JTextField();
        txtAngeAgent = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTilldelaId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRegistreraNyAlien.setText("Registrera ny Alien");

        lblNamn.setText("Namn:");

        lblEpost.setText("E-post:");

        lblLosenord.setText("Lösenord:");

        lblTelefon.setText("Telefonnummer:");

        lblOmrade.setText("Område:");

        lblAnsvarigAgent.setText("Ansvarig agent:");

        btnLaggTill.setText("Lägg till");
        btnLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillActionPerformed(evt);
            }
        });

        btnAvbryt.setText("Avbryt");
        btnAvbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvbrytActionPerformed(evt);
            }
        });

        pwAngeLosenord.setText("lösenord");

        lblRegDatum.setText("Reg.datum:");

        txtRegDatum.setText("yyyy-mm-dd");
        txtRegDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegDatumActionPerformed(evt);
            }
        });

        txtAngeAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAngeAgentActionPerformed(evt);
            }
        });

        jLabel1.setText("Tilldela ID:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAvbryt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLaggTill)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAngeOmrade)
                            .addComponent(txtAngeTelefon)
                            .addComponent(txtAngeEpost)
                            .addComponent(pwAngeLosenord)
                            .addComponent(txtAngeAgent)
                            .addComponent(txtTilldelaId)
                            .addComponent(txtAngeNamn)
                            .addComponent(txtRegDatum)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(lblRegistreraNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistreraNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegDatum)
                    .addComponent(txtRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAngeNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAngeEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEpost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLosenord)
                    .addComponent(pwAngeLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefon)
                    .addComponent(txtAngeTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOmrade)
                    .addComponent(txtAngeOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnsvarigAgent)
                    .addComponent(txtAngeAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTilldelaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaggTill)
                    .addComponent(btnAvbryt))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillActionPerformed

        String datum = txtRegDatum.getText();
        String namn = txtAngeNamn.getText();
        String epost = txtAngeEpost.getText();
        String losenord = pwAngeLosenord.getText();
        String telefon = txtAngeTelefon.getText();
        String omrade = txtAngeOmrade.getText();
        String agent = txtAngeAgent.getText();
        String id = txtTilldelaId.getText();

        try {

            SimpleDateFormat datumFormat = new SimpleDateFormat("yyyy-MM-dd");
            datumFormat.parse(datum);
            datumFormat.setLenient(false);

            String sqlFragaFinnsEpost = "SELECT * FROM alien WHERE epost = '" + epost + "'";
            if (idb.fetchSingle(sqlFragaFinnsEpost) != null) {
                JOptionPane.showMessageDialog(this, "E-postadressen finns redan i databasen.");
                return;
            }

            String sqlFragaFinnsId = "SELECT * FROM alien WHERE Alien_id = " + id;
            if (idb.fetchSingle(sqlFragaFinnsId) != null) {
                JOptionPane.showMessageDialog(this, "Alien-id finns redan i databasen.");
                return;

            }

            if (!Validering.valideraTelefonnummer(telefon)) {
                JOptionPane.showMessageDialog(this, "Telefonnummer kan endast innehålla siffror.");
                return;
            }
            if (!Validering.valideraOmradeID(omrade)) {
                JOptionPane.showMessageDialog(this, "Ogiltigt omradeID. Endast 1 = Svealand, 2 = Götaland eller 4 = Norrland är tillåtna.");
                return;
            }
            if (!Validering.agentFinnsIDatabas(idb, agent)) {
                JOptionPane.showMessageDialog(this, "Ogiltig ansvarig agent. Agenten finns inte i databasen.");
                return;
            }

            String sqlFraga = "INSERT INTO alien (Alien_id, registreringsdatum, epost, losenord, namn, telefon, plats, ansvarig_agent) "
                    + "VALUES (" + id + ", '" + datum + "', '" + epost + "', '" + losenord + "', '" + namn + "', '" + telefon + "', '" + omrade + "', '" + agent + "')";

            idb.insert(sqlFraga);
            JOptionPane.showMessageDialog(this, "Alien har lagts till i databasen.");

        } catch (InfException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ett fel uppstod: " + e.getMessage());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Ange datum i rätt format, yyyy-MM-dd!");

        }


    }//GEN-LAST:event_btnLaggTillActionPerformed

    private void txtRegDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegDatumActionPerformed

    private void txtAngeAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAngeAgentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAngeAgentActionPerformed

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAvbrytActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnLaggTill;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblAnsvarigAgent;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblOmrade;
    private javax.swing.JLabel lblRegDatum;
    private javax.swing.JLabel lblRegistreraNyAlien;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JPasswordField pwAngeLosenord;
    private javax.swing.JTextField txtAngeAgent;
    private javax.swing.JTextField txtAngeEpost;
    private javax.swing.JTextField txtAngeNamn;
    private javax.swing.JTextField txtAngeOmrade;
    private javax.swing.JTextField txtAngeTelefon;
    private javax.swing.JTextField txtRegDatum;
    private javax.swing.JTextField txtTilldelaId;
    // End of variables declaration//GEN-END:variables
}
