package fr.dawan.endlessoffice.dto.employees;

import fr.dawan.endlessoffice.utils.enums.Gender;
import fr.dawan.endlessoffice.utils.enums.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeDtoTest {

    EmployeeDto player;

    @BeforeEach
    void setUp() {
        player = new EmployeeDto("TNO", "Thomas", "Noiret", Gender.MALE, Status.WORKING);
    }

    @Test
    void getTrigram() {
        player.setTrigram("ABO");
        assertEquals("ABO", player.getTrigram());
    }

    @Test
    void getFirstname() {
        player.setFirstname("Aurélien");
        assertEquals("Aurélien", player.getFirstname());
    }

    @Test
    void getLastname() {
        player.setLastname("Bouillé");
        assertEquals("Bouillé", player.getLastname());
    }

    @Test
    void getGender() {
        player.setGender(Gender.FEMALE);
        assertEquals(Gender.FEMALE, player.getGender());
    }

    @Test
    void getStatus() {
        player.setStatus(Status.TALKING);
        assertEquals(Status.TALKING, player.getStatus());
    }

    @Test
    void testHashCode() {
        assertEquals(Objects.hash("TNO", "Thomas", "Noiret", Gender.MALE, Status.WORKING), player.hashCode());

    }

    @Test
    void testToString() {
        assertEquals("EmployeeDto(trigram = TNO, firstname = Thomas, lastname = Noiret, gender = MALE, status = WORKING)",
                     player.toString());
    }
}