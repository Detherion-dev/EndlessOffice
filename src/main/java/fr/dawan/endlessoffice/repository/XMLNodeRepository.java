package fr.dawan.endlessoffice.repository;

import fr.dawan.endlessoffice.entities.xml.structure.XMLNode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface XMLNodeRepository extends JpaRepository<XMLNode, Long> {
}