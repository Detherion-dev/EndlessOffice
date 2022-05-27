package endlessoffice.entities._backup.items;

import endlessoffice.entities._backup.ElectricalItem;

public class CoffeeMachine extends ElectricalItem {
    //region Attributes
    //endregion

    //region Constructor
    public CoffeeMachine(int id) {
        super(id);
    }

    public CoffeeMachine(int id, String name) {
        super(id, name);
    }

    public CoffeeMachine(int id, String name, String description) {
        super(id, name, description);
    }
    //endregion
}
