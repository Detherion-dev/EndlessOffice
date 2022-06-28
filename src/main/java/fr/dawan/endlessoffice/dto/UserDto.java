package fr.dawan.endlessoffice.dto;

import java.io.Serializable;
import java.util.Objects;

public class UserDto implements Serializable {

    private String username;
    private String eMail;
    private String password;

    public UserDto(String username, String eMail, String password) {
        this.username = username;
        this.eMail = eMail;
        this.password = password;
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


    public void setUsername(String username) {
        this.username = username;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, eMail, password);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "username = " + username + ", " +
                "eMail = " + eMail + ", " +
                "password = " + password + ")";
    }
}
