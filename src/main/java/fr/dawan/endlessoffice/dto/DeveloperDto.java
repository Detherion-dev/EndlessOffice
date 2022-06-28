package fr.dawan.endlessoffice.dto;

import fr.dawan.endlessoffice.entities.employees.Gender;

import java.io.Serializable;
import java.util.Objects;

public class DeveloperDto implements Serializable {
    private String trigram;
    private String firstname;
    private String lastname;
    private Gender gender;
    private String status;

    public DeveloperDto(String trigram, String firstname, String lastname, Gender gender, String status) {
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

    public String getStatus() {
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

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeveloperDto entity = (DeveloperDto) o;
        return Objects.equals(this.trigram, entity.trigram) &&
                Objects.equals(this.firstname, entity.firstname) &&
                Objects.equals(this.lastname, entity.lastname) &&
                Objects.equals(this.gender, entity.gender) &&
                Objects.equals(this.status, entity.status);
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
