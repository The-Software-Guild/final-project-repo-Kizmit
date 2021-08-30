/* The various effects of the move "Fling" when used with different items. */

package com.jdm.pokeAPI.entities.items;
/*
{
  "id": 1,
  "name": "badly-poison",
  "effect_entries": [
    {
      "effect": "Badly poisons the target.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "items": [
    {
      "name": "toxic-orb",
      "url": "https://pokeapi.co/api/v2/item/249/"
    }
  ]
}
*/

import java.util.ArrayList;


import com.jdm.pokeAPI.entities.utility.Effect;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;

public class ItemFlingEffect extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The result of this fling effect listed in different languages.
	private ArrayList<Effect> effect_entries;

	// A list of items that have this fling effect.
	private ArrayList<Item> items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Effect> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(ArrayList<Effect> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

	
}