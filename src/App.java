import main.java.endlessoffice.gameloop.GameLoop;

public class App {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        GameLoop gp = new GameLoop();
        gp.run();
        long endTime = System.currentTimeMillis();
        System.out.println("time calculation: " + (endTime - startTime) + " milliseconds");
    }
}
