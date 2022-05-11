package tests.multithread._backup.signals;

import org.endlessoffice.triggers.signals.Signal;

public class SignalOnOff extends Signal{
    private final static tests.multithread._backup.signals.MonitorObject myMonitorObject = new tests.multithread._backup.signals.MonitorObject();

    public SignalOnOff() {
        super("OnOff", "Interrupt or Relaunch the Event");
    }

    public void eventOff(){
        synchronized(myMonitorObject){
            try{
                myMonitorObject.wait();
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void eventOn(){
        synchronized(myMonitorObject){
            myMonitorObject.notify();
        }
    }
}
