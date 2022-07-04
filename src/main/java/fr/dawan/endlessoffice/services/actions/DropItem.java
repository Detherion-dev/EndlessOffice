package fr.dawan.endlessoffice.services.actions;

import fr.dawan.endlessoffice.entities.employees.player.Player;
import fr.dawan.endlessoffice.entities.items.pickable.Pickable;

import java.util.List;

public class DropItem extends Action {

    //region Constructors
    public DropItem() {
        super();
    }

    public DropItem(String name) {
        super(name);
    }

    public DropItem(String name, String description) {
        super(name, description);
    }

    public DropItem(String name, String description, long triggerTime) {
        super(name, description, triggerTime);
    }

    public DropItem(String name, String description, long triggerTime, long duration) {
        super(name, description, triggerTime, duration);
    }
    //endregion

    //region Exec method
    public List<Action> execute(Pickable item) {

        Player player = (Player) getActor();
        player.removeItem(item);

        return getNextActions();
    }
    //endregion
}
