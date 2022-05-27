package endlessoffice.entities.employees;

import endlessoffice.entities.employees.Employee;

import java.io.Serializable;

public abstract class ExecutiveEmployee extends Employee implements Serializable {

    private static final long serialVersionUID = 7062253586753002114L;

    public ExecutiveEmployee() {
        super();
    }

    public ExecutiveEmployee(String firstname, String lastname) {
        super(firstname, lastname);
    }
}
