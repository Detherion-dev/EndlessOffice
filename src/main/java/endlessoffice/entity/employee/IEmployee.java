package endlessoffice.entity.employee;

//region Module import
import endlessoffice.entity.action.Action;
//endregion

/**
 * This interface implements Employee methods
 */
public interface IEmployee {

    /**
     * Performs an action by the Employee
     * @param actionToExecute: action to execute
     */
    public Action makeAction(Action actionToExecute);

    /**
     * Adds a task in the Employee planning
     * @param task: task to add
     */
    public void addTaskInPlanning(Action task);

    /**
     * Delete a task from the Employee planning
     * @param taskId: id of the task to delete
     */
    public void deleteTaskFromPlanning(int taskId);

    /**
     * Update a task from the Employee planning
     * @param taskId: id of the task to update
     */
    public void updateTaskFromPlanning(int taskId);
}
