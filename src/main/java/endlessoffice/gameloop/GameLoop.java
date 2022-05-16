package main.java.endlessoffice.gameloop;


// Module import
import java.util.Scanner;


public class GameLoop {
    private final static int TIME_INTERVAL = 5;                             // Time duration between two iterations (min)
    private final static int ITERATION_NUMBER = 1 * 60 * 24 / TIME_INTERVAL;// Number of iterations
    private int iteration;
    private Clock clock;

    //region Constructors
    public GameLoop(){
        clock = new Clock();
    }
    //endregion

    public void run() {
        Scanner monitor = new Scanner(System.in);


        for (iteration = 0; iteration <= ITERATION_NUMBER; iteration++) {
            runOnIterationN(iteration);
        }
    }

    private void runOnIterationN(int t) {
        System.out.println("Time " + TIME_INTERVAL * t);
    }
}
