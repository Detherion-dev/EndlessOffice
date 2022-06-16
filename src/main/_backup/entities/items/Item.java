package endlessoffice.entities.items;

//region Module Import
import endlessoffice.entities.InteractiveObject;
import endlessoffice.entities.employees.Employee;

import java.io.Serializable;
//endregion

/**
 * Item represents objects in Player environment and that can be manipulated by him/her
 */
public abstract class Item extends InteractiveObject implements Serializable, IItem {
    private static final long serialVersionUID = 3470788007977051051L;

    //region Attributes
    private String name;
    private String description;
    private Employee owner;
    private Employee currentUser;
    private String position;

    private boolean isBroken;
    //endregion

    //region Constructor
    public Item() {
        super();
    }

    public Item(String name) {
        this();
        this.name = name;
    }

    public Item(String name, Employee owner) {
        this(name);
        this.owner = owner;
    }
    //endregion

    //region Public methods
    @Override
    public String toString() {
        return "Item " + name + " (owner: " + owner + ")";
    }

    @Override
    public boolean isBreakable() { return false; }

    @Override
    public boolean isMovable() { return false; }

    @Override
    public boolean isStealable() { return false; }

    @Override
    public boolean isElectrical() { return false; }

    @Override
    public boolean isAContainer() { return false; }
    //endregion

    //region Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Employee getOwner() {
        return owner;
    }

    public String getPosition() {
        return position;
    }

    public Employee getCurrentUser() {
        return currentUser;
    }

    public boolean isBroken() { return isBroken; }
    //endregion

    //region Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(Employee owner) {
        this.owner = owner;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setCurrentUser(Employee currentUser) {
        this.currentUser = currentUser;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
    //endregion
}
