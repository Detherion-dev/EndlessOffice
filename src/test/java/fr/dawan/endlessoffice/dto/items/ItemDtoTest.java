package fr.dawan.endlessoffice.dto.items;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ItemDtoTest {

    private ItemDto itemDto;

    @BeforeEach
    void setUp() {
        itemDto = new ItemDto("item1", "item1");
    }

    @Test
    void getName() {
        itemDto.setName("item2");
        assertEquals("item2", itemDto.getName());
    }

    @Test
    void getDescription() {
        itemDto.setDescription("item2");
        assertEquals("item2", itemDto.getDescription());
    }

    @Test
    void testHashCode() {
        assertEquals(Objects.hash("item1", "item1"), itemDto.hashCode());
    }

    @Test
    void testToString() {
        assertEquals("ItemDto(name = item1, description = item1)", itemDto.toString());
    }
}