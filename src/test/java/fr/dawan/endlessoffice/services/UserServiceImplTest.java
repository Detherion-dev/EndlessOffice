package fr.dawan.endlessoffice.services;

import fr.dawan.endlessoffice.entities.users.User;
import fr.dawan.endlessoffice.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    void getAllUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("dether", "toto@gmail.com", "azerty123"));
        users.add(new User("nyx", "gregou@gmail.com", "azerty123"));

        when(userRepository.findAll()).thenReturn(users);

        List<User> result = userService.getAllUsers();

        assertEquals(2, result.size());
        assertEquals(users.get(0).getUsername(), result.get(0).getUsername());

    }

    @Test
    void getById() {
        User user = new User("dether", "toto@gmail.com", "azerty123");
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        Optional<User> result = userService.getById(1L);

        assertEquals("dether", result.get().getUsername());
        assertEquals("toto@gmail.com", result.get().getEmail());
    }

    @Test
    void getByUsername() {
        User user = new User("dether", "toto@gmail.com", "azerty123");
        when(userRepository.findByUsername("dether")).thenReturn(user);

        User result = userService.getByUsername("dether");

        assertEquals("dether", result.getUsername());
        assertEquals("toto@gmail.com", result.getEmail());
    }

    @Test
    void getByEmail() {
        User user = new User("dether", "toto@gmail.com", "azerty123");
        when(userRepository.findByEmail("toto@gmail.com")).thenReturn(user);

        User result = userService.getByEmail("toto@gmail.com");

        assertEquals("dether", result.getUsername());
        assertEquals("toto@gmail.com", result.getEmail());
    }

    @Test
    void deleteById() {
        userService.deleteById(1L);
        verify(userRepository, times(1)).deleteById(1L);
    }

    @Test
    void deleteByUsername() {
        userService.deleteByUsername("dether");
        verify(userRepository, times(1)).deleteByUsername("dether");
    }

    @Test
    void deleteByEmail() {
        userService.deleteByEmail("toto@gmail.com");
        verify(userRepository, times(1)).deleteByEmail("toto@gmail.com");
    }

    @Test
    void saveOrUpdate() {
        User user = new User("dether", "toto@gmail.com", "azerty123");
        when(userRepository.saveAndFlush(user)).thenReturn(user);

        User result = userService.saveOrUpdate(user);

        assertEquals("dether", result.getUsername());
        assertEquals("toto@gmail.com", result.getEmail());
    }
}