package fr.dawan.endlessoffice.services.actions;

import fr.dawan.endlessoffice.entities.employees.Employee;
import fr.dawan.endlessoffice.entities.employees.player.Player;
import fr.dawan.endlessoffice.utils.enums.Position;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveTest {

    private Employee employee;
    private Move goTo;

    @BeforeEach
    void setUp() {
        employee = new Player("Thomas", "Noiret");
        employee.setPosition(Position.OFFICE_A);
        goTo = new Move("moveToOfficeB");
        goTo.setActor(employee);
    }

    @Test
    void execute() {
        goTo.execute(Position.OFFICE_B);
        assertEquals(Position.OFFICE_B, employee.getPosition());
    }
}