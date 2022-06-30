package fr.dawan.endlessoffice.dto.users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class UserDtoTest {

    private UserDto userDto;

    @BeforeEach
    void setUp() {
        userDto = new UserDto("dether", "toto@gmail.com", "azerty123");
    }

    @Test
    void getUsername() {
        userDto.setUsername("Detherion");
        assertEquals("Detherion", userDto.getUsername());
    }

    @Test
    void getEmail() {
        userDto.setEmail("tata@gmail.com");
        assertEquals("tata@gmail.com", userDto.getEmail());
    }

    @Test
    void getPassword() {
        userDto.setPassword("azerty789");
        assertEquals("azerty789", userDto.getPassword());
    }

    @Test
    void testHashCode() {
        assertEquals(Objects.hash("dether", "toto@gmail.com", "azerty123"), userDto.hashCode());
    }

    @Test
    void testToString() {
        assertEquals("UserDto(username = dether, email = toto@gmail.com, password = azerty123)",
                     userDto.toString());
    }
}