package com.jdm.pokeAPI.entities.utility;

import com.jdm.pokeAPI.entities.games.Version;


public class FlavorText {
	// The localized flavor text for an API resource in a specific language.
	private String flavor_text;

	// The language this name is in.
	private Language language;

	// The game version this flavor text is extracted from.
	private Version version;

    public String getFlavor_text() {
        return flavor_text;
    }

    public void setFlavor_text(String flavor_text) {
        this.flavor_text = flavor_text;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

	
}