package fr.dawan.endlessoffice.entities.items;

import fr.dawan.endlessoffice.entities.InteractiveObject;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Item represents objects in Player environment and that can be manipulated by him/her
 */
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="discriminator_item")
public abstract class Item extends InteractiveObject implements IItem, Serializable {
    private static final long serialVersionUID = 3470788007977051051L;

    @Column(name="name", length=32)
    private String name;
    @Column(name="description", length=256)
    private String description;
    private boolean isBroken;

    public Item() {
        super();
    }

    public Item(String name) {
        this();
        this.name = name;
    }

    public Item(String name, String description) {
        this(name);
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item " + name + " (description: " + description + ")";
    }

    //region Getters-Setters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isBroken() { return isBroken; }

    public void setName(String name) {
        this.name = name;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
    //endregion
}
