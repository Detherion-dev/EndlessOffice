package fr.dawan.endlessoffice.entities;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class InteractiveObject extends EndlessOfficeEntity implements Serializable {
    private static final long serialVersionUID = -5451514644182346076L;

    public InteractiveObject() {
        super();
    }
}
