package fr.lostaria.littera.repositories;

import fr.lostaria.littera.entities.ShootCraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShootCraftRepository extends JpaRepository<ShootCraft, String> {
}
