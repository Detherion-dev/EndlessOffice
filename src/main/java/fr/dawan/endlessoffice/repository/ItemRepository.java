package fr.dawan.endlessoffice.repository;

import fr.dawan.endlessoffice.entities.items.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByName(String name);
    List<Item> findByDescription(String description);
    List<Item> findByNameAndDescription(String name, String description);
    void deleteByNameAndDescription(String name, String description);

}
