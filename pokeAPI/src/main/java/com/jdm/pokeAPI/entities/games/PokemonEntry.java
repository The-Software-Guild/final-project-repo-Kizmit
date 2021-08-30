/* A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.games;

import com.jdm.pokeAPI.entities.pokemon.PokemonSpecies;

/*
{
  "id": 2,
  "name": "kanto",
  "is_main_series": true,
  "descriptions": [
    {
      "description": "Rot/Blau/Gelb Kanto Dex",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "names": [
    {
      "name": "Kanto",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "pokemon_entries": [
    {
      "entry_number": 1,
      "pokemon_species": {
        "name": "bulbasaur",
        "url": "https://pokeapi.co/api/v2/pokemon-species/1/"
      }
    }
  ],
  "region": {
    "name": "kanto",
    "url": "https://pokeapi.co/api/v2/region/1/"
  },
  "version_groups": [
    {
      "name": "red-blue",
      "url": "https://pokeapi.co/api/v2/version-group/1/"
    }
  ]
}
*/



public class PokemonEntry {
	// The index of this Pokémon species entry within the Pokédex.
	private int entry_number;

	// The Pokémon species being encountered.
	private PokemonSpecies pokemon_species;

    public int getEntry_number() {
        return entry_number;
    }

    public void setEntry_number(int entry_number) {
        this.entry_number = entry_number;
    }

    public PokemonSpecies getPokemon_species() {
        return pokemon_species;
    }

    public void setPokemon_species(PokemonSpecies pokemon_species) {
        this.pokemon_species = pokemon_species;
    }

}