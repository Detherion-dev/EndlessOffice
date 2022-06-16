package endlessoffice.entities.items.pickableitems;

//region Module import
import endlessoffice.entities.employees.Employee;
import endlessoffice.entities.items.Item;
import endlessoffice.entities.items.ItemSize;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
//endregion

@Entity
@DiscriminatorValue("PICKABLEITEM")
public abstract class PickableItem extends Item implements Serializable {
    private static final long serialVersionUID = 34564698191923654L;

    //region Attributes
    private ItemSize size;
    @ManyToOne
    @JoinColumn(name="id_employee")
    private Employee user;
    //endregion

    //region Constructors
    public PickableItem() {
        super();
    }

    public PickableItem(String name) {
        super(name);
    }
    //endregion

    //region Public methods
    @Override
    public boolean isBreakable() { return true; }

    @Override
    public boolean isMovable() { return true; }

    @Override
    public boolean isStealable() { return true; }

    @Override
    public boolean isElectrical() { return false; }

    @Override
    public boolean isAContainer() { return false; }
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

    public void setOwner(Employee user) {
        this.user = user;
    }

    public void setSize(ItemSize size) {
        this.size = size;
    }
    //endregion
}