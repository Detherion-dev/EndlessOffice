package fr.dawan.endlessoffice.entities.items.pickable;

import fr.dawan.endlessoffice.entities.employees.Employee;
import fr.dawan.endlessoffice.entities.items.Item;
import fr.dawan.endlessoffice.utils.enums.ItemSize;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@DiscriminatorValue("PICKABLE")
public abstract class Pickable extends Item implements Serializable {
    private static final long serialVersionUID = 34564698191923654L;

    @Enumerated(EnumType.STRING)
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

    public Pickable(String name, String description) {
        super(name, description);
    }

    //region Getters-Setters
    public ItemSize getSize() {
        return size;
    }

    public Employee getUser() {
        return user;
    }

    public void setUser(Employee user) {
        this.user = user;
    }

    public void setSize(ItemSize size) {
        this.size = size;
    }
    //endregion
}
