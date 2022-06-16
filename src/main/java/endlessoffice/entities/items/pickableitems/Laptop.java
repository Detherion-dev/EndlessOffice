package endlessoffice.entities.items.pickableitems;

import endlessoffice.entities.items.ItemSize;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue("LAPTOP")
public class Laptop extends PickableItem implements Serializable {
    private static final long serialVersionUID = -11123584687953L;

    //region Constructors
    public Laptop() {
        super();
        setSize(ItemSize.MEDIUM);
    }

    public Laptop(String name) {
        super(name);
        setSize(ItemSize.MEDIUM);
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
    public boolean isElectrical() { return true; }

    @Override
    public boolean isAContainer() { return false; }
    //endregion
}