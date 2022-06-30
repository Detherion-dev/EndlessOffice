package fr.dawan.endlessoffice.dto.employees.player;

import fr.dawan.endlessoffice.utils.enums.Gender;
import fr.dawan.endlessoffice.utils.enums.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerDtoTest {

    PlayerDto player;

    @BeforeEach
    void setUp() {
        player = new PlayerDto("TNO", "Thomas", "Noiret",
                                Gender.MALE, Status.WORKING, 10, 10, 10);
    }

    @Test
    void getEatGauge() {
        player.setEatGauge(50);
        assertEquals(50, player.getEatGauge());
    }

    @Test
    void getDrinkGauge() {
        player.setDrinkGauge(50);
        assertEquals(50, player.getDrinkGauge());
    }

    @Test
    void getReputation() {
        player.setReputation(50);
        assertEquals(50, player.getReputation());
    }

}