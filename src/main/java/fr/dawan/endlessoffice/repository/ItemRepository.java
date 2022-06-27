package fr.dawan.endlessoffice.repository;

import fr.dawan.endlessoffice.entities.items.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
