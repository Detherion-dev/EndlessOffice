package endlessoffice.entities.items.furnitures;

//region Module import
import endlessoffice.entities.items.Item;
import endlessoffice.entities.items.ItemWeight;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;
//endregion

@Entity
@DiscriminatorValue("FURNITURE")
public abstract class Furniture extends Item implements Serializable {
    private static final long serialVersionUID = -35746984136654L;

    //region Attributes
    private ItemWeight weight;
    //endregion

    //region Constructors
    public Furniture() {
        super();
    }

    public Furniture(String name) {
        super(name);
    }
    //endregion

    //region Public methods
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
    //endregion

    //region Getters
    public ItemWeight getWeight() {
        return weight;
    }
    //endregion

    //region Setters
    public void setWeight(ItemWeight weight) {
        this.weight = weight;
    }
    //endregion
}