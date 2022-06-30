package fr.dawan.endlessoffice.dto.items;

import java.util.Objects;

public class ItemDto {
    private String name;
    private String description;

    private Boolean isBroken;

    public ItemDto(String name, String description, boolean isBroken) {
        this.name = name;
        this.description = description;
        this.isBroken = isBroken;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getBroken() {
        return isBroken;
    }

    public void setBroken(Boolean broken) {
        isBroken = broken;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, isBroken);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "name = " + name + ", " +
                "description = " + description + ")";
    }
}
