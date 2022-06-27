package fr.dawan.endlessoffice.entities.items.pickable;

import fr.dawan.endlessoffice.entities.items.ItemSize;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue("BAG")
public class Bag extends Pickable implements Serializable {
    private static final long serialVersionUID = -123584687953L;

    public Bag() {
        super();
        setSize(ItemSize.LARGE);
    }

    public Bag(String name) {
        super(name);
        setSize(ItemSize.LARGE);
    }

    public Bag(String name, String description) {
        super(name, description);
        setSize(ItemSize.LARGE);
    }

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
}
