package fr.dawan.endlessoffice.entities.items.pickable;

import fr.dawan.endlessoffice.utils.enums.Gender;
import fr.dawan.endlessoffice.entities.employees.player.Player;
import fr.dawan.endlessoffice.utils.enums.ItemSize;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PickableTest {

    private Pickable item;

    @BeforeEach
    void setUp() {
        item = new Bag("bag", "bag of TNO");
    }

    @Test
    void getSize() {
        assertEquals(ItemSize.LARGE, item.getSize());
    }

    @Test
    void getUser() {
        Player player = new Player("Thomas", "Noiret", Gender.MALE);
        item.setUser(player);
        assertEquals(player, item.getUser());
    }
}