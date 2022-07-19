package fr.dawan.endlessoffice.services.actions;

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

    public Move(String name, String description, long timeTrigger) {
        super(name, description, timeTrigger);
    }

    public Move(String name, String description, long timeTrigger, long duration) {
        super(name, description, timeTrigger);
    }
    //endregion

    //region Exec method
    public List<Action> execute(Position position) {
        getActor().setPosition(position);
        return getNextActions();
    }
}
