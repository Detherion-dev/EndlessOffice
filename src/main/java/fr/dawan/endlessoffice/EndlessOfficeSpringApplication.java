package fr.dawan.endlessoffice;

import fr.dawan.endlessoffice.repository.XMLNodeRepository;
import fr.dawan.endlessoffice.utils.Util;
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
import fr.dawan.endlessoffice.entities.xml.structure.XMLNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EndlessOfficeSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EndlessOfficeSpringApplication.class, args);
		Util.setContext(ctx);

		EmployeeRepository employeeRepository = ctx.getBean(EmployeeRepository.class);
		UserRepository userRepository = ctx.getBean(UserRepository.class);
		XMLNodeRepository xmlNodeRepository = ctx.getBean(XMLNodeRepository.class);

		Player player = new Player("Thomas", "Noiret", Gender.MALE);
		Pickable phone = new Phone("phone");
		Pickable bag = new Bag("bag");
		player.addItem(bag);
		player.addItem(phone);

		XMLNode node = Util.getText("intro");

		User user = new User("detherion", "toto@gmail.com", "azerty123");
		User user2 = new User("nyx", "greg@gmail.com", "azerty123");

		employeeRepository.save(player);
		employeeRepository.save(new Boss("Gregory", "Marshall", Gender.MALE));
		employeeRepository.save(new Manager("Aurélien", "Bouillé", Gender.MALE));
		userRepository.save(user);
		userRepository.save(user2);
		xmlNodeRepository.save(node);

		XMLNode xmlNode2 = xmlNodeRepository.findById(1L);
		System.out.println(xmlNode2);
	}
}
