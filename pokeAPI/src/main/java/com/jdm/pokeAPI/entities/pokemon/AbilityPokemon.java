/* Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.pokemon;

public class AbilityPokemon {
	// Whether or not this a hidden ability for the referenced Pokémon.
	private boolean is_hidden;

	// Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
	private int slot;

	// The Pokémon this ability could belong to.
	private Pokemon pokemon;

    public boolean is_hidden() {
        return is_hidden;
    }

    public void set_hidden(boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

	
}