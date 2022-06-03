package endlessoffice.entities.items.pickableitems;

//region Module import
import endlessoffice.entities.employees.Employee;
import endlessoffice.entities.items.Item;

import java.io.Serializable;
//endregion

public abstract class PickableItem extends Item implements Serializable {
    private static final long serialVersionUID = 34564698191923654L;

    //region Attributes
    private int length;
    private int width;
    //endregion

    //region Constructors
    public PickableItem() {
        super();
    }

    public PickableItem(String name) {
        super(name);
    }

    public PickableItem(String name, Employee owner) {
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
    public boolean isElectrical() { return false; }

    @Override
    public boolean isAContainer() { return false; }
    //endregion

    //region Getters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    //endregion
}
