package tests.multithread;

import org.endlessoffice.triggers.Task;
import tests.multithread.tasks.Task1;

public class testThread {

    public static void main(String[] args) {
        Task1 task1 = new Task1("task1", "executes some sleep instructions", 0);
        Thread thread1 = new Thread(task1);
        thread1.start();
        int iteration = 0;

        try {
            for (int i=0; i < 10; i++) {
                Thread.sleep(1500);
                iteration = task1.getIteration();
                System.out.println("Main Thread iteration: " + i + "(" + iteration + ")");
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
