package fr.dawan.endlessoffice.services;

import fr.dawan.endlessoffice.dto.UserDto;
import fr.dawan.endlessoffice.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private ModelMapper mapper;

    public List<UserDto> getAllUsers() {
        return null;
    }

    public UserDto getById(long id) {
        return null;
    }

    public UserDto getByUsername(String username) {
        return null;
    }

    public void deleteById(long id) {

    }

    public void deleteByUsername(String username) {

    }

    public void saveOrUpdate(UserDto user) {

    }

}
