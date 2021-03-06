package fr.dawan.endlessoffice.entities.items.furnitures;

import fr.dawan.endlessoffice.utils.enums.ItemWeight;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue("DESK")
public class Desk extends Furniture implements Serializable {
    private static final long serialVersionUID = -123584687953L;

    public Desk() {
        super();
    }

    public Desk(String name) {
        super(name);
        this.setWeight(ItemWeight.HEAVY);
    }

    public Desk(String name, String description) {
        super(name, description);
        this.setWeight(ItemWeight.HEAVY);
    }

    @Override
    public boolean isBreakable() { return true; }

    @Override
    public boolean isMovable() { return true; }

    @Override
    public boolean isStealable() { return false; }

    @Override
    public boolean isElectrical() { return false; }

    @Override
    public boolean isAContainer() { return true; }
}
