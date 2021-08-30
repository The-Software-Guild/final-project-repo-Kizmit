package com.jdm.pokeAPI.entities.utility;

import com.jdm.pokeAPI.entities.games.VersionGroup;


public class VersionGroupFlavorText {
	// The localized name for an API resource in a specific language.
	private String text;

	// The language this name is in.
	private Language language;

	// The version group which uses this flavor text.
	private VersionGroup version_group;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public VersionGroup getVersion_group() {
        return version_group;
    }

    public void setVersion_group(VersionGroup version_group) {
        this.version_group = version_group;
    }

	
}