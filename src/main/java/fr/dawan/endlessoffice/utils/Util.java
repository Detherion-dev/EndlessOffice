package fr.dawan.endlessoffice.utils;

import fr.dawan.endlessoffice.utils.text.xml.XMLHandler;
import fr.dawan.endlessoffice.entities.xml.structure.XMLNode;

import java.util.HashMap;

public class Util
{
    public static final int MAX_RECURSIVE_DEPTH = 10;

    private static final XMLHandler XML_HANDLER = new XMLHandler();
    private static final HashMap<String, XMLNode> TEXTS = XML_HANDLER.addAllText();

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
