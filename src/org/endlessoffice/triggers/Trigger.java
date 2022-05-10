package org.endlessoffice.triggers;

// Module Import
/**
 * A trigger consists in an event performed at a specific time
 */
public abstract class Trigger implements Runnable {
    protected String name;
    protected String description;
    protected Integer startingTime;

    //region Constructors
    public Trigger() {
        super();
    }

    public Trigger(String name) {
        this();
        this.name = name;
    }

    public Trigger(String name, String description) {
        this(name);
        this.description = description;
    }

    public Trigger(String name, String description, Integer startingTime) {
        this(name, description);
        this.startingTime = startingTime;
    }
    //endregion

    //region run method
    @Override
    public void run() {

    }
    //endregion

    //region Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getStartingTime() {
        return startingTime;
    }
}
