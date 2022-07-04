package fr.dawan.endlessoffice.services.actions;

import fr.dawan.endlessoffice.entities.employees.Employee;
import fr.dawan.endlessoffice.entities.employees.player.Player;
import fr.dawan.endlessoffice.entities.items.pickable.Bag;
import fr.dawan.endlessoffice.entities.items.pickable.Phone;
import fr.dawan.endlessoffice.entities.items.pickable.Pickable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TakeItemTest {

    private Pickable item;
    private Pickable item2;
    private Employee employee;
    private TakeItem takeItemAction;

    @BeforeEach
    void setUp() {
        item = new Bag("bag");
        item2 = new Phone("phone");
        employee = new Player("Thomas", "Noiret");
        takeItemAction = new TakeItem("takeBag", "take my bag", 1L, 1L);
        takeItemAction.setActor(employee);
    }

    @Test
    void execute() {
        takeItemAction.execute(item);
        assertEquals(1, employee.getInventory().size());
    }
}