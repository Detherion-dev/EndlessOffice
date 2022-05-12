package tests.multithread.actions;


import tests.multithread.signals.MyWaitNotify;

public class ActionGlander implements Runnable {
    private String name;
    private String description;
    private int startingTime;

    public MyWaitNotify sharedSignal;

    public ActionGlander() {

    }

    public ActionGlander(String name) {
        this();
        this.name = name;
    }

    public ActionGlander(String name, String description) {
        this(name);
        this.description = description;
    }

    public ActionGlander(String name, String description, int startingTime) {
        this(name, description);
        this.startingTime = startingTime;
    }

    public void run() {
        int iteration = 0;

        for (iteration=1; iteration < 21; iteration++) {
            try {
                Thread.sleep(2222);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Glander: iteration " + iteration);
            getCurrentThread();

        }
    }

    public void actionOff() {
        Thread currentThread = Thread.currentThread();
        synchronized (currentThread) {
            try {
                currentThread.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void getCurrentThread() {
        System.out.println(Thread.currentThread().getName());
    }

}