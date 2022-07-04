package fr.dawan.endlessoffice;

import fr.dawan.endlessoffice.utils.Util;
import fr.dawan.endlessoffice.utils.xml.XMLNode;

public class Test
{
    public static void main(String[] args) {
        Util.addText();

        XMLNode node = Util.getText("secondTextFile");
        System.out.println(node);
    }
}
