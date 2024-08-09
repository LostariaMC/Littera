package fr.lostaria.littera.repositories;

import fr.lostaria.littera.entities.Main;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainRepository extends JpaRepository<Main, String> {
}
