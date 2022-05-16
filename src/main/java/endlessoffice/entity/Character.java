package main.java.endlessoffice.entity;

//=============================================================================================
// Module Import
//=============================================================================================
import java.util.List;

import main.java.endlessoffice.entity.InteractiveObject;
//=============================================================================================

/**
 * The Character class represent a character in the game Endless Office
 * TODO: make a better description
 */
public abstract class Character extends InteractiveObject {
    protected int id;                               // Character unique id in the company = ex: 1 = boss; 10 = player
    protected String name;                          // Character name
    protected String gender;                        // Character gender
    protected String position;                      // Character position; ex: Office 1, toilets, etc.
    protected Object inventory;                     // Character inventory
    protected Object planning;                      // Character planning
    protected List<Object> pendingActions;          // Character pending actions

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

    public void setPendingActions(List<Object> pendingActions) {
        this.pendingActions = pendingActions;
    }
}
