package fr.lostaria.littera.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "heroes")
public class Heroes extends TranslationsCategory {
}
