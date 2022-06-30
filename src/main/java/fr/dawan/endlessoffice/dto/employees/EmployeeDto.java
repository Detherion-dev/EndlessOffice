package fr.dawan.endlessoffice.dto.employees;

import fr.dawan.endlessoffice.entities.employees.Gender;
import fr.dawan.endlessoffice.entities.employees.Status;

import java.util.Objects;

public class EmployeeDto {
    private String trigram;
    private String firstname;
    private String lastname;
    private Gender gender;
    private Status status;

    public EmployeeDto(String trigram, String firstname, String lastname, Gender gender, Status status) {
        this.trigram = trigram;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.status = status;
    }

    public String getTrigram() {
        return trigram;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Gender getGender() {
        return gender;
    }

    public Status getStatus() {
        return status;
    }

    public void setTrigram(String trigram) {
        this.trigram = trigram;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trigram, firstname, lastname, gender, status);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "trigram = " + trigram + ", " +
                "firstname = " + firstname + ", " +
                "lastname = " + lastname + ", " +
                "gender = " + gender + ", " +
                "status = " + status + ")";
    }
}
