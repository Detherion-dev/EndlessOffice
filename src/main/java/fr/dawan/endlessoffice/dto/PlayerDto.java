package fr.dawan.endlessoffice.dto;

import fr.dawan.endlessoffice.entities.employees.Gender;

import java.io.Serializable;
import java.util.Objects;

public class PlayerDto implements Serializable {
    private String trigram;
    private String firstname;
    private String lastname;
    private Gender gender;
    private String status;
    private int eatGauge;
    private int drinkGauge;
    private int reputation;

    public PlayerDto(String trigram, String firstname, String lastname, Gender gender, String status, int eatGauge, int drinkGauge, int reputation) {
        this.trigram = trigram;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.status = status;
        this.eatGauge = eatGauge;
        this.drinkGauge = drinkGauge;
        this.reputation = reputation;
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

    public int getEatGauge() {
        return eatGauge;
    }

    public int getDrinkGauge() {
        return drinkGauge;
    }

    public int getReputation() {
        return reputation;
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

    public void setEatGauge(int eatGauge) {
        this.eatGauge = eatGauge;
    }

    public void setDrinkGauge(int drinkGauge) {
        this.drinkGauge = drinkGauge;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerDto entity = (PlayerDto) o;
        return Objects.equals(this.trigram, entity.trigram) &&
                Objects.equals(this.firstname, entity.firstname) &&
                Objects.equals(this.lastname, entity.lastname) &&
                Objects.equals(this.gender, entity.gender) &&
                Objects.equals(this.status, entity.status) &&
                Objects.equals(this.eatGauge, entity.eatGauge) &&
                Objects.equals(this.drinkGauge, entity.drinkGauge) &&
                Objects.equals(this.reputation, entity.reputation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trigram, firstname, lastname, gender, status, eatGauge, drinkGauge, reputation);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "trigram = " + trigram + ", " +
                "firstname = " + firstname + ", " +
                "lastname = " + lastname + ", " +
                "gender = " + gender + ", " +
                "status = " + status + ", " +
                "eatGauge = " + eatGauge + ", " +
                "drinkGauge = " + drinkGauge + ", " +
                "reputation = " + reputation + ")";
    }
}
