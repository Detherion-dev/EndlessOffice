package endlessoffice.entity;

//=============================================================================================
// Module Import
//=============================================================================================
import java.util.Map;
//=============================================================================================

/**
 * InteractiveObject represents an object in Endless Office that can interacts with another object
 * TODO: better definition
 */
public abstract class InteractiveObject {
    private Map<String, Object> availableInteractions;

    //region Constructors
    public InteractiveObject() {
        super();
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
