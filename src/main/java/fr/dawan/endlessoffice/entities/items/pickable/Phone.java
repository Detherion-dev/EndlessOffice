package fr.dawan.endlessoffice.entities.items.pickable;

//region Module Import

import fr.dawan.endlessoffice.entities.items.ItemSize;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;
//endregion

@Entity
@DiscriminatorValue("PHONE")
public class Phone extends Pickable implements Serializable {
    private static final long serialVersionUID = -123584687953L;

    //region Constructors
    public Phone() {
        super();
        setSize(ItemSize.SMALL);
    }

    public Phone(String name) {
        super(name);
        setSize(ItemSize.SMALL);
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
