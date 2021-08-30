/* Growth rates are the speed with which Pokémon gain levels through experience. Check out Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.pokemon;
/*
{
  "id": 1,
  "name": "slow",
  "formula": "\\frac{5x^3}{4}",
  "descriptions": [
    {
      "description": "langsam",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "levels": [
    {
      "level": 100,
      "experience": 1250000
    }
  ],
  "pokemon_species": [
    {
      "name": "growlithe",
      "url": "https://pokeapi.co/api/v2/pokemon-species/58/"
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.utility.Description;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;


public class GrowthRate extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The formula used to calculate the rate at which the Pokémon species gains level.
	private String formula;

	// The descriptions of this characteristic listed in different languages.
	private ArrayList<Description> descriptions;

	// A list of levels and the amount of experienced needed to atain them based on this growth rate.
	private ArrayList<GrowthRateExperienceLevel> levels;

	// A list of Pokémon species that gain levels at this growth rate.
	private ArrayList<PokemonSpecies> pokemon_species;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(ArrayList<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public ArrayList<GrowthRateExperienceLevel> getLevels() {
        return levels;
    }

    public void setLevels(ArrayList<GrowthRateExperienceLevel> levels) {
        this.levels = levels;
    }

    public ArrayList<PokemonSpecies> getPokemon_species() {
        return pokemon_species;
    }

    public void setPokemon_species(ArrayList<PokemonSpecies> pokemon_species) {
        this.pokemon_species = pokemon_species;
    }

	
}