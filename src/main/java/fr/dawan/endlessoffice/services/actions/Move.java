package fr.dawan.endlessoffice.services.actions;

import fr.dawan.endlessoffice.entities.employees.Employee;
import fr.dawan.endlessoffice.utils.enums.Position;

import java.util.List;

public class Move extends Action{

    //region Constructors
    public Move() {
        super();
    }

    public Move(String name) {
        super(name);
    }

    public Move(String name, String description) {
        super(name, description);
    }

    public Move(String name, String description, long triggerTime) {
        super(name, description, triggerTime);
    }

    public Move(String name, String description, long triggerTime, long duration) {
        super(name, description, triggerTime, duration);
    }
    //endregion

    //region Exec method
    public List<Action> execute(Position newPosition) {

        Employee employee = getActor();
        employee.setPosition(newPosition);

        return getNextActions();
    }
    //endregion
}
