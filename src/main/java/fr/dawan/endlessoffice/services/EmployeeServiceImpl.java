package fr.dawan.endlessoffice.services;

import fr.dawan.endlessoffice.dto.employees.EmployeeDto;
import fr.dawan.endlessoffice.utils.enums.Status;
import fr.dawan.endlessoffice.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;

import java.awt.print.Pageable;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository repository;
    private ModelMapper mapper;

    @Override
    public List<EmployeeDto> getAllEmployees(Pageable page) {
        return null;
    }

    @Override
    public EmployeeDto getById(long id) {
        return null;
    }

    @Override
    public List<EmployeeDto> searchByTrigram(String trigram) {
        return null;
    }

    @Override
    public List<EmployeeDto> searchByFirstnameAndLastname(String firstname, String lastname) {
        return null;
    }

    @Override
    public List<EmployeeDto> searchByStatus(Status status) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public EmployeeDto saveOrUpdate(EmployeeDto employeeDto) {
        return null;
    }
}
