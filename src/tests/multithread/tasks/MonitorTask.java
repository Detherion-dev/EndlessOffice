package tests.multithread.tasks;

import org.endlessoffice.triggers.Task;

public class MonitorTask extends Task {

    //region Constructors
    public MonitorTask() {
        super();
    }

    public MonitorTask(String name) {
        super(name);
    }

    public MonitorTask(String name, String description) {
        super(name, description);
    }

    public MonitorTask(String name, String description, Integer startingTime) {
        super(name, description, startingTime);
    }
    //endregion

}
