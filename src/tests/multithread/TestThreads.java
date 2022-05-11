package tests.multithread;

import tests.multithread.actions.ActionGlander;
import tests.multithread.signals.MyWaitNotify;

public class TestThreads {

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        ActionGlander rGlander = new ActionGlander();
        MyWaitNotify sWN = new MyWaitNotify();
        rGlander.sharedSignal = sWN;
        Thread tGlander = new Thread(rGlander);

        tGlander.start();

        for (int iteration = 1; iteration < 21; iteration++) {
            if (iteration % 2 == 0) {
                sWN.doNotify();
            }
            try {
                Thread.sleep(1111);
                System.out.println("Main thread iteration " + iteration);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
