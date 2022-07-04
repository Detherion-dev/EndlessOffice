package fr.dawan.endlessoffice.services;

import fr.dawan.endlessoffice.entities.items.Item;
import fr.dawan.endlessoffice.entities.items.pickable.Bag;
import fr.dawan.endlessoffice.entities.items.pickable.Phone;
import fr.dawan.endlessoffice.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ItemServiceImplTest {

    @Mock
    private ItemRepository repository;

    @InjectMocks
    private ItemServiceImpl service;

    @Test
    void getAllItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Bag("bag", "bag of TNO"));
        items.add(new Phone("phone", "phone of TNO"));

        when(repository.findAll()).thenReturn(items);

        List<Item> result = service.getAllItems();

        assertEquals(2, result.size());
        assertEquals("bag", result.get(0).getName());
    }

    @Test
    void getById() {
        Item item = new Bag("bag", "bag of TNO");

        when(repository.findById(1L)).thenReturn(Optional.of(item));

        Optional<Item> result = service.getById(1L);

        assertEquals("bag", result.get().getName());
        assertEquals("bag of TNO", result.get().getDescription());
    }

    @Test
    void getByName() {
        List<Item> items = new ArrayList<>();
        items.add(new Bag("bag", "bag of TNO"));

        when(repository.findByName("bag")).thenReturn(items);

        List<Item> result = service.getByName("bag");

        assertEquals("bag", result.get(0).getName());
        assertEquals("bag of TNO", result.get(0).getDescription());
    }

    @Test
    void getByDescription() {
        List<Item> items = new ArrayList<>();
        items.add(new Bag("bag", "bag of TNO"));

        when(repository.findByDescription("bag")).thenReturn(items);

        List<Item> result = service.getByDescription("bag");

        assertEquals("bag", result.get(0).getName());
        assertEquals("bag of TNO", result.get(0).getDescription());
    }

    @Test
    void getByNameAndDescription() {
        List<Item> items = new ArrayList<>();
        items.add(new Bag("bag", "bag of TNO"));

        when(repository.findByNameAndDescription("bag", "description")).thenReturn(items);

        List<Item> result = service.getByNameAndDescription("bag", "description");

        assertEquals("bag", result.get(0).getName());
        assertEquals("bag of TNO", result.get(0).getDescription());
    }

    @Test
    void deleteById() {
        service.deleteById(1L);
        verify(repository, times(1)).deleteById(1L);
    }

    @Test
    void deleteByNameAndDescription() {
        service.deleteByNameAndDescription("bag", "description");
        verify(repository, times(1)).deleteByNameAndDescription("bag", "description");
    }

    @Test
    void saveOrUpdate() {
        Item item = new Bag("bag", "bag of TNO");

        when(repository.saveAndFlush(item)).thenReturn(item);

        Item result = service.saveOrUpdate(item);

        assertEquals("bag", result.getName());
        assertEquals("bag of TNO", result.getDescription());
    }
}