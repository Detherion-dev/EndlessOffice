package fr.dawan.endlessoffice.entities.xml.structure;

import fr.dawan.endlessoffice.utils.text.enums.NodeType;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="xmlnodes")
public class XMLNode implements Serializable
{
    private static final long serialVersionUID = -854651568L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;
    @Transient
    private static int tab = 0;
    @Enumerated(EnumType.STRING)
    private NodeType nodeType;
    @OneToMany(mappedBy = "xmlNodeParent", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private final List<XMLContent> nodeContents;
    @OneToMany(mappedBy = "parentXMLNode", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private final List<XMLNode> children;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parent",referencedColumnName = "id")
    private XMLNode parentXMLNode;
    private String numeration;
    private String fileName;
    private boolean isFileName;

    public XMLNode()
    {
        nodeType = NodeType.NONE;
        children = new ArrayList<>();
        nodeContents = new ArrayList<>();
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

    public boolean isThisFileName() {
        return isFileName;
    }

    public XMLNode getChild(int index) {
        if(children.size() > 0)
            return children.get(index);
        else
            return null;
    }

    public List<XMLContent> getNodeContents()
    {
        return nodeContents;
    }

    public String getNumeration()
    {
        return numeration;
    }

    public String getFileName() {
        return fileName;
    }

    public XMLNode getParentXMLNode() {
        return parentXMLNode;
    }

    public void setParentXMLNode(XMLNode parentXMLNode) {
        this.parentXMLNode = parentXMLNode;
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
