package fr.dawan.endlessoffice.dto.employees.player;

import fr.dawan.endlessoffice.dto.employees.EmployeeDto;
import fr.dawan.endlessoffice.entities.employees.Gender;

import java.util.Objects;

public class PlayerDto extends EmployeeDto {
    private int eatGauge;
    private int drinkGauge;
    private int reputation;

    public PlayerDto(String trigram, String firstname, String lastname, Gender gender,
                     String status, int eatGauge, int drinkGauge, int reputation) {
        super(trigram, firstname, lastname, gender, status);
        this.eatGauge = eatGauge;
        this.drinkGauge = drinkGauge;
        this.reputation = reputation;
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
        return Objects.equals(this.getTrigram(), entity.getTrigram()) &&
                Objects.equals(this.getFirstname(), entity.getFirstname()) &&
                Objects.equals(this.getLastname(), entity.getLastname()) &&
                Objects.equals(this.getGender(), entity.getGender()) &&
                Objects.equals(this.getStatus(), entity.getStatus()) &&
                Objects.equals(this.eatGauge, entity.eatGauge) &&
                Objects.equals(this.drinkGauge, entity.drinkGauge) &&
                Objects.equals(this.reputation, entity.reputation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTrigram(), getFirstname(), getLastname(), getStatus(),
                            getGender(), getStatus(), eatGauge, drinkGauge, reputation);
    }

}
