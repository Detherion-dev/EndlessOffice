package org.endlessoffice.core.characters.actions;

import java.util.Scanner;

public class ActionWastingTime {
    private Scanner monitor;

    public ActionWastingTime() {}

    public ActionWastingTime(Scanner monitor) {
        this();
        this.monitor = monitor;
    }

    public int run() {
        System.out.println("Spend time (1 unit = 5 min): ");
        int dt = monitor.nextInt();
        return dt;
    }
}
