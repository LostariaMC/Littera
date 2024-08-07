package fr.lostaria.littera.repositories;

import fr.lostaria.littera.entities.Spleef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpleefRepository extends JpaRepository<Spleef, String> {
}
