package endlessoffice.entities.employees.npc;

import endlessoffice.entities.employees.npc.ExecutiveEmployee;

public class Manager extends ExecutiveEmployee {

    private static final long serialVersionUID = -2949075286937518843L;

    public Manager() {
        super();
    }

    public Manager(String firstname, String lastname) {
        super(firstname, lastname);
    }
}
