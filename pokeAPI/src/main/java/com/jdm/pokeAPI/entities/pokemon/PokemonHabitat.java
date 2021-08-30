/* Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon. */

package com.jdm.pokeAPI.entities.pokemon;
/*
{
  "id": 1,
  "name": "cave",
  "names": [
    {
      "name": "grottes",
      "language": {
        "name": "fr",
        "url": "https://pokeapi.co/api/v2/language/5/"
      }
    }
  ],
  "pokemon_species": [
    {
      "name": "zubat",
      "url": "https://pokeapi.co/api/v2/pokemon-species/41/"
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;


public class PokemonHabitat extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of the Pokémon species that can be found in this habitat.
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