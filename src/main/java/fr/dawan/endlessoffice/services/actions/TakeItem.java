package fr.dawan.endlessoffice.services.actions;

import fr.dawan.endlessoffice.entities.employees.player.Player;
import fr.dawan.endlessoffice.entities.items.pickable.Pickable;

import java.util.List;

public class TakeItem extends Action {

    //region Constructors
    public TakeItem() {
        super();
    }

    public TakeItem(String name) {
        super(name);
    }

    public TakeItem(String name, String description) {
        super(name, description);
    }

    public TakeItem(String name, String description, long timeTrigger) {
        super(name, description, timeTrigger);
    }

    public TakeItem(String name, String description, long timeTrigger, long duration) {
        super(name, description, timeTrigger);
    }
    //endregion

    //region Exec method
    public List<Action> execute(Pickable item) {
        Player player = (Player) getActor();
        player.addItem(item);
        return getNextActions();
    }
    //endregion
}
