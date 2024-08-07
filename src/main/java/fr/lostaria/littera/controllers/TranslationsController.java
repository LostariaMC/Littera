package fr.lostaria.littera.controllers;

import fr.lostaria.littera.entities.TranslationsCategory;
import fr.lostaria.littera.payload.Category;
import fr.lostaria.littera.payload.Lang;
import fr.lostaria.littera.services.TranslationsService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/translations")
public class TranslationsController {

    private TranslationsService translationsService;

    public TranslationsController(TranslationsService translationsService) {
        this.translationsService = translationsService;
    }

    @GetMapping("/translations/{category}")
    public HashMap<Lang, HashMap<String, String>> getTranslations(@PathVariable Category category) {
        List<TranslationsCategory> translations = translationsService.getTranslations(category);

        HashMap<Lang, HashMap<String, String>> result = new HashMap<>();
        for (Lang lang : Lang.values()) {
            HashMap<String, String> translationsMap = new HashMap<>();
            for (TranslationsCategory translation : translations) {
                translationsMap.put(translation.getLabel(), translation.getTranslation(lang));
            }
            result.put(lang, translationsMap);
        }
        return result;
    }

}
