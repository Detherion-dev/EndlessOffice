package endlessoffice.entities.items;

public class Screen extends ElectricalItem {
    //region Attributes
    //endregion

    //region Constructors
    public Screen(int id) {
        super(id);
    }

    public Screen(int id, String name) {
        super(id, name);
    }

    public Screen(int id, String name, String description) {
        super(id, name, description);
    }
    //endregion
}
