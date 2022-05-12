package org.endlessoffice.core;

import java.util.Scanner;

public class GameLoop {
    private final static int FINAL_TIME = 288; // 1 = 5 min
    private boolean isRunning = true;

    public void run() {
        Scanner monitor = new Scanner(System.in);
        int newT = 0;

        for (int t=0; t <= FINAL_TIME; t++) {
            System.out.println("Time " + t*5 + " min");

            if (t >= newT) {
                System.out.println("Increment the time (1 = 5 min): ");
                int dt = monitor.nextInt();
                newT = t + dt;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }
}
