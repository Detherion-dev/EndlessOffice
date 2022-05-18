package endlessoffice.entities.items;

import endlessoffice.entities.InteractiveObject;
import endlessoffice.entities.employees.Employee;

/**
 * Item represents object manipulated by the player and NPC in Endless Office
 */
public abstract class Item extends InteractiveObject {
    private String name;                // Item name
    private String description;         // Item description
    private int length;                 // Item length
    private int width;                  // Item width
    private int ownerId;            // id of the bag's owner (possibly different from currentHolder)
    private Employee currentHolder;     // Item current holder
    private boolean isPocket;           // Item condition to be stored in pocket
    private boolean isTransportable;    // Item condition to be transportable by an Employee
    private boolean isBreakable;        // Item condition to be breakable by an Employee
    private boolean isBroken;           // Item condition to be broken or not by an Employee
    //region Constructors

    public Item() {
        super();
    }

    public Item(int id) {
        super(id);
    }

    public Item(int id, String name) {
        this(id);
        this.name = name;
    }

    public Item(int id, String name, String description) {
        this(id, name);
        this.description = description;
    }
    //endregion

    //region Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Employee getCurrentHolder() {
        return currentHolder;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public boolean isPocket() {
        return isPocket;
    }

    public boolean isTransportable() {
        return isTransportable;
    }

    public boolean isBreakable() {
        return isBreakable;
    }

    public boolean isBroken() {
        return isBroken;
    }
    //endregion

    //region Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setCurrentHolder(Employee currentHolder) {
        this.currentHolder = currentHolder;
    }

    public void setPocket(boolean pocket) {
        isPocket = pocket;
    }

    public void setTransportable(boolean transportable) {
        isTransportable = transportable;
    }

    public void setBreakable(boolean breakable) {
        isBreakable = breakable;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
    //endregion
}
