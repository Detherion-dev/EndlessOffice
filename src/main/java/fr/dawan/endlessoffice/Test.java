package fr.dawan.endlessoffice;

import fr.dawan.endlessoffice.utils.Util;
import fr.dawan.endlessoffice.utils.text.xml.XMLNode;

public class Test
{
    public static void main(String[] args) {
        XMLNode node = Util.getText("intro");
        System.out.println(node.toString());
    }
}
