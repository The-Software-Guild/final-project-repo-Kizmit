/* Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy. */

package com.jdm.pokeAPI.entities.evolution;
/*
{
  "id": 7,
  "baby_trigger_item": null,
  "chain": {
    "is_baby": false,
    "species": {
      "name": "rattata",
      "url": "https://pokeapi.co/api/v2/pokemon-species/19/"
    },
    "evolution_details": null,
    "evolves_to": [
      {
        "is_baby": false,
        "species": {
          "name": "raticate",
          "url": "https://pokeapi.co/api/v2/pokemon-species/20/"
        },
        "evolution_details": [
          {
            "item": null,
            "trigger": {
              "name": "level-up",
              "url": "https://pokeapi.co/api/v2/evolution-trigger/1/"
            },
            "gender": null,
            "held_item": null,
            "known_move": null,
            "known_move_type": null,
            "location": null,
            "min_level": 20,
            "min_happiness": null,
            "min_beauty": null,
            "min_affection": null,
            "needs_overworld_rain": false,
            "party_species": null,
            "party_type": null,
            "relative_physical_stats": null,
            "time_of_day": "",
            "trade_species": null,
            "turn_upside_down": false
          }
        ],
        "evolves_to": []
      }
    ]
  }
}
*/

import com.jdm.pokeAPI.entities.pokemon.PokemonSpecies;
import java.util.ArrayList;



public class ChainLink {
    // Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
    private boolean is_baby;

    // The Pokémon species at this point in the evolution chain.
    private PokemonSpecies species;

    // All details regarding the specific details of the referenced Pokémon species evolution.
    private ArrayList<EvolutionDetail> evolution_details;

    // A List of chain objects.
    private ArrayList<ChainLink> evolves_to;

    public boolean isIs_baby() {
        return is_baby;
    }

    public void setIs_baby(boolean is_baby) {
        this.is_baby = is_baby;
    }

    public PokemonSpecies getSpecies() {
        return species;
    }

    public void setSpecies(PokemonSpecies species) {
        this.species = species;
    }

    public ArrayList<EvolutionDetail> getEvolution_details() {
        return evolution_details;
    }

    public void setEvolution_details(ArrayList<EvolutionDetail> evolution_details) {
        this.evolution_details = evolution_details;
    }

    public ArrayList<ChainLink> getEvolves_to() {
        return evolves_to;
    }

    public void setEvolves_to(ArrayList<ChainLink> evolves_to) {
        this.evolves_to = evolves_to;
    }

	
}