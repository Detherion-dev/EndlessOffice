package fr.dawan.endlessoffice;

import fr.dawan.endlessoffice.client.fx.ChartApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static javafx.application.Application.launch;

@SpringBootApplication
public class TempJFXApplication
{
    public static void main(String[] args) {
        launch(ChartApplication.class, args);
    }
}
