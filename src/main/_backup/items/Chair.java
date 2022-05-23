package endlessoffice.entities._backup.items;

import endlessoffice.entities._backup.Item;

public class Chair extends Item {
    //region Attributes
    //endregion

    //region Constructors
    public Chair() {
        super();
    }

    public Chair(int id) {
        super(id);
    }

    public Chair(int id, String name) {
        super(id, name);
    }

    public Chair(int id, String name, String description) {
        super(id, name, description);
    }
    //endregion
}
