package endlessoffice.entities._backup.items;

import endlessoffice.entities._backup.ElectricalItem;

public class Computer extends ElectricalItem {
    //region Attributes
    //endregion

    //region Constructor
    public Computer(int id) {
        super(id);
    }

    public Computer(int id, String name) {
        super(id, name);
    }

    public Computer(int id, String name, String description) {
        super(id, name, description);
    }
    //endregion
}
