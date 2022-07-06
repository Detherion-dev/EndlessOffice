package fr.dawan.endlessoffice.entities.users;

import fr.dawan.endlessoffice.entities.EndlessOfficeEntity;
import fr.dawan.endlessoffice.entities.save.Save;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class User extends EndlessOfficeEntity implements Serializable {
    private static final long serialVersionUID = -85445415111235L;

    @Column(name="username", length=32, unique = true)
    private String username;
    @Column(name="email", length=64, unique = true)
    private String email;
    @Column(name="password", length=32)
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
    private List<Save> saves;

    public User() {
        super();
    }

    public User(String username) {
        this();
        this.username = username;
    }

    public User(String username, String eMail, String password) {
        this(username);
        this.email = eMail;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Save> getSaves() {
        return saves;
    }

    public void setSaves(List<Save> saves) {
        this.saves = saves;
    }
    //endregion

}
