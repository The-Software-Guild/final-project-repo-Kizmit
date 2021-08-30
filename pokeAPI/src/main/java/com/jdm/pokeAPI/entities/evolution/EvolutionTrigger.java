/* Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.evolution;
/*
{
  "id": 1,
  "name": "level-up",
  "names": [
    {
      "name": "Level up",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "pokemon_species": [
    {
      "name": "ivysaur",
      "url": "https://pokeapi.co/api/v2/pokemon-species/2/"
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.pokemon.PokemonSpecies;
import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class EvolutionTrigger extends NamedAPIResource {
    // The identifier for this resource.
    private int id;

    // The name of this resource listed in different languages.
    private ArrayList<Name> names;

    // A list of pokemon species that result from this evolution trigger.
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