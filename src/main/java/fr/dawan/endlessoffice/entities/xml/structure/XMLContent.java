package fr.dawan.endlessoffice.entities.xml.structure;

import fr.dawan.endlessoffice.utils.text.enums.TextStyle;

import javax.persistence.*;

@Entity
public class XMLContent
{
    private static final long serialVersionUID = -86455469461L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private TextStyle style;
    private String content;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private XMLNode xmlNodeParent;

    public XMLContent()
    {
        style = TextStyle.NONE;
    }

    public void setStyle(TextStyle style) {
        this.style = style;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TextStyle getStyle() {
        return style;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString()
    {
        if(style.equals(TextStyle.NONE))
        {
            return content.toString();
        }
        else
        {
            return "<" + style + ">" + content.toString() + "</" + style + ">";
        }
    }
}
