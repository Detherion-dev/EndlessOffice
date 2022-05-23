package endlessoffice.entities._backup;

// Module Import
import java.util.Map;

/**
 * InteractiveObject represents an object in Endless Office that can interacts with another object
 * TODO: better definition
 */
public abstract class InteractiveObject extends Entity {
    private Map<String, Object> availableInteractions;

    //region Constructors
    public InteractiveObject() {
        super();
    }

    public InteractiveObject(int id) {
        super(id);
    }
    //endregion

    //region Getter
    public Map<String, Object> getAvailableInteractions() {
        return availableInteractions;
    }
    //endregion

    //region Setter
    public void setAvailableInteractions(Map<String, Object> availableInteractions) {
        this.availableInteractions = availableInteractions;
    }
    //endregion
}
