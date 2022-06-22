package fr.dawan.endlessoffice.entities.employees.player;

//region Module import

import fr.dawan.endlessoffice.entities.employees.npc.Developer;
import fr.dawan.endlessoffice.entities.items.pickable.Pickable;
import fr.dawan.endlessoffice.entities.memories.Memory;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
//endregion

@Entity
@DiscriminatorValue("PLAYER")
public class Player extends Developer implements IPlayer, Serializable {
    private static final long serialVersionUID = 871833314841131835L;

    //region Constants
    private static final int BASE_INVENTORY_SIZE = 6;
    private static final int MAX_EAT_GAUGE = 100;
    private static final int MAX_DRINK_GAUGE = 100;
    //endregion

    //region Attributes
    @OneToMany(mappedBy = "owner", cascade = CascadeType.PERSIST)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Memory> memories = new ArrayList<>();
    private int eatGauge;
    private int drinkGauge;
    private int reputation;
    //endregion

    //region Constructors
    public Player() {
        super();
    }

    public Player(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public Player(String firstname, String lastname, String gender) {
        super(firstname, lastname, gender);
    }
    //endregion

    //region Public methods
    @Override
    public boolean acts() {
        return false;
    }

    @Override
    public boolean takeItem(Pickable item) {
        boolean result = false;
        List<Pickable> items = getInventory();

        // Get total size of the player's inventory and the sum of items size for comparison
        int availableSize = currentPlayerInventorySize();
        int currentSize = 0;

        if (items != null) {
            for (Pickable i : items) {
                currentSize += i.getSize().index();
            }
        }
        currentSize += item.getSize().index();

        // Check that item is in the inventory, returns false if it is true
        if ((item.isAContainer()) || ((!item.isAContainer()) && (!hasItem(item)) && (currentSize <= availableSize))) {
            item.setUser(this);
            items.add(item);
            result = true;

        }

        return result;
    }

    @Override
    public boolean dropItem(Pickable item) {
        List<Pickable> items = getInventory();

        if (hasItem(item)) {
            items.remove(item);
            return true;
        }

        return false;
    }

    @Override
    public boolean hasItem(Pickable item) {
        boolean result = false;

        if (getInventory() != null) {
            for (Pickable i: getInventory()) {
                if (i.getId() == item.getId()) {
                    result = true;
                    break;
                }
            }
        }

        return result;
    }

    @Override
    public boolean addMemory(Memory memory) {
        boolean result = false;

        if (!hasMemory(memory)) {
            memories.add(memory);
            result = true;

        }

        return result;
    }

    @Override
    public boolean hasMemory(Memory memory) {
        boolean result = false;

        if (memories != null) {
            for (Memory m : memories) {
                if (m.getId() == memory.getId()) {
                    result = true;
                    break;
                }
            }
        }

        return result;
    }
    //endregion

    //region Private methods
    private int currentPlayerInventorySize() {
        int size = BASE_INVENTORY_SIZE;

        if(getInventory() != null) {
            for (Pickable i : getInventory()) {
                if (i.isAContainer()) {
                    size += i.getSize().index();
                }
            }
        }

        return size;
    }
    //endregion

    //region Getters
    public List<Memory> getMemories() {
        return memories;
    }

    public int getEatGauge() {
        return eatGauge;
    }

    public int getDrinkGauge() {
        return drinkGauge;
    }

    public int getReputation() {
        return reputation;
    }
    //endregion

    //region Setters
    public void setEatGauge(int eatGauge) {
        this.eatGauge = eatGauge;
    }

    public void setDrinkGauge(int drinkGauge) {
        this.drinkGauge = drinkGauge;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }
    //endregion
}
