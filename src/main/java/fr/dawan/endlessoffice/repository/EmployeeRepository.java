package fr.dawan.endlessoffice.repository;

import fr.dawan.endlessoffice.entities.employees.Employee;
import fr.dawan.endlessoffice.utils.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByTrigram(String trigram);
    List<Employee> findByFirstnameAndLastname(String firstname, String lastname);
    List<Employee> findByStatus(Status status);


}
