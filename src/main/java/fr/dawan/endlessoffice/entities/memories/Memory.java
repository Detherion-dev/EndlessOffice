package fr.dawan.endlessoffice.entities.memories;

import fr.dawan.endlessoffice.entities.EndlessOfficeEntity;
import fr.dawan.endlessoffice.entities.employees.player.Player;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Memory extends EndlessOfficeEntity {
    private static final long serialVersionUID = 5643975171999105002L;

    //region Attributes
    @Column(name="name", length=32)
    private String name;
    @Column(name="description", length=256)
    private String description;
    @ManyToOne
    private Player owner;
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

    public Player getOwner() {
        return owner;
    }
    //endregion

    //region Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
    //endregion
}
