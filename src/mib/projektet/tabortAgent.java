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
public class tabortAgent extends javax.swing.JFrame {
    private final String agentID;
    private InfDB idb;
   
    /**
     * Creates new form Utrustning
     */
    public tabortAgent(InfDB idb, String agentID) {
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

        lblTabortAgent = new javax.swing.JLabel();
        btnTabortAgent = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textRuta = new javax.swing.JTextArea();
        lblValjAgent = new javax.swing.JLabel();
        comboValjTabortAgent = new javax.swing.JComboBox<>();
        btnVisaIdNamn = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTabortAgent.setFont(new java.awt.Font("Kaiti SC", 1, 24)); // NOI18N
        lblTabortAgent.setText("Ta bort Agent");

        btnTabortAgent.setText("Ta bort");
        btnTabortAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabortAgentActionPerformed(evt);
            }
        });

        textRuta.setColumns(20);
        textRuta.setRows(5);
        jScrollPane1.setViewportView(textRuta);

        lblValjAgent.setText("Välj Agent ID att ta bort:");

        comboValjTabortAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboValjTabortAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboValjTabortAgentActionPerformed(evt);
            }
        });

        btnVisaIdNamn.setText("Visa Agents ID och namn:");
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
                            .addComponent(lblValjAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(comboValjTabortAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAvbryt)
                            .addGap(18, 18, 18)
                            .addComponent(btnTabortAgent)))
                    .addComponent(lblTabortAgent))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lblTabortAgent)
                .addGap(18, 18, 18)
                .addComponent(btnVisaIdNamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValjAgent)
                    .addComponent(comboValjTabortAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTabortAgent)
                    .addComponent(btnAvbryt))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
        private String hittaSlumpmässigAgent() throws InfException {
    // Hämta alla agent-ID från databasen
    String sqlFraga = "SELECT Agent_ID FROM agent";
    ArrayList<String> allaAgenter = idb.fetchColumn(sqlFraga);

    // Generera en slumpmässig indexposition för att välja en agent
    int slumpIndex = (int) (Math.random() * allaAgenter.size());

    // Returnera det slumpmässiga agent-ID:et
    return allaAgenter.get(slumpIndex);
    }
    
    
    
    
    private void btnTabortAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabortAgentActionPerformed
   String valdAgent = comboValjTabortAgent.getSelectedItem().toString();

//Kollar så vald agent finns och inte är samma agent (AgentID) som har loggat in.

if(valdAgent != null && !valdAgent.equals(agentID))
try{
    // Hämta en slumpmässig agent från databasen
            String slumpmässigAgent = hittaSlumpmässigAgent();
            
            // Uppdatera aliens som tidigare hade den borttagna agenten som ansvarig agent
            String sqlFraga = "UPDATE alien SET Ansvarig_Agent = '" + slumpmässigAgent + "' WHERE Ansvarig_Agent = " + valdAgent;
            idb.update(sqlFraga);
           
     // Uppdatera områdeschefer som tidigare hade den borttagna agenten som områdeschef
            String sqlFragaOmradeschef = "UPDATE omradeschef SET Agent_ID = '" + slumpmässigAgent + "' WHERE Agent_ID = " + valdAgent;
            idb.update(sqlFragaOmradeschef);

            // Uppdatera kontorschefer som tidigare hade den borttagna agenten som kontorschef
            String sqlFragaKontorschef = "UPDATE kontorschef SET Agent_ID = '" + slumpmässigAgent + "' WHERE Agent_ID = " + valdAgent;
            idb.update(sqlFragaKontorschef);
    
    // Ta bort eventuella rader i alien som har den valda agenten som ansvarig agent
            idb.delete("DELETE FROM alien WHERE Ansvarig_Agent = " + valdAgent);
            
    
    // Ta bort eventuella rader i innehar_utrustning för den valda agenten
            idb.delete("DELETE FROM innehar_utrustning WHERE Agent_ID = " + valdAgent);
            
    
     idb.delete("DELETE FROM omradeschef WHERE Agent_ID = "+ valdAgent); 
     idb.delete("DELETE FROM kontorschef WHERE Agent_ID = " + valdAgent); 
     idb.delete("DELETE FROM faltagent WHERE Agent_ID = " + valdAgent) ;
     idb.delete("Delete from Agent where Agent.Agent_ID = " + valdAgent);
        JOptionPane.showMessageDialog(this, "Agenten har tagits bort!");

    
    
    

} catch (InfException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Ett fel uppstod: " + e.getMessage());

       } else {
        JOptionPane.showMessageDialog(this, "Du kan inte ta bort dig själv!");
}


    }//GEN-LAST:event_btnTabortAgentActionPerformed


    
    
    
    private void comboValjTabortAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboValjTabortAgentActionPerformed
     
     String valdAgent = comboValjTabortAgent.getSelectedItem().toString();
     fyllCombo2();
     comboValjTabortAgent.setSelectedItem(valdAgent);
    }//GEN-LAST:event_comboValjTabortAgentActionPerformed

    private void btnVisaIdNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaIdNamnActionPerformed
        textRuta.setText("");

        ArrayList<HashMap<String, String>> soktAgent;

        try {

            String sqlFraga = "select Agent_ID, Namn from Agent ORDER BY Agent_ID ASC";
            soktAgent = idb.fetchRows(sqlFraga);

            for (HashMap<String, String> agenter : soktAgent) {
               
              textRuta.append(agenter.get("Agent_ID")+" "+ agenter.get("Namn") + "\n");
            
            }
        } catch (InfException e) {
       System.out.println("fel" + e.getMessage());
        }

    }//GEN-LAST:event_btnVisaIdNamnActionPerformed

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAvbrytActionPerformed


  private void fyllCombo2() {
         
    String sqlFraga = "select Agent_ID from Agent ORDER BY Agent_ID ASC";
    ArrayList<String> allaAgenter;

    try {
        allaAgenter = idb.fetchColumn(sqlFraga);

        comboValjTabortAgent.setModel(new DefaultComboBoxModel<>(allaAgenter.toArray(new String[0])));
    } catch (InfException e) {
        System.out.println("fel" + e.getMessage());
    }

  
  
  
  
} 
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnTabortAgent;
    private javax.swing.JButton btnVisaIdNamn;
    private javax.swing.JComboBox<String> comboValjTabortAgent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTabortAgent;
    private javax.swing.JLabel lblValjAgent;
    private javax.swing.JTextArea textRuta;
    // End of variables declaration//GEN-END:variables
}
