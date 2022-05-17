package endlessoffice.entities.memories;

//region Module import
import java.util.HashMap;
import java.util.Map;
//endregion


/**
 * The brain contains all Player memories / information regarding its environment / NPC
 */
public class Brain implements IBrain {
    private Map<Integer, Memory> memories;      // List of player memories

    //region Constructors
    public Brain() {
        memories = new HashMap<>();
    }
    //endregion

    //region Public methods
    @Override
    public void addMemory(Memory newMemory) {
        memories.put(newMemory.getId(), newMemory);
    }

    @Override
    public void deleteMemory(Integer memoryId) {
        memories.remove(memoryId);
    }

    @Override
    public boolean useMemory(int id) {
        // TODO: to implement
        return false;
    }

}
