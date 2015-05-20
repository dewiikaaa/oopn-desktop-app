/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsiapp;

import com.hp.hpl.jena.rdf.model.Model;
import java.io.File;
import java.io.StringWriter;
import javax.swing.JOptionPane;
import oopn.Ontology;

/**
 *
 * @author dhealf
 */
public class PanelReasoningRDFXMLABBREV extends javax.swing.JPanel {

    /**
     * Creates new form PanelReasoningRDFXML
     */
    public PanelReasoningRDFXMLABBREV() {
        initComponents();
        //txtAreaReasoning.setText(Ontology.ontologyModel.w);
        if (Ontology.getInstance().ontologyFile != null) {
            Waiting wait = new Waiting();
            wait.setVisible(true);
            Model tempModel;
            if (Ontology.ontologyModel == null) {
                tempModel = Ontology.getInstance().createOntologyModelFromFile(Ontology.ontologyFilePath);
            } else {
                tempModel = Ontology.ontologyModel;
            }
            StringWriter writer = new StringWriter();
            tempModel.write(writer, "RDF/XML-ABBREV");
            txtAreaReasoningRDFXMLABBREV.setText(writer.toString());
            wait.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Please upload your ontology file first!");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaReasoningRDFXMLABBREV = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        txtAreaReasoningRDFXMLABBREV.setEditable(false);
        txtAreaReasoningRDFXMLABBREV.setColumns(20);
        txtAreaReasoningRDFXMLABBREV.setRows(5);
        jScrollPane1.setViewportView(txtAreaReasoningRDFXMLABBREV);

        jLabel1.setText("Inference Ontology Write in RDF/XML-ABBREV Format");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaReasoningRDFXMLABBREV;
    // End of variables declaration//GEN-END:variables
}
