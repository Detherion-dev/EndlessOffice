package fr.dawan.endlessoffice.entities.items.furnitures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeskTest {

    private Desk desk;

    @BeforeEach
    void setUp() {
        desk = new Desk("desk", "desk of TNO");
    }

    @Test
    void isBreakable() {
        assertTrue(desk.isBreakable());
    }

    @Test
    void isMovable() {
        assertTrue(desk.isMovable());
    }

    @Test
    void isStealable() {
        assertFalse(desk.isStealable());
    }

    @Test
    void isElectrical() {
        assertFalse(desk.isElectrical());
    }

    @Test
    void isAContainer() {
        assertTrue(desk.isAContainer());
    }
}