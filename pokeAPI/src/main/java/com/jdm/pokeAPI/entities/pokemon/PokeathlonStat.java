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

import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;


public class PokeathlonStat extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A detail of natures which affect this Pokéathlon stat positively or negatively.
	private NaturePokeathlonStatAffectSets affecting_natures;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public NaturePokeathlonStatAffectSets getAffecting_natures() {
        return affecting_natures;
    }

    public void setAffecting_natures(NaturePokeathlonStatAffectSets affecting_natures) {
        this.affecting_natures = affecting_natures;
    }

	
}