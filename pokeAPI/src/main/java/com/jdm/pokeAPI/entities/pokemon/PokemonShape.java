/* Shapes used for sorting Pokémon in a Pokédex. */

package com.jdm.pokeAPI.entities.pokemon;
/*
{
  "id": 1,
  "name": "ball",
  "awesome_names": [
    {
      "awesome_name": "Pomaceous",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "names": [
    {
      "name": "Ball",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "pokemon_species": [
    {
      "name": "shellder",
      "url": "https://pokeapi.co/api/v2/pokemon-species/90/"
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class PokemonShape extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The "scientific" name of this Pokémon shape listed in different languages.
	private ArrayList<AwesomeName> awesome_names;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of the Pokémon species that have this shape.
	private ArrayList<PokemonSpecies> pokemon_species;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<AwesomeName> getAwesome_names() {
        return awesome_names;
    }

    public void setAwesome_names(ArrayList<AwesomeName> awesome_names) {
        this.awesome_names = awesome_names;
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