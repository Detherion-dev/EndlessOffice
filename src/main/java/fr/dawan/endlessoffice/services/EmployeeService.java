package fr.dawan.endlessoffice.services;


import fr.dawan.endlessoffice.dto.employees.EmployeeDto;

import java.awt.print.Pageable;
import java.util.List;

public interface EmployeeService {
    /**
     * Returns all employees of Endless Office
     */
    List<EmployeeDto> getAllEmployees(Pageable page);

    /**
     * Returns the employee corresponding to the id
     * @param id: id of the employee to get
     */
    EmployeeDto getById(long id);

    /**
     * Returns employee(s) corresponding to the trigram
     * @param trigram: trigram of the employee(s)
     */
    List<EmployeeDto> searchByTrigram(String trigram);

    /**
     * Returns employee(s) corresponding to the firstname and the lastname
     * @param firstname: firstname of the employee(s)
     * @param lastname: lastname of the employee(s)
     */
    List<EmployeeDto> searchByFirstnameAndLastname(String firstname, String lastname);

    /**
     * Delete the employee corresponding to the id
     * @param id: id of the employee to delete
     */
    void deleteById(long id);

    /**
     * Save or update the employee
     * @param employeeDto: Dto of the employee to save
     */
    EmployeeDto saveOrUpdate(EmployeeDto employeeDto);

}
