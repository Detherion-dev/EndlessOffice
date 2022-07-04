package fr.dawan.endlessoffice.entities.items.pickable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {

    private Phone phone;

    @BeforeEach
    void setUp() {
        phone = new Phone("phone", "phone of tno");
    }

    @Test
    void isBreakable() {
        assertTrue(phone.isBreakable());
    }

    @Test
    void isMovable() {
        assertTrue(phone.isMovable());
    }

    @Test
    void isStealable() {
        assertTrue(phone.isStealable());
    }

    @Test
    void isElectrical() {
        assertTrue(phone.isElectrical());
    }

    @Test
    void isAContainer() {
        assertFalse(phone.isAContainer());
    }
}