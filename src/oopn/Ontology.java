/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oopn;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.FileManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import org.mindswap.pellet.jena.PelletReasonerFactory;

/**
 *
 * @author dhealf
 */
public class Ontology {

    private static Ontology ontology = new Ontology();
    public static OntModel ontologyModel; //this is the main of ontology model
    public static File ontologyFile; //this is the file of owl
    public static String ontologyFilePath; //this is the path of owl file
    public static JTree ontologyModelTree;
    public static int saveAction;
    public static String copiedText;
    public static JTree tree;

    private Ontology() {
    }

    public static Ontology getInstance() {
        return ontology;
    }

    public void resetOntology() {
        ontologyModel = null;
        ontologyFile = null;
        ontologyFilePath = null;
        ontologyModelTree = null;
    }

    //this method's aim to create an ontology model from parameter file inside
    //the parameter was written in string, so user has to get an absolute path to
    //be the parameter of this method :-)
    public OntModel createOntologyModelFromFile(String owlFile) {
        InputStream in;
        in = FileManager.get().open(owlFile);
        //create a model using reasoner
//        OntModel model1 = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM_MICRO_RULE_INF);
        OntModel model1 = ModelFactory.createOntologyModel(PelletReasonerFactory.THE_SPEC);
        //create a model which doesn't use a reasoner
        OntModel model2 = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
        // read the RDF/XML file
        model1.read(in, "");
        model2.read(in, "");
//        System.out.println("MODEL 2: ");
//        model1.write(System.out);
        ontologyModel = model1;
        return model1;
    }

    //user can create the tree of their ontology model here
    public static void showOntologyFile(File rdfFile, JTextArea txtAreaOntology) {
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
            //System.out.println(allData.toString());
            txtAreaOntology.setText(allData.toString());
        } catch (IOException ioExc) {
        }
    }

    public static void showInferenceFile(File rdfFile, JTextArea txtAreaOntology) {
        OntModel om;
        BufferedReader reader;
        String data;
        StringBuffer allData;
        reader = null;
        allData = new StringBuffer();
        try {
            reader = new BufferedReader(new FileReader(rdfFile)); // i need to write ontologi model here
            while ((data = reader.readLine()) != null) {
                allData.append(data);
                allData.append('\n');
            }
            System.out.println(allData.toString());
            txtAreaOntology.setText(allData.toString());
        } catch (IOException ioExc) {
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
