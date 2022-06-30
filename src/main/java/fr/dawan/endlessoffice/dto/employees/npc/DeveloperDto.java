package fr.dawan.endlessoffice.dto.employees.npc;

import fr.dawan.endlessoffice.dto.employees.EmployeeDto;
import fr.dawan.endlessoffice.entities.employees.Gender;

public class DeveloperDto extends EmployeeDto {
    public DeveloperDto(String trigram, String firstname, String lastname, Gender gender, String status) {
        super(trigram, firstname, lastname, gender, status);
    }

}
