package fr.lostaria.littera.services;

import fr.lostaria.littera.entities.TranslationsCategory;
import fr.lostaria.littera.payload.Category;
import fr.lostaria.littera.repositories.MainRepository;
import fr.lostaria.littera.repositories.ShootCraftRepository;
import fr.lostaria.littera.repositories.SpleefRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TranslationsService {

    @Autowired
    private MainRepository mainRepository;

    @Autowired
    private ShootCraftRepository shootCraftRepository;

    @Autowired
    private SpleefRepository spleefRepository;

    public List<TranslationsCategory> getTranslations(Category category) {
        switch (category) {
            case MAIN:
                return StreamSupport
                        .stream(mainRepository.findAll().spliterator(), false)
                        .collect(Collectors.toList());
            case SHOOTCRAFT:
                return StreamSupport
                        .stream(shootCraftRepository.findAll().spliterator(), false)
                        .collect(Collectors.toList());
            case SPLEEF:
                return StreamSupport
                        .stream(spleefRepository.findAll().spliterator(), false)
                        .collect(Collectors.toList());
            default:
                throw new IllegalArgumentException("Unknown category: " + category);
        }
    }

}
