package fr.dawan.endlessoffice.entities.planning;

import fr.dawan.endlessoffice.entities.Entity;
import fr.dawan.endlessoffice.entities.actions.Task;
import fr.dawan.endlessoffice.entities.employees.Employee;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Planning extends Entity implements Serializable {
    private static final long serialVersionUID = -8980446777370315111L;

    private final Map<Long, Task> plannedTasks;
    private final Map<Long, Task> pendingTasks;
    private Employee owner;

    public Planning() {
        super();
        pendingTasks = new HashMap<>();
        plannedTasks = new HashMap<>();
    }

    public Planning(Employee owner) {
        this();
        this.owner = owner;
    }

    //region Getters-Setters
    public Map<Long, Task> getPlannedTasks() {
        return plannedTasks;
    }

    public Map<Long, Task> getPendingTasks() {
        return pendingTasks;
    }

    public Employee getOwner() {
        return owner;
    }

    public void setOwner(Employee owner) {
        this.owner = owner;
    }
    //endregion
}
