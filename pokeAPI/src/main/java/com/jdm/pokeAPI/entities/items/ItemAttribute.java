/* Item attributes define particular aspects of items, e.g. "usable in battle" or "consumable". */

package com.jdm.pokeAPI.entities.items;
/*
{
  "id": 1,
  "name": "countable",
  "descriptions": [
    {
      "description": "Has a count in the bag",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "items": [
    {
      "name": "master-ball",
      "url": "https://pokeapi.co/api/v2/item/1/"
    }
  ],
  "names": [
    {
      "name": "Countable",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.utility.Description;
import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;


public class ItemAttribute extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of items that have this attribute.
	private ArrayList<Item> items;

	// The name of this item attribute listed in different languages.
	private ArrayList<Name> names;

	// The description of this item attribute listed in different languages.
	private ArrayList<Description> descriptions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(ArrayList<Description> descriptions) {
        this.descriptions = descriptions;
    }

	
}