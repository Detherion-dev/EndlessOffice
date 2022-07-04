package fr.dawan.endlessoffice.entities.employees;

import java.io.Serializable;

public interface IEmployee extends Serializable {

    /**
     * Set the Employee name
     * @param firstname: employee's firstname
     * @param lastname: employee's lastname
     */
    void setName(String firstname, String lastname);

}
