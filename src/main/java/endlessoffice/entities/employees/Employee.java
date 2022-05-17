package endlessoffice.entities.employees;

//=============================================================================================
// Module Import
//=============================================================================================
import java.util.List;

import endlessoffice.entities.actions.Action;
import endlessoffice.entities.InteractiveObject;
//=============================================================================================

/**
 * The Employee class represents a character in the game Endless Office
 */
public abstract class Employee extends InteractiveObject implements IEmployee {
    //region Attributes
    private String name;                          // Character name
    private String gender;                        // Character gender
    private String position;                      // Character position; ex: Office 1, toilets, etc.
    private Object desk;                          // Character desk
    private Object inventory;                     // Character inventory
    private Object planning;                      // Character planning
    private List<Action> pendingActions;          // Character pending actions
    //endregion

    //region Constructors
    public Employee() {
        super();
    }

    public Employee(int id) {
        super(id);
    }

    public Employee(int id, String name) {
        this(id);
        this.name = name;
    }
    //endregion

    //region Public methods
    public String toString() {
        return "Employee " + name + "( " + getId() + ")";
    }

    @Override
    public Action acts(Action actionToExecute) {
        // TODO: to implement
        return null;
    }

    @Override
    public void addTaskInPlanning(Action task) {
        // TODO: to implement
    }

    @Override
    public void deleteTaskFromPlanning(int taskId) {
        // TODO: to implement
    }

    @Override
    public void updateTaskFromPlanning(int taskId) {
        // TODO: to implement
    }
    //endregion

    //region Getters
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPosition() {
        return position;
    }

    public Object getDesk() {
        return desk;
    }

    public Object getInventory() {
        return inventory;
    }

    public Object getPlanning() {
        return planning;
    }

    public List<Action> getPendingActions() {
        return pendingActions;
    }
    //endregion

    //region Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDesk(Object desk) {
        this.desk = desk;
    }

    public void setInventory(Object inventory) {
        this.inventory = inventory;
    }

    public void setPlanning(Object planning) {
        this.planning = planning;
    }

    public void setPendingActions(List<Action> pendingActions) {
        this.pendingActions = pendingActions;
    }
    //endregion
}
