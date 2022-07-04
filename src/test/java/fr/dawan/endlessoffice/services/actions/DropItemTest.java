package fr.dawan.endlessoffice.services.actions;

import fr.dawan.endlessoffice.entities.employees.player.Player;
import fr.dawan.endlessoffice.entities.items.pickable.Bag;
import fr.dawan.endlessoffice.entities.items.pickable.Phone;
import fr.dawan.endlessoffice.entities.items.pickable.Pickable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DropItemTest {

    private Pickable item;
    private Pickable item2;
    private Player employee;
    private DropItem dropItemAction;

    @BeforeEach
    void setUp() {
        employee = new Player("Thomas", "Noiret");
        item = new Bag("bag");
        item2 = new Phone("phone");
        employee.addItem(item);
        employee.addItem(item2);
        dropItemAction = new DropItem("drop bag");
        dropItemAction.setActor(employee);
    }

    @Test
    void execute() {
        dropItemAction.execute(item);
        assertEquals(1, employee.getInventory().size());
    }
}