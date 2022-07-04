package fr.dawan.endlessoffice.utils.xml;

import java.util.ArrayList;
import java.util.List;

public class XMLNode
{
    private static int tab = 0;

    private String nodeName;
    private Object nodeContent;
    private final List<XMLNode> children;

    public XMLNode()
    {
        children = new ArrayList<>();
    }

    public String getNodeName()
    {
        return nodeName;
    }

    public void setNodeName(String nodeName)
    {
        this.nodeName = nodeName;
    }

    public Object getNodeContent() {
        return nodeContent;
    }

    public void setNodeContent(Object nodeContent) {
        this.nodeContent = nodeContent;
    }

    public void addChild(XMLNode newChild) {
        children.add(newChild);
    }

    public XMLNode getChildNode(int child) {
        return children.get(child);
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        String tabS = "     ";

        builder.append("<").append(nodeName).append(">");

        if(nodeContent != null)
            builder.append(nodeContent).append("</").append(nodeName).append(">");
        else {
            tab++;
            for (XMLNode child : children) {
                builder.append("\n").append(tabS.repeat(tab)).append(child);
            }
            tab--;
            builder.append("\n").append(tabS.repeat(tab)).append("</").append(nodeName).append(">");
        }

        return builder.toString();
    }
}
