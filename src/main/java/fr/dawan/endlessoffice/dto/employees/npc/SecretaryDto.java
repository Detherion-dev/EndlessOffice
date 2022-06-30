package fr.dawan.endlessoffice.dto.employees.npc;

import fr.dawan.endlessoffice.dto.employees.EmployeeDto;
import fr.dawan.endlessoffice.entities.employees.Gender;
import fr.dawan.endlessoffice.entities.employees.Status;

public class SecretaryDto extends EmployeeDto {
    public SecretaryDto(String trigram, String firstname, String lastname, Gender gender, Status status) {
        super(trigram, firstname, lastname, gender, status);
    }
}