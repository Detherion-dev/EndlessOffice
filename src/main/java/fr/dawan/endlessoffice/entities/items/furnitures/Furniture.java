package fr.dawan.endlessoffice.entities.items.furnitures;

import fr.dawan.endlessoffice.entities.items.Item;
import fr.dawan.endlessoffice.entities.items.ItemWeight;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;

@Entity
@DiscriminatorValue("FURNITURE")
public abstract class Furniture extends Item implements Serializable {
    private static final long serialVersionUID = -35746984136654L;

    @Enumerated(EnumType.STRING)
    private ItemWeight weight;

    public Furniture() {
        super();
    }

    public Furniture(String name) {
        super(name);
    }

    public Furniture(String name, String description) {
        super(name, description);
    }

    //region Getters-Setters
    public ItemWeight getWeight() {
        return weight;
    }

    public void setWeight(ItemWeight weight) {
        this.weight = weight;
    }
    //endregion
}
