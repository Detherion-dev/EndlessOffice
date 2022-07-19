package fr.dawan.endlessoffice.entities.save;

import fr.dawan.endlessoffice.entities.EndlessOfficeEntity;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Save extends EndlessOfficeEntity implements Serializable {
    private static final long serialVersionUID = -864543219514L;

    private String user;
}
