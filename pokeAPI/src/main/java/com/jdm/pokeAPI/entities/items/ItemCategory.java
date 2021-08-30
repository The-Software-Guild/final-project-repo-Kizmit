/* Item categories determine where items will be placed in the players bag. */

package com.jdm.pokeAPI.entities.items;
/*
{
  "id": 1,
  "name": "stat-boosts",
  "items": [
    {
      "name": "guard-spec",
      "url": "https://pokeapi.co/api/v2/item/55/"
    }
  ],
  "names": [
    {
      "name": "Stat boosts",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "pocket": {
    "name": "battle",
    "url": "https://pokeapi.co/api/v2/item-pocket/7/"
  }
}
*/

import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class ItemCategory extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of items that are a part of this category.
	private ArrayList<Item> items;

	// The name of this item category listed in different languages.
	private ArrayList<Name> names;

	// The pocket items in this category would be put in.
	private ItemPocket pocket;

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

    public ItemPocket getPocket() {
        return pocket;
    }

    public void setPocket(ItemPocket pocket) {
        this.pocket = pocket;
    }

	
}