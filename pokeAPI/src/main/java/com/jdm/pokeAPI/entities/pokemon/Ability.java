/* Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.pokemon;

import com.jdm.pokeAPI.entities.games.Generation;
import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import com.jdm.pokeAPI.entities.utility.VerboseEffect;
import java.util.ArrayList;



public class Ability extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// Whether or not this ability originated in the main series of the video games.
	private boolean is_main_series;

	// The generation this ability originated in.
	private Generation generation;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// The effect of this ability listed in different languages.
	private ArrayList<VerboseEffect> effect_entries;

	// The list of previous effects this ability has had across version groups.
	private ArrayList<AbilityEffectChange> effect_changes;

	// The flavor text of this ability listed in different languages.
	private ArrayList<AbilityFlavorText> flavor_text_entries;

	// A list of Pokémon that could potentially have this ability.
	private ArrayList<AbilityPokemon> pokemon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIs_main_series() {
        return is_main_series;
    }

    public void setIs_main_series(boolean is_main_series) {
        this.is_main_series = is_main_series;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public ArrayList<VerboseEffect> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(ArrayList<VerboseEffect> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public ArrayList<AbilityEffectChange> getEffect_changes() {
        return effect_changes;
    }

    public void setEffect_changes(ArrayList<AbilityEffectChange> effect_changes) {
        this.effect_changes = effect_changes;
    }

    public ArrayList<AbilityFlavorText> getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public void setFlavor_text_entries(ArrayList<AbilityFlavorText> flavor_text_entries) {
        this.flavor_text_entries = flavor_text_entries;
    }

    public ArrayList<AbilityPokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(ArrayList<AbilityPokemon> pokemon) {
        this.pokemon = pokemon;
    }

	
}