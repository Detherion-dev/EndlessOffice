package fr.dawan.endlessoffice.utils;

import fr.dawan.endlessoffice.utils.text.xml.Texts;
import fr.dawan.endlessoffice.utils.text.xml.XMLHandler;
import fr.dawan.endlessoffice.utils.text.xml.XMLNode;

public class Util
{
    private static final XMLHandler XML_HANDLER = new XMLHandler();
    private static final Texts TEXTS = XML_HANDLER.addAllText();

    public static XMLNode getText(String textFileName)
    {
        return TEXTS.get(textFileName);
    }
}
