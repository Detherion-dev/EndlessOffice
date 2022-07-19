package fr.dawan.endlessoffice.services.actions;

import fr.dawan.endlessoffice.entities.InteractiveObject;
import fr.dawan.endlessoffice.entities.employees.Employee;
import fr.dawan.endlessoffice.entities.employees.player.Player;
import fr.dawan.endlessoffice.entities.items.pickable.Bag;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActionTest {

    private Action move;
    private Action nextAction1;
    private Action nextAction2;

    @BeforeEach
    void setUp() {
        move = new Move("moveToOfficeB");
        nextAction1 = new TakeItem("take bag");
        nextAction2 = new DropItem("drop bag");
        move.addAction(nextAction1);
        move.addAction(nextAction2);
    }

    @Test
    void execute() {
        List<Action> nextAction = new ArrayList<>();
        nextAction.add(nextAction1);
        nextAction.add(nextAction2);
        assertEquals(nextAction, move.execute());
    }

    @Test
    void addAction() {
        move.addAction(new Move("moveToOfficeD"));
        assertEquals(3, move.getNextActions().size());
    }

    @Test
    void deleteAction() {
        move.deleteAction(nextAction2);
        assertEquals(1, move.getNextActions().size());
    }

    @Test
    void hasAction() {
        assertTrue(move.hasAction(nextAction2));
        assertFalse(move.hasAction(new Move("moveToOfficeD")));
    }

    @Test
    void getName() {
        move.setName("MoveToOfficeE");
        assertEquals("MoveToOfficeE", move.getName());
    }

    @Test
    void getDescription() {
        move.setDescription("MoveToOfficeE");
        assertEquals("MoveToOfficeE", move.getDescription());
    }

    @Test
    void getTriggerTime() {
        move.setTriggerTime(1);
        assertEquals(1, move.getTriggerTime());
    }

    @Test
    void getDuration() {
        move.setDuration(1);
        assertEquals(1, move.getDuration());
    }

    @Test
    void getNextActions() {
        List<Action> nextAction = new ArrayList<>();
        nextAction.add(nextAction1);
        nextAction.add(nextAction2);
        assertEquals(nextAction, move.getNextActions());
    }

    @Test
    void getActor() {
        Employee employee = new Player("Thomas", "Noiret");
        move.setActor(employee);
        assertEquals(employee, move.getActor());
    }

    @Test
    void getSubject() {
        InteractiveObject item = new Bag("bag");
        move.setSubject(item);
        assertEquals(item, move.getSubject());
    }
}