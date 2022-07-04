package fr.dawan.endlessoffice.entities.items.furnitures;

import fr.dawan.endlessoffice.utils.enums.ItemWeight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FurnitureTest {

    private Furniture item;

    @BeforeEach
    void setUp() {
        item = new Desk("desk", "desk of TNO");
    }

    @Test
    void getWeight() {
        assertEquals(ItemWeight.HEAVY, item.getWeight());
    }
}