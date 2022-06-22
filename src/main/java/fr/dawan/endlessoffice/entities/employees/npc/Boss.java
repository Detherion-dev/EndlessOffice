package fr.dawan.endlessoffice.entities.employees.npc;

import fr.dawan.endlessoffice.entities.employees.Employee;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue("BOSS")
public class Boss extends Employee implements Serializable {

    private static final long serialVersionUID = -2366814153781478640L;

    public Boss() {
        super();
    }

    public Boss(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public Boss(String firstname, String lastname, String gender) {
        super(firstname, lastname, gender);
    }
}
