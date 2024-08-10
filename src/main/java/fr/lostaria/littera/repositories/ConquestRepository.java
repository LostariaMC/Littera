package fr.lostaria.littera.repositories;

import fr.lostaria.littera.entities.Conquest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConquestRepository extends JpaRepository<Conquest, String> {
}
