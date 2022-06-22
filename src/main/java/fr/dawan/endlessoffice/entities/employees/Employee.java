package fr.dawan.endlessoffice.entities.employees;

//region Module import
import fr.dawan.endlessoffice.entities.InteractiveObject;
import fr.dawan.endlessoffice.entities.items.pickable.Pickable;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
//endregion

/**
 * Employee represents the different characters in EndlessOffice
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="discriminator_employee", discriminatorType = DiscriminatorType.STRING, length=32)
public abstract class Employee extends InteractiveObject implements IEmployee, Serializable {
    private static final long serialVersionUID = -3253000308142350912L;

    //region Attributes
    @Column(name="trigram", length=3)
    private String trigram;                 // Employee trigram
    @Column(name="firstname", length=64)
    private String firstname;               // Employee firstname
    @Column(name="lastname", length=128)
    private String lastname;                // Employee lastname
    @Column(name="gender", length=1)
    private String gender;                  // Employee gender
    @OneToMany(mappedBy = "user")
    @Cascade(value = {org.hibernate.annotations.CascadeType.DETACH,org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Pickable> inventory = new ArrayList<>();   // Employee inventory
    @Column(name="status", length=16)
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

    public Employee(String firstname, String lastname, String gender) {
        this(firstname, lastname);
        this.gender = gender;
    }
    //endregion

    //region Public methods
    @Override
    public void setName(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.trigram = firstname.toUpperCase().charAt(0) + lastname.toUpperCase().substring(0,2);
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

    public List<Pickable> getInventory() {
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

    public void setStatus(String status) {
        this.status = status;
    }
    //endregion

}
