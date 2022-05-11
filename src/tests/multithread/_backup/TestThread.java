package tests.multithread._backup;

import tests.multithread._backup.signals.SignalOnOff;
import tests.multithread._backup.tasks.Task1;
import tests.multithread._backup.tasks.Task2;
import tests.multithread._backup.tasks.Task3;
import tests.multithread._backup.signals.MySignalTest;
import tests.multithread._backup.actions.ActionGlander;

public class TestThread {
    public static Task1 task1 = new Task1("task1", "executes some sleep instructions", 0);
    public static Task2 task2 = new Task2("task2", "change task1 iteration value", 0);
    public static Task3 task3 = new Task3("task3", "launches wait/notify orders", 0);

    public static void main(String[] args) {
        // test1();
        // test2();
        test3();
    }

    public static void test1() {
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

    public static void test2() {
        MySignalTest signal = new MySignalTest();
        task1.setSharedSignal(signal);
        task3.setSharedSignal(signal);

        Thread thread1 = new Thread(task1);
        Thread thread3 = new Thread(task3);
        thread1.start();
        thread3.start();

        try {
            for (int i = 0; i < 20; i++) {

                Thread.sleep(1515);
                int iteration1 = task1.getIteration();
                int iteration2 = task3.getIteration();
                System.out.println("Main Thread iteration: " + i + " (1-" + iteration1 + ", 2-" + iteration2 + ")");
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void test3() {
        SignalOnOff sOnOff = new SignalOnOff();
        ActionGlander tGlander = new ActionGlander();

        tGlander.start();

        for (int i = 1; i < 20; i++) {
            if (i % 2 == 0) {
                tGlander.actionOff();
            } else {
                tGlander.actionOn();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
