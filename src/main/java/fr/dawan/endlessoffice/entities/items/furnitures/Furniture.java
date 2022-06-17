package fr.dawan.endlessoffice.entities.items.furnitures;

import fr.dawan.endlessoffice.entities.items.Item;
import fr.dawan.endlessoffice.entities.items.ItemWeight;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue("FURNITURE")
public abstract class Furniture extends Item implements Serializable {
    private static final long serialVersionUID = -35746984136654L;

    private ItemWeight weight;

    public Furniture() {
        super();
    }

    public Furniture(String name) {
        super(name);
    }

    @Override
    public boolean isBreakable() { return false; }

    @Override
    public boolean isMovable() { return false; }

    @Override
    public boolean isStealable() { return false; }

    @Override
    public boolean isElectrical() { return false; }

    @Override
    public boolean isAContainer() { return false; }

    //region Getters-Setters
    public ItemWeight getWeight() {
        return weight;
    }

    public void setWeight(ItemWeight weight) {
        this.weight = weight;
    }
    //endregion
}
