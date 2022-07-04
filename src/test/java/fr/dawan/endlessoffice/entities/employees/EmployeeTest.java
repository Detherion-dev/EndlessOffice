package fr.dawan.endlessoffice.entities.employees;

import fr.dawan.endlessoffice.entities.employees.player.Player;
import fr.dawan.endlessoffice.entities.items.pickable.Bag;
import fr.dawan.endlessoffice.entities.items.pickable.Phone;
import fr.dawan.endlessoffice.entities.items.pickable.Pickable;
import fr.dawan.endlessoffice.utils.enums.Gender;
import fr.dawan.endlessoffice.utils.enums.Position;
import fr.dawan.endlessoffice.utils.enums.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private Employee player;

    @BeforeEach
    void setUp() {
        player = new Player("Thomas", "Noiret", Gender.MALE);
    }

    @Test
    void testToString() {
        assertEquals("Employee Thomas Noiret", player.toString());
    }

    @Test
    void getTrigram() {
        assertEquals("TNO", player.getTrigram());
    }

    @Test
    void setName() {
        player.setName("Aurélien", "Bouillé");
        assertEquals("Employee Aurélien Bouillé", player.toString());
        assertEquals("ABO", player.getTrigram());
    }

    @Test
    void getFirstname() {
        player.setName("Aurélien", "Bouillé");
        assertEquals("Aurélien", player.getFirstname());
    }

    @Test
    void getLastname() {
        player.setName("Grégory", "Marshall");
        assertEquals("Marshall", player.getLastname());
    }

    @Test
    void getGender() {
        player.setGender(Gender.FEMALE);
        assertEquals(Gender.FEMALE, player.getGender());
    }

    @Test
    void getInventory() {
        List<Pickable> inventory = new ArrayList<>();
        Pickable item1 = new Phone("phone", "phone of TNO");
        Pickable item2 = new Bag("bag", "bag of TNO");
        inventory.add(item1);
        inventory.add(item2);
        player.setInventory(inventory);
        assertEquals(inventory, player.getInventory());
    }

    @Test
    void getStatus() {
        player.setStatus(Status.MOVING);
        assertEquals(Status.MOVING, player.getStatus());
    }

    @Test
    void getPosition() {
        player.setPosition(Position.OFFICE_A);
        assertEquals(Position.OFFICE_A, player.getPosition());
    }
}
