package endlessoffice.entities.employees.npc;

import endlessoffice.entities.employees.Employee;

import java.io.Serializable;

public class Developer extends Employee implements Serializable {

    private static final long serialVersionUID = -8498703466884798465L;

    public Developer() {
        super();
    }

    public Developer(String firstname, String lastname) {
        super(firstname, lastname);
    }
}
