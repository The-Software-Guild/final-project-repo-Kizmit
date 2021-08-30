/* A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant. */

package com.jdm.pokeAPI.entities.pokemon;

import com.jdm.pokeAPI.entities.locations.PalParkArea;

/*
{
  "id": 413,
  "name": "wormadam",
  "order": 441,
  "gender_rate": 8,
  "capture_rate": 45,
  "base_happiness": 70,
  "is_baby": false,
  "hatch_counter": 15,
  "has_gender_differences": false,
  "forms_switchable": false,
  "growth_rate": {
    "name": "medium",
    "url": "https://pokeapi.co/api/v2/growth-rate/2/"
  },
  "pokedex_numbers": [
    {
      "entry_number": 45,
      "pokedex": {
        "name": "kalos-central",
        "url": "https://pokeapi.co/api/v2/pokedex/12/"
      }
    }
  ],
  "egg_groups": [
    {
      "name": "bug",
      "url": "https://pokeapi.co/api/v2/egg-group/3/"
    }
  ],
  "color": {
    "name": "gray",
    "url": "https://pokeapi.co/api/v2/pokemon-color/4/"
  },
  "shape": {
    "name": "squiggle",
    "url": "https://pokeapi.co/api/v2/pokemon-shape/2/"
  },
  "evolves_from_species": {
    "name": "burmy",
    "url": "https://pokeapi.co/api/v2/pokemon-species/412/"
  },
  "evolution_chain": {
    "url": "https://pokeapi.co/api/v2/evolution-chain/213/"
  },
  "habitat": null,
  "generation": {
    "name": "generation-iv",
    "url": "https://pokeapi.co/api/v2/generation/4/"
  },
  "names": [
    {
      "name": "Wormadam",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "flavor_text_entries": [
    {
      "flavor_text": "When the bulb on\nits back grows\nlarge, it appears\fto lose the\nability to stand\non its hind legs.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      },
      "version": {
        "name": "red",
        "url": "https://pokeapi.co/api/v2/version/1/"
      }
    }
  ],
  "form_descriptions": [
    {
      "description": "Forms have different stats and movepools.  During evolution, Burmy's current cloak becomes Wormadam's form, and can no longer be changed.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "genera": [
    {
      "genus": "Bagworm",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "varieties": [
    {
      "is_default": true,
      "pokemon": {
        "name": "wormadam-plant",
        "url": "https://pokeapi.co/api/v2/pokemon/413/"
      }
    }
  ]
}
*/



public class PalParkEncounterArea {
	// The base score given to the player when the referenced Pokémon is caught during a pal park run.
	private int base_score;

	// The base rate for encountering the referenced Pokémon in this pal park area.
	private int rate;

	// The pal park area where this encounter happens.
	private PalParkArea area;

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

    public PalParkArea getArea() {
        return area;
    }

    public void setArea(PalParkArea area) {
        this.area = area;
    }

	
}