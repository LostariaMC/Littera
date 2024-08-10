package fr.lostaria.littera.repositories;

import fr.lostaria.littera.entities.PloufCraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PloufCraftRepository extends JpaRepository<PloufCraft, String> {
}
