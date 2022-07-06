package fr.dawan.endlessoffice.services.actions;

import fr.dawan.endlessoffice.entities.employees.player.Player;
import fr.dawan.endlessoffice.entities.items.pickable.Bag;
import fr.dawan.endlessoffice.entities.items.pickable.Phone;
import fr.dawan.endlessoffice.entities.items.pickable.Pickable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DropItemTest {

    private DropItem dropItemAction;
    private Pickable itemToDelete;

    @BeforeEach
    void setUp() {
        dropItemAction = new DropItem("drop bag", "drop bag", 1, 1);
        itemToDelete = new Bag("bag");
        Player player = new Player("Thomas", "Noiret");
        player.addItem(itemToDelete);
        player.addItem(new Phone("phone"));
        dropItemAction.setActor(player);
    }

    @Test
    void execute() {
        dropItemAction.execute(itemToDelete);
        assertEquals(1, dropItemAction.getActor().getInventory().size());
    }
}