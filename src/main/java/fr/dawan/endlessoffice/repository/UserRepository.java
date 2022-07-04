package fr.dawan.endlessoffice.repository;

import fr.dawan.endlessoffice.entities.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    User findByEmail(String eMail);
    void deleteByUsername(String username);
    void deleteByEmail(String email);

}
