package endlessoffice.entities.employees.npc;

import endlessoffice.entities.employees.Employee;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue("DEVELOPER")
public class Developer extends Employee implements Serializable {

    private static final long serialVersionUID = -8498703466884798465L;

    public Developer() {
        super();
    }

    public Developer(String firstname, String lastname) {
        super(firstname, lastname);
    }
}