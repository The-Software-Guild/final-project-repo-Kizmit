/* Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy. */

package com.jdm.pokeAPI.entities.evolution;

import com.jdm.pokeAPI.entities.items.Item;
import com.jdm.pokeAPI.entities.utility.APIResource;

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



public class EvolutionChain extends APIResource {
    // The identifier for this resource.
    private int id;

    // The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
    private Item baby_trigger_item;

    // The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.
    private ChainLink chain;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getBaby_trigger_item() {
        return baby_trigger_item;
    }

    public void setBaby_trigger_item(Item baby_trigger_item) {
        this.baby_trigger_item = baby_trigger_item;
    }

    public ChainLink getChain() {
        return chain;
    }

    public void setChain(ChainLink chain) {
        this.chain = chain;
    }

	
}