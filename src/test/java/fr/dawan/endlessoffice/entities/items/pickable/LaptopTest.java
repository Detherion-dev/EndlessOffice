package fr.dawan.endlessoffice.entities.items.pickable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaptopTest {

    private Laptop laptop;

    @BeforeEach
    void setUp() {
        laptop = new Laptop("laptop", "laptop of tno");
    }

    @Test
    void isBreakable() {
        assertTrue(laptop.isBreakable());
    }

    @Test
    void isMovable() {
        assertTrue(laptop.isMovable());
    }

    @Test
    void isStealable() {
        assertTrue(laptop.isStealable());
    }

    @Test
    void isElectrical() {
        assertTrue(laptop.isElectrical());
    }

    @Test
    void isAContainer() {
        assertFalse(laptop.isAContainer());
    }
}