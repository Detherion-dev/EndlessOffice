package endlessoffice.entities.actions;

//region Module Import
import endlessoffice.entities.Entity;
import endlessoffice.entities.employees.Employee;
import endlessoffice.exceptions.NoTaskException;
import endlessoffice.exceptions.TaskAlreadyExistsException;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
//endregion
public class Planning extends Entity implements IPlanning, Serializable {
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
    @Override
    public boolean addTask(Task task){
        boolean result = false;

        if (!plannedTasks.containsKey(task.getId())) {
            plannedTasks.put(task.getId(), task);
            result = true;
        }

        return result;
    }

    @Override
    public boolean removeTask(long taskId){
        boolean result = false;

        if(this.plannedTasks.containsKey(taskId)) {
            this.plannedTasks.remove(taskId);
            result = true;

        }

        return result;

    }

    @Override
    public boolean updateTask(Task task){
        boolean result = false;

        if(this.plannedTasks.containsKey(task.getId())) {
            this.plannedTasks.put(task.getId(), task);
            result = true;
        }

        return result;
    }

    @Override
    public Task getPlannedTask(long taskId){
        Task task = null;
        if(this.plannedTasks.containsKey(taskId)) {
            task = this.plannedTasks.get(taskId);
        }

        return task;
    }
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
