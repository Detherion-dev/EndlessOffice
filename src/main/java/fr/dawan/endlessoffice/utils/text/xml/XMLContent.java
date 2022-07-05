package fr.dawan.endlessoffice.utils.text.xml;

import fr.dawan.endlessoffice.utils.text.enums.TextStyle;

public class XMLContent
{
    private TextStyle style;
    private Object content;

    public XMLContent()
    {
        style = TextStyle.NONE;
    }

    public TextStyle getStyle() {
        return style;
    }

    public void setStyle(TextStyle style) {
        this.style = style;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
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
