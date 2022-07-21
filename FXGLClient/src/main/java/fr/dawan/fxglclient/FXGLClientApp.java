package fr.dawan.fxglclient;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import fr.dawan.fxglclient.util.SettingUtil;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import static com.almasb.fxgl.dsl.FXGLForKtKt.getAssetLoader;
import static com.almasb.fxgl.dsl.FXGLForKtKt.getCutsceneService;
import static com.almasb.fxgl.dsl.FXGLForKtKt.onKeyDown;

public class FXGLClientApp extends GameApplication
{
    @Override
    protected void initSettings(GameSettings settings) {
        SettingUtil.setWindow(settings);
        SettingUtil.setAchievements(settings);
        SettingUtil.setMenus(settings);
    }

    @Override
    protected void initInput() {
        onKeyDown(KeyCode.F, () -> {
            var dialogue = getAssetLoader().loadDialogueGraph("intro.json");
            getCutsceneService().startDialogueScene(dialogue);
            return null;
        });
    }

    @Override
    protected void initGame() {
        FXGL.entityBuilder()
                .at(300, 300)
                .view(new Rectangle(100, 100, Color.BLUE))
                .view(new Text("Example"))
                .buildAndAttach();
    }

    public static void main(String[] args) {
        launch(args);
    }
}