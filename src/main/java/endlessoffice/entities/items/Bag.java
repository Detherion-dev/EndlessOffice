package endlessoffice.entities.items;

//region Module import
import endlessoffice.entities.employees.Employee;
import endlessoffice.exceptions.ItemAlreadyExistsException;
import endlessoffice.exceptions.NotEnoughSpaceException;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
//endregion

public class Bag extends PickableItem implements Serializable, IItemStorage {
    private static final long serialVersionUID = -123584687953L;

    private Map<Long, PickableItem> items = new HashMap<>();

    //region Constructors
    public Bag() {
        super();
    }

    public Bag(String name) {
        super(name);
    }

    public Bag(String name, Employee owner) {
        super(name, owner);
    }
    //endregion

    //region Public methods
    @Override
    public boolean isBreakable() { return true; }

    @Override
    public boolean isMovable() { return true; }

    @Override
    public boolean isStealable() { return true; }

    @Override
    public boolean isElectrical() { return false; }

    @Override
    public boolean isAContainer() { return true; }

    @Override
    public boolean addItem(PickableItem item){
        //Find the current volume of stored items
        int currentVolume = 0;
        for (long key : this.items.keySet()) {
            currentVolume += this.items.get(key).getLength() * this.items.get(key).getWidth();
        }

        // Get the item volume
        int itemVolume = item.getLength() * getWidth();

        // Get the volume that can be stored
        int availableVolume = this.getLength() * this.getWidth();

        // return value
        boolean result = false;

        // Condition to add the item: currentVolume + itemVolume <= availableVolume
        if ((currentVolume + itemVolume <= availableVolume) && (!this.items.containsKey(item.getId()))) {
                this.items.put(item.getId(), item);
                result = true;
        }

        return result;
    }

    @Override
    public boolean deleteItem(long itemId){
        boolean result = false;
        if(this.items.containsKey(itemId)) {
            this.items.remove(itemId);
            result = true;
        }
        return result;
    }

    @Override
    public PickableItem getItem(long itemId){
        PickableItem item = null;
        if(this.items.containsKey(itemId)) {
            item = this.items.get(itemId);
        }
        return item;
    }
    //endregion

}
