package main.java.endlessoffice.gameloop;


// Module import
import java.util.Scanner;

import main.java.endlessoffice.entity.Clock;


public class GameLoop {
    private final static int TIME_INTERVAL = 5;                             // Time duration between two iterations (min)
    private final static int ITERATION_NUMBER = 2 * 60 * 24 / TIME_INTERVAL;// Number of iterations
    private int iteration;
    private Clock clock;

    //region Constructors
    public GameLoop(){
        iteration = 0;
        clock = new Clock();
    }
    //endregion

    public void run() {
        Scanner monitor = new Scanner(System.in);


        for (int i = 0; i <= ITERATION_NUMBER; i++) {
            runOnIterationN(i);
        }
    }

    private void runOnIterationN(int N) {

    }
}
