package com.jdm.pokeAPI.entities.utility;

public class Effect {
	// The localized effect text for an API resource in a specific language.
	private String effect;

	// The language this effect is in.
	private Language language;

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }


}