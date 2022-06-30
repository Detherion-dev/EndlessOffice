package fr.dawan.endlessoffice;

import fr.dawan.endlessoffice.utils.enums.Gender;
import fr.dawan.endlessoffice.entities.users.User;
import fr.dawan.endlessoffice.repository.EmployeeRepository;
import fr.dawan.endlessoffice.repository.ItemRepository;
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

@SpringBootApplication
public class EndlessOfficeSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EndlessOfficeSpringApplication.class, args);

		EmployeeRepository employeeRepository = ctx.getBean(EmployeeRepository.class);
		ItemRepository itemRepository = ctx.getBean(ItemRepository.class);
		UserRepository userRepository = ctx.getBean(UserRepository.class);

		Player player = new Player("Thomas", "Noiret", Gender.MALE);
		Pickable phone = new Phone("phone");
		Pickable bag = new Bag("bag");
		player.takeItem(bag);
		player.takeItem(phone);

		User user = new User("detherion", "toto@gmail.com", "azerty123");

		System.out.println(player.getInventory());

		employeeRepository.save(player);
		employeeRepository.save(new Boss("Gregory", "Marchall", Gender.MALE));
		employeeRepository.save(new Manager("Aurélien", "Bouillé", Gender.MALE));
//		itemRepository.save(phone);
//		itemRepository.save(bag);
		userRepository.save(user);
	}

}
