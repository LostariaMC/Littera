package fr.lostaria.littera.entities;

import fr.lostaria.littera.payload.Lang;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class TranslationsCategory {

    @Id
    @Column(nullable = false, unique = true)
    private String label;

    @Column(columnDefinition = "LONGTEXT")
    private String fr;

    @Column(columnDefinition = "LONGTEXT")
    private String en;

    public String getTranslation(Lang lang) {
        switch (lang) {
            case FR:
                return fr;
            case EN:
                return en;
            default:
                throw new IllegalArgumentException("Unknown lang: " + lang);
        }
    }

}

