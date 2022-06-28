package fr.dawan.endlessoffice.entities.users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User("Detherion", "detherion@gmail.com", "azerty123");
    }

    @Test
    void testToString() {
        assertEquals("<User Detherion>", user.toString());
    }

    @Test
    void getUsername() {
        user.setUsername("Toto");
        assertEquals("Toto", user.getUsername());
    }

    @Test
    void getEmail() {
        user.setEmail("toto@gmail.com");
        assertEquals("toto@gmail.com", user.getEmail());
    }

    @Test
    void getPassword() {
        user.setPassword("azerty124");
        assertEquals("azerty124", user.getPassword());
    }
}