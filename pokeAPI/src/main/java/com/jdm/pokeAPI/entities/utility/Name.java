package com.jdm.pokeAPI.entities.utility;

public class Name {
	// The localized name for an API resource in a specific language.
	private String name;

	// The language this name is in.
	private Language language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }


}