package endlessoffice.entities;

//region Module Import
import java.io.Serializable;
//endregion

/**
 * Entity represents objects with a unique ID that are serializable
 */
public abstract class Entity implements Serializable {
    //region Attributes
    private long id;                    // Entity unique id
    //endregion

    //region Constructors
    public Entity() {

    }
    //endregion

    //region Getters
    public long getId() {
        return id;
    }
    //endregion

    //region Setters
    public void setId(long id) {
        this.id = id;
    }
    //endregion
}
