package fr.dawan.endlessoffice.utils.text.xml;

import fr.dawan.endlessoffice.utils.Util;
import fr.dawan.endlessoffice.utils.text.enums.NodeType;
import fr.dawan.endlessoffice.utils.text.enums.TextStyle;
import fr.dawan.endlessoffice.utils.text.xml.structure.XMLContent;
import fr.dawan.endlessoffice.utils.text.xml.structure.XMLNode;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class XMLHandler
{
    public XMLHandler()
    {

    }

    /**
     * Returns all texts present in the resources/xml folder
     * @return - Texts from text xml files
     */
    public HashMap<String, XMLNode> addAllText()
    {
        HashMap<String, XMLNode> texts = new HashMap<>();

        try {
            List<String> fileNames = getXMLTextFileNames();

            for (String s : fileNames)
            {
                texts.put(s.substring(0, s.length()-4), parseXML(s));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return texts;
    }

    /**
     * Parse information from xml file to XMLNode object
     * @param xmlFileName - xml file to parse
     * @return - XML Node with information from file
     */
    private XMLNode parseXML(String xmlFileName)
    {
        XMLNode nodes = new XMLNode();

        try
        {
            Node node = prepareNode(xmlFileName);

            if(node.getNodeType() == Node.ELEMENT_NODE)
            {
                nodes.isFileName();
                nodes.setFileName(xmlFileName.substring(0, xmlFileName.length()-4));
                nodes.setNodeType(NodeType.NONE);
                exploreNodeList((Element)node, nodes, 0);
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
     * Explore the nodes recursively while checking their format
     * @param node - current node to explore
     * @param parentNode - parent XMLNode
     */
    private void exploreNodeList(Element node, XMLNode parentNode, int depth)
    {
        //We set up the current Node with its type and numeration (will be checked in setNumeration())
        XMLNode currentNode = new XMLNode();
        currentNode.setNodeType(convertNodeToType(node));
        currentNode.setNumeration(node.getNodeName().substring(node.getNodeName().length()-2));

        //add to parent if node respects file format
        if(!currentNode.getNodeType().equals(NodeType.NONE) && isTextFormatAtDepth(currentNode.getNodeType(), depth))
        {
            parentNode.addChild(currentNode);

            //check if node is element
            if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                //check for next sibling, will recursively explore until no siblings left
                if (node.getNextSibling() != null)
                    if (node.getNextSibling().getNextSibling() != null)
                        exploreNodeList((Element) node.getNextSibling().getNextSibling(), parentNode, depth);

                //in this case the node has content and needs to parse the content style
                //since we are at the content level we do not check for children
                if(currentNode.getNodeType().equals(NodeType.L) || currentNode.getNodeType().equals(NodeType.C))
                {
                    //when style is present there might be more than one content sibling
                    Node currentChild = node.getFirstChild();
                    do
                    {
                        currentNode.addContent(parseContent(currentChild));
                        currentChild = currentChild.getNextSibling();
                    }
                    while(currentChild != null);
                }
                else
                {
                    //check for children, will recursively
                    if (node.getFirstChild().getNextSibling() != null)
                        exploreNodeList((Element) node.getFirstChild().getNextSibling(), currentNode, ++depth);
                }
            }
        }
    }

    private boolean isTextFormatAtDepth(NodeType type, int depth)
    {
        return type.getDepth() == depth;
    }

    /**
     * Checks if the content of the node has a style
     * @param currentChild - node we are currently parsing
     * @return - styled content from currentChild node
     */
    private XMLContent parseContent(Node currentChild)
    {
        XMLContent content = new XMLContent();

        if(currentChild.getNodeValue() != null) {
            content.setContent(currentChild.getNodeValue());
            content.setStyle(TextStyle.NONE);
        }
        else
        {
            switch (currentChild.getNodeName())
            {
                case "b":
                    content.setStyle(TextStyle.B);
                    break;
                case "i":
                    content.setStyle(TextStyle.I);
                    break;
                default:
                    content.setStyle(TextStyle.NONE);
                    break;
            }
            content.setContent(currentChild.getFirstChild().getNodeValue());
        }
        return content;
    }

    /**
     * Prepares the node for xml parsing from xml file name
     * @param xmlFileName - XML file to read from node
     * @return - node to parse
     * @throws ParserConfigurationException - Error for parsing configuration
     * @throws IOException - Input output issues
     * @throws SAXException - xml issues
     */
    private Node prepareNode(String xmlFileName) throws ParserConfigurationException, IOException, SAXException
    {
        InputStream inputStream = getContextClassLoader().getResourceAsStream("xml/"+xmlFileName);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(inputStream);
        document.getDocumentElement().normalize();
        NodeList nodeList = document.getElementsByTagName("text");

        return nodeList.item(0);
    }

    private NodeType convertNodeToType(Element node)
    {
        String nodeName = node.getNodeName();

        if(Character.isDigit(nodeName.charAt(nodeName.length()-2)))
            nodeName = nodeName.substring(0, nodeName.length() - 2);

        switch (nodeName)
        {
            case "text":
                return NodeType.TEXT;
            case "section":
                return  NodeType.SECTION;
            case "choice":
                return  NodeType.CHOICE;
            case "answer":
                return  NodeType.ANSWER;
            case "bl":
                return  NodeType.BL;
            case "l":
                return  NodeType.L;
            case "c":
                return  NodeType.C;
            case "a":
                return  NodeType.A;
            default:
                return NodeType.NONE;
        }
    }

    /**
     * Explores the xml section of resources and returns the name of all the present files
     * @return List of file names
     * @throws IOException - Missing files exception
     */
    private List<String> getXMLTextFileNames() throws IOException {
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
     * Auto closes the input stream
     * @return Instance of InputStream for the explored path
     */
    private InputStream getResourceAsStream() {
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
    private ClassLoader getContextClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }
}
