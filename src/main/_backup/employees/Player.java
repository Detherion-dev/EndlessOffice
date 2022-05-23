package endlessoffice.entities._backup.employees;

//region Module import
import Brain;
import Memory;
//endregion

/**
 * This class represents the player of Endless Office, its characteristics and behaviours
 */
public class Player extends Developer {
    //region Attributes
    private Brain brain;
    //endregion

    //region Constructors
    public Player(){
        super();
    }

    public Player(int id) {
        super(id);
    }

    public Player(int id, String firstname, String lastname) {
        super(id, firstname, lastname);
    }
    //endregion

    //region Public methods
    public void addMemory(Memory memory) {
        brain.addMemory(memory);
    }

    public void deleteMemory(int memoryId) {
        brain.deleteMemory(memoryId);
    }
    //endregion

    //region Getters and Setters
    public Brain getBrain() {
        return brain;
    }

    public void setBrain(Brain brain) {
        this.brain = brain;
    }
    //endregion
}
