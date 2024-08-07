package fr.lostaria.littera.payload;

import java.util.HashMap;
import java.util.Map;

public enum Category {
    SHOOTCRAFT("shootcraft", "ShootCraft"),
    SPLEEF("spleef", "Spleef");

    private String id;
    private String name;
    private static Map<String, String> categories = new HashMap<>();

    Category(String id, String name) {
        this.id = id;
        this.name = name;
    }

    static {
        for (Category category : Category.values()) {
            categories.put(category.id, category.name);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Map<String, String> getCategories() {
        return categories;
    }

    public static Category getCategory(String id) {
        for (Category category : Category.values()) {
            if (category.id.equals(id)) {
                return category;
            }
        }
        return null;
    }
}
