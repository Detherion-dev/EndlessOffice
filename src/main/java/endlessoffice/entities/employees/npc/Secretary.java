package endlessoffice.entities.employees.npc;

import endlessoffice.entities.employees.Employee;

import java.io.Serializable;

public class Secretary extends Employee implements Serializable {
    private static final long serialVersionUID = 2334295602355693922L;

    public Secretary() {
        super();
    }

    public Secretary(String firstname, String lastname) {
        super(firstname, lastname);
    }
}
