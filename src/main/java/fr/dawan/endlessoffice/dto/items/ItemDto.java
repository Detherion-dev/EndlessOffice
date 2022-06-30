package fr.dawan.endlessoffice.dto.items;

import java.util.Objects;

public class ItemDto {
    private String name;
    private String description;

    public ItemDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "name = " + name + ", " +
                "description = " + description + ")";
    }
}
