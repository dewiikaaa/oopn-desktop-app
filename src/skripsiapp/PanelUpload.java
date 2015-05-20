/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsiapp;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import oopn.Ontology;

/**
 *
 * @author dhealf
 */
public class PanelUpload extends javax.swing.JPanel {

    JFileChooser fileDialog;

    /**
     * Creates new form PanelUpload
     */
    public PanelUpload() {
        initComponents();
        if (Ontology.ontologyFile != null) {
            Ontology.showOntologyFile(Ontology.ontologyFile, txtAreaOntology);
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

        scrolUpload = new javax.swing.JScrollPane();
        txtAreaOntology = new javax.swing.JTextArea();
        btnUploadFile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        txtAreaOntology.setEditable(false);
        txtAreaOntology.setColumns(20);
        txtAreaOntology.setRows(5);
        scrolUpload.setViewportView(txtAreaOntology);

        btnUploadFile.setText("Upload File");
        btnUploadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadFileActionPerformed(evt);
            }
        });

        jLabel1.setText("To use this application, upload your OWL file, please !");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrolUpload, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUploadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUploadFile)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrolUpload, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUploadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadFileActionPerformed
        // TODO add your handling code here:
        if (Ontology.ontologyFile == null) {
            Ontology.ontologyFile = openOntologyFile();
            Ontology.showOntologyFile(Ontology.ontologyFile, txtAreaOntology);
        } else {
            String message = "Would you like to change your ontology file?";
            int answer = JOptionPane.showConfirmDialog(this, message);
            if (answer == JOptionPane.YES_OPTION) {
                // User clicked YES.
                Ontology.ontologyFile = openOntologyFile();
                Ontology.showOntologyFile(Ontology.ontologyFile, txtAreaOntology);
                Ontology.getInstance().createOntologyModelFromFile(Ontology.ontologyFilePath);
            } else if (answer == JOptionPane.NO_OPTION) {
                // User clicked NO.
            }
        }


//        int saveChoice = fileDialog.showSaveDialog(this);
//
//        //display choice using tracker 
//        logChoice(saveChoice, "Open Dialog");
//
//        if (saveChoice == JFileChooser.APPROVE_OPTION) {
//            //Put save file code in here
//            File saveFile = fileDialog.getSelectedFile();
//            txtAreaOntology.append("\nThe file selected is " + saveFile.getName());
//            txtAreaOntology.append("\nThe file's path is " + saveFile.getPath());
//        }

    }//GEN-LAST:event_btnUploadFileActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUploadFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane scrolUpload;
    private javax.swing.JTextArea txtAreaOntology;
    // End of variables declaration//GEN-END:variables

    private void logChoice(int choice, String dialog) {
        switch (choice) {
            //The user pressed cancel button
            case JFileChooser.CANCEL_OPTION:
                txtAreaOntology.append("\nCancel Option received from " + dialog);
                break;

            //The user pressed the open/save button
            case JFileChooser.APPROVE_OPTION:
                txtAreaOntology.append("\nApprove Option received from " + dialog);
                break;

            //The user dismissed the dialog without pressing a button
            case JFileChooser.ERROR_OPTION:
                txtAreaOntology.append("\nError Option received from " + dialog);
                break;
        }
    }

    File openOntologyFile() {
        JFileChooser fileChooser;
        File chosenFile;
        fileChooser = new JFileChooser(new File("."));
        fileChooser.showOpenDialog(fileChooser);
        chosenFile = fileChooser.getSelectedFile();
        if (chosenFile != null) {
            //loadOntologyFile(chosenFile);
        } else {
            JOptionPane.showMessageDialog(fileChooser, this);
        }
        //enableControls(true);
        Ontology.ontologyFilePath = chosenFile.getAbsolutePath();
        return chosenFile;
    }
}