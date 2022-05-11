package tests.multithread._backup.signals;

import tests.multithread._backup.MyWaitNotifySignal;

import java.util.Objects;

public class MySignalTest extends MyWaitNotifySignal {
    private Object data = null;
    public boolean hasNewData = false;

    public MySignalTest() {

    }

    public boolean hasDataToProcess() {
        return (!Objects.isNull(data));
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
