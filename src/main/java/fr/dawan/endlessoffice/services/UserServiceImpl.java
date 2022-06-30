package fr.dawan.endlessoffice.services;

import fr.dawan.endlessoffice.entities.users.User;
import fr.dawan.endlessoffice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> getAllUsers(Pageable page) {
        System.out.println(repository);
        return repository.findAll(page).getContent();
    }

    @Override
    public Optional<User> getById(long id) {
        return repository.findById(id);
    }

    @Override
    public User getByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public User getByEmail(String email) {
        return repository.findByEmail(email);
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
    public User saveOrUpdate(User user) {
        return repository.saveAndFlush(user);
    }

}
