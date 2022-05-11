package tests.multithread._backup.signals;

public class MyWaitNotifySignal {

    public final tests.multithread._backup.signals.MonitorObject myMonitorObject = new tests.multithread._backup.signals.MonitorObject();

    public void doWait(){
        synchronized(myMonitorObject){
            try{
                myMonitorObject.wait();
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void doNotify(){
        synchronized(myMonitorObject){
            myMonitorObject.notify();
        }
    }

}
