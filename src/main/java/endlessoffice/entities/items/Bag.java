package endlessoffice.entities.items;

public class Bag extends StorageItem {
    //region Attributes
    //endregion

    //region Constructors
    public Bag() {
        super();
    }

    public Bag(int id) {
        super(id);
    }

    public Bag(int id, String name) {
        super(id, name);
    }

    public Bag(int id, String name, String description) {
        super(id, name, description);
    }
    //endregion

}
