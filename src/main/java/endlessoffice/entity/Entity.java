package endlessoffice.entity;

import java.io.Serializable;

public abstract class Entity implements Serializable {
    private int id;

    //region Constuctors
    public Entity() {
        super();
    }

    public Entity(int id) {
        this();
        this.id = id;
    }
    //endregion

    //region Getter/Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //endregion
}
