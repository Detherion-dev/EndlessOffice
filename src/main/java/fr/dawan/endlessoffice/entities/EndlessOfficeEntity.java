package fr.dawan.endlessoffice.entities;

//region Module Import
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
//endregion

/**
 * Entity represents objects with a unique ID that are serializable
 */
@MappedSuperclass
public abstract class EndlessOfficeEntity implements Serializable {
    private static final long serialVersionUID = -5631805452910499066L;

    //region Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // Entity unique id
    //endregion

    //region Constructors
    public EndlessOfficeEntity() {

    }
    //endregion

    //region Getters
    public long getId() {
        return id;
    }
    //endregion

    //region Setters
    public void setId(long id) {
        this.id = id;
    }
    //endregion
}
