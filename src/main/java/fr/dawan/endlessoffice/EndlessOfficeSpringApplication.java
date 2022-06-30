package fr.dawan.endlessoffice;

import fr.dawan.endlessoffice.services.UserService;
import fr.dawan.endlessoffice.services.UserServiceImpl;
import fr.dawan.endlessoffice.utils.enums.Gender;
import fr.dawan.endlessoffice.entities.users.User;
import fr.dawan.endlessoffice.repository.EmployeeRepository;
import fr.dawan.endlessoffice.entities.employees.npc.Boss;
import fr.dawan.endlessoffice.entities.employees.npc.Manager;
import fr.dawan.endlessoffice.entities.employees.player.Player;
import fr.dawan.endlessoffice.entities.items.pickable.Bag;
import fr.dawan.endlessoffice.entities.items.pickable.Phone;
import fr.dawan.endlessoffice.entities.items.pickable.Pickable;
import fr.dawan.endlessoffice.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Pageable;

@SpringBootApplication
public class EndlessOfficeSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EndlessOfficeSpringApplication.class, args);

		EmployeeRepository employeeRepository = ctx.getBean(EmployeeRepository.class);
		UserRepository userRepository = ctx.getBean(UserRepository.class);

		Player player = new Player("Thomas", "Noiret", Gender.MALE);
		Pickable phone = new Phone("phone");
		Pickable bag = new Bag("bag");
		player.takeItem(bag);
		player.takeItem(phone);

		User user = new User("detherion", "toto@gmail.com", "azerty123");
		User user2 = new User("nyx", "gregou@gmail.com", "azerty123");

		System.out.println(player.getInventory());

		employeeRepository.save(player);
		employeeRepository.save(new Boss("Gregory", "Marchall", Gender.MALE));
		employeeRepository.save(new Manager("Aurélien", "Bouillé", Gender.MALE));
		userRepository.save(user);
		userRepository.save(user2);


		UserService userService = new UserServiceImpl();
		System.out.println(userRepository.findAll(Pageable.unpaged()).getContent());
		System.out.println(employeeRepository.findAll());
		System.out.println(userService.getAllUsers(Pageable.unpaged()));

	}

}
