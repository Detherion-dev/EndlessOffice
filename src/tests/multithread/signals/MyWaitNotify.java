package tests.multithread.signals;

public class MyWaitNotify{

    private static final MonitorObject myMonitorObject = new MonitorObject();

    public void doWait(){
        synchronized(myMonitorObject){
            try{
                System.out.println("Wait");
                myMonitorObject.wait();
            } catch(InterruptedException e){ e.printStackTrace();}
        }
    }

    public void doNotify(){
        synchronized(myMonitorObject){
            myMonitorObject.notify();
            System.out.println("Notify");
        }
    }
}