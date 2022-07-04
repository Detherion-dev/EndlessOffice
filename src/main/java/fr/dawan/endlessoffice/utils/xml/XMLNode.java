package fr.dawan.endlessoffice.utils.xml;

import java.util.ArrayList;
import java.util.List;

public class XMLNode
{
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
}
