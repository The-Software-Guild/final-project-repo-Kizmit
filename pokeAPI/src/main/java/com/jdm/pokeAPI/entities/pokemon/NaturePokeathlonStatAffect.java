/* Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.pokemon;
/*
{
  "id": 1,
  "name": "speed",
  "affecting_natures": {
    "increase": [
      {
        "max_change": 2,
        "nature": {
          "name": "timid",
          "url": "https://pokeapi.co/api/v2/nature/5/"
        }
      }
    ],
    "decrease": [
      {
        "max_change": -1,
        "nature": {
          "name": "hardy",
          "url": "https://pokeapi.co/api/v2/nature/1/"
        }
      }
    ]
  },
  "names": [
    {
      "name": "Speed",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

public class NaturePokeathlonStatAffect {
	// The maximum amount of change to the referenced Pokéathlon stat.
	private int max_change;

	// The nature causing the change.
	private Nature nature;

    public int getMax_change() {
        return max_change;
    }

    public void setMax_change(int max_change) {
        this.max_change = max_change;
    }

    public Nature getNature() {
        return nature;
    }

    public void setNature(Nature nature) {
        this.nature = nature;
    }

	
}