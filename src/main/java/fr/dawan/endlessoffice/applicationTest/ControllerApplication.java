package fr.dawan.endlessoffice.applicationTest;

import fr.dawan.endlessoffice.entities.users.User;
import fr.dawan.endlessoffice.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "fr.dawan.endlessoffice")
public class ControllerApplication
{
    public static void main(String[] args)
    {
        ApplicationContext ctx = SpringApplication.run(ControllerApplication.class, args);

        UserRepository userRepository = ctx.getBean(UserRepository.class);

        User user = new User("Jean", "jean.charles@goume.com", "unmotdepass");

        userRepository.save(user);
    }
}
