package endlessoffice.entities.memories;

//region Module Import
import endlessoffice.entities.Entity;

import java.util.Map;
//end region

public class Memory extends Entity {
    //region Attributes
    private String name;                            // Memory name
    private String description;                     // Memory description
    private Map<String, Boolean> affectActions;     // Memory effects on player actions
    //endregion

    //region Constructors
    public Memory() {
        super();
    }

    public Memory(int id) {
        super(id);
    }

    public Memory(int id, String name) {
        this(id);
        this.name = name;
    }

    public Memory(int id, String name, String description) {
        this(id, name);
        this.description = description;
    }

    //region Getters/Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Boolean> getAffectActions() {
        return affectActions;
    }

    public void setAffectActions(Map<String, Boolean> affectActions) {
        this.affectActions = affectActions;
    }
    //endregion

}
