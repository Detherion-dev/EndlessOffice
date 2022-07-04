package fr.dawan.endlessoffice.services;

import fr.dawan.endlessoffice.entities.items.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    /**
     * Returns all items from the database
     */
    List<Item> getAllItems();

    /**
     * Returns the item corresponding to the given id
     * @param id: id of the parameter to return
     */
    Optional<Item> getById(long id);

    /**
     * Returns a list of item(s) corresponding to the given name
     * @param name: name of the item(s) to return
     */
    List<Item> getByName(String name);

    /**
     * Returns a list of item(s) corresponding to the given description
     * @param description: description of the item(s) to return
     */
    List<Item> getByDescription(String description);

    /**
     * Returns a list of item(s) corresponding to the given name and the description
     * @param name: name of the item(s) to return
     * @param description: description of the item(s) to return
     */
    List<Item> getByNameAndDescription(String name, String description);

    /**
     * Delete from the database the item corresponding to the given id
     * @param id: id of the item to delete
     */
    void deleteById(long id);

    /**
     * Delete from the database the item(s) corresponding to the given name and the description
     * @param name: name of the item(s) to delete
     * @param description: description of the item(s) to delete
     */
    void deleteByNameAndDescription(String name, String description);

    /**
     * Save / Update the item in the database
     * @param item: item to save/update in the database
     * @return item: item to save
     */
    Item saveOrUpdate(Item item);

}
