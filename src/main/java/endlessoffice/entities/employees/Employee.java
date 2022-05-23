package endlessoffice.entities.employees;

//region Module import
import endlessoffice.entities.InteractiveObject;
import endlessoffice.entities.items.ItemStorage;
//endregion

/**
 * Employee represents the different characters in EndlessOffice
 */
public abstract class Employee extends InteractiveObject implements IEmployee
{
    private static final long serialVersionUID = -3253000308142350912L;
    //region Attributes
    private String trigram;                 // Employee trigram
    private String firstname;               // Employee firstname
    private String lastname;                // Employee lastname
    private String gender;                  // Employee gender
    private String position;                // Employee position
    private ItemStorage inventory;          // Employee inventory
    private String status;
    //endregion

    //region Constructors
    public Employee() {
        super();
    }

    public Employee(String firstname, String lastname) {
        this();
        setName(firstname, lastname);
    }
    //endregion

    //region Public methods
    @Override
    public void setName(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.trigram = firstname.charAt(0) + lastname.substring(0,2);
    }

    @Override
    public String toString() {
        return "Employee " + firstname + " " + lastname;
    }
    //endregion

    //region Getters
    public String getTrigram() {
        return trigram;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public String getPosition() {
        return position;
    }

    public ItemStorage getInventory() {
        return inventory;
    }

    public String getStatus() {
        return status;
    }
    //endregion

    //region Setters
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    //endregion
}
