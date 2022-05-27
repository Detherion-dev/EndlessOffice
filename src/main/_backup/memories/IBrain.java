package endlessoffice.entities._backup.memories;

import endlessoffice.entities._backup.Memory;

public interface IBrain {

    /**
     * Add a memory in player brain
     * @param newMemory: memory to add
     */
    void addMemory(Memory newMemory);

    /**
     * Delete a memory from the player brain
     * @param memoryId: memory ID to delete
     */
    void deleteMemory(Integer memoryId);

    /**
     * Use a specific memory for an interaction
     * @param id: memory id to get
     * @return affectAction: boolean that indicates that a memory affects a player action
     */
    boolean useMemory(int id);


}
