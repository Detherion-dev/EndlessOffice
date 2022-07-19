package fr.dawan.endlessoffice;

import fr.dawan.endlessoffice.utils.Util;
import fr.dawan.endlessoffice.entities.xml.structure.XMLNode;

public class TestXMLHandling
{
    public static void main(String[] args) {
        XMLNode node = Util.getText("intro");
        System.out.println(node);
    }
}
