package endlessoffice.entities._backup.actions;

//region Import module
import endlessoffice.entities._backup.Employee;
import endlessoffice.entities._backup.Entity;
import endlessoffice.entities._backup.employees.Employee;
//endregion

public abstract class Action extends Entity {
    //region Attributes
    private String name;
    private String description;
    private int startingTime;
    private int duration;
    private Employee owner;
    //endregion

    //region Constructors
    public Action() {
        super();
    }

    public Action(String name) {
        this();
        this.name = name;
    }

    public Action(String name, String description) {
        this(name);
        this.description = description;
    }

    public Action(String name, String description, int startingTime) {
        this(name, description);
        this.startingTime = startingTime;
    }

    public Action(String name, String description, int startingTime, int duration) {
        this(name, description, startingTime);
        this.duration = duration;
    }

    public Action(String name, String description, int startingTime, int duration, Employee owner) {
        this(name, description, startingTime, duration);
        this.owner = owner;
    }
    //endregion

    //region Getter/Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(int startingTime) {
        this.startingTime = startingTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Employee getOwner() {
        return owner;
    }

    public void setOwner(Employee owner) {
        this.owner = owner;
    }
    //endregion
}
