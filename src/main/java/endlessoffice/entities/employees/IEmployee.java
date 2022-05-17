package endlessoffice.entities.employees;

//region Module import
import endlessoffice.entities.actions.Action;
import endlessoffice.entities.items.Item;
//endregion

/**
 * This interface implements Employee methods
 */
public interface IEmployee {

    /**
     * Performs an action by the Employee
     * @param actionToExecute: action to execute
     */
    Action acts(Action actionToExecute);

    /**
     * Adds a task in the Employee planning
     * @param task: task to add
     */
    void addTaskInPlanning(Action task);

    /**
     * Delete a task from the Employee planning
     * @param taskId: id of the task to delete
     */
    void deleteTaskFromPlanning(int taskId);

    /**
     * Update a task from the Employee planning
     * @param taskId: id of the task to update
     */
    void updateTaskFromPlanning(int taskId);

    /**
     * Take an item in hand
     * @param item: item to take
     */
    void takeItem(Item item);

    /**
     * Drop an item, from employee's hand or bag
     * @param itemId: id of the item to delete
     */
    void dropItem(int itemId);

    /**
     * Storage item in the bag or the drawer
     * @param item: item to store
     * @param isBag: condition true: store in bag ; false : store in drawer
     */
    void storeItem(Item item, boolean isBag);
}
