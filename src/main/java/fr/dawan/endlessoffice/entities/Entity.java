package fr.dawan.endlessoffice.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Entity represents objects with a unique ID that are serializable
 */
@MappedSuperclass
public abstract class Entity implements Serializable {
    private static final long serialVersionUID = -5631805452910499066L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // Entity unique id

    public Entity() {

    }

    //region Getters-Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    //endregion
}
