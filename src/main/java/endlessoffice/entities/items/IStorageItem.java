package endlessoffice.entities.items;

public interface IStorageItem {

    /**
     * Add an item in the storage item (if there is enough space)
     * @param item: item to add
     */
    void putItem(Item item);

    /**
     * Remove an item from the storage item
     * @param id: item id to delete
     */
    void removeItem(int id);

}
