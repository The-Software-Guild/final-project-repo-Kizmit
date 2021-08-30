/* Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park. */

package com.jdm.pokeAPI.entities.locations;
/*
{
  "id": 1,
  "name": "forest",
  "names": [
    {
      "name": "Forest",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "pokemon_encounters": [
    {
      "base_score": 30,
      "rate": 50,
      "pokemon_species": {
        "name": "caterpie",
        "url": "https://pokeapi.co/api/v2/pokemon-species/10/"
      }
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class PalParkArea extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of Pokémon encountered in thi pal park area along with details.
	private ArrayList<PalParkEncounterSpecies> pokemon_encounters;

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

    public ArrayList<PalParkEncounterSpecies> getPokemon_encounters() {
        return pokemon_encounters;
    }

    public void setPokemon_encounters(ArrayList<PalParkEncounterSpecies> pokemon_encounters) {
        this.pokemon_encounters = pokemon_encounters;
    }

	
}