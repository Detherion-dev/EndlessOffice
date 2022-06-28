package fr.dawan.endlessoffice.entities.memories;

import fr.dawan.endlessoffice.entities.employees.player.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemoryTest {

    Memory memory;

    @BeforeEach
    void setUp() {
        memory = new Memory("memory1", "memory1");
    }

    @Test
    void getName() {
        memory.setName("memory2");
        assertEquals("memory2", memory.getName());
    }

    @Test
    void getDescription() {
        memory.setDescription("memory2");
        assertEquals("memory2", memory.getDescription());
    }

    @Test
    void getOwner() {
        Player player = new Player("Thomas", "Noiret");
        memory.setOwner(player);
        assertEquals("Employee Thomas Noiret", memory.getOwner().toString());
    }
}