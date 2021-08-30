/* An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area. */

package com.jdm.pokeAPI.entities.items;
/*
{
  "id": 1,
  "name": "master-ball",
  "cost": 0,
  "fling_power": 10,
  "fling_effect": {
    "name": "flinch",
    "url": "https://pokeapi.co/api/v2/item-fling-effect/7/"
  },
  "attributes": [
    {
      "name": "holdable",
      "url": "https://pokeapi.co/api/v2/item-attribute/5/"
    }
  ],
  "category": {
    "name": "standard-balls",
    "url": "https://pokeapi.co/api/v2/item-category/34/"
  },
  "effect_entries": [
    {
      "effect": "Used in battle\n:   [Catches]{mechanic:catch} a wild Pokémon without fail.\n\n    If used in a trainer battle, nothing happens and the ball is lost.",
      "short_effect": "Catches a wild Pokémon every time.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "flavor_text_entries": [
    {
      "text": "The best Poké Ball with the ultimate level of performance. With it, you will catch any wild Pokémon without fail.",
      "version_group": {
        "name": "x-y",
        "url": "https://pokeapi.co/api/v2/version-group/15/"
      },
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "game_indices": [
    {
      "game_index": 1,
      "generation": {
        "name": "generation-vi",
        "url": "https://pokeapi.co/api/v2/generation/6/"
      }
    }
  ],
  "names": [
    {
      "name": "Master Ball",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "sprites": {
    "default": "http://pokeapi.co/media/sprites/items/master-ball.png"
  },
  "held_by_pokemon": [
    {
      "pokemon": {
        "name": "chansey",
        "url": "https://pokeapi.co/api/v2/pokemon/113/"
      },
      "version_details": [
        {
          "rarity": 50,
          "version": {
            "name": "soulsilver",
            "url": "https://pokeapi.co/api/v2/version/16/"
          }
        }
      ]
    }
  ],
  "baby_trigger_for": {
    "url": "https://pokeapi.co/api/v2/evolution-chain/1/"
  }
}
*/

import com.jdm.pokeAPI.entities.evolution.EvolutionChain;
import com.jdm.pokeAPI.entities.utility.GenerationGameIndex;
import com.jdm.pokeAPI.entities.utility.MachineVersionDetail;
import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import com.jdm.pokeAPI.entities.utility.VerboseEffect;
import com.jdm.pokeAPI.entities.utility.VersionGroupFlavorText;
import java.util.ArrayList;


public class Item extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The price of this item in stores.
	private int cost;

	// The power of the move Fling when used with this item.
	private int fling_power;

	// The effect of the move Fling when used with this item.
	private ItemFlingEffect fling_effect;

	// A list of attributes this item has.
	private ArrayList<ItemAttribute> attributes;

	// The category of items this item falls into.
	private ItemCategory category;

	// The effect of this ability listed in different languages.
	private ArrayList<VerboseEffect> effect_entries;

	// The flavor text of this ability listed in different languages.
	private ArrayList<VersionGroupFlavorText> flavor_text_entries;

	// A list of game indices relevent to this item by generation.
	private ArrayList<GenerationGameIndex> game_indices;

	// The name of this item listed in different languages.
	private ArrayList<Name> names;

	// A set of sprites used to depict this item in the game.
	private ItemSprites sprites;

	// A list of Pokémon that might be found in the wild holding this item.
	private ArrayList<ItemHolderPokemon> held_by_pokemon;

	// An evolution chain this item requires to produce a bay during mating.
	private EvolutionChain baby_trigger_for;

	// A list of the machines related to this item.
	private ArrayList<MachineVersionDetail> machines;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getFling_power() {
        return fling_power;
    }

    public void setFling_power(int fling_power) {
        this.fling_power = fling_power;
    }

    public ItemFlingEffect getFling_effect() {
        return fling_effect;
    }

    public void setFling_effect(ItemFlingEffect fling_effect) {
        this.fling_effect = fling_effect;
    }

    public ArrayList<ItemAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<ItemAttribute> attributes) {
        this.attributes = attributes;
    }

    public ItemCategory getCategory() {
        return category;
    }

    public void setCategory(ItemCategory category) {
        this.category = category;
    }

    public ArrayList<VerboseEffect> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(ArrayList<VerboseEffect> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public ArrayList<VersionGroupFlavorText> getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public void setFlavor_text_entries(ArrayList<VersionGroupFlavorText> flavor_text_entries) {
        this.flavor_text_entries = flavor_text_entries;
    }

    public ArrayList<GenerationGameIndex> getGame_indices() {
        return game_indices;
    }

    public void setGame_indices(ArrayList<GenerationGameIndex> game_indices) {
        this.game_indices = game_indices;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public ItemSprites getSprites() {
        return sprites;
    }

    public void setSprites(ItemSprites sprites) {
        this.sprites = sprites;
    }

    public ArrayList<ItemHolderPokemon> getHeld_by_pokemon() {
        return held_by_pokemon;
    }

    public void setHeld_by_pokemon(ArrayList<ItemHolderPokemon> held_by_pokemon) {
        this.held_by_pokemon = held_by_pokemon;
    }

    public EvolutionChain getBaby_trigger_for() {
        return baby_trigger_for;
    }

    public void setBaby_trigger_for(EvolutionChain baby_trigger_for) {
        this.baby_trigger_for = baby_trigger_for;
    }

    public ArrayList<MachineVersionDetail> getMachines() {
        return machines;
    }

    public void setMachines(ArrayList<MachineVersionDetail> machines) {
        this.machines = machines;
    }

	
}