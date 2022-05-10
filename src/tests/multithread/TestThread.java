package tests.multithread;

import tests.multithread.tasks.Task1;
import tests.multithread.tasks.Task2;
import tests.multithread.signals.MySignalTest;

public class TestThread {
    public static Task1 task1 = new Task1("task1", "executes some sleep instructions", 0);
    public static Task2 task2 = new Task2("task2", "change task1 iteration value", 0);

    public static void main(String[] args) {
        MySignalTest signal = new MySignalTest();
        task1.setSharedSignal(signal);
        task2.setSharedSignal(signal);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();

        try {
            for (int i = 0; i < 20; i++) {

                Thread.sleep(1515);
                int iteration1 = task1.getIteration();
                int iteration2 = task2.getIteration();
                System.out.println("Main Thread iteration: " + i + " (1-" + iteration1 + ", 2-" + iteration2 + ")");
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
