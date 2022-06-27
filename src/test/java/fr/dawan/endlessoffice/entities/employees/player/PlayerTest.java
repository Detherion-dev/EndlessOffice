package fr.dawan.endlessoffice.entities.employees.player;

import fr.dawan.endlessoffice.entities.employees.Gender;
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
    void takeItem() {
        Pickable item = new Bag("bag", "bag of TNO");
        item.setId(1);
        assertEquals(true, player.takeItem(item));
        assertEquals(false, player.takeItem(item));
    }

    @Test
    void dropItem() {
        Pickable item = new Bag("bag", "bag of TNO");
        item.setId(1);
        player.takeItem(item);
        assertEquals(true, player.dropItem(item));
        assertEquals(false, player.dropItem(item));
    }

    @Test
    void getItem() {
        Pickable item = new Bag("bag", "bag of TNO");
        item.setId(1);
        player.takeItem(item);
        assertEquals(item, player.getItem("bag"));
        assertEquals(null, player.getItem("phone"));
    }

    @Test
    void testGetItem() {
        Pickable item = new Bag("bag", "bag of TNO");
        item.setId(1);
        player.takeItem(item);
        assertEquals(item, player.getItem(1));
        assertEquals(null, player.getItem(2));
    }

    @Test
    void hasItem() {
        Pickable item = new Bag("bag", "bag of TNO");
        Pickable item2 = new Bag("bag2", "bag of ABO");
        item.setId(1);
        item2.setId(2);
        player.takeItem(item);
        assertEquals(true, player.hasItem(item));
        assertEquals(false, player.hasItem(item2));
    }

    @Test
    void addMemory() {
        Memory memory = new Memory("memory1", "memory1");
        assertEquals(true, player.addMemory(memory));
        assertEquals(false, player.addMemory(memory));
    }

    @Test
    void hasMemory() {
        Memory memory = new Memory("memory1", "memory1");
        Memory memory2 = new Memory("memory2", "memory2");
        memory.setId(1);
        memory.setId(2);
        player.addMemory(memory);
        assertEquals(true, player.hasMemory(memory));
        assertEquals(false, player.hasMemory(memory2));
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