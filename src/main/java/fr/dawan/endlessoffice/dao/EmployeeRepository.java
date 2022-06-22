package fr.dawan.endlessoffice.dao;

import fr.dawan.endlessoffice.entities.employees.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
