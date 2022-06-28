package fr.dawan.endlessoffice.entities.users;

import fr.dawan.endlessoffice.entities.EndlessOfficeEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class User extends EndlessOfficeEntity implements Serializable {
    private static final long serialVersionUID = -85445415111235L;

    @Column(name="username", length=32, unique = true)
    private String username;
    @Column(name="email", length=64, unique = true)
    private String eMail;
    @Column(name="password", length=32)
    private String password;
    @Column(name="save", length=256)
    private String save;

    public User() {
        super();
    }

    public User(String username) {
        this();
        this.username = username;
    }

    public User(String username, String eMail, String password) {
        this(username);
        this.eMail = eMail;
        this.password = password;
    }

    @Override
    public String toString() {
        return "<User " + username + ">";
    }

    //region Getters-Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSave() {
        return save;
    }

    public void setSave(String save) {
        this.save = save;
    }
    //endregion

}
