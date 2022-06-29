package fr.dawan.endlessoffice.dto.users;

import java.util.Objects;

public class UserDto {

    private String username;
    private String email;
    private String password;

    public UserDto(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String eMail) {
        this.email = eMail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, password);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "username = " + username + ", " +
                "email = " + email + ", " +
                "password = " + password + ")";
    }
}
