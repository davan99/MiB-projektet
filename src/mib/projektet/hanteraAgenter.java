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
public class hanteraAgenter extends javax.swing.JFrame {
private InfDB idb;
    /**
     * Creates new form hanteraAlien
     */
    public hanteraAgenter(InfDB idb) {
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
        Admin = new javax.swing.JLabel();
        txtAngeNamn = new javax.swing.JTextField();
        txtAngeEpost = new javax.swing.JTextField();
        txtAngeTelefon = new javax.swing.JTextField();
        btnLaggTill = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();
        pwAngeLosenord = new javax.swing.JPasswordField();
        anstDatum = new javax.swing.JLabel();
        textAnst = new javax.swing.JTextField();
        omradeID = new javax.swing.JTextField();
        admin = new javax.swing.JTextField();
        AgentID = new javax.swing.JLabel();
        agentensid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRegistreraNyAlien.setText("Registrera ny Agent");

        lblNamn.setText("Namn:");

        lblEpost.setText("E-post:");

        lblLosenord.setText("Lösenord:");

        lblTelefon.setText("Telefonnummer:");

        lblOmrade.setText("Område-ID:");

        Admin.setText("Admin");

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

        anstDatum.setText("Anst-Datum");

        textAnst.setText("yyyy-mm-dd");
        textAnst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAnstActionPerformed(evt);
            }
        });

        omradeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omradeIDActionPerformed(evt);
            }
        });

        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        AgentID.setText("Agent-ID:");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(anstDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(omradeID)
                                    .addComponent(txtAngeTelefon)
                                    .addComponent(txtAngeEpost)
                                    .addComponent(pwAngeLosenord)
                                    .addComponent(admin)
                                    .addComponent(agentensid)
                                    .addComponent(txtAngeNamn)
                                    .addComponent(textAnst)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                                .addComponent(lblRegistreraNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AgentID, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegistreraNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anstDatum)
                    .addComponent(textAnst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(omradeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Admin)
                    .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgentID)
                    .addComponent(agentensid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaggTill)
                    .addComponent(btnAvbryt))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillActionPerformed

        String datum = textAnst.getText();
        String namn = txtAngeNamn.getText();
        String epost = txtAngeEpost.getText();
        String losenord = pwAngeLosenord.getText();
        String telefon = txtAngeTelefon.getText();
        String omrade = omradeID.getText();
        String adminen = admin.getText();
        String id = agentensid.getText();
        
        
        try {
            
            SimpleDateFormat datumFormat = new SimpleDateFormat("yyyy-MM-dd");
            datumFormat.parse(datum);
            datumFormat.setLenient(false);
            
            String sqlFragaFinnsEpost = "SELECT * FROM agent WHERE epost = '" + epost + "'";
            if (idb.fetchSingle(sqlFragaFinnsEpost) != null) {
                JOptionPane.showMessageDialog(this, "E-postadressen finns redan i databasen.");
                return;
            }

            String sqlFragaFinnsId = "SELECT * FROM agent WHERE Agent_id = " + id;
            if (idb.fetchSingle(sqlFragaFinnsId) != null) {
                JOptionPane.showMessageDialog(this, "Agent-id finns redan i databasen.");
                return;
            }
          // Validering av telefonnummer
   if (!Validering.valideraTelefonnummer(telefon)) {
        JOptionPane.showMessageDialog(this, "Telefonnummer kan endast innehålla siffror.");
        return;
    }
   
   if (!Validering.valideraOmradeID(omrade)) {
            JOptionPane.showMessageDialog(this, "Ogiltigt omradeID. Endast 1 = Svealand, 2 = Götaland eller 4 = Norrland är tillåtna.");
            return;
        }
    if (!Validering.kollaAdminStatus(adminen)) {
            JOptionPane.showMessageDialog(this, "Ogiltig adminstatus. Vänligen ange antingen 'J' för JA eller 'N' för NEJ.");
            return;
        }


            String sqlFraga = "INSERT INTO agent (Agent_id, namn, telefon, anstallningsdatum, administrator, epost, losenord, omrade ) "
                    + "VALUES (" + id + ", '" + namn + "', '" + telefon + "', '" + datum + "', '" + adminen + "', '" + epost+ "', '" + losenord + "', '" + omrade + "')";

            idb.insert(sqlFraga);
            JOptionPane.showMessageDialog(this, "Agent har lagts till i databasen.");

        } catch (InfException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ett fel uppstod: " + e.getMessage());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Ange datum i rätt format, yyyy-MM-dd!");

        }
    
    
    
        
    }//GEN-LAST:event_btnLaggTillActionPerformed

    private void textAnstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAnstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAnstActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminActionPerformed

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAvbrytActionPerformed

    private void omradeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omradeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_omradeIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admin;
    private javax.swing.JLabel AgentID;
    private javax.swing.JTextField admin;
    private javax.swing.JTextField agentensid;
    private javax.swing.JLabel anstDatum;
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnLaggTill;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblOmrade;
    private javax.swing.JLabel lblRegistreraNyAlien;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JTextField omradeID;
    private javax.swing.JPasswordField pwAngeLosenord;
    private javax.swing.JTextField textAnst;
    private javax.swing.JTextField txtAngeEpost;
    private javax.swing.JTextField txtAngeNamn;
    private javax.swing.JTextField txtAngeTelefon;
    // End of variables declaration//GEN-END:variables
}
