package fr.dawan.endlessoffice.utils.text.xml.structure;

import fr.dawan.endlessoffice.utils.text.enums.NodeType;
import fr.dawan.endlessoffice.utils.text.enums.TextStyle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class XMLNodeTest {

    XMLNode node, defaultNode, fileNameNode;
    final String contentString = "Hi! I am content!";
    final String styledContentString = "With styled content!";

    @BeforeEach
    void setUp()
    {
        XMLContent content = new XMLContent();
        content.setContent(contentString);

        node = new XMLNode();
        defaultNode = new XMLNode();
        fileNameNode = new XMLNode();

        node.setNodeType(NodeType.L);
        node.addContent(content);
        content = new XMLContent();
        content.setStyle(TextStyle.B);
        content.setContent(styledContentString);
        node.addContent(content);
        node.setNumeration("00");

        fileNameNode.isFileName();
        fileNameNode.setFileName("test");
        fileNameNode.addChild(node);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDefaultConstruction() {
        assertNull(defaultNode.getNodeType());
        assertNull(defaultNode.getChild(0));
        assertEquals(0, defaultNode.getNodeContents().size());
        assertFalse(defaultNode.isThisFileName());
        assertEquals("", defaultNode.getNumeration());
        assertEquals("", defaultNode.getFileName());

        assertNotEquals(null, node.getNodeType());
        assertNotEquals(null, fileNameNode.getChild(0));
        assertNotEquals(null, node.getNodeContents().get(0));
        assertTrue(fileNameNode.isThisFileName());
        assertNotEquals("", node.getNumeration());
        assertNotEquals("", fileNameNode.getFileName());
    }

    @Test
    void testToString()
    {
        String tabs = "    ";
        String fileName = fileNameNode.getFileName();
        String childNode = fileNameNode.getChild(0).getNodeType().toString() +
                fileNameNode.getChild(0).getNumeration();

        String exp =    "<" + fileName + ">\n" +
                        tabs + "<" + childNode + ">" + contentString + "<b>" + styledContentString + "</b></" + childNode + ">\n" +
                        "</" + fileName + ">";

        assertEquals(exp, fileNameNode.toString());
    }
}