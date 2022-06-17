package fr.dawan.endlessoffice.entities.items.pickable;

import fr.dawan.endlessoffice.entities.items.ItemSize;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue("LAPTOP")
public class Laptop extends Pickable implements Serializable {
    private static final long serialVersionUID = -11123584687953L;

    public Laptop() {
        super();
        setSize(ItemSize.MEDIUM);
    }

    public Laptop(String name) {
        super(name);
        setSize(ItemSize.MEDIUM);
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
