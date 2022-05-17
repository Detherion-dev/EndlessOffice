package endlessoffice.entities.items;

public interface IInventory {

    /**
     * Add item in the inventory (if there is enough space)
     * @param item: item to add
     */
    void addItem(Item item);

    /**
     * Delete item from the inventory
     * @param id: item id to delete
     */
    void deleteItem(int id);

}
