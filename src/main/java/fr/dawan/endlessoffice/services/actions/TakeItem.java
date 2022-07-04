package fr.dawan.endlessoffice.services.actions;

import fr.dawan.endlessoffice.entities.employees.Employee;
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

    public TakeItem(String name, String description, long triggerTime) {
        super(name, description, triggerTime);
    }

    public TakeItem(String name, String description, long triggerTime, long duration) {
        super(name, description, triggerTime, duration);
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
