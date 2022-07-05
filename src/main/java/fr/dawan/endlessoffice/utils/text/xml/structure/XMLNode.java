package fr.dawan.endlessoffice.utils.text.xml.structure;

import fr.dawan.endlessoffice.utils.text.enums.NodeType;

import java.util.ArrayList;
import java.util.List;

public class XMLNode
{
    private static int tab = 0;

    private NodeType nodeType;
    private final List<XMLContent> nodeContents = new ArrayList<>();
    private final List<XMLNode> children;
    private String numeration, fileName;
    private boolean isFileName;

    public XMLNode()
    {
        children = new ArrayList<>();
        isFileName = false;
        numeration = "";
        fileName = "";
    }

    public NodeType getNodeType()
    {
        return nodeType;
    }

    public void setNodeType(NodeType nodeType)
    {
        this.nodeType = nodeType;
    }

    public void addContent(XMLContent content)
    {
        nodeContents.add(content);
    }

    public void addChild(XMLNode newChild) {
        children.add(newChild);
    }

    public void setNumeration(String numeration) {
        if(Character.isDigit(numeration.charAt(numeration.length()-2)))
            this.numeration = numeration;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void isFileName() {
        isFileName = true;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        String tabS = "    ";
        String node = nodeType.toString() + numeration;

        if(isFileName)
            node = fileName;

        builder.append("<").append(node).append(">");

        if(nodeContents.size() > 0) {
            for (XMLContent content : nodeContents) {
                builder.append(content.toString());
            }
            builder.append("</").append(node).append(">");
        }
        else {
            tab++;
            for (XMLNode child : children) {
                builder.append("\n").append(tabS.repeat(tab)).append(child);
            }
            tab--;
            builder.append("\n").append(tabS.repeat(tab)).append("</").append(node).append(">");
        }
        return builder.toString();
    }
}
