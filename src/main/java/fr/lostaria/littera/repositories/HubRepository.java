package fr.lostaria.littera.repositories;

import fr.lostaria.littera.entities.Hub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubRepository extends JpaRepository<Hub, String> {
}
