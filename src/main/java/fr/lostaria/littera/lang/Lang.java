package fr.lostaria.littera.lang;

import java.util.HashMap;
import java.util.Map;

public enum Lang {
    FR("fr", "Français"),
    EN("en", "English");

    private String id;
    private String name;
    private static Map<String, String> languages = new HashMap<>();

    Lang(String id, String name) {
        this.id = id;
        this.name = name;
    }

    static {
        for (Lang lang : Lang.values()) {
            languages.put(lang.id, lang.name);
        }
    }

    public String getId() {
        return id;
    }

    public static String getName(String id) {
        return languages.get(id);
    }

    public static Map<String, String> getLanguages() {
        return languages;
    }

    public static Lang getLang(String id) {
        for (Lang lang : Lang.values()) {
            if (lang.id.equals(id)) {
                return lang;
            }
        }
        return null;
    }

}
