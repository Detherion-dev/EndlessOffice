package fr.dawan.endlessoffice.services.actions;

import fr.dawan.endlessoffice.entities.InteractiveObject;
import fr.dawan.endlessoffice.entities.employees.Employee;

import java.util.ArrayList;
import java.util.List;

public abstract class Action implements IAction {

    //region Attributes
    private String name;
    private String description;
    private long triggerTime;
    private long duration;
    private List<Action> nextActions = new ArrayList<>();
    private Employee actor;
    private InteractiveObject subject;
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

    //region Public methods
    @Override
    public List<Action> execute() {
        // TO OVERRIDE
        return nextActions;
    }

    @Override
    public boolean addAction(Action action) {
        boolean result = false;

        if (!hasAction(action)) {
            nextActions.add(action);
            result = true;
        }

        return result;
    }

    @Override
    public boolean deleteAction(Action action) {
        boolean result = false;

        if (hasAction(action)) {
            nextActions.remove(action);
        }

        return result;
    }

    @Override
    public boolean hasAction(Action action) {
        boolean result = false;

        for (Action a: nextActions) {
            if (a.equals(action)) {
                result = true;
                break;
            }
        }

        return result;
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

    public List<Action> getNextActions() {
        return nextActions;
    }

    public Employee getActor() {
        return actor;
    }

    public InteractiveObject getSubject() {
        return subject;
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
    //endregion
}
