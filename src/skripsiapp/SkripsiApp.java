/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsiapp;

import java.awt.GraphicsEnvironment;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oopn.Ontology;

/**
 *
 * @author dhealf
 */
public class SkripsiApp extends javax.swing.JFrame {

    /**
     * Creates new form SkripsiApp
     */
    public SkripsiApp() {
        initComponents();
        this.setLocationRelativeTo(this);
        mainPanel = new PanelUpload();
        mainPanel.repaint();
        mainScrol.setViewportView(mainPanel);
        mainPanel.setAutoscrolls(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainScrol = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mMenuFile = new javax.swing.JMenu();
        menuReset = new javax.swing.JMenuItem();
        menuLastFile = new javax.swing.JMenuItem();
        menuSave = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        mMenuEdit = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mMenuInference = new javax.swing.JMenu();
        menuInfRDFXML = new javax.swing.JMenuItem();
        menuInfRDFXMLABRREV = new javax.swing.JMenuItem();
        menuInfTurtle = new javax.swing.JMenuItem();
        menuInfN3 = new javax.swing.JMenuItem();
        mMenuShow = new javax.swing.JMenu();
        menuClassHierarchy = new javax.swing.JMenuItem();
        menuRDFText = new javax.swing.JMenuItem();
        mMenuQuerying = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuSparqlMode = new javax.swing.JMenuItem();
        mMenuHelp = new javax.swing.JMenu();
        menuHelpContent = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ontology of Pediatric Nutrient");
        setBackground(new java.awt.Color(112, 66, 21));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mainPanel.setPreferredSize(new java.awt.Dimension(752, 474));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );

        mainScrol.setViewportView(mainPanel);

        mMenuFile.setText("File");

        menuReset.setText("Reset");
        menuReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuResetActionPerformed(evt);
            }
        });
        mMenuFile.add(menuReset);

        menuLastFile.setText("Uploaded File");
        menuLastFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLastFileActionPerformed(evt);
            }
        });
        mMenuFile.add(menuLastFile);

        menuSave.setText("Save Last File");
        menuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveActionPerformed(evt);
            }
        });
        mMenuFile.add(menuSave);

        menuExit.setText("Exit");
        mMenuFile.add(menuExit);

        jMenuBar1.add(mMenuFile);

        mMenuEdit.setText("Edit");

        jMenuItem1.setText("Add Triple");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mMenuEdit.add(jMenuItem1);

        jMenuBar1.add(mMenuEdit);

        mMenuInference.setText("Inference");

        menuInfRDFXML.setText("RDF/XML");
        menuInfRDFXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInfRDFXMLActionPerformed(evt);
            }
        });
        mMenuInference.add(menuInfRDFXML);

        menuInfRDFXMLABRREV.setText("RDF/XML-ABBREV");
        menuInfRDFXMLABRREV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInfRDFXMLABRREVActionPerformed(evt);
            }
        });
        mMenuInference.add(menuInfRDFXMLABRREV);

        menuInfTurtle.setText("TURTLE");
        menuInfTurtle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInfTurtleActionPerformed(evt);
            }
        });
        mMenuInference.add(menuInfTurtle);

        menuInfN3.setText("N3");
        menuInfN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInfN3ActionPerformed(evt);
            }
        });
        mMenuInference.add(menuInfN3);

        jMenuBar1.add(mMenuInference);

        mMenuShow.setText("Show");

        menuClassHierarchy.setText("Class Hierarchy");
        menuClassHierarchy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClassHierarchyActionPerformed(evt);
            }
        });
        mMenuShow.add(menuClassHierarchy);

        menuRDFText.setText("RDF Text");
        mMenuShow.add(menuRDFText);

        jMenuBar1.add(mMenuShow);

        mMenuQuerying.setText("Querying");

        jMenuItem2.setText("Quick Search");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mMenuQuerying.add(jMenuItem2);

        menuSparqlMode.setText("Direct SPARQL Mode");
        menuSparqlMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSparqlModeActionPerformed(evt);
            }
        });
        mMenuQuerying.add(menuSparqlMode);

        jMenuBar1.add(mMenuQuerying);

        mMenuHelp.setText("Help");

        menuHelpContent.setText("Help Content");
        menuHelpContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHelpContentActionPerformed(evt);
            }
        });
        mMenuHelp.add(menuHelpContent);

        menuAbout.setText("About");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        mMenuHelp.add(menuAbout);

        jMenuBar1.add(mMenuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainScrol, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainScrol, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuLastFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLastFileActionPerformed
        // TODO add your handling code here:
        mainPanel = new PanelUpload();
        mainPanel.repaint();
        mainScrol.setViewportView(mainPanel);
        mainPanel.setAutoscrolls(true);

    }//GEN-LAST:event_menuLastFileActionPerformed

    private void menuResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuResetActionPerformed
        // TODO add your handling code here:
        String message = "Are you sure to reset this ontology application?";
        int answer = JOptionPane.showConfirmDialog(this, message);
        if (answer == JOptionPane.YES_OPTION) {
            Ontology.getInstance().resetOntology();
            mainPanel = new PanelUpload();
            mainPanel.repaint();
            mainScrol.setViewportView(mainPanel);
            mainPanel.setAutoscrolls(true);
        } else if (answer == JOptionPane.NO_OPTION) {
            // User clicked NO.
        }

    }//GEN-LAST:event_menuResetActionPerformed

    private void menuSparqlModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSparqlModeActionPerformed
        try {
            // TODO add your handling code here:
            mainPanel = new PanelSPARQLMode();
            mainPanel.repaint();
            mainScrol.setViewportView(mainPanel);
            mainPanel.setAutoscrolls(true);
        } catch (Exception ex) {
            Logger.getLogger(SkripsiApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuSparqlModeActionPerformed

    private void menuClassHierarchyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClassHierarchyActionPerformed
        // TODO add your handling code here:
        mainPanel = new PanelClassHierarchy();
        mainPanel.repaint();
        mainScrol.setViewportView(mainPanel);
        mainPanel.setAutoscrolls(true);
    }//GEN-LAST:event_menuClassHierarchyActionPerformed

    private void menuHelpContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHelpContentActionPerformed
        // TODO add your handling code here:
        mainPanel = new PanelHelpContent();
        mainPanel.repaint();
        mainScrol.setViewportView(mainPanel);
        mainPanel.setAutoscrolls(true);
    }//GEN-LAST:event_menuHelpContentActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        // TODO add your handling code here:
        mainPanel = new PanelAbout();
        mainPanel.repaint();
        mainScrol.setViewportView(mainPanel);
        mainPanel.setAutoscrolls(true);
    }//GEN-LAST:event_menuAboutActionPerformed

    private void menuInfRDFXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInfRDFXMLActionPerformed
        // TODO add your handling code here:
        mainPanel = new PanelReasoningRDFXML();
        mainPanel.repaint();
        mainScrol.setViewportView(mainPanel);
        mainPanel.setAutoscrolls(true);
    }//GEN-LAST:event_menuInfRDFXMLActionPerformed

    private void menuInfN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInfN3ActionPerformed
        // TODO add your handling code here:
        mainPanel = new PanelReasoningN3();
        mainPanel.repaint();
        mainScrol.setViewportView(mainPanel);
        mainPanel.setAutoscrolls(true);
    }//GEN-LAST:event_menuInfN3ActionPerformed

    private void menuInfRDFXMLABRREVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInfRDFXMLABRREVActionPerformed
        // TODO add your handling code here:
        mainPanel = new PanelReasoningRDFXMLABBREV();
        mainPanel.repaint();
        mainScrol.setViewportView(mainPanel);
        mainPanel.setAutoscrolls(true);
    }//GEN-LAST:event_menuInfRDFXMLABRREVActionPerformed

    private void menuInfTurtleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInfTurtleActionPerformed
        // TODO add your handling code here:
        mainPanel = new PanelReasoningTURTLE();
        mainPanel.repaint();
        mainScrol.setViewportView(mainPanel);
        mainPanel.setAutoscrolls(true);
    }//GEN-LAST:event_menuInfTurtleActionPerformed

    private void menuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveActionPerformed
        // TODO add your handling code here:
        oopn.Ontology.saveAction=1;
        mainPanel = new PanelUpload();
        mainPanel.repaint();
        mainScrol.setViewportView(mainPanel);
        mainPanel.setAutoscrolls(true);
    }//GEN-LAST:event_menuSaveActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        mainPanel = new PanelAdd3();
        mainPanel.repaint();
        mainScrol.setViewportView(mainPanel);
        mainPanel.setAutoscrolls(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        mainPanel = new PanelMultipleCriteriaOke();
        mainPanel.repaint();
        mainScrol.setViewportView(mainPanel);
        mainPanel.setAutoscrolls(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SkripsiApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SkripsiApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SkripsiApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SkripsiApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GraphicsEnvironment env =
                        GraphicsEnvironment.getLocalGraphicsEnvironment();
                SkripsiApp mainFrame = new SkripsiApp();
                mainFrame.setMaximizedBounds(env.getMaximumWindowBounds());
                mainFrame.setVisible(true);
                mainFrame.setExtendedState(mainFrame.getExtendedState());
                //new SkripsiApp().setVisible(true)setExtendedState(myFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu mMenuEdit;
    private javax.swing.JMenu mMenuFile;
    private javax.swing.JMenu mMenuHelp;
    private javax.swing.JMenu mMenuInference;
    private javax.swing.JMenu mMenuQuerying;
    private javax.swing.JMenu mMenuShow;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrol;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuItem menuClassHierarchy;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuHelpContent;
    private javax.swing.JMenuItem menuInfN3;
    private javax.swing.JMenuItem menuInfRDFXML;
    private javax.swing.JMenuItem menuInfRDFXMLABRREV;
    private javax.swing.JMenuItem menuInfTurtle;
    private javax.swing.JMenuItem menuLastFile;
    private javax.swing.JMenuItem menuRDFText;
    private javax.swing.JMenuItem menuReset;
    private javax.swing.JMenuItem menuSave;
    private javax.swing.JMenuItem menuSparqlMode;
    // End of variables declaration//GEN-END:variables
}
