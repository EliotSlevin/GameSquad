package testParser;

import java.io.File;
 


import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 








import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
 
/**
 * @author Crunchify.com
 */
 
public class CreateXML {
 
    public static void main(String[] args) {
    	final int size = 9;
		char[] temp = new char[size];
    	for (int i = 0; i < size; i++){
    		temp[i] = 'e';
    	}
    	temp [0] = 'w';
    	temp [1] = 'w';
    	temp [2] = 'w';
    	temp [3] = 'w';
    	temp [6] = 'w';
    	
        DocumentBuilderFactory icFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder icBuilder;
        try {
            icBuilder = icFactory.newDocumentBuilder();
            Document doc = icBuilder.newDocument();
            Element mainRootElement = doc.createElementNS("http://crunchify.com/CrunchifyCreateXMLDOM", "Companies");
            doc.appendChild(mainRootElement);
 
            // append child elements to root element
            int y = -1;
            for (int x = 0; x < size; x++){
            	if (x % 3 == 0){
            		y++;
            	}
            	if (x > 6){
            		mainRootElement.appendChild(getTile(doc, String.valueOf(x - 6), x, y));
            	} else if (x > 3){
            		mainRootElement.appendChild(getTile(doc, String.valueOf(x - 3), x, y));
            	} else {
            		mainRootElement.appendChild(getTile(doc, String.valueOf(x), x, y));
            	}
            }
 
            // output DOM XML to console 
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); 
            DOMSource source = new DOMSource(doc);
            //StreamResult console = new StreamResult(System.out);
            StreamResult console = new StreamResult(new File("file.xml"));
            transformer.transform(source, console);
 
            System.out.println("\nXML DOM Created Successfully..");
            load("file.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static boolean load(String xml) {
    	ArrayList<String> rolev = new ArrayList<String>();
    	String role1 = null;
    	String role2 = null;
    	String role3 = null;
    	String role4 = null;
    	Document dom;
    	// Make an  instance of the DocumentBuilderFactory
    	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    	try {
    		// use the factory to take an instance of the document builder
    		DocumentBuilder db = dbf.newDocumentBuilder();
    		// parse using the builder to get the DOM mapping of the    
    		// XML file
    		dom = db.parse(xml);

    		Element doc = dom.getDocumentElement();

    		role1 = getTextValue(role1, doc, "role1");
    		if (role1 != null) {
    			if (!role1.isEmpty())
    				rolev.add(role1);
    		}
    		role2 = getTextValue(role2, doc, "role2");
    		if (role2 != null) {
    			if (!role2.isEmpty())
    				rolev.add(role2);
    		}
    		role3 = getTextValue(role3, doc, "role3");
    		if (role3 != null) {
    			if (!role3.isEmpty())
    				rolev.add(role3);
    		}
    		role4 = getTextValue(role4, doc, "role4");
    		if ( role4 != null) {
    			if (!role4.isEmpty())
    				rolev.add(role4);
    		}
    		for (String s : rolev){
    			System.out.println(s);
    		}
    		return true;

    	} catch (ParserConfigurationException pce) {
    		System.out.println(pce.getMessage());
    	} catch (SAXException se) {
    		System.out.println(se.getMessage());
    	} catch (IOException ioe) {
    		System.err.println(ioe.getMessage());
    	}

    	return false;
		
	}
    
    private static String getTextValue(String def, Element doc, String tag) {
        String value = def;
        NodeList nl;
        nl = doc.getElementsByTagName(tag);
        if (nl.getLength() > 0 && nl.item(0).hasChildNodes()) {
            value = nl.item(0).getFirstChild().getNodeValue();
        }
        return value;
    }

	private static Node getTile(Document doc, String index, int xCoord, int yCoord) {
        Element company = doc.createElement("Tile");
        company.setAttribute("index", index);
        company.appendChild(getTileElements(doc, company, "xCoord", String.valueOf(xCoord)));
        company.appendChild(getTileElements(doc, company, "yCoord", String.valueOf(yCoord)));
        return company;
    }
 
    // utility method to create text node
    private static Node getTileElements(Document doc, Element element, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }
}