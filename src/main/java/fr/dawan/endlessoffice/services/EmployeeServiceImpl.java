package fr.dawan.endlessoffice.services;

import fr.dawan.endlessoffice.entities.employees.Employee;
import fr.dawan.endlessoffice.utils.enums.Status;
import fr.dawan.endlessoffice.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;

import java.awt.print.Pageable;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository repository;

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getById(long id) {
        return null;
    }

    @Override
    public List<Employee> searchByTrigram(String trigram) {
        return null;
    }

    @Override
    public List<Employee> searchByFirstnameAndLastname(String firstname, String lastname) {
        return null;
    }

    @Override
    public List<Employee> searchByStatus(Status status) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public Employee saveOrUpdate(Employee employeeDto) {
        return null;
    }
}
