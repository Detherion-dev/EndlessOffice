package fr.dawan.stockui;

import javafx.stage.Stage;
import org.springframework.context.ApplicationListener;
import fr.dawan.stockui.ChartApplication.StageReadyEvent;
import org.springframework.stereotype.Component;

@Component
public class StageInitializer implements ApplicationListener<StageReadyEvent> {
    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        Stage stage = event.getStage();
    }
}
