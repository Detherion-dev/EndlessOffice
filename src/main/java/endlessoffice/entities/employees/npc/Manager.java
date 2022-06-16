package endlessoffice.entities.employees.npc;

import endlessoffice.entities.employees.Employee;

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
}