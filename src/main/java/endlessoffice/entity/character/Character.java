package endlessoffice.entity.character;

//=============================================================================================
// Module Import
//=============================================================================================
import java.util.List;

import endlessoffice.entity.InteractiveObject;
//=============================================================================================

/**
 * The Character class represents a character in the game Endless Office
 * TODO: make a better description
 */
public abstract class Character extends InteractiveObject {
    private int id;                               // Character unique id in the company = ex: 1 = boss; 10 = player
    private String name;                          // Character name
    private String gender;                        // Character gender
    private String position;                      // Character position; ex: Office 1, toilets, etc.
    private Object inventory;                     // Character inventory
    private Object planning;                      // Character planning
    private Object currentAction;                 // Character action at the instant t
    private List<Object> pendingActions;          // Character pending actions

    //region Constructors
    public Character() {
        super();
    }

    public Character(int id) {
        this();
        this.id = id;
    }

    public Character(int id, String name) {
        this(id);
        this.name = name;
    }
    //endregion

    //region Public methods
    public String toString() {
        return "Character[id = " + id + "; name = " + name + "]";
    }
    //endregion

    //region Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPosition() {
        return position;
    }

    public Object getInventory() {
        return inventory;
    }

    public Object getPlanning() {
        return planning;
    }

    public Object getCurrentAction() {
        return currentAction;
    }

    public List<Object> getPendingActions() {
        return pendingActions;
    }
    //endregion

    //region Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setInventory(Object inventory) {
        this.inventory = inventory;
    }

    public void setPlanning(Object planning) {
        this.planning = planning;
    }

    public void setCurrentAction(Object currentAction) {
        this.currentAction = currentAction;
    }

    public void setPendingActions(List<Object> pendingActions) {
        this.pendingActions = pendingActions;
    }
    //endregion
}
