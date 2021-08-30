/* Pockets within the players bag used for storing items by category. */

package com.jdm.pokeAPI.entities.items;
/*
{
  "id": 1,
  "name": "misc",
  "categories": [
    {
      "name": "collectibles",
      "url": "https://pokeapi.co/api/v2/item-category/9/"
    }
  ],
  "names": [
    {
      "name": "Items",
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


public class ItemPocket extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of item categories that are relevant to this item pocket.
	private ArrayList<ItemCategory> categories;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<ItemCategory> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<ItemCategory> categories) {
        this.categories = categories;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

	
}