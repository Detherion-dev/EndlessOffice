package tests.multithread.eoobjects;

public class Waiter<T> implements Runnable{

    private T object;

    public Waiter(T o){
        this.object=o;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (object) {
            try{
                System.out.println(name+" waiting to get notified at time:"+System.currentTimeMillis());
                object.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
            //process the message now
            System.out.println(name+" processed: "+object.toString());
        }
    }

}
