package tests.multithread._backup.actions;

import org.endlessoffice.triggers.tasks.Task;
import org.endlessoffice.triggers.signals.Signal;
import tests.multithread._backup.MonitorObject;
import tests.multithread._backup.signals.MonitorObject;

import java.util.HashMap;
import java.util.Map;

public class ActionGlander extends Task {
    private final static MonitorObject myMonitorObject = new MonitorObject();
    protected Map<String, Signal> sharedSignals = new HashMap<>();

    public ActionGlander() {
        super("Glander", "Glander", 0);
    }

    public void run() {
        int iteration = 0;

        for (iteration=1; iteration < 21; iteration++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Glander: iteration " + iteration);

        }
    }

    public void addSignal(Signal signal) {
        this.sharedSignals.put(signal.getName(), signal);
    }

    public void deleteSignal(String signal) {
        this.sharedSignals.remove(signal);
    }

    public void actionOff() {
        synchronized(this){
            try{
                this.wait();
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void actionOn() {
        synchronized(this){
            this.notify();
        }
    }
}
