package endlessoffice.entities.items.pickableitems;

//region Module Import
import endlessoffice.entities.employees.Employee;
import java.io.Serializable;
//endregion

public class Phone extends PickableItem implements Serializable {
    private static final long serialVersionUID = -123584687953L;

    //region Constructors
    public Phone() {
        super();
    }

    public Phone(String name) {
        super(name);
    }

    public Phone(String name, Employee owner) {
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
