package fr.dawan.endlessoffice.dto.memories;

import fr.dawan.endlessoffice.dto.employees.player.PlayerDto;
import fr.dawan.endlessoffice.utils.enums.Gender;
import fr.dawan.endlessoffice.utils.enums.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class MemoryDtoTest {

    private PlayerDto player;
    private MemoryDto memoryDto;

    @BeforeEach
    void setUp() {
        player = new PlayerDto("TNO", "Thomas", "Noiret", Gender.MALE, Status.WORKING,
                               10, 10, 10);
        memoryDto = new MemoryDto("memory1", "memory1", player);
    }

    @Test
    void getName() {
        memoryDto.setName("memory2");
        assertEquals("memory2", memoryDto.getName());
    }

    @Test
    void getDescription() {
        memoryDto.setDescription("memory2");
        assertEquals("memory2", memoryDto.getDescription());
    }

    @Test
    void getOwner() {
        assertEquals(player, memoryDto.getOwner());
    }

    @Test
    void testHashCode() {
        assertEquals(Objects.hash("memory1", "memory1", player), memoryDto.hashCode());
    }

    @Test
    void testToString() {
        assertEquals("MemoryDto(name = memory1, description = memory1, owner = Thomas Noiret)",
                      memoryDto.toString());
    }
}