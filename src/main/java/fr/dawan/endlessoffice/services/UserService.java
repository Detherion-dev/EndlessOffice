package fr.dawan.endlessoffice.services;

import fr.dawan.endlessoffice.entities.users.User;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface UserService {

    /**
     * Returns all users from the database
     */
    List<User> getAllUsers(Pageable page);

    /**
     * Returns the user corresponding to the id
     *
     * @param id: id of the user
     */
    Optional<User> getById(long id);

    /**
     * Returns the user corresponding to username
     * @param username: username of the user
     */
    User getByUsername(String username);

    /**
     * Returns the user corresponding to the email
     * @param eMail: email of the user
     */
    User getByEmail(String eMail);

    /**
     * Delete the user corresponding to id
     * @param id: id of the user to delete
     */
    void deleteById(long id);

    /**
     * Delete the user corresponding to username
     * @param username: username of the user to delete
     */
    void deleteByUsername(String username);

    /**
     * Delete the user corresponding to the email
     * @param eMail: email of the user
     */
    void deleteByEmail(String eMail);

    /**
     * Save or update the user in the database
     * @param user: user to create/update in the database
     */
    User saveOrUpdate(User user);


}
