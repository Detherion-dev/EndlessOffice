package fr.dawan.endlessoffice.utils;

import fr.dawan.endlessoffice.repository.UserRepository;
import fr.dawan.endlessoffice.utils.text.xml.XMLHandler;
import fr.dawan.endlessoffice.entities.xml.structure.XMLNode;
import org.springframework.context.ApplicationContext;

import java.util.HashMap;

public class Util
{
    public static final int MAX_RECURSIVE_DEPTH = 10;

    private static ApplicationContext context;

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

    /**
     * Must be called at app start to set up context actions with database
     * @param appContext - Spring app context
     */
    public static void setContext(ApplicationContext appContext)
    {
        context = appContext;
    }

    /**
     * Gets the user repository bean
     * @return - User Repository
     */
    public static UserRepository getUserRepository()
    {
        return context.getBean(UserRepository.class);
    }
}
