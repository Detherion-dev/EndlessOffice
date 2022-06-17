package fr.dawan.endlessoffice.entities.memories;

import fr.dawan.endlessoffice.entities.Entity;
import fr.dawan.endlessoffice.entities.employees.player.Player;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

@javax.persistence.Entity
public class Memory extends Entity {
    private static final long serialVersionUID = 5643975171999105002L;

    @Column(name="name", length=32)
    private String name;
    @Column(name="description", length=256)
    private String description;
    @ManyToOne
    private Player owner;

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

    //region Getters-Setters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Player getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //endregion
}
