package org.endlessoffice.triggers;

// Module Import
/**
 * A trigger consists in an event performed at a specific time
 */
public abstract class Trigger extends Thread {
    protected String objectName;
    protected String description;
    protected Integer startingTime;

    //region Constructors
    public Trigger() {
        super();
    }

    public Trigger(String objectName) {
        this();
        this.objectName = objectName;
    }

    public Trigger(String objectName, String description) {
        this(objectName);
        this.description = description;
    }

    public Trigger(String objectName, String description, Integer startingTime) {
        this(objectName, description);
        this.startingTime = startingTime;
    }
    //endregion

    //region run method
    @Override
    public void run() {

    }
    //endregion

    //region Getters
    public String getObjectName() {
        return objectName;
    }

    public String getDescription() {
        return description;
    }

    public Integer getStartingTime() {
        return startingTime;
    }
}
