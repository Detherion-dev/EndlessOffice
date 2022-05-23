package endlessoffice.entities.employees.npc;

import endlessoffice.entities.employees.ExecutiveEmployee;

import java.io.Serializable;

public class Boss extends ExecutiveEmployee implements Serializable {

    private static final long serialVersionUID = -2366814153781478640L;

    public Boss() {
        super();
    }

    public Boss(String firstname, String lastname) {
        super(firstname, lastname);
    }
}
