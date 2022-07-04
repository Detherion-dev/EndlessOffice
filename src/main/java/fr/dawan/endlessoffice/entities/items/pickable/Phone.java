package fr.dawan.endlessoffice.entities.items.pickable;

import fr.dawan.endlessoffice.utils.enums.ItemSize;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue("PHONE")
public class Phone extends Pickable implements Serializable {
    private static final long serialVersionUID = -123584687953L;

    public Phone() {
        super();
        setSize(ItemSize.SMALL);
    }

    public Phone(String name) {
        super(name);
        setSize(ItemSize.SMALL);
    }

    public Phone(String name, String description) {
        super(name, description);
        setSize(ItemSize.SMALL);
    }

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
}
