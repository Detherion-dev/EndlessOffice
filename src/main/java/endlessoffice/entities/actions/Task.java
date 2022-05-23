package endlessoffice.entities.actions;

import endlessoffice.entities.InteractiveObject;
import endlessoffice.entities.employees.Employee;

import java.io.Serializable;

public abstract class Task extends Action implements Serializable {

    private static final long serialVersionUID = -5494599254519406054L;

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

    public Task(String name, String description, long triggerTime) {
        super(name, description, triggerTime);
    }

    public Task(String name, String description, long triggerTime, long duration) {
        super(name, description, triggerTime, duration);
    }

    public Task(String name, String description, long triggerTime, long duration, Employee actor) {
        super(name, description, triggerTime, duration, actor);
    }

    public Task(String name, String description, long triggerTime, long duration, Employee actor, InteractiveObject subject) {
        super(name, description, triggerTime, duration, actor, subject);
    }
    //endregion

}
