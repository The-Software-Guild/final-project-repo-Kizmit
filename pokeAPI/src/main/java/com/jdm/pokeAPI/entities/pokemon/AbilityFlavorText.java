/* Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.pokemon;

import com.jdm.pokeAPI.entities.games.VersionGroup;
import com.jdm.pokeAPI.entities.utility.Language;


public class AbilityFlavorText {
	// The localized name for an API resource in a specific language.
	private String flavor_text;

	// The language this text resource is in.
	private Language language;

	// The version group that uses this flavor text.
	private VersionGroup version_group;

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

    public VersionGroup getVersion_group() {
        return version_group;
    }

    public void setVersion_group(VersionGroup version_group) {
        this.version_group = version_group;
    }

	
}