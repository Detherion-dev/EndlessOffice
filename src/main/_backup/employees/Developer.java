package endlessoffice.entities._backup.employees;

import endlessoffice.entities._backup.Employee;

public class Developer extends Employee {

    //region Constructors
    public Developer(){
        super();
    }

    public Developer(int id) {
        super(id);
    }

    public Developer(int id, String firstname, String lastname) {
        super(id, firstname, lastname);
    }
    //endregion
}
