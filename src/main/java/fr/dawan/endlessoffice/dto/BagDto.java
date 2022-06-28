package fr.dawan.endlessoffice.dto;

import fr.dawan.endlessoffice.entities.items.ItemSize;

import java.io.Serializable;
import java.util.Objects;

public class BagDto implements Serializable {
    private String name;
    private String description;
    private boolean isBroken;
    private ItemSize size;

    public BagDto(String name, String description, boolean isBroken, ItemSize size) {
        this.name = name;
        this.description = description;
        this.isBroken = isBroken;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsBroken() {
        return isBroken;
    }

    public ItemSize getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public void setSize(ItemSize size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BagDto entity = (BagDto) o;
        return Objects.equals(this.name, entity.name) &&
                Objects.equals(this.description, entity.description) &&
                Objects.equals(this.isBroken, entity.isBroken) &&
                Objects.equals(this.size, entity.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, isBroken, size);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "name = " + name + ", " +
                "description = " + description + ", " +
                "isBroken = " + isBroken + ", " +
                "size = " + size + ")";
    }
}
