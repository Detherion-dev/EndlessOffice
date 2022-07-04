package fr.dawan.endlessoffice.entities.employees.player;

import fr.dawan.endlessoffice.utils.enums.Gender;
import fr.dawan.endlessoffice.entities.items.pickable.Bag;
import fr.dawan.endlessoffice.entities.items.pickable.Pickable;
import fr.dawan.endlessoffice.entities.memories.Memory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player("Thomas", "Noiret", Gender.MALE);
    }

    @Test
    void addItem() {
        Pickable item = new Bag("bag", "bag of TNO");
        item.setId(1);
        assertTrue(player.addItem(item));
        assertFalse(player.addItem(item));
    }

    @Test
    void removeItem() {
        Pickable item = new Bag("bag", "bag of TNO");
        item.setId(1);
        player.addItem(item);
        assertTrue(player.removeItem(item));
        assertFalse(player.removeItem(item));
    }

    @Test
    void getItem() {
        Pickable item = new Bag("bag", "bag of TNO");
        item.setId(1);
        player.addItem(item);
        assertEquals(item, player.getItem("bag"));
        assertNull(player.getItem("phone"));
    }

    @Test
    void testGetItem() {
        Pickable item = new Bag("bag", "bag of TNO");
        item.setId(1);
        player.addItem(item);
        assertEquals(item, player.getItem(1));
        assertNull(player.getItem(2));
    }

    @Test
    void hasItem() {
        Pickable item = new Bag("bag", "bag of TNO");
        Pickable item2 = new Bag("bag2", "bag of ABO");
        item.setId(1);
        item2.setId(2);
        player.addItem(item);
        assertTrue(player.hasItem(item));
        assertFalse(player.hasItem(item2));
    }

    @Test
    void addMemory() {
        Memory memory = new Memory("memory1", "memory1");
        assertTrue(player.addMemory(memory));
        assertFalse(player.addMemory(memory));
    }

    @Test
    void hasMemory() {
        Memory memory = new Memory("memory1", "memory1");
        Memory memory2 = new Memory("memory2", "memory2");
        memory.setId(1);
        memory.setId(2);
        player.addMemory(memory);
        assertTrue(player.hasMemory(memory));
        assertFalse(player.hasMemory(memory2));
    }

    @Test
    void getMemories() {
        Memory memory = new Memory("memory1", "memory1");
        List<Memory> memories = new ArrayList<>();
        memories.add(memory);
        player.addMemory(memory);
        assertEquals(memories, player.getMemories());
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