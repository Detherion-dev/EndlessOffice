package fr.dawan.endlessoffice.services;

import fr.dawan.endlessoffice.dto.UserDto;

import java.util.List;

public interface UserService {

    /**
     * Returns all users from the database
     */
    List<UserDto> getAllUsers();

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
     * Save or update the user in the database
     * @param user: user to create/update in the databse
     */
    void saveOrUpdate(UserDto user);


}
