package fr.dawan.endlessoffice;

import fr.dawan.endlessoffice.dao.EmployeeRepository;
import fr.dawan.endlessoffice.dao.ItemRepository;
import fr.dawan.endlessoffice.entities.employees.npc.Boss;
import fr.dawan.endlessoffice.entities.employees.npc.Manager;
import fr.dawan.endlessoffice.entities.employees.player.Player;
import fr.dawan.endlessoffice.entities.items.pickable.Bag;
import fr.dawan.endlessoffice.entities.items.pickable.Phone;
import fr.dawan.endlessoffice.entities.items.pickable.Pickable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EndlessOfficeSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EndlessOfficeSpringApplication.class, args);

		EmployeeRepository employeeRepository = ctx.getBean(EmployeeRepository.class);
		ItemRepository itemRepository = ctx.getBean(ItemRepository.class);

		Player player = new Player("Thomas", "Noiret", "M");
		Pickable phone = new Phone("TNO phone");
		Pickable bag = new Bag("TNO bag");
		phone.setId(1);
		bag.setId(2);
		player.takeItem(phone);
		player.takeItem(bag);

		employeeRepository.save(player);
		employeeRepository.save(new Boss("Gregory", "Marchall", "M"));
		employeeRepository.save(new Manager("Aurélien", "Bouillé", "M"));
		itemRepository.save(phone);
		itemRepository.save(bag);
	}

}
