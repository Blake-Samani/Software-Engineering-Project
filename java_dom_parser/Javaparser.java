package java_dom_parser;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Javaparser {

    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); // returns document builder factory
                                                                               // object
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("xmlfile.xml");
            NodeList patientList = doc.getElementsByTagName("Patient");
            for(int i = 0; i < patientList.getLength();i++){
                Node p = patientList.item(i);
                if(p.getNodeType()== Node.ELEMENT_NODE){
                    Element patient = (Element) p;
                    String id = patient.getAttribute("id");
                    NodeList attybutes = patient.getChildNodes();
                    for(int j = 0; j<attybutes.getLength(); j++){
                        Node n = attybutes.item(j);
                        if(n.getNodeType() == Node.ELEMENT_NODE){
                            Element name = (Element) n;
                            System.out.println("Patient " + id + ":" + name.getTagName() + " = " 
                            + name.getTextContent());
                        }
                    }
                }
            }
        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SAXException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
