package tests.multithread.tasks;

import org.endlessoffice.triggers.Task;

public class Task1 extends Task {

    protected int iteration = 0;

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

        for (iteration = 0; iteration < 20; iteration++) {
            System.out.println("Task 1: iteration " + iteration);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public int getIteration() {
        return iteration;
    }

    public void setIteration(int iteration) {
        this.iteration = iteration;
    }
}
