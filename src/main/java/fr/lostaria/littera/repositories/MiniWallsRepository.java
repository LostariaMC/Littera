package fr.lostaria.littera.repositories;

import fr.lostaria.littera.entities.MiniWalls;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiniWallsRepository extends JpaRepository<MiniWalls, String> {
}
