package fr.dawan.endlessoffice.services;

import fr.dawan.endlessoffice.entities.employees.Employee;
import fr.dawan.endlessoffice.entities.employees.npc.Manager;
import fr.dawan.endlessoffice.entities.employees.player.Player;
import fr.dawan.endlessoffice.repository.EmployeeRepository;
import fr.dawan.endlessoffice.utils.enums.Gender;
import fr.dawan.endlessoffice.utils.enums.Status;
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
class EmployeeServiceImplTest {

    @Mock
    private EmployeeRepository repository;

    @InjectMocks
    private EmployeeServiceImpl service;

    @Test
    void getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Player("Thomas", "Noiret", Gender.MALE));
        employees.add(new Manager("Grégory", "Marshall", Gender.MALE));

        when(repository.findAll()).thenReturn(employees);

        List<Employee> result = service.getAllEmployees();

        assertEquals(2, result.size());
        assertEquals(employees.get(0).getFirstname(), result.get(0).getFirstname());

    }

    @Test
    void getById() {
        Employee player = new Player("Thomas", "Noiret", Gender.MALE);

        when(repository.findById(1L)).thenReturn(Optional.of(player));

        Optional<Employee> result = service.getById(1L);

        assertEquals("Thomas", result.get().getFirstname());
        assertEquals("Noiret", result.get().getLastname());
    }

    @Test
    void searchByTrigram() {
        List<Employee> employees = new ArrayList<>();
        Employee player = new Player("Thomas", "Noiret", Gender.MALE);
        employees.add(player);

        when(repository.findByTrigram("TNO")).thenReturn(employees);

        List<Employee> result = service.searchByTrigram("TNO");

        assertEquals("Thomas", result.get(0).getFirstname());
        assertEquals("Noiret", result.get(0).getLastname());
    }

    @Test
    void searchByFirstnameAndLastname() {
        List<Employee> employees = new ArrayList<>();
        Employee player = new Player("Thomas", "Noiret", Gender.MALE);
        employees.add(player);

        when(repository.findByFirstnameAndLastname("Thomas", "Noiret")).thenReturn(employees);

        List<Employee> result = service.searchByFirstnameAndLastname("Thomas", "Noiret");

        assertEquals("Thomas", result.get(0).getFirstname());
        assertEquals("Noiret", result.get(0).getLastname());
    }

    @Test
    void searchByStatus() {
        List<Employee> employees = new ArrayList<>();
        Employee player = new Player("Thomas", "Noiret", Gender.MALE);
        player.setStatus(Status.WORKING);
        employees.add(player);

        when(repository.findByStatus(Status.WORKING)).thenReturn(employees);

        List<Employee> result = service.searchByStatus(Status.WORKING);

        assertEquals("Thomas", result.get(0).getFirstname());
        assertEquals("Noiret", result.get(0).getLastname());
    }

    @Test
    void deleteById() {
        service.deleteById(1L);
        verify(repository, times(1)).deleteById(1L);
    }

    @Test
    void saveOrUpdate() {
        Employee player = new Player("Thomas", "Noiret", Gender.MALE);

        when(repository.saveAndFlush(player)).thenReturn(player);

        Employee result = service.saveOrUpdate(player);

        assertEquals("Thomas", result.getFirstname());
        assertEquals("Noiret", result.getLastname());
    }
}