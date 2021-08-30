/* Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.encounters;
/*
{
  "id": 1,
  "name": "walk",
  "order": 1,
  "names": [
    {
      "name": "Walking in tall grass or a cave",
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



public class EncounterMethod extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A good value for sorting.
	private int order;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

	
}