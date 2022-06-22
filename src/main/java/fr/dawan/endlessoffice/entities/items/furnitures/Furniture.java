package fr.dawan.endlessoffice.entities.items.furnitures;

//region Module import
import fr.dawan.endlessoffice.entities.items.Item;
import fr.dawan.endlessoffice.entities.items.ItemWeight;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;
//endregion

@Entity
@DiscriminatorValue("FURNITURE")
public abstract class Furniture extends Item implements Serializable {
    private static final long serialVersionUID = -35746984136654L;

    //region Attributes
    @Enumerated(EnumType.STRING)
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
