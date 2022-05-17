package endlessoffice.entities.items;

public interface IStorageItem {

    /**
     * Add item in the storage item (if there is enough space)
     * @param item: item to add
     */
    void addItem(Item item);

    /**
     * Delete item from the storage item
     * @param id: item id to delete
     */
    void deleteItem(int id);

}
