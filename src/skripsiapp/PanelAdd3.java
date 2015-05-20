/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsiapp;

import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFactory;
import com.hp.hpl.jena.query.ResultSetRewindable;
import guiSetup.ClassTree;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import oopn.Ontology;

/**
 *
 * @author dhealf
 */
public class PanelAdd3 extends javax.swing.JPanel {

    /**
     * Creates new form PanelClassHierarchy
     */
    public PanelAdd3() {

        if (Ontology.ontologyFile != null) {
            initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        if (oopn.Ontology.tree==null){
            try{
                oopn.Ontology.tree = new ClassTree(oopn.Ontology.ontologyFilePath).getJTree();
            }
            catch(Exception e){
                //System.out.println("error tree: "+e)
            }}
            ontModelTree1 = oopn.Ontology.tree;
            jLabel2 = new javax.swing.JLabel();
            scrol1 = new javax.swing.JScrollPane();
            sparqlResultsTable1 = new javax.swing.JTable();
            txtRange = new javax.swing.JTextField();
            jLabel4 = new javax.swing.JLabel();
            jPanel2 = new javax.swing.JPanel();
            scrol = new javax.swing.JScrollPane();
            sparqlResultsTable = new javax.swing.JTable();
            txtDomain = new javax.swing.JTextField();
            jScrollPane1 = new javax.swing.JScrollPane();
            if (oopn.Ontology.tree==null){
                try{
                    oopn.Ontology.tree = new ClassTree(oopn.Ontology.ontologyFilePath).getJTree();
                }
                catch(Exception e){
                    //System.out.println("error tree: "+e)
                }}
                ontModelTree = oopn.Ontology.tree;
                jLabel1 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jComboBox1 = new javax.swing.JComboBox();
                jButton1 = new javax.swing.JButton();
                jLabel5 = new javax.swing.JLabel();

                jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                ontModelTree1.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        ontModelTree1MouseClicked(evt);
                    }
                });
                ontModelTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
                    public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                        ontModelTree1ValueChanged(evt);
                    }
                });
                jScrollPane3.setViewportView(ontModelTree1);

                jLabel2.setText("HIERARCHY CLASS");

                sparqlResultsTable1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                        {null},
                        {null},
                        {null},
                        {null}
                    },
                    new String [] {
                        "Title 1"
                    }
                ));
                scrol1.setViewportView(sparqlResultsTable1);

                jLabel4.setText("RANGE");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(scrol1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtRange, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel4)))
                        .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scrol1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128))))
                );

                jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                sparqlResultsTable.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                        {null},
                        {null},
                        {null},
                        {null}
                    },
                    new String [] {
                        "Title 1"
                    }
                ));
                scrol.setViewportView(sparqlResultsTable);

                ontModelTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
                    public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                        ontModelTreeValueChanged(evt);
                    }
                });
                jScrollPane1.setViewportView(ontModelTree);

                jLabel1.setText("HIERARCHY CLASS");

                jLabel3.setText("DOMAIN");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addComponent(scrol, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtDomain, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(93, 93, 93))))
                );
                jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrol, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDomain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                );

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jComboBox1ActionPerformed(evt);
                    }
                });

                jButton1.setText("ADD");

                jLabel5.setText("OBJECT PROPERTY");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel5)
                                .addGap(31, 31, 31)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                );
            }// </editor-fold>//GEN-END:initComponents

    private void ontModelTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_ontModelTreeValueChanged
        // TODO add your handling code here:
        int i;
        String pref;
        String[] segment = new String[10];
        System.out.println("Path : " + ontModelTree.getSelectionPath().toString());
        String[] path = ontModelTree.getSelectionPath().toString().split(",");
        for (i = 0; i < path.length; i++) {
            String[] path2 = path[i].split("#");
            segment[i] = path2[1].split("]")[0];
            System.out.println("Segment" + i + " : " + path2[1].split("]")[0]);
        }
        selectedClass = oopn.Ontology.ontologyModel.getOntClass(prefix + segment[i - 1]);
        if ("Thing".equals(segment[i - 1])) {
            pref = "owl";
        } else {
            pref = "oopn";
        }
        String queryText =
                "SELECT ?" + segment[i - 1] + " WHERE {\n?" + segment[i - 1] + " rdf:type "+pref+":" + segment[i - 1] + "}";
        String prefix = "PREFIX owl:<http://www.w3.org/2002/07/owl#>\n"
                + "PREFIX xsd:<http://www.w3.org/2001/XMLSchema#>\n"
                + "PREFIX owl2xml:<http://www.w3.org/2006/12/owl2-xml#>\n"
                + "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n"
                + "PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
                + "PREFIX oopn:<http://www.ontology.dhealf.com/pediatric/oopn.owl#>\n";
        String queryString = prefix + queryText;
        System.out.println("\n" + queryString);
        System.out.println(i);
        Query query = QueryFactory.create(queryString);
        qe = QueryExecutionFactory.create(query, oopn.Ontology.ontologyModel);
        qeCopy = QueryExecutionFactory.create(query, oopn.Ontology.ontologyModel);
        resultSet = qe.execSelect();
        resultSetCopy = qeCopy.execSelect();

        System.out.println(
                "----------------------");
        System.out.println(
                "Query Result Sheet");
        System.out.println(
                "----------------------");
        // Output query results    

        //ResultSetFormatter.out(System.out, resultSet, query);
        String[] labels;
        String[][] data_table;
        ;
        int a, b, c;
        int column;
        ResultSetRewindable rsrw = ResultSetFactory.copyResults(resultSetCopy);
        int row = rsrw.size();
        //to get variable
        String[] varq = queryString.split("SELECT")[1].split("WHERE")[0].split("\\?");

        System.out.println(
                "List var: ");
        labels = new String[varq.length - 1];
        column = varq.length - 1;
        data_table = new String[row][column];
        for (int q = 1;
                q < varq.length;
                q++) {
            System.out.println("var : " + varq[q].trim());
            labels[q - 1] = varq[q].trim();
        }

        System.out.println(
                "column " + column);
        System.out.println(
                "row " + row);

        a = 0;

        while (resultSet.hasNext()) {
            QuerySolution qsol = resultSet.next();
            for (b = 0; b < column; b++) {
                String[] as = qsol.get(labels[b]).toString().split("#");
                data_table[a][b] = as[1].split(">")[0].replace('_', ' ');
            }
//            System.out.println("===============");
//            System.out.println("Nutrisi: " + qsol.get("Nutrisi"));
//            System.out.println("Nama Lain: " + qsol.get("lain"));
            a++;
        }

        //sparqlResultsTable.setModel(new SparqlTableModel(resultSet));
        sparqlResultsTable.setModel(new DefaultTableModel(data_table, labels));
        qe.close();
    }//GEN-LAST:event_ontModelTreeValueChanged

    private void ontModelTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_ontModelTree1ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ontModelTree1ValueChanged

    private void ontModelTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ontModelTree1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ontModelTree1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTree ontModelTree;
    private javax.swing.JTree ontModelTree1;
    private javax.swing.JScrollPane scrol;
    private javax.swing.JScrollPane scrol1;
    private javax.swing.JTable sparqlResultsTable;
    private javax.swing.JTable sparqlResultsTable1;
    private javax.swing.JTextField txtDomain;
    private javax.swing.JTextField txtRange;
    // End of variables declaration//GEN-END:variables
    ClassTree tree;
    //Dewi's code
    QueryExecution qe;
    QueryExecution qeCopy;
    ResultSet resultSet;
    ResultSet resultSetCopy;
    OntClass selectedClass;
    String prefix = "http://www.ontology.dhealf.com/pediatric/oopn.owl#";

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
        return chosenFile;
    }

    public void showOntologyFile(File rdfFile, JTextArea txtAreaOntology) {
        BufferedReader reader;
        String data;
        StringBuffer allData;
        reader = null;
        allData = new StringBuffer();
        try {
            reader = new BufferedReader(new FileReader(rdfFile));
            while ((data = reader.readLine()) != null) {
                allData.append(data);
                allData.append('\n');
            }
            System.out.println(allData.toString());
            txtAreaOntology.setText(allData.toString());
        } catch (IOException ioExc) {
        }
    }
}