package endlessoffice.entities.employees.npc;

import endlessoffice.entities.employees.ExecutiveEmployee;

import java.io.Serializable;

public class Manager extends ExecutiveEmployee implements Serializable {

    private static final long serialVersionUID = -2949075286937518843L;

    public Manager() {
        super();
    }

    public Manager(String firstname, String lastname) {
        super(firstname, lastname);
    }
}
