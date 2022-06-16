package endlessoffice.entities.planning;

//region Module Import
import endlessoffice.entities.EndlessOfficeEntity;
import endlessoffice.entities.actions.Task;
import endlessoffice.entities.employees.Employee;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

//endregion
public class Planning extends EndlessOfficeEntity implements Serializable {
    private static final long serialVersionUID = -8980446777370315111L;

    //region Attributes
    private final Map<Long, Task> plannedTasks;
    private final Map<Long, Task> pendingTasks;
    private Employee owner;
    //endregion

    //region Constructor
    public Planning() {
        super();
        pendingTasks = new HashMap<>();
        plannedTasks = new HashMap<>();
    }

    public Planning(Employee owner) {
        this();
        this.owner = owner;
    }
    //endregion

    //region Public methods

    //endregion

    //region Getters
    public Map<Long, Task> getPlannedTasks() {
        return plannedTasks;
    }

    public Map<Long, Task> getPendingTasks() {
        return pendingTasks;
    }

    public Employee getOwner() {
        return owner;
    }
    //endregion

    //region Setters
    public void setOwner(Employee owner) {
        this.owner = owner;
    }
    //endregion

}
