package com.jdm.pokeAPI.entities.utility;

public class Description {
    // The localized description for an API resource in a specific language.
    private String description;

    // The language this name is in.
    private Language language;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }


}