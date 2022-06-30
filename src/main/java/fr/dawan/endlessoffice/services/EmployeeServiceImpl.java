package fr.dawan.endlessoffice.services;

import fr.dawan.endlessoffice.entities.employees.Employee;
import fr.dawan.endlessoffice.utils.enums.Status;
import fr.dawan.endlessoffice.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository repository;

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Optional<Employee> getById(long id) {
        return repository.findById(id);
    }

    @Override
    public List<Employee> searchByTrigram(String trigram) {
        return repository.findByTrigram(trigram);
    }

    @Override
    public List<Employee> searchByFirstnameAndLastname(String firstname, String lastname) {
        return repository.findByFirstnameAndLastname(firstname, lastname);
    }

    @Override
    public List<Employee> searchByStatus(Status status) {
        return repository.findByStatus(status);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public Employee saveOrUpdate(Employee employee) {
        return repository.saveAndFlush(employee);
    }
}
