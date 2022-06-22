package fr.dawan.endlessoffice.dao;

import fr.dawan.endlessoffice.entities.memories.Memory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoryRepository extends JpaRepository<Memory, Long> {
}
