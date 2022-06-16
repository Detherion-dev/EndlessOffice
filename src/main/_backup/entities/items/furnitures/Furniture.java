package endlessoffice.entities.items.furnitures;

//region Module import
import endlessoffice.entities.employees.Employee;
import endlessoffice.entities.items.Item;

import java.io.Serializable;
//endregion

public class Furniture extends Item implements Serializable {
    private static final long serialVersionUID = -35746984136654L;

    //region Attributes
    private String weight;
    //endregion

    //region Constructors
    public Furniture() {
        super();
    }

    public Furniture(String name) {
        super(name);
    }

    public Furniture(String name, Employee owner) {
        super(name, owner);
    }
    //endregion

    //region Public methods
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
    public String getWeight() {
        return weight;
    }
    //endregion

    //region Setters
    public void setWeight(String weight) {
        this.weight = weight;
    }
    //endregion
}
