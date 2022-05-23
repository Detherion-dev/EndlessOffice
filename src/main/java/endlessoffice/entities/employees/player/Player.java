package endlessoffice.entities.employees.player;

//region Module import
import endlessoffice.entities.actions.Action;
import endlessoffice.entities.employees.Developer;
import endlessoffice.entities.memories.Memory;

import java.util.HashMap;
import java.util.Map;
//endregion

public class Player extends Developer
{
    private static final long serialVersionUID = 871833314841131835L;
    //region Attributes
    private final Map<Long, Memory> memories = new HashMap<>();
    private int eatGauge;
    private int drinkGauge;
    private int reputation;
    private Action currentAction;
    //endregion

    //region Constructors
    public Player() {
        super();
    }

    public Player(String firstname, String lastname) {
        super(firstname, lastname);
    }
    //endregion

    //region Public methods
    //endregion

    //region Getters
    public Map<Long, Memory> getMemories() {
        return memories;
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

    public Action getCurrentAction() {
        return currentAction;
    }
//endregion

    //region Setters
    public void setEatGauge(int eatGauge) {
        this.eatGauge = eatGauge;
    }

    public void setDrinkGauge(int drinkGauge) {
        this.drinkGauge = drinkGauge;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public void setCurrentAction(Action currentAction) {
        this.currentAction = currentAction;
    }
}
