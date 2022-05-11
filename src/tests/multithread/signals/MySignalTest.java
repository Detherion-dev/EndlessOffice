package tests.multithread.signals;

import java.util.Objects;

public class MySignalTest {
    private MonitorObject myMonitorObject = new MonitorObject();
    private Object data = null;
    public boolean hasNewData = false;

    public MySignalTest() {

    }

    public boolean hasDataToProcess() {
        return (!Objects.isNull(data));
    }

    public void doWait() {
        synchronized (myMonitorObject) {
            try {
                myMonitorObject.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void doNotify(){
        synchronized(myMonitorObject){
            myMonitorObject.notify();
        }
    }

    public void put(Object data) {
        hasNewData = true;
        this.data = data;
        doWait();
    }

    public Object getData() {
        hasNewData = false;
        return data;
    }

    public void setData(Object data) {
        hasNewData = true;
        this.data = data;
    }
}
