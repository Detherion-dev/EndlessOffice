package endlessoffice.entities.items;

//region Module import
import java.util.Map;
//endregion

/**
 * StorageItem represents the abstraction of item being able to storage items
 */
public abstract class StorageItem extends Item implements IStorageItem{
    //region Attributes
    private Map<Integer, Item> items;
    //endregion

    //region Constructors
    public StorageItem() {
        super();
    }

    public StorageItem(int id) {
        super(id);
    }

    public StorageItem(int id, String name) {
        super(id, name);
    }

    public StorageItem(int id, String name, String description) {
        super(id, name, description);
    }

    //region Public methods
    @Override
    public void putItem(Item item) {
        //TODO: implement condition on width and length
        this.items.put(item.getId(), item);
    }

    @Override
    public void removeItem(int id) {
        this.items.remove(id);

    }
    //endregion

    //region Getter/Setter
    public Map<Integer, Item> getItems() {
        return items;
    }

    public void setItems(Map<Integer, Item> items) {
        this.items = items;
    }
    //endregion
}
