package fr.dawan.endlessoffice.entities.employees.npc;

import fr.dawan.endlessoffice.entities.employees.Employee;
import fr.dawan.endlessoffice.utils.enums.Gender;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue("MANAGER")
public class Manager extends Employee implements Serializable {
    private static final long serialVersionUID = -2949075286937518843L;

    public Manager() {
        super();
    }

    public Manager(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public Manager(String firsname, String lastname, Gender gender) {
        super(firsname, lastname, gender);
    }
}
