package fr.dawan.endlessoffice.entities.employees.player;

import fr.dawan.endlessoffice.entities.employees.Employee;
import fr.dawan.endlessoffice.entities.employees.Gender;
import fr.dawan.endlessoffice.entities.items.pickable.Pickable;
import fr.dawan.endlessoffice.entities.memories.Memory;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("PLAYER")
public class Player extends Employee implements IPlayer, Serializable {
    private static final long serialVersionUID = 871833314841131835L;

    private static final int BASE_INVENTORY_SIZE = 6;
    private static final int MAX_EAT_GAUGE = 100;
    private static final int MAX_DRINK_GAUGE = 100;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.PERSIST)
    private List<Memory> memories = new ArrayList<>();
    private int eatGauge;
    private int drinkGauge;
    private int reputation;

    public Player() {
        super();
    }

    public Player(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public Player(String firstname, String lastname, Gender gender) {
        super(firstname, lastname, gender);
    }

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
        for (Pickable i : items) {
            currentSize += i.getSize().getIndex();
        }
        currentSize += item.getSize().getIndex();

        // Check that item is in the inventory, returns false if it is true
        if ((!hasItem(item)) && (currentSize <= availableSize)) {
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
    public Pickable getItem(long itemId) {
        Pickable result = null;

        for (Pickable i: getInventory()) {
            if (i.getId() == itemId) {
                result = i;
                break;
            }
        }

        return result;
    }

    @Override
    public Pickable getItem(String itemName) {
        Pickable result = null;

        for (Pickable i: getInventory()) {
            if (i.getName() == itemName) {
                result = i;
                break;
            }
        }

        return result;
    }

    @Override
    public boolean hasItem(Pickable item) {
        boolean result = false;

        for (Pickable i: getInventory()) {
            if (i.equals(item)) {
                result = true;
                break;
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

        for (Memory m: memories) {
            if (m.equals(memory)) {
                result = true;
                break;
            }
        }

        return result;
    }

    private int currentPlayerInventorySize() {
        int size = BASE_INVENTORY_SIZE;
        for (Pickable i: getInventory()) {
            if (i.isAContainer()) {
                size += i.getSize().getIndex();
            }
        }

        return size;
    }

    //region Getters-Setters
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
