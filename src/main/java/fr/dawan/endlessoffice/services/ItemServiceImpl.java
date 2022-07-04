package fr.dawan.endlessoffice.services;

import fr.dawan.endlessoffice.entities.items.Item;

import java.util.List;
import java.util.Optional;

public class ItemServiceImpl implements ItemService {
    @Override
    public List<Item> getAllItems() {
        return null;
    }

    @Override
    public Optional<Item> getById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Item> getByName(String name) {
        return null;
    }

    @Override
    public List<Item> getByDescription(String description) {
        return null;
    }

    @Override
    public List<Item> getByNameAndDescription(String name, String description) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public void deleteByNameAndDescription(String name, String description) {

    }

    @Override
    public Item saveOrUpdate(Item item) {
        return null;
    }
}
