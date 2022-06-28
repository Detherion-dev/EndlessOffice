package fr.dawan.endlessoffice.repository;

import fr.dawan.endlessoffice.entities.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    User findByEMail(String eMail);
    User deleteByUsername(String username);
    User deleteByEMail(String eMail);

}
