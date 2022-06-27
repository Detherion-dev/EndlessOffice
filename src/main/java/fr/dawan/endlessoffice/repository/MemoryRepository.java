package fr.dawan.endlessoffice.repository;

import fr.dawan.endlessoffice.entities.memories.Memory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoryRepository extends JpaRepository<Memory, Long> {
}
