package endlessoffice.entities.items;

import endlessoffice.entities.employees.Employee;

import java.io.Serializable;

public class Laptop extends PickableItem implements Serializable {
    private static final long serialVersionUID = -11123584687953L;

    //region Constructors
    public Laptop() {
        super();
    }

    public Laptop(String name) {
        super(name);
    }

    public Laptop(String name, Employee owner) {
        super(name, owner);
    }
    //endregion

    //region Public methods
    @Override
    public boolean isBreakable() { return true; }

    @Override
    public boolean isMovable() { return true; }

    @Override
    public boolean isStealable() { return true; }

    @Override
    public boolean isElectrical() { return true; }

    @Override
    public boolean isAContainer() { return false; }
    //endregion
}
