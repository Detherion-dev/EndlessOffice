package fr.dawan.endlessoffice.services;

import fr.dawan.endlessoffice.dto.users.UserDto;
import fr.dawan.endlessoffice.entities.users.User;
import fr.dawan.endlessoffice.repository.UserRepository;
import fr.dawan.endlessoffice.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private ModelMapper mapper;

    @Override
    public List<UserDto> getAllUsers(Pageable page) {
        return repository.findAll(page).getContent().stream().map(m -> mapper.map(m, UserDto.class)).collect(Collectors.toList());
    }

    @Override
    public UserDto getById(long id) {
        return mapper.map(repository.findById(id), UserDto.class);
    }

    @Override
    public UserDto getByUsername(String username) {
        return mapper.map(repository.findByUsername(username), UserDto.class);
    }

    @Override
    public UserDto getByEmail(String email) {
        return mapper.map(repository.findByEmail(email), UserDto.class);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteByUsername(String username) {
        repository.deleteByUsername(username);
    }

    @Override
    public void deleteByEmail(String email) {
        repository.deleteByEmail(email);
    }

    @Override
    public UserDto saveOrUpdate(UserDto userDto) {
        return mapper.map(repository.saveAndFlush(mapper.map(userDto, User.class)), UserDto.class);
    }

}