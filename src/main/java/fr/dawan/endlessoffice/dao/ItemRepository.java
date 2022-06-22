package fr.dawan.endlessoffice.dao;

import fr.dawan.endlessoffice.entities.items.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
