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

import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;


public class Gender extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of Pokémon species that can be this gender and how likely it is that they will be.
	private ArrayList<PokemonSpeciesGender> pokemon_species_details;

	// A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
	private ArrayList<PokemonSpecies> required_for_evolution;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<PokemonSpeciesGender> getPokemon_species_details() {
        return pokemon_species_details;
    }

    public void setPokemon_species_details(ArrayList<PokemonSpeciesGender> pokemon_species_details) {
        this.pokemon_species_details = pokemon_species_details;
    }

    public ArrayList<PokemonSpecies> getRequired_for_evolution() {
        return required_for_evolution;
    }

    public void setRequired_for_evolution(ArrayList<PokemonSpecies> required_for_evolution) {
        this.required_for_evolution = required_for_evolution;
    }

	
}