package endlessoffice.entities._backup.employees;

//region Module import
import endlessoffice.entities._backup.Memory;
import endlessoffice.entities._backup.memories.Memory;
//endregion

public interface IPlayer {

    /**
     * Add a memory in player brain
     * @param memory: memory to add
     */
    void addMemory(Memory memory);

    /**
     * Delete a memory from the player brain
     * @param memoryId: id of the memory to delete
     */
    void deleteMemory(int memoryId);
}
