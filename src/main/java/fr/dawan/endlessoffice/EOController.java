package fr.dawan.endlessoffice;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EOController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
