package endlessoffice.entities.items;

//region Module import
import endlessoffice.exceptions.NoITemException;
import endlessoffice.exceptions.NotEnoughSpaceException;

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
    public void putItem(Item item) throws NotEnoughSpaceException {
        //TODO: implement condition on width and length
        //Find the current volume of stored items
        int currentVolume = 0;
        for (int key : this.items.keySet()) {
            currentVolume += this.items.get(key).getLength() * this.items.get(key).getWidth();
        }

        // Get the item volume
        int itemVolume = item.getLength() * getWidth();

        // Get the volume that can be stored
        int availableVolume = this.getLength() * this.getWidth();

        // Condition to add the item: currentVolume + itemVolume <= availableVolume
        if (currentVolume + itemVolume <= availableVolume) {
            this.items.put(item.getId(), item);
        } else {
            String msg = "There is no enough space in the " + this.getName() +
                    "(current holder: " + this.getCurrentHolder() + ")";
            throw new NotEnoughSpaceException(msg);
        }
    }

    @Override
    public void removeItem(int id) throws NoITemException {
        if(this.items.containsKey(id)) {
            this.items.remove(id);
        } else{
            String msg = "There is no item with the id " + id;
            throw new NoITemException(msg);
        }

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
