package tests.multithread._backup.tasks;

import org.endlessoffice.triggers.tasks.Task;
import tests.multithread._backup.signals.MySignalTest;

public class Task3 extends Task{
    public int iteration;
    protected MySignalTest sharedSignal;

    //region Constructors
    public Task3() {
        super();
    }

    public Task3(String name) {
        super(name);
    }

    public Task3(String name, String description) {
        super(name, description);
    }

    public Task3(String name, String description, Integer startingTime) {
        super(name, description, startingTime);
    }
    //endregion

    public void run() {
        for (iteration = 1; iteration < 5; iteration++) {
            System.out.println("Task 3: iteration " + iteration);

            if (iteration == 2) {
                System.out.println("Task 3: set data and notify signal");
                sharedSignal.doNotify();
                sharedSignal.setData(iteration);
            }

            try {
                Thread.sleep(3333);

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public MySignalTest getSharedSignal() {
        return sharedSignal;
    }

    public int getIteration() {
        return iteration;
    }

    public void setSharedSignal(MySignalTest sharedSignal) {
        this.sharedSignal = sharedSignal;
    }

    public void setIteration(int iteration) {
        this.iteration = iteration;
    }
}
