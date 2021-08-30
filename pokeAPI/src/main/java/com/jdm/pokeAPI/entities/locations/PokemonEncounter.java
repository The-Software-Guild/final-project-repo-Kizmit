/* Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters. */

package com.jdm.pokeAPI.entities.locations;
/*
{
  "id": 1,
  "name": "canalave-city-area",
  "game_index": 1,
  "encounter_method_rates": [
    {
      "encounter_method": {
        "name": "old-rod",
        "url": "https://pokeapi.co/api/v2/encounter-method/2/"
      },
      "version_details": [
        {
          "rate": 25,
          "version": {
            "name": "platinum",
            "url": "https://pokeapi.co/api/v2/version/14/"
          }
        }
      ]
    }
  ],
  "location": {
    "name": "canalave-city",
    "url": "https://pokeapi.co/api/v2/location/1/"
  },
  "names": [
    {
      "name": "",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "pokemon_encounters": [
    {
      "pokemon": {
        "name": "tentacool",
        "url": "https://pokeapi.co/api/v2/pokemon/72/"
      },
      "version_details": [
        {
          "version": {
            "name": "diamond",
            "url": "https://pokeapi.co/api/v2/version/12/"
          },
          "max_chance": 60,
          "encounter_details": [
            {
              "min_level": 20,
              "max_level": 30,
              "condition_values": [],
              "chance": 60,
              "method": {
                "name": "surf",
                "url": "https://pokeapi.co/api/v2/encounter-method/5/"
              }
            }
          ]
        }
      ]
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.pokemon.Pokemon;
import com.jdm.pokeAPI.entities.utility.VersionEncounterDetail;
import java.util.ArrayList;



public class PokemonEncounter {
	// The Pokémon being encountered.
	private Pokemon pokemon;

	// A list of versions and encounters with Pokémon that might happen in the referenced location area.
	private ArrayList<VersionEncounterDetail> version_details;

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public ArrayList<VersionEncounterDetail> getVersion_details() {
        return version_details;
    }

    public void setVersion_details(ArrayList<VersionEncounterDetail> version_details) {
        this.version_details = version_details;
    }

	
}