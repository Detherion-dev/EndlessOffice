package endlessoffice.entities.memories;

public interface IBrain {

    /**
     * Add a memory in player brain
     * @param newMemory: memory to add
     */
    public void addMemory(Memory newMemory);

    /**
     * Delete a memory from the player brain
     * @param memoryId: memory ID to delete
     */
    public void deleteMemory(Integer memoryId);

    /**
     * Use a specific memory for an interaction
     * @param id: memory id to get
     * @return affectAction: boolean that indicates that a memory affects a player action
     */
    public boolean useMemory(int id);


}
