package fr.dawan.endlessoffice.utils;

import fr.dawan.endlessoffice.utils.xml.Texts;
import fr.dawan.endlessoffice.utils.xml.XMLNode;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Util
{
    public static final Texts TEXTS = new Texts();

    /**
     * Inits the TEXTS map with text files present in resources/xml
     */
    public static void getText()
    {
        try {
            List<String> fileNames = getXMLTextFileNames();

            for (String s : fileNames)
            {
                TEXTS.put(s.substring(0, s.length()-4), parseXML(s));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Parse information from xml file to XMLNode object
     * @param xmlFileName - xml file to parse
     * @return - XML Node with information from file
     */
    private static XMLNode parseXML(String xmlFileName)
    {
        XMLNode nodes = new XMLNode();

        try
        {
            InputStream inputStream = getContextClassLoader().getResourceAsStream("xml/"+xmlFileName);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputStream);
            document.getDocumentElement().normalize();
            NodeList nodeList = document.getElementsByTagName("text");

            Node node = nodeList.item(0);
            if(node.getNodeType() == Node.ELEMENT_NODE)
            {
                nodes.setNodeName(xmlFileName.substring(0, xmlFileName.length()-4));
                exploreNodeList((Element)node, nodes);
            }

            return nodes;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Explore the nodes recursively
     * @param node - current node to explore
     * @param parentNode - parent XMLNode
     */
    private static void exploreNodeList(Element node, XMLNode parentNode)
    {
        XMLNode currentNode = new XMLNode();

        //Current node sets
        currentNode.setNodeName(node.getNodeName());
        if(!node.getFirstChild().getNodeValue().isBlank()) {
            currentNode.setNodeContent(node.getFirstChild().getNodeValue());
        }

        parentNode.addChild(currentNode);

        //checking for siblings
        if(node.getNextSibling() != null && node.getNodeType() == Node.ELEMENT_NODE)
            if(node.getNextSibling().getNextSibling() != null)
                exploreNodeList((Element)node.getNextSibling().getNextSibling(), parentNode);

        //checking for children
        if(node.getFirstChild().getNextSibling() != null && node.getNodeType() == Node.ELEMENT_NODE)
            exploreNodeList((Element)node.getFirstChild().getNextSibling(), currentNode);
    }

    /**
     * Explores the xml section of resources and returns the name of all the present files
     * @return List of file names
     * @throws IOException - Missing files exception
     */
    private static List<String> getXMLTextFileNames() throws IOException {
        List<String> fileNames = new ArrayList<>();

        try (
                InputStream inputStream = getResourceAsStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream)))
        {
            String resource;

            while((resource = bufferedReader.readLine()) != null)
            {
                fileNames.add(resource);
            }
        }

        return fileNames;
    }

    /**
     * Auto closes the inputstream
     * @return Instance of InputStream for the explored path
     */
    private static InputStream getResourceAsStream() {
        try (InputStream in = getContextClassLoader().getResourceAsStream("xml")) {

            return in == null ? Util.class.getResourceAsStream("xml") : in;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns this class in its current Thread context
     * @return - Current context class
     */
    private static ClassLoader getContextClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }
}
