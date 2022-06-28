package fr.dawan.endlessoffice.services;

import fr.dawan.endlessoffice.dto.UserDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {

    /**
     * Returns all users from the database
     */
    List<UserDto> getAllUsers(Pageable page);

    /**
     * Returns the user corresponding to the id
     * @param id: id of the user
     */
    UserDto getById(long id);

    /**
     * Returns the user corresponding to username
     * @param username: username of the user
     */
    UserDto getByUsername(String username);

    /**
     * Returns the user corresponding to the email
     * @param eMail: email of the user
     */
    UserDto getByEmail(String eMail);

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
     * @param user: user to create/update in the databse
     */
    UserDto saveOrUpdate(UserDto user);


}
