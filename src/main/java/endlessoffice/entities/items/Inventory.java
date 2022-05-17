package endlessoffice.entities.items;

//region Module Import
import endlessoffice.entities.employees.Employee;

import java.util.Map;
//endregion

/**
 * Inventory represents an Employee inventory, constituted by his/her bag, his/her pockets and his hands
 */
public class Inventory implements IInventory{
    //region Attributes
    private Map<Integer, Item> items;
    private Item itemInHands;
    private Bag bag;
    private Employee owner;
    //endregion

    //region Constructors
    public Inventory() {
        super();
    }

    public Inventory(Employee owner) {
        this();
        this.owner = owner;
    }
    //endregion

    //region Public methods
    @Override
    public void addItem(Item item) {
        //TODO: implement condition on width and length
        this.items.put(item.getId(), item);
    }

    @Override
    public void deleteItem(int id) {
        // Comment: Firstly, checks if the item in player hands corresponds to id, if not, check items in bags
        if (itemInHands.getId() == id) {
            itemInHands = null;

        } else {
            this.items.remove(id);
        }
    }
    //endregion

    //region Getters/Setters
    public Map<Integer, Item> getItems() {
        return items;
    }

    public void setItems(Map<Integer, Item> items) {
        this.items = items;
    }

    public Item getItemInHands() {
        return itemInHands;
    }

    public void setItemInHands(Item itemInHands) {
        this.itemInHands = itemInHands;
    }

    public Bag getBag() {
        return bag;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }

    public Employee getOwner() {
        return owner;
    }

    public void setOwner(Employee owner) {
        this.owner = owner;
    }
    //endregion
}
