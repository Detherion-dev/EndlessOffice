package fr.dawan.endlessoffice.utils.text.xml.structure;

import fr.dawan.endlessoffice.utils.text.enums.TextStyle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class XMLContentTest {

    XMLContent content, defaultContent, styledContent;
    final String contentString = "Hi! I am content";
    final String styledContentString = "Hi! I am styled content";

    @BeforeEach
    void setUp()
    {
        content = new XMLContent();
        styledContent = new XMLContent();
        defaultContent = new XMLContent();

        content.setContent(contentString);
        styledContent.setContent(styledContentString);
        styledContent.setStyle(TextStyle.I);
    }

    @Test
    void testDefaultConstruction()
    {
        assertEquals(TextStyle.NONE, defaultContent.getStyle());
        assertNull(defaultContent.getContent());

        assertNotEquals(TextStyle.NONE, styledContent.getStyle());
        assertNotEquals(null, content.getContent());
    }

    @Test
    void testToString1()
    {
        assertEquals(contentString, content.toString());
        assertEquals("<" + styledContent.getStyle() + ">" +
                styledContent.getContent() + "</" + styledContent.getStyle() + ">",
                styledContent.toString());
    }
}