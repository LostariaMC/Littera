package fr.lostaria.littera.services;

import fr.lostaria.littera.entities.TranslationsCategory;
import fr.lostaria.littera.payload.Category;
import fr.lostaria.littera.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TranslationsService {

    @Autowired
    private ConquestRepository conquestRepository;

    @Autowired
    private HeroesRepository heroesRepository;

    @Autowired
    private HubRepository hubRepository;

    @Autowired
    private MainRepository mainRepository;

    @Autowired
    private MiniWallsRepository miniWallsRepository;

    @Autowired
    private PloufCraftRepository ploufCraftRepository;

    @Autowired
    private ShootCraftRepository shootCraftRepository;

    @Autowired
    private SpleefRepository spleefRepository;

    @Autowired
    private TeamFortress2Repository teamFortress2Repository;

    public List<TranslationsCategory> getTranslations(Category category) {
        switch (category) {
            case CONQUEST:
                return StreamSupport
                        .stream(conquestRepository.findAll().spliterator(), false)
                        .collect(Collectors.toList());
            case HEROES:
                return StreamSupport
                        .stream(heroesRepository.findAll().spliterator(), false)
                        .collect(Collectors.toList());
            case HUB:
                return StreamSupport
                        .stream(hubRepository.findAll().spliterator(), false)
                        .collect(Collectors.toList());
            case MAIN:
                return StreamSupport
                        .stream(mainRepository.findAll().spliterator(), false)
                        .collect(Collectors.toList());
            case MINIWALLS:
                return StreamSupport
                        .stream(miniWallsRepository.findAll().spliterator(), false)
                        .collect(Collectors.toList());
            case PLOUFCRAFT:
                return StreamSupport
                        .stream(ploufCraftRepository.findAll().spliterator(), false)
                        .collect(Collectors.toList());
            case SHOOTCRAFT:
                return StreamSupport
                        .stream(shootCraftRepository.findAll().spliterator(), false)
                        .collect(Collectors.toList());
            case SPLEEF:
                return StreamSupport
                        .stream(spleefRepository.findAll().spliterator(), false)
                        .collect(Collectors.toList());
            case TEAMFORTRESS2:
                return StreamSupport
                        .stream(teamFortress2Repository.findAll().spliterator(), false)
                        .collect(Collectors.toList());
            default:
                throw new IllegalArgumentException("Unknown category: " + category);
        }
    }

}
