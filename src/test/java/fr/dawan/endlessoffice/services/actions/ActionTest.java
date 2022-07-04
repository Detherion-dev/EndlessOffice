package fr.dawan.endlessoffice.services.actions;

import fr.dawan.endlessoffice.entities.InteractiveObject;
import fr.dawan.endlessoffice.entities.employees.Employee;
import fr.dawan.endlessoffice.entities.employees.player.Player;
import fr.dawan.endlessoffice.entities.items.pickable.Bag;
import fr.dawan.endlessoffice.entities.items.pickable.Pickable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActionTest {

    private Action action;
    private Action nextAction1;
    private Action nextAction2;
    private List<Action> nextActions = new ArrayList<>();

    @BeforeEach
    void setUp() {
        action = new TakeItem("takeBag", "take my bag", 1L, 1L);
        nextAction1 = new Move("moveToOfficeA", "my move", 1L, 1L);
        nextAction2 = new Move("moveToOfficeB", "my move", 1L, 1L);
        action.addAction(nextAction1);
        action.addAction(nextAction2);
        nextActions.add(nextAction1);
        nextActions.add(nextAction2);
    }

    @Test
    void execute() {
        Pickable bag = new Bag("bag");
        List<Action> result = action.execute();
        assertEquals(result, nextActions);
    }

    @Test
    void addAction() {
        Action nextAction3 = new Move("moveToOfficeC", "my move", 1L, 1L);
        action.addAction(nextAction3);
        assertEquals(3, action.getNextActions().size());
    }

    @Test
    void deleteAction() {
        action.deleteAction(nextAction2);
        assertEquals(1, action.getNextActions().size());
    }

    @Test
    void hasAction() {
        Action nextAction3 = new Move("moveToOfficeC", "my move", 1L, 1L);
        assertTrue(action.hasAction(nextAction2));
        assertFalse(action.hasAction(nextAction3));
    }

    @Test
    void getName() {
        action.setName("moveToOfficeD");
        assertEquals("moveToOfficeD", action.getName());
    }

    @Test
    void getDescription() {
        action.setDescription("newMove");
        assertEquals("newMove", action.getDescription());
    }

    @Test
    void getTriggerTime() {
        action.setTriggerTime(2L);
        assertEquals(2L, action.getTriggerTime());
    }

    @Test
    void getDuration() {
        action.setDuration(2L);
        assertEquals(2L, action.getDuration());
    }

    @Test
    void getNextActions() {
        Action nextAction3 = new Move("moveToOfficeC", "my move", 1L, 1L);
        nextActions.add(nextAction3);
        action.addAction(nextAction3);
        assertEquals(nextActions, action.getNextActions());
    }

    @Test
    void getActor() {
        Employee employee = new Player("Thomas", "Noiret");
        action.setActor(employee);
        assertEquals(employee, action.getActor());
    }

    @Test
    void getSubject() {
        InteractiveObject item = new Bag("bag", "bag of TNO");
        action.setSubject(item);
        assertEquals(item, action.getSubject());
    }
}