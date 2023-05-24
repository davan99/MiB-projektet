/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.projektet;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author oskarjolesjo
 */
public class AlienStartsida extends javax.swing.JFrame {
private InfDB idb;
private final String alienID;
    /**
     * Creates new form AlienStartsida
     */
    public AlienStartsida(InfDB idb, String alienID) {
        initComponents();
        this.idb = idb;
        this.alienID = alienID;
        
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
        btnLosenord = new javax.swing.JButton();
        visaOmradeschef = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Omradeschef = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Alien Startsida");

        btnLosenord.setText("Ändra lösenord");
        btnLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLosenordActionPerformed(evt);
            }
        });

        visaOmradeschef.setText("Visa områdeschef");
        visaOmradeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaOmradeschefActionPerformed(evt);
            }
        });

        Omradeschef.setText("Områdeschef");

        jButton1.setText("Logga ut");
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
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLosenord)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(visaOmradeschef)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Omradeschef)
                                .addGap(27, 27, 27)))
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLosenord)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(visaOmradeschef))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Omradeschef)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLosenordActionPerformed
        new andraLosenordAlien(idb, alienID).setVisible(true);
      
    }//GEN-LAST:event_btnLosenordActionPerformed

    private void visaOmradeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaOmradeschefActionPerformed
     
        try {
            String sqlFraga = "SELECT Agent.namn from agent join Omradeschef on Agent.Agent_ID = Omradeschef.Agent_ID join Omrade on Omradeschef.Omrade = Omrades_ID join plats on Omrade.Omrades_ID = Plats.Finns_I join Alien on Finns_I = Plats where Alien_ID = '" + alienID + "' group by Agent.Namn";
        String chef = idb.fetchSingle(sqlFraga);
        Omradeschef.setText(chef);
        }
        catch (InfException e) {
       System.out.println("fel" + e.getMessage());
        }
         
    }//GEN-LAST:event_visaOmradeschefActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Omradeschef;
    private javax.swing.JButton btnLosenord;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton visaOmradeschef;
    // End of variables declaration//GEN-END:variables
}
