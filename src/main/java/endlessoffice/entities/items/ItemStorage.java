package endlessoffice.entities.items;

//region Module Import
import endlessoffice.entities.employees.Employee;
import endlessoffice.exceptions.ItemAlreadyExistsException;
import endlessoffice.exceptions.NoITemException;
import endlessoffice.exceptions.NotEnoughSpaceException;

import java.util.HashMap;
import java.util.Map;
//endregion

public class ItemStorage extends Item implements IItemStorage {
    //region Attributes
    private Map<Long, Item> items = new HashMap<>();
    //endregion

    //region Constructors
    public ItemStorage() {
        super();
    }

    public ItemStorage(String name) {
        super(name);
    }

    public ItemStorage(String name, Employee owner) {
        super(name, owner);
    }
    //endregion

    //regions Public method
    @Override
    public void addItem(Item item)  throws ItemAlreadyExistsException, NotEnoughSpaceException {
        //Find the current volume of stored items
        int currentVolume = 0;
        for (long key : this.items.keySet()) {
            currentVolume += this.items.get(key).getLength() * this.items.get(key).getWidth();
        }

        // Get the item volume
        int itemVolume = item.getLength() * getWidth();

        // Get the volume that can be stored
        int availableVolume = this.getLength() * this.getWidth();

        // Condition to add the item: currentVolume + itemVolume <= availableVolume
        if (currentVolume + itemVolume <= availableVolume) {
            if (!this.items.containsKey(item.getId())) {
                this.items.put(item.getId(), item);

            } else {
                String msg = "The item with id " + item.getId() + " is already in the inventory " + this.getName();
                throw new ItemAlreadyExistsException(msg);
            }

        } else {
            String msg = "There is no enough space in the inventory " + this.getName() +
                    "(current user: " + this.getCurrentUser() + ")";
            throw new NotEnoughSpaceException(msg);
        }
    }

    @Override
    public void deleteItem(long itemId) throws NoITemException {
        if(this.items.containsKey(itemId)) {
            this.items.remove(itemId);

        } else{
            String msg = "There is no item with the id " + itemId;
            throw new NoITemException(msg);
        }
    }

    @Override
    public Item getItem(long itemId) throws NoITemException {
        Item item = null;
        if(this.items.containsKey(itemId)) {
            item = this.items.get(itemId);

        } else{
            String msg = "There is no item with the id " + itemId;
            throw new NoITemException(msg);
        }
        return item;
    }
    //endregion

    //region Getters
    public Map<Long, Item> getItems() {
        return items;
    }
    //endregion
}
