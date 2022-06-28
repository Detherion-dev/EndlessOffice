package fr.dawan.endlessoffice.dto;

import java.io.Serializable;
import java.util.Objects;

public class UserDto implements Serializable {
    private long id;
    private String username;
    private String eMail;
    private String password;
    private String save;

    public UserDto(long id, String username, String eMail, String password, String save) {
        this.id = id;
        this.username = username;
        this.eMail = eMail;
        this.password = password;
        this.save = save;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEMail() {
        return eMail;
    }

    public String getPassword() {
        return password;
    }

    public String getSave() {
        return save;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public void setSave(String save) {
        this.save = save;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto entity = (UserDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.username, entity.username) &&
                Objects.equals(this.eMail, entity.eMail) &&
                Objects.equals(this.password, entity.password) &&
                Objects.equals(this.save, entity.save);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, eMail, password, save);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "username = " + username + ", " +
                "eMail = " + eMail + ", " +
                "password = " + password + ", " +
                "save = " + save + ")";
    }
}
