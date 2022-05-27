package endlessoffice.entities._backup.items;

public class Phone extends ElectricalItem {
    //region Attributes
    //endregion

    //region Constructor
    public Phone(int id) {
        super(id);
    }

    public Phone(int id, String name) {
        super(id, name);
    }

    public Phone(int id, String name, String description) {
        super(id, name, description);
    }
    //endregion
}
