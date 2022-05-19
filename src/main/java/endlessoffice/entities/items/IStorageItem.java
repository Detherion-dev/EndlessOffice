package endlessoffice.entities.items;

import endlessoffice.exceptions.NoITemException;
import endlessoffice.exceptions.NotEnoughSpaceException;

public interface IStorageItem {

    /**
     * Add an item in the storage item (if there is enough space)
     * @param item: item to add
     * @throws NotEnoughSpaceException: exception if there is no enough space in the storage item
     */
    void putItem(Item item) throws NotEnoughSpaceException;

    /**
     * Remove an item from the storage item
     * @param id: item id to delete
     * @throws NoITemException: exception if there is no concordance with item id
     */
    void removeItem(int id) throws NoITemException;

}
