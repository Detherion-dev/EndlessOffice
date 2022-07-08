package fr.dawan.endlessoffice;

import fr.dawan.endlessoffice.javafx.client.ChartApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static javafx.application.Application.launch;

@SpringBootApplication
public class TempJFXApplication
{
    public static void main(String[] args) {
        launch(ChartApplication.class, args);
    }
}
