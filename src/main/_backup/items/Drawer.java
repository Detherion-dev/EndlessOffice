package endlessoffice.entities._backup.items;

import endlessoffice.entities._backup.StorageItem;

public class Drawer extends StorageItem {
    //region Attributes
    private Desk desk;          // Desk of the drawer
    //endregion

    //region Constructors
    public Drawer(int id) {
        super(id);
    }

    public Drawer(int id, String name) {
        super(id, name);
    }

    public Drawer(int id, String name, String description) {
        super(id, name, description);
    }

    public Drawer(int id, String name, String description, Desk desk) {
        this(id, name, description);
        this.desk = desk;
    }
    //endregion

    //region Getter/Setter
    public Desk getDesk() {
        return desk;
    }

    public void setDesk(Desk desk) {
        this.desk = desk;
    }
    //endregion

}
