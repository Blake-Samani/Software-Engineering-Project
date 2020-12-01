package Model;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Parser {

    private DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    private ArrayList<Integer> values = new ArrayList<>(); 
    private int counter;
    
    public void parseEm() {
                                                                            
        try {

            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("xmlfile.xml");
            NodeList patientList = doc.getElementsByTagName("Patient");

            for (int i = 0; i < patientList.getLength();i++) {

                Node p = patientList.item(i);

                if (p.getNodeType() == Node.ELEMENT_NODE) {
                    
                    Element patient = (Element) p;
                    // String id = patient.getAttribute("id");
                    NodeList attybutes = patient.getChildNodes();

                    for (int j = 0; j<attybutes.getLength() - 2; j++) {

                        Node n = attybutes.item(j);

                        if (n.getNodeType() == Node.ELEMENT_NODE) {

                            Element name = (Element) n;
                            int k = Integer.parseInt(name.getTextContent());
                            values.add(k);
                        
                            System.out.println(values.get(counter));
                            counter++;
                            // System.out.println("Patient " + id + ":" + name.getTagName() + " = " 
                            // + name.getTextContent());
                            
                        }
                    }
                    counter = 0;
                }
            }
        } catch (ParserConfigurationException e) {
           
            e.printStackTrace();
        } catch (SAXException e) {
         
            e.printStackTrace();
        } catch (IOException e) {
          
            e.printStackTrace();
        }
    }

    public ArrayList<Integer> getValues() {
        return values;
    }
}