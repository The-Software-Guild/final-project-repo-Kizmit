/* Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against. */

package com.jdm.pokeAPI.entities.pokemon;

public class TypePokemon {
	// The order the Pokémon's types are listed in.
	private int slot;

	// The Pokémon that has the referenced type.
	private Pokemon pokemon;

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