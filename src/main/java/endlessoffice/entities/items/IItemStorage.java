package endlessoffice.entities.items;

//region Module Import
import java.io.Serializable;
//endregion

public interface IItemStorage extends Serializable
{
    /**
     * Add the item in the inventory
     * @param item: item to add
     * @return isStored: returns if the item has been stored (true) or not (false)
     */
    boolean addItem(PickableItem item);

    /**
     * Delete the item corresponding to the itemId
     * @param itemId: id of the item to delete
     * @return isDeleted: returns if the item has been deleted in items
     */
    boolean deleteItem(long itemId);

    /**
     * Returns the item corresponding to the itemid; if there is no item to return, return null
     * @param itemId: id of the item to return
     * @return item: item to return
     */
    PickableItem getItem(long itemId);
}
