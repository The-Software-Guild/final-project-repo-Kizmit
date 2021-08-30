/* Berries can be soft or hard. Check out Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.berries;
/*
{
  "id": 1,
  "name": "very-soft",
  "berries": [
    {
      "name": "pecha",
      "url": "https://pokeapi.co/api/v2/berry/3/"
    }
  ],
  "names": [
    {
      "name": "Very Soft",
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


public class BerryFirmness extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of the berries with this firmness.
	private ArrayList<Berry> berries;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Berry> getBerries() {
        return berries;
    }

    public void setBerries(ArrayList<Berry> berries) {
        this.berries = berries;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

        
}