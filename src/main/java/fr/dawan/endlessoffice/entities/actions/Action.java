package fr.dawan.endlessoffice.entities.actions;

import fr.dawan.endlessoffice.entities.Entity;

import javax.persistence.Column;
import javax.persistence.OneToOne;

@javax.persistence.Entity
public abstract class Action extends Entity {
    private static final long serialVersionUID = -1960986265207465711L;

    //region Attributes
    @Column(name="name", length=32)
    private String name;
    @Column(name="description", length=256)
    private String description;
    private long triggerTime;
    private long duration;

    @OneToOne
    private Action nextAction;
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

    public Action getNextAction() {
        return nextAction;
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
    //endregion
}
