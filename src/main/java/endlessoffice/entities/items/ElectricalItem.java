package endlessoffice.entities.items;

public abstract class ElectricalItem extends Item {
    //region Attributes
    private boolean isOn;                   // Electrical item status : On (true) / Off (false)
    //endregion

    //region Constructors
    public ElectricalItem() {
        super();
    }

    public ElectricalItem(int id) {
        super(id);
    }

    public ElectricalItem(int id, String name) {
        super(id, name);
    }

    public ElectricalItem(int id, String name, String description) {
        super(id, name, description);
    }
    //endregion

    //region Getter/Setter
    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
    //endregion

}
