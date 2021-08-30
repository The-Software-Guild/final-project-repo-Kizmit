package com.jdm.pokeAPI.entities.utility;

public class VerboseEffect {
	// The localized effect text for an API resource in a specific language.
	private String effect;

	// The localized effect text in brief.
	private String short_effect;

	// The language this effect is in.
	private Language language;

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getShort_effect() {
        return short_effect;
    }

    public void setShort_effect(String short_effect) {
        this.short_effect = short_effect;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

	
}