package endlessoffice.entities.actions;

//region Module Import
import endlessoffice.entities.Entity;
import endlessoffice.entities.InteractiveObject;
import endlessoffice.entities.employees.Employee;
import java.io.Serializable;
//endregion

public abstract class Action extends Entity implements Serializable {
    private static final long serialVersionUID = -1960986265207465711L;

    //region Attributes
    private String name;
    private String description;
    private long triggerTime;
    private long duration;
    private Employee actor;
    private InteractiveObject subject;
    private String status;
    //endregion

    //region Constructors
    public Action() {
        super();
    }

    public Action(String name) {
        this();
        this.name = name;
    }

    public Action(String name, String description) {
        this(name);
        this.description = description;
    }

    public Action(String name, String description, long triggerTime) {
        this(name, description);
        this.triggerTime = triggerTime;
    }

    public Action(String name, String description, long triggerTime, long duration) {
        this(name, description, triggerTime);
        this.duration = duration;
    }

    public Action(String name, String description, long triggerTime, long duration, Employee actor) {
        this(name, description, triggerTime, duration);
        this.actor = actor;
    }

    public Action(String name, String description, long triggerTime, long duration, Employee actor, InteractiveObject subject) {
        this(name, description, triggerTime, duration, actor);
        this.subject = subject;
    }
    //endregion


    //region Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getTriggerTime() {
        return triggerTime;
    }

    public long getDuration() {
        return duration;
    }

    public Employee getActor() {
        return actor;
    }

    public InteractiveObject getSubject() {
        return subject;
    }

    public String getStatus() {
        return status;
    }
    //endregion

    //region Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTriggerTime(long triggerTime) {
        this.triggerTime = triggerTime;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public void setActor(Employee actor) {
        this.actor = actor;
    }

    public void setSubject(InteractiveObject subject) {
        this.subject = subject;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    //endregion
}
