package org.endlessoffice.triggers.signals;

import org.endlessoffice.triggers.Trigger;

public class Signal extends Trigger {

    //region Constructors
    public Signal() {
        super();
    }

    public Signal(String name) {
        super(name);
    }

    public Signal(String name, String description) {
        super(name, description);
    }

    public Signal(String name, String description, Integer startingTime) {
        super(name, description, startingTime);
    }
    //endregion

    public void run() {
        // TODO
    }


}
