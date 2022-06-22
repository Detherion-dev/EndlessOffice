package fr.dawan.endlessoffice.entities.items.pickable;

//region Module import
import fr.dawan.endlessoffice.entities.items.ItemSize;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;
//endregion

@Entity
@DiscriminatorValue("BAG")
public class Bag extends Pickable implements Serializable {
    private static final long serialVersionUID = -123584687953L;

    //region Constructors
    public Bag() {
        super();
        setSize(ItemSize.LARGE);
    }

    public Bag(String name) {
        super(name);
        setSize(ItemSize.LARGE);
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
    public boolean isAContainer() { return true; }
    //endregion
}
