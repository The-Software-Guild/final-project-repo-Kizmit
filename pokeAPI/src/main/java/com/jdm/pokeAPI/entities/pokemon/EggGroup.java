/* Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.pokemon;

import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class EggGroup extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of all Pokémon species that are members of this egg group.
	private ArrayList<PokemonSpecies> pokemon_species;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public ArrayList<PokemonSpecies> getPokemon_species() {
        return pokemon_species;
    }

    public void setPokemon_species(ArrayList<PokemonSpecies> pokemon_species) {
        this.pokemon_species = pokemon_species;
    }

	
}