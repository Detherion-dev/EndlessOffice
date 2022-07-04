package fr.dawan.endlessoffice.services.actions;

import java.util.List;

public interface IAction {

    /**
     * Exec method of the action
     * @return nextActions: list of next action(s)
     */
    List<Action> execute();

    /**
     * Add an action as a next action
     * @param action: action to add
     * @return isAdded: returns if the action has been added (true) or not (false)
     */
    boolean addAction(Action action);

    /**
     * Delete an action as next action
     * @param action: action to delete
     * @return isRemoved: returns if the action has been deleted (true) or not (false)
     */
    boolean deleteAction(Action action);

    /**
     * Returns if the action is considered as next action
     * @param action: action to test
     */
    boolean hasAction(Action action);

}
