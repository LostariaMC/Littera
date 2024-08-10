package fr.lostaria.littera.repositories;

import fr.lostaria.littera.entities.Heroes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroesRepository extends JpaRepository<Heroes, String> {
}
