/* Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.berries;
/*
{
  "id": 1,
  "name": "cheri",
  "growth_time": 3,
  "max_harvest": 5,
  "natural_gift_power": 60,
  "size": 20,
  "smoothness": 25,
  "soil_dryness": 15,
  "firmness": {
    "name": "soft",
    "url": "https://pokeapi.co/api/v2/berry-firmness/2/"
  },
  "flavors": [
    {
      "potency": 10,
      "flavor": {
        "name": "spicy",
        "url": "https://pokeapi.co/api/v2/berry-flavor/1/"
      }
    }
  ],
  "item": {
    "name": "cheri-berry",
    "url": "https://pokeapi.co/api/v2/item/126/"
  },
  "natural_gift_type": {
    "name": "fire",
    "url": "https://pokeapi.co/api/v2/type/10/"
  }
}
*/

import com.jdm.pokeAPI.entities.items.Item;
import com.jdm.pokeAPI.entities.pokemon.Type;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;


public class Berry extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
	private int growth_time;

	// The maximum number of these berries that can grow on one tree in Generation IV.
	private int max_harvest;

	// The power of the move "Natural Gift" when used with this Berry.
	private int natural_gift_power;

	// The size of this Berry, in millimeters.
	private int size;

	// The smoothness of this Berry, used in making Pokéblocks or Poffins.
	private int smoothness;

	// The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
	private int soil_dryness;

	// The firmness of this berry, used in making Pokéblocks or Poffins.
	private BerryFirmness firmness;

	// A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
	private ArrayList<BerryFlavorMap> flavors;

	// Berries are actually items. This is a reference to the item specific data for this berry.
	private Item item;

	// The type inherited by "Natural Gift" when used with this Berry.
	private Type natural_gift_type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrowth_time() {
        return growth_time;
    }

    public void setGrowth_time(int growth_time) {
        this.growth_time = growth_time;
    }

    public int getMax_harvest() {
        return max_harvest;
    }

    public void setMax_harvest(int max_harvest) {
        this.max_harvest = max_harvest;
    }

    public int getNatural_gift_power() {
        return natural_gift_power;
    }

    public void setNatural_gift_power(int natural_gift_power) {
        this.natural_gift_power = natural_gift_power;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSmoothness() {
        return smoothness;
    }

    public void setSmoothness(int smoothness) {
        this.smoothness = smoothness;
    }

    public int getSoil_dryness() {
        return soil_dryness;
    }

    public void setSoil_dryness(int soil_dryness) {
        this.soil_dryness = soil_dryness;
    }

    public BerryFirmness getFirmness() {
        return firmness;
    }

    public void setFirmness(BerryFirmness firmness) {
        this.firmness = firmness;
    }

    public ArrayList<BerryFlavorMap> getFlavors() {
        return flavors;
    }

    public void setFlavors(ArrayList<BerryFlavorMap> flavors) {
        this.flavors = flavors;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Type getNatural_gift_type() {
        return natural_gift_type;
    }

    public void setNatural_gift_type(Type natural_gift_type) {
        this.natural_gift_type = natural_gift_type;
    }

	
}