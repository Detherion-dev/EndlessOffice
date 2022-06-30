package fr.dawan.endlessoffice.dto.memories;

import fr.dawan.endlessoffice.dto.employees.player.PlayerDto;

import java.io.Serializable;
import java.util.Objects;

public class MemoryDto {
    private String name;
    private String description;
    private PlayerDto owner;

    public MemoryDto(String name, String description, PlayerDto owner) {
        this.name = name;
        this.description = description;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public PlayerDto getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOwner(PlayerDto owner) {
        this.owner = owner;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, owner);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "name = " + name + ", " +
                "description = " + description + ", " +
                "owner = " + owner.getFirstname() + " " + owner.getLastname() + ")";
    }
}
