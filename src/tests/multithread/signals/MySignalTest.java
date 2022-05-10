package tests.multithread.signals;

import java.util.Objects;

public class MySignalTest {
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
