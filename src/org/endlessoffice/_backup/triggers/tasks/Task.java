package org.endlessoffice.triggers.tasks;

// Module import
import org.endlessoffice.characters.Character;
import org.endlessoffice.triggers.Trigger;

public abstract class Task extends Trigger {
    protected Integer duration;
    protected Character owner;

    //region Constructors
    public Task() {
        super();
    }

    public Task(String name) {
        super(name);
    }

    public Task(String name, String description) {
        super(name, description);
    }

    public Task(String name, String description, Integer startingTime) {
        super(name, description, startingTime);
    }

    //region run method
    @Override
    public void run() {
        // TODO
    }

    //endregion

    //region Getters

    //endregion
}
