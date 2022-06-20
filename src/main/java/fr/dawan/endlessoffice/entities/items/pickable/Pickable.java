package fr.dawan.endlessoffice.entities.items.pickable;

import fr.dawan.endlessoffice.entities.employees.Employee;
import fr.dawan.endlessoffice.entities.items.Item;
import fr.dawan.endlessoffice.entities.items.ItemSize;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@DiscriminatorValue("PICKABLE")
public abstract class Pickable extends Item implements Serializable {
    private static final long serialVersionUID = 34564698191923654L;

    private ItemSize size;
    @ManyToOne
    @JoinColumn(name="id_employee")
    private Employee user;

    public Pickable() {
        super();
    }

    public Pickable(String name) {
        super(name);
    }

    //region Getters-Setters
    public ItemSize getSize() {
        return size;
    }

    public Employee getUser() {
        return user;
    }

    public void setOwner(Employee user) {
        this.user = user;
    }

    public void setSize(ItemSize size) {
        this.size = size;
    }
    //endregion
}
