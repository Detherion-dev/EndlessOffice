package fr.dawan.endlessoffice.entities.employees.npc;

import fr.dawan.endlessoffice.entities.employees.Employee;
import fr.dawan.endlessoffice.utils.enums.Gender;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue("SECRETARY")
public class Secretary extends Employee implements Serializable {
    private static final long serialVersionUID = 2334295602355693922L;

    public Secretary() {
        super();
    }

    public Secretary(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public Secretary(String firsname, String lastname, Gender gender) {
        super(firsname, lastname, gender);
    }
}
