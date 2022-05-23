package endlessoffice.entities.memories;

//region Attributes
import endlessoffice.entities.Entity;
//endregion

public class Memory extends Entity {
    //region Attributes
    private String name;
    private String description;
    //endregion

    //region Constructor
    public Memory() {
        super();
    }

    public Memory(String name) {
        this();
        this.name = name;
    }

    public Memory(String name, String description) {
        this(name);
        this.description = description;
    }
    //endregion

    //region Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    //endregion

    //region Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //endregion
}
