package tests.multithread._backup.tasks;

import org.endlessoffice.triggers.tasks.Task;
import tests.multithread._backup.signals.MySignalTest;

public class Task2 extends Task {

    protected int iteration = 0;
    protected MySignalTest sharedSignal;

    //region Constructors
    public Task2() {
        super();
    }

    public Task2(String name) {
        super(name);
    }

    public Task2(String name, String description) {
        super(name, description);
    }

    public Task2(String name, String description, Integer startingTime) {
        super(name, description, startingTime);
    }
    //endregion

    public void run() {

        for (iteration = 0; iteration < 5; iteration++) {
            System.out.println("Task 2: iteration " + iteration);
            try {
                Thread.sleep(3333);
                sharedSignal.setData(iteration);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public int getIteration() {
        return iteration;
    }

    public MySignalTest getSharedSignal() {
        return sharedSignal;
    }

    public void setIteration(int iteration) {
        this.iteration = iteration;
    }

    public void setSharedSignal(MySignalTest sharedSignal) {
        this.sharedSignal = sharedSignal;
    }
}
