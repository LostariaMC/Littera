package fr.lostaria.littera.repositories;

import fr.lostaria.littera.entities.TeamFortress2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamFortress2Repository extends JpaRepository<TeamFortress2, String> {
}
