package endlessoffice.entities.items;

//region Module Import
import endlessoffice.entities.InteractiveObject;
import endlessoffice.entities.employees.Employee;
//endregion

/**
 * Item represents objects in Player environment and that can be manipulated by him/her
 */
public abstract class Item extends InteractiveObject {
    //region Attributes
    private String name;
    private String description;
    private int width;
    private int length;
    private double weight;
    private Employee owner;
    private Employee currentUser;
    private String position;
    private boolean isBreakable;
    private boolean isMovable;
    private boolean isElectrical;
    private boolean isBroken;
    private boolean isVisibleByPlayer;
    private boolean isAccessibleToPlayer;
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
    //endregion

    //region Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
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

    public boolean isBreakable() {
        return isBreakable;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public boolean isMovable() {
        return isMovable;
    }

    public boolean isVisibleByPlayer() {
        return isVisibleByPlayer;
    }

    public boolean isAccessibleToPlayer() {
        return isAccessibleToPlayer;
    }

    public boolean isElectrical() {
        return isElectrical;
    }
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

    public void setVisibleByPlayer(boolean visibleByPlayer) {
        isVisibleByPlayer = visibleByPlayer;
    }

    public void setAccessibleToPlayer(boolean accessibleToPlayer) {
        isAccessibleToPlayer = accessibleToPlayer;
    }
    //endregion
}
