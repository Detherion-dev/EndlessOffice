package fr.dawan.endlessoffice.entities.items.pickable;

//region Module import
import fr.dawan.endlessoffice.entities.employees.Employee;
import fr.dawan.endlessoffice.entities.items.Item;
import fr.dawan.endlessoffice.entities.items.ItemSize;

import javax.persistence.*;
import java.io.Serializable;
//endregion

@Entity
@DiscriminatorValue("PICKABLEITEM")
public abstract class Pickable extends Item implements Serializable {
    private static final long serialVersionUID = 34564698191923654L;

    //region Attributes
    @Enumerated(EnumType.STRING)
    private ItemSize size;
    @ManyToOne
    @JoinColumn(name="id_employee")
    private Employee user;
    //endregion

    //region Constructors
    public Pickable() {
        super();
    }

    public Pickable(String name) {
        super(name);
    }
    //endregion

    //region Getters
    public ItemSize getSize() {
        return size;
    }

    public Employee getUser() {
        return user;
    }
    //endregion

    //region Setters

    public void setUser(Employee user) {
        this.user = user;
    }

    public void setSize(ItemSize size) {
        this.size = size;
    }
    //endregion
}
