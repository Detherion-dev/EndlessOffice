package fr.dawan.endlessoffice.entities.items.pickable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

    private Bag bag;

    @BeforeEach
    void setUp() {
        bag = new Bag("bag", "bag of TNO");
    }

    @Test
    void isBreakable() {
        assertTrue(bag.isBreakable());
    }

    @Test
    void isMovable() {
        assertTrue(bag.isMovable());
    }

    @Test
    void isStealable() {
        assertTrue(bag.isStealable());
    }

    @Test
    void isElectrical() {
        assertFalse(bag.isElectrical());
    }

    @Test
    void isAContainer() {
        assertTrue(bag.isAContainer());
    }
}