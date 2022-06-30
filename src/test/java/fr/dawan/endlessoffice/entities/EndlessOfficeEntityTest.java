package fr.dawan.endlessoffice.entities;

import fr.dawan.endlessoffice.utils.enums.Gender;
import fr.dawan.endlessoffice.entities.employees.player.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndlessOfficeEntityTest {

    private EndlessOfficeEntity player;

    @BeforeEach
    void setUp() {
        player = new Player("Thomas", "Noiret", Gender.MALE);
    }

    @Test
    void getId() {
        player.setId(1);
        assertEquals(1, player.getId());
    }
}