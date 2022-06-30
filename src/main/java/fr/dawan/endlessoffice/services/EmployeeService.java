package fr.dawan.endlessoffice.services;

import fr.dawan.endlessoffice.entities.employees.Employee;
import fr.dawan.endlessoffice.utils.enums.Status;

import java.awt.print.Pageable;
import java.util.List;

public interface EmployeeService {
    /**
     * Returns all employees of Endless Office
     */
    List<Employee> getAllEmployees();

    /**
     * Returns the employee corresponding to the id
     * @param id: id of the employee to get
     */
    Employee getById(long id);

    /**
     * Returns employee(s) corresponding to the trigram
     * @param trigram: trigram of the employee(s)
     */
    List<Employee> searchByTrigram(String trigram);

    /**
     * Returns employee(s) corresponding to the firstname and the lastname
     * @param firstname: firstname of the employee(s)
     * @param lastname: lastname of the employee(s)
     */
    List<Employee> searchByFirstnameAndLastname(String firstname, String lastname);

    /**
     * Returns employees having a specific status
     * @param status: Employee status
     */
    List<Employee> searchByStatus(Status status);

    /**
     * Delete the employee corresponding to the id
     * @param id: id of the employee to delete
     */
    void deleteById(long id);

    /**
     * Save or update the employee
     * @param employeeDto: Dto of the employee to save
     * @return employeeDto: Dto of the employee to save
     */
    Employee saveOrUpdate(Employee employeeDto);

}
