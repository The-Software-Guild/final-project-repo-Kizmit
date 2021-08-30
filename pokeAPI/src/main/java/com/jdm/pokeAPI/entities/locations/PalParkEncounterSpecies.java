/* Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park. */

package com.jdm.pokeAPI.entities.locations;

import com.jdm.pokeAPI.entities.pokemon.PokemonSpecies;

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



public class PalParkEncounterSpecies {
	// The base score given to the player when this Pokémon is caught during a pal park run.
	private int base_score;

	// The base rate for encountering this Pokémon in this pal park area.
	private int rate;

	// The Pokémon species being encountered.
	private PokemonSpecies pokemon_species;

    public int getBase_score() {
        return base_score;
    }

    public void setBase_score(int base_score) {
        this.base_score = base_score;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public PokemonSpecies getPokemon_species() {
        return pokemon_species;
    }

    public void setPokemon_species(PokemonSpecies pokemon_species) {
        this.pokemon_species = pokemon_species;
    }

	
}