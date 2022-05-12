package org.endlessoffice.core;

import org.endlessoffice.core.characters.actions.ActionDevelop;
import org.endlessoffice.core.characters.actions.ActionWastingTime;

import java.util.Scanner;

public class GameLoop {

    private final static int FINAL_TIME = 288; // 1 = 5 min
    private boolean isRunning = true;

    public void run() {
        Scanner monitor = new Scanner(System.in);
        int newt = 0;
        String action = "waiting";

        for (int t=0; t <= FINAL_TIME; t++) {
            System.out.println("Time " + t*5 + " min - Current action: " + action);
            if (t >= newt) {
                System.out.println("Select your task:\n\t1 - Wasting time\n\t2 - Develop");
                int chosenCase = monitor.nextInt();

                int dt = 0;
                switch (chosenCase) {
                    case 1:
                        action = "wasting time";
                        ActionWastingTime awt = new ActionWastingTime(monitor);
                        dt = awt.run();
                        break;
                    case 2 :
                        action = "develop";
                        ActionDevelop ad = new ActionDevelop();
                        dt = ad.run();
                }
                newt = t + dt;
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
