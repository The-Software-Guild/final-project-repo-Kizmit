/* Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.contests;
/*
{
  "id": 1,
  "name": "cool",
  "berry_flavor": {
    "name": "spicy",
    "url": "https://pokeapi.co/api/v2/berry-flavor/1/"
  },
  "names": [
    {
      "name": "Cool",
      "color": "Red",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.berries.BerryFlavor;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class ContestType extends NamedAPIResource {
    // The identifier for this resource.
    private int id;

    // The berry flavor that correlates with this contest type.
    private BerryFlavor berry_flavor;

    // The name of this contest type listed in different languages.
    private ArrayList<ContestName> names;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BerryFlavor getBerry_flavor() {
        return berry_flavor;
    }

    public void setBerry_flavor(BerryFlavor berry_flavor) {
        this.berry_flavor = berry_flavor;
    }

    public ArrayList<ContestName> getNames() {
        return names;
    }

    public void setNames(ArrayList<ContestName> names) {
        this.names = names;
    }

	
}