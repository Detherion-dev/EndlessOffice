package fr.dawan.endlessoffice.dto.employees.player;

import fr.dawan.endlessoffice.dto.employees.EmployeeDto;
import fr.dawan.endlessoffice.entities.employees.Gender;
import fr.dawan.endlessoffice.entities.employees.Status;

import java.util.Objects;

public class PlayerDto extends EmployeeDto {
    private int eatGauge;
    private int drinkGauge;
    private int reputation;

    public PlayerDto(String trigram, String firstname, String lastname, Gender gender,
                     Status status, int eatGauge, int drinkGauge, int reputation) {
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
    public int hashCode() {
        return Objects.hash(getTrigram(), getFirstname(), getLastname(), getStatus(),
                            getGender(), getStatus(), eatGauge, drinkGauge, reputation);
    }

}
