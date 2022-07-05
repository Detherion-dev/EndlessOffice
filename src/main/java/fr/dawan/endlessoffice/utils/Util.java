package fr.dawan.endlessoffice.utils;

import fr.dawan.endlessoffice.utils.text.xml.structure.Texts;
import fr.dawan.endlessoffice.utils.text.xml.XMLHandler;
import fr.dawan.endlessoffice.utils.text.xml.structure.XMLNode;

public class Util
{
    private static final XMLHandler XML_HANDLER = new XMLHandler();
    private static final Texts TEXTS = XML_HANDLER.addAllText();

    /**
     * Gets the text from read text file
     * @param textFileName - name of the text to load
     * @return - xml node containing text data
     */
    public static XMLNode getText(String textFileName)
    {
        return TEXTS.get(textFileName);
    }
}
