package fr.dawan.endlessoffice.services.actions;

import fr.dawan.endlessoffice.entities.employees.Employee;
import fr.dawan.endlessoffice.entities.employees.player.Player;
import fr.dawan.endlessoffice.entities.items.pickable.Bag;
import fr.dawan.endlessoffice.entities.items.pickable.Pickable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TakeItemTest {

    private TakeItem takeItemAction;

    @BeforeEach
    void setUp() {
        Employee player = new Player("Thomas", "Noiret");
        takeItemAction = new TakeItem("take bag", "take bag", 1, 1);
        takeItemAction.setActor(player);
    }

    @Test
    void execute() {
        Pickable item = new Bag("bag");
        takeItemAction.execute(item);
        Player player = (Player) takeItemAction.getActor();
        assertEquals(1, player.getInventory().size());
    }
}