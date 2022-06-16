package endlessoffice.entities.actions;

import java.io.Serializable;

public interface IPlanning extends Serializable {
    /**
     * Add a task in the planning
     * @param task: task to add
     * @return isStored: returns if the task has been added (true) or not (false)
     */
    boolean addTask(Task task);

    /**
     * Remove a task from the planning
     * @param taskId: id of the task to remove
     * @return isRemoved: returns if the task has been removed (true) or not (false)
     */
    boolean removeTask(long taskId);

    /**
     * Update a task in the planning
     * @param task: task to update
     * @return isUpdated: returns if the task has been updated (true) or not (false)
     */
    boolean updateTask(Task task);

    /**
     *
     * @param taskId: id of the task to return
     * @return task: task to return; return null if there is no id correspondences
     */
    Task getPlannedTask(long taskId);
}
