package fr.dawan.endlessoffice.entities.items;

import fr.dawan.endlessoffice.entities.items.pickable.Bag;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    private Item item;

    @BeforeEach
    void setUp() {
        item = new Bag("bag", "bag of TNO");
    }

    @Test
    void testToString() {
        assertEquals("Item bag (description: bag of TNO)", item.toString());
    }

    @Test
    void getName() {
        item.setName("bag2");
        assertEquals("bag2", item.getName());
    }

    @Test
    void getDescription() {
        item.setDescription("Second Bag of TNO");
        assertEquals("Second Bag of TNO", item.getDescription());
    }

    @Test
    void isBroken() {
        item.setBroken(true);
        assertEquals(true, item.isBroken());
    }
}
