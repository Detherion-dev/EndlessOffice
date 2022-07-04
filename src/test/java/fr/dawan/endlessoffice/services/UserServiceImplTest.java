package fr.dawan.endlessoffice.services;

import fr.dawan.endlessoffice.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserServiceImpl();
    }

    @Test
    void getAllUsers() {
        userService.getAllUsers(Pageable.unpaged()).forEach(System.out::println);
    }

    @Test
    void getById() {
        userService.getById(1);
    }

    @Test
    void getByUsername() {
    }

    @Test
    void getByEmail() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void deleteByUsername() {
    }

    @Test
    void deleteByEmail() {
    }

    @Test
    void saveOrUpdate() {
    }
}