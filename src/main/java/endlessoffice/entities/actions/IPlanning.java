package endlessoffice.entities.actions;

import endlessoffice.exceptions.NoTaskException;
import endlessoffice.exceptions.TaskAlreadyExistsException;

import java.io.Serializable;

public interface IPlanning extends Serializable {
    /**
     * Add a task in the planning
     * @param task: task to add
     * @throws TaskAlreadyExistsException: returns exception if the task id already exist
     */
    void addTask(Task task) throws TaskAlreadyExistsException;

    /**
     * Remove a task from the planning
     * @param taskId: id of the task to remove
     * @throws NoTaskException: returns exception if plannedTasks key list does not include taskId
     */
    void removeTask(long taskId) throws NoTaskException;

    /**
     * Update a task in the planning
     * @param task: task to update
     * @throws NoTaskException: returns an exception if there is no task id in plannedTasks key list
     */
    void updateTask(Task task) throws NoTaskException;

    /**
     *
     * @param taskId: id of the task to return
     * @throws NoTaskException: returns an exception if there is no taskId in plannedTasks key list
     */
    Task getPlannedTask(long taskId) throws NoTaskException;
}
