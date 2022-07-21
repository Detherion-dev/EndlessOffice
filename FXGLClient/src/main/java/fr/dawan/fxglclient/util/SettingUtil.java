package fr.dawan.fxglclient.util;

import com.almasb.fxgl.achievement.Achievement;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.app.MenuItem;

import java.util.Arrays;
import java.util.EnumSet;

public class SettingUtil
{
    public final static String VERSION = "1.0.0-SNAPSHOT";

    private final static int APPLICATION_WIDTH = 800;
    private final static int APPLICATION_HEIGHT = 600;

    private final static String[] CREDITS = {
            "Game Framework - Almas Baimagambetov",
            "Company - Dawan.INC",
            "Project Coordinator - Greg Marshall",
            "Lead Developer - Thomas Noiret",
            "Responsible Art Style - Aurelien Bjornson"
        };

    /**
     * Adds Achievements to game
     * @param settings - settings context
     */
    public static void setAchievements(GameSettings settings)
    {
        settings.getAchievements().add(new Achievement("New Game", "Wow! You made it!!", "", 0));
    }

    /**
     * Sets game menus
     * @param settings - settings context
     */
    public static void setMenus(GameSettings settings)
    {
        settings.setTitle("Endless Office");
        settings.setMainMenuEnabled(true);
        settings.setGameMenuEnabled(true);

        settings.getCredits().addAll(Arrays.asList(CREDITS));
        settings.setEnabledMenuItems(EnumSet.of(MenuItem.SAVE_LOAD, MenuItem.EXTRA));
    }

    /**
     * Sets game window view
     * @param settings - settings context
     */
    public static void setWindow(GameSettings settings)
    {
        settings.setWidth(APPLICATION_WIDTH);
        settings.setHeight(APPLICATION_HEIGHT);
        settings.setFullScreenAllowed(true);
        settings.setVersion(VERSION);
    }
}
