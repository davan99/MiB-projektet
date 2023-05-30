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
public class andraOmradesKontorsChef extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form andraOmradesKontorsChef
     */
    public andraOmradesKontorsChef(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllCombo();
        fyllCombo1();
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
        comboKontor = new javax.swing.JComboBox<>();
        comboOmrade = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        uppdateraKontor = new javax.swing.JButton();
        uppdateraOmrade = new javax.swing.JButton();
        gotaland = new javax.swing.JButton();
        norrland = new javax.swing.JButton();
        svealand = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        namn = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        namn2 = new javax.swing.JLabel();
        nychefuppgifter = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        namn3 = new javax.swing.JLabel();
        nychefuppgifter2 = new javax.swing.JButton();
        id4 = new javax.swing.JLabel();
        namn4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Ändra Kontorschef");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setText("Ändra Områdeschef");

        jLabel3.setText("Välj Ny Chef");

        jLabel4.setText("Välj Ny Chef");

        uppdateraKontor.setText("Uppdatera");
        uppdateraKontor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uppdateraKontorActionPerformed(evt);
            }
        });

        uppdateraOmrade.setText("Uppdatera");
        uppdateraOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uppdateraOmradeActionPerformed(evt);
            }
        });

        gotaland.setText("Götaland");
        gotaland.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotalandActionPerformed(evt);
            }
        });

        norrland.setText("Norrland");
        norrland.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                norrlandActionPerformed(evt);
            }
        });

        svealand.setText("Svealand");
        svealand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svealandActionPerformed(evt);
            }
        });

        jLabel6.setText("För Örebro kontoret");

        id.setText("Agent ID");

        jButton5.setText("Visa Nuvarande Chef");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        namn.setText("Namn");

        id2.setText("Agent ID");

        namn2.setText("Namn");

        nychefuppgifter.setText("Visa Uppgifter");
        nychefuppgifter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nychefuppgifterActionPerformed(evt);
            }
        });

        jLabel5.setText("Visa nuvarande chef:");

        id3.setText("Agent ID");

        namn3.setText("namn");

        nychefuppgifter2.setText("Visa Uppgifter");
        nychefuppgifter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nychefuppgifter2ActionPerformed(evt);
            }
        });

        id4.setText("Agent ID");

        namn4.setText("Namn");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(id)
                                    .addComponent(jLabel3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(id2)
                                        .addGap(23, 23, 23)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(namn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(namn2)
                                            .addComponent(uppdateraKontor)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(nychefuppgifter)
                                            .addComponent(comboKontor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(comboOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(uppdateraOmrade)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(id3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(namn3)
                                                    .addGap(28, 28, 28)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gotaland)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(norrland)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(svealand))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nychefuppgifter2)
                                .addGap(53, 53, 53)))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(id4)
                        .addGap(96, 96, 96)
                        .addComponent(namn4)
                        .addGap(64, 64, 64))))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gotaland)
                            .addComponent(norrland)
                            .addComponent(svealand)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id3)
                            .addComponent(namn3))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(comboOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nychefuppgifter2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id4)
                            .addComponent(namn4))
                        .addGap(18, 18, 18)
                        .addComponent(uppdateraOmrade)
                        .addGap(123, 123, 123))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id)
                            .addComponent(namn))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboKontor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(nychefuppgifter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namn2)
                            .addComponent(id2))
                        .addGap(18, 18, 18)
                        .addComponent(uppdateraKontor)
                        .addGap(67, 67, 67))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        id.setText("");
        namn.setText("");
        ArrayList<HashMap<String, String>> soktChef;

        try {
            String sqlFraga = "Select kontorschef.agent_id, namn from agent join kontorschef on agent.agent_id = kontorschef.agent_id";
            soktChef = idb.fetchRows(sqlFraga);

            for (HashMap<String, String> chef : soktChef) {
                id.setText(chef.get("Agent_ID"));
                namn.setText(chef.get("Namn"));
            }

        } catch (InfException e) {
            System.out.println("fel" + e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void nychefuppgifterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nychefuppgifterActionPerformed
        id2.setText("");
        namn2.setText("");
        ArrayList<HashMap<String, String>> nyChef;

        try {
            String valdAgent = comboKontor.getSelectedItem().toString();
            String sqlFraga = "Select namn, agent_id from agent where namn = '" + valdAgent + "'";
            nyChef = idb.fetchRows(sqlFraga);

            for (HashMap<String, String> chef : nyChef) {
                id2.setText(chef.get("Agent_ID"));
                namn2.setText(chef.get("Namn"));
            }

        } catch (InfException e) {
            System.out.println("fel" + e.getMessage());
        }
    }//GEN-LAST:event_nychefuppgifterActionPerformed

    private void uppdateraKontorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uppdateraKontorActionPerformed

        try {
            String nychefID = id2.getText();
            String gammalchefID = id.getText();

            String sqlFraga = "UPDATE kontorschef SET agent_ID = '" + nychefID + "' where agent_id = '" + gammalchefID + "'";
            idb.update(sqlFraga);
            JOptionPane.showMessageDialog(null, "Kontorschef har uppdaterats");
        } catch (InfException e) {
            System.out.println("fel" + e.getMessage());
        }
    }//GEN-LAST:event_uppdateraKontorActionPerformed

    private void gotalandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotalandActionPerformed
        id3.setText("");
        namn3.setText("");
        ArrayList<HashMap<String, String>> soktChef;

        try {
            String sqlFraga = "select Omradeschef.Agent_id, namn from Omradeschef join agent on Agent.Agent_ID = Omradeschef.Agent_ID where Omradeschef.Omrade = 2";
            soktChef = idb.fetchRows(sqlFraga);

            for (HashMap<String, String> chef : soktChef) {
                id3.setText(chef.get("Agent_ID"));
                namn3.setText(chef.get("Namn"));
            }

        } catch (InfException e) {
            System.out.println("fel" + e.getMessage());
        }


    }//GEN-LAST:event_gotalandActionPerformed

    private void norrlandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_norrlandActionPerformed
        id3.setText("");
        namn3.setText("");
        ArrayList<HashMap<String, String>> soktChef;

        try {
            String sqlFraga = "select Omradeschef.Agent_id, namn from Omradeschef join agent on Agent.Agent_ID = Omradeschef.Agent_ID where Omradeschef.Omrade = 4";
            soktChef = idb.fetchRows(sqlFraga);

            for (HashMap<String, String> chef : soktChef) {
                id3.setText(chef.get("Agent_ID"));
                namn3.setText(chef.get("Namn"));
            }

        } catch (InfException e) {
            System.out.println("fel" + e.getMessage());
        }
    }//GEN-LAST:event_norrlandActionPerformed

    private void svealandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svealandActionPerformed
        id3.setText("");
        namn3.setText("");
        ArrayList<HashMap<String, String>> soktChef;

        try {
            String sqlFraga = "select Omradeschef.Agent_id, namn from Omradeschef join agent on Agent.Agent_ID = Omradeschef.Agent_ID where Omradeschef.Omrade = 1";
            soktChef = idb.fetchRows(sqlFraga);

            for (HashMap<String, String> chef : soktChef) {
                id3.setText(chef.get("Agent_ID"));
                namn3.setText(chef.get("Namn"));
            }

        } catch (InfException e) {
            System.out.println("fel" + e.getMessage());
        }
    }//GEN-LAST:event_svealandActionPerformed

    private void nychefuppgifter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nychefuppgifter2ActionPerformed
        id4.setText("");
        namn4.setText("");
        ArrayList<HashMap<String, String>> nyChef;

        try {
            String valdAgent = comboOmrade.getSelectedItem().toString();
            String sqlFraga = "Select namn, agent_id from agent where namn = '" + valdAgent + "'";
            nyChef = idb.fetchRows(sqlFraga);

            for (HashMap<String, String> chef : nyChef) {
                id4.setText(chef.get("Agent_ID"));
                namn4.setText(chef.get("Namn"));
            }

        } catch (InfException e) {
            System.out.println("fel" + e.getMessage());
        }
    }//GEN-LAST:event_nychefuppgifter2ActionPerformed

    private void uppdateraOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uppdateraOmradeActionPerformed
        try {
            String nychefID = id4.getText();
            String gammalchefID = id3.getText();

            String sqlFraga = "UPDATE omradeschef SET agent_ID = '" + nychefID + "' where agent_id = '" + gammalchefID + "'";
            idb.update(sqlFraga);
            JOptionPane.showMessageDialog(null, "Områdeschef har uppdaterats");
        } catch (InfException e) {
            System.out.println("fel" + e.getMessage());
        }
    }//GEN-LAST:event_uppdateraOmradeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void fyllCombo() {
        String sqlFraga = " SELECT namn from agent";
        ArrayList<String> allaAgenter;

        try {
            allaAgenter = idb.fetchColumn(sqlFraga);

            for (String agent : allaAgenter) {
                comboOmrade.addItem(agent);
            }
        } catch (InfException e) {
            System.out.println("fel" + e.getMessage());
        }
    }

    private void fyllCombo1() {
        String sqlFraga = " SELECT namn from agent";
        ArrayList<String> allaAgenter;

        try {
            allaAgenter = idb.fetchColumn(sqlFraga);

            for (String agent : allaAgenter) {
                comboKontor.addItem(agent);
            }
        } catch (InfException e) {
            System.out.println("fel" + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboKontor;
    private javax.swing.JComboBox<String> comboOmrade;
    private javax.swing.JButton gotaland;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel namn;
    private javax.swing.JLabel namn2;
    private javax.swing.JLabel namn3;
    private javax.swing.JLabel namn4;
    private javax.swing.JButton norrland;
    private javax.swing.JButton nychefuppgifter;
    private javax.swing.JButton nychefuppgifter2;
    private javax.swing.JButton svealand;
    private javax.swing.JButton uppdateraKontor;
    private javax.swing.JButton uppdateraOmrade;
    // End of variables declaration//GEN-END:variables
}
