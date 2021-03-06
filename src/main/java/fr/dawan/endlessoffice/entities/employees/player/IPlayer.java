package fr.dawan.endlessoffice.entities.employees.player;

import fr.dawan.endlessoffice.entities.items.pickable.Pickable;
import fr.dawan.endlessoffice.entities.memories.Memory;

import java.io.Serializable;

public interface IPlayer extends Serializable {
    /**
     * Executes an action
     * @return isActed: returns if the player executed the current action
     */
    boolean acts();

    /**
     * The player takes an item and store it in his/her inventory
     * @param item: item to store in the inventory
     * @return isStored: returns if the item has been stored (true) or not (false) in the player inventory
     */
    boolean addItem(Pickable item);

    /**
     * The player drops the item from his/her inventory corresponding to the given id
     * @param item: item to drop
     * @return isDropped: returns if the item has been dropped (true) or not (false)
     */
    boolean removeItem(Pickable item);

    /**
     * Returns the item corresponding to the id
     * @param itemId: item id to return
     * @return item: item corresponding to the id
     */
    Pickable getItem(long itemId);

    /**
     * Returns the first occurrence of the item corresponding to the name
     * @param name: name of the item to return
     * @return item: item corresponding to the name
     */
    Pickable getItem(String name);

    /**
     * This method determines if the player has the item in its inventory and returns the result
     * @param item: item to check
     */
    boolean hasItem(Pickable item);

    /**
     * Adds a memory to the player
     * @param memory: memory to add
     * @return isAcquired: returns if the memory has been acquired (true) or not (false) by the player
     */
    boolean addMemory(Memory memory);

    /**
     * This method determines if the player has the memory in its brain and returns the result
     * @param memory: memory to check
     */
    boolean hasMemory(Memory memory);
}
