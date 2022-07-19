package fr.dawan.endlessoffice.services.actions;

import fr.dawan.endlessoffice.entities.employees.Employee;
import fr.dawan.endlessoffice.entities.employees.player.Player;
import fr.dawan.endlessoffice.utils.enums.Position;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoveTest {

    private Move move;

    @BeforeEach
    void setUp() {
        move = new Move("moveToOfficeB", "moveToOfficeB", 1, 1);
        move.addAction(new DropItem("drop Bag"));
        move.setActor(new Player("Thomas", "Noiret"));
    }

    @Test
    void execute() {
        move.execute(Position.OFFICE_B);
        Employee player = move.getActor();
        assertEquals(Position.OFFICE_B, player.getPosition());
    }
}