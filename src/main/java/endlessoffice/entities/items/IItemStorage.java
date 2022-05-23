package endlessoffice.entities.items;

//region Module Import
import endlessoffice.exceptions.ItemAlreadyExistsException;
import endlessoffice.exceptions.NoITemException;
import endlessoffice.exceptions.NotEnoughSpaceException;
//endregion

public interface IItemStorage {

    /**
     * Add the item in the inventory
     * @param item: item to add
     * @throws ItemAlreadyExistsException : returns an exception if the item id is already in map items
     * @throws NotEnoughSpaceException: returns an exception if the inventory item is not enough to store item
     */
    void addItem(Item item) throws ItemAlreadyExistsException, NotEnoughSpaceException;

    /**
     * Delete the item corresponding to the itemId
     * @param itemId: id of the item to delete
     * @throws NoITemException: returns an exception if the item id does not correspond to any map keys
     */
    void deleteItem(long itemId) throws NoITemException;

    /**
     * Returns the item corresponding to the itemid
     * @param itemId: id of the item to return
     * @return item: item to return
     * @throws NoITemException: returns an exception if the item id does not correspond to any map keys
     */
    Item getItem(long itemId) throws NoITemException;
}
