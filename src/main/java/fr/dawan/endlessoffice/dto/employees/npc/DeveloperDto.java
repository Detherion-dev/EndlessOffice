package fr.dawan.endlessoffice.dto.employees.npc;

import fr.dawan.endlessoffice.dto.employees.EmployeeDto;
import fr.dawan.endlessoffice.utils.enums.Gender;
import fr.dawan.endlessoffice.utils.enums.Status;

public class DeveloperDto extends EmployeeDto {
    public DeveloperDto(String trigram, String firstname, String lastname, Gender gender, Status status) {
        super(trigram, firstname, lastname, gender, status);
    }

}
