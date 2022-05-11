package tests.multithread._backup.tasks;

import org.endlessoffice.triggers.tasks.Task;
import tests.multithread._backup.signals.MySignalTest;

public class Task1 extends Task {

    protected int iteration = 0;
    protected MySignalTest sharedSignal;

    //region Constructors
    public Task1() {
        super();
    }

    public Task1(String name) {
        super(name);
    }

    public Task1(String name, String description) {
        super(name, description);
    }

    public Task1(String name, String description, Integer startingTime) {
        super(name, description, startingTime);
    }
    //endregion

    public void run() {


        if (!sharedSignal.hasDataToProcess()) {
            System.out.println("Task 1 is waiting...");
            sharedSignal.doWait();
        }

        for (iteration = 0; iteration < 10; iteration++) {
            if (sharedSignal.hasNewData) {
                iteration = (int) sharedSignal.getData();
            }

            System.out.println("Task 1: iteration " + iteration);
            try {
                Thread.sleep(1111);
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
