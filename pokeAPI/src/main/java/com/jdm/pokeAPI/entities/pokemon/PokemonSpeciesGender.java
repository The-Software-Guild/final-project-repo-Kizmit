/* Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.pokemon;
/*
{
  "id": 1,
  "name": "female",
  "pokemon_species_details": [
    {
      "rate": 1,
      "pokemon_species": {
        "name": "bulbasaur",
        "url": "https://pokeapi.co/api/v2/pokemon-species/1/"
      }
    }
  ],
  "required_for_evolution": [
    {
      "name": "wormadam",
      "url": "https://pokeapi.co/api/v2/pokemon-species/413/"
    }
  ]
}
*/

public class PokemonSpeciesGender {
	// The chance of this Pokémon being female, in eighths; or -1 for genderless.
	private int rate;

	// A Pokémon species that can be the referenced gender.
	private PokemonSpecies pokemon_species;

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