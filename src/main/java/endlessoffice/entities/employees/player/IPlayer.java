package endlessoffice.entities.employees.player;

import endlessoffice.entities.items.Item;
import endlessoffice.entities.memories.Memory;

import java.io.Serializable;

public interface IPlayer extends Serializable {
    /**
     * Executes an action
     */
    void acts();

    /**
     * The player takes an item and store it in his/her inventory
     * @param item: item to store in the inventory
     */
    void takeItem(Item item);

    /**
     * The player drops the item from his/her inventory corresponding to the given id
     * @param itemId: id of the item to drop
     */
    void dropItem(long itemId);

    /**
     * Adds a memory to the player
     * @param memory: memory to add
     */
    void addMemory(Memory memory);

}
