package endlessoffice.entities._backup.items;

//region Module import
import endlessoffice.entities._backup.Drawer;
import endlessoffice.entities._backup.Employee;
import endlessoffice.entities._backup.Item;
import endlessoffice.entities._backup.Screen;
import endlessoffice.entities._backup.employees.Employee;
//endregion

public class Desk extends Item {
    //region Attributes
    private Drawer drawer;
    private Chair chair;
    private Computer computer;
    private Screen screen;
    private Employee owner;

    //region Constructors
    public Desk() {
        super();
    }

    public Desk(int id) {
        super(id);
    }

    public Desk(int id, String name) {
        super(id, name);
    }

    public Desk(int id, String name, String description) {
        super(id, name, description);
    }
    //endregion

    //region Getters and Setters
    public Drawer getDrawer() {
        return drawer;
    }

    public void setDrawer(Drawer drawer) {
        this.drawer = drawer;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Employee getOwner() {
        return owner;
    }

    public void setOwner(Employee owner) {
        this.owner = owner;
    }
    //endregion
}
