package fr.dawan.endlessoffice.services;

import fr.dawan.endlessoffice.entities.items.Item;
import fr.dawan.endlessoffice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository repository;

    @Override
    public List<Item> getAllItems() {
        return repository.findAll();
    }

    @Override
    public Optional<Item> getById(long id) {
        return repository.findById(id);
    }

    @Override
    public List<Item> getByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Item> getByDescription(String description) {
        return repository.findByDescription(description);
    }

    @Override
    public List<Item> getByNameAndDescription(String name, String description) {
        return repository.findByNameAndDescription(name, description);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteByNameAndDescription(String name, String description) {
        repository.deleteByNameAndDescription(name, description);
    }

    @Override
    public Item saveOrUpdate(Item item) {
        return repository.saveAndFlush(item);
    }
}
