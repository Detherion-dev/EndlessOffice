package main.java.endlessoffice.entity;

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
    protected Map<String, Object> availableInteractions;

    //region Constructors
    public InteractiveObject() {
        super();
    }
    //endregion
}
