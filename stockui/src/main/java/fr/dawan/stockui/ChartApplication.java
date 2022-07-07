package fr.dawan.stockui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

public class ChartApplication extends Application {

    private ConfigurableApplicationContext applicationContext;

    @Override
    public void start(Stage stage) {
        applicationContext.publishEvent(new StageReadyEvent(stage));
    }

    @Override
    public void init() {
        applicationContext = new SpringApplicationBuilder(StockUiApplication.class).run();
    }

    @Override
    public void stop() {
        applicationContext.close();
        Platform.exit();
    }

    public static class StageReadyEvent extends ApplicationEvent {
        private static final long serialVersionUID = -8757196013589092601L;

        public StageReadyEvent(Stage stage) {
            super(stage);
        }

        public Stage getStage() {
            return (Stage) getSource();
        }
    }
}
