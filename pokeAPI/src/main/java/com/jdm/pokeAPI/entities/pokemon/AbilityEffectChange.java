/* Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.pokemon;

import com.jdm.pokeAPI.entities.games.VersionGroup;
import com.jdm.pokeAPI.entities.utility.Effect;
import java.util.ArrayList;


public class AbilityEffectChange {
	// The previous effect of this ability listed in different languages.
	private ArrayList<Effect> effect_entries;

	// The version group in which the previous effect of this ability originated.
	private VersionGroup version_group;

    public ArrayList<Effect> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(ArrayList<Effect> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public VersionGroup getVersion_group() {
        return version_group;
    }

    public void setVersion_group(VersionGroup version_group) {
        this.version_group = version_group;
    }


}