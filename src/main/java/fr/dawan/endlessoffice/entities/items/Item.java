package fr.dawan.endlessoffice.entities.items;

//region Module Import
import fr.dawan.endlessoffice.entities.InteractiveObject;

import javax.persistence.*;
import java.io.Serializable;
//endregion

/**
 * Item represents objects in Player environment and that can be manipulated by him/her
 */
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="discriminator_item")
public abstract class Item extends InteractiveObject implements IItem, Serializable {
    private static final long serialVersionUID = 3470788007977051051L;

    //region Attributes
    @Column(name="name", length=32)
    private String name;
    @Column(name="description", length=256)
    private String description;
    private boolean isBroken;
    //endregion

    //region Constructor
    public Item() {
        super();
    }

    public Item(String name) {
        this();
        this.name = name;
    }
    //endregion

    //region Public methods
    @Override
    public String toString() {
        return "Item " + name + " (description: " + description + ")";
    }
    //endregion

    //region Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isBroken() { return isBroken; }
    //endregion

    //region Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
    //endregion
}
