/* Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their nature. Check out Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.berries;
/*
{
  "id": 1,
  "name": "spicy",
  "berries": [
    {
      "potency": 10,
      "berry": {
        "name": "rowap",
        "url": "https://pokeapi.co/api/v2/berry/64/"
      }
    }
  ],
  "contest_type": {
    "name": "cool",
    "url": "https://pokeapi.co/api/v2/contest-type/1/"
  },
  "names": [
    {
      "name": "Spicy",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.contests.ContestType;
import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;


public class BerryFlavor extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of the berries with this flavor.
	private ArrayList<FlavorBerryMap> berries;

	// The contest type that correlates with this berry flavor.
	private ContestType contest_type;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<FlavorBerryMap> getBerries() {
        return berries;
    }

    public void setBerries(ArrayList<FlavorBerryMap> berries) {
        this.berries = berries;
    }

    public ContestType getContest_type() {
        return contest_type;
    }

    public void setContest_type(ContestType contest_type) {
        this.contest_type = contest_type;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }
        
        
}