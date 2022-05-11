package tests.multithread.eoobjects;

public class Notifier <T> implements Runnable {
    private T object;

    public Notifier(T o) {
        this.object = o;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(1000);
            synchronized (object) {
                object.notify();
                // msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
