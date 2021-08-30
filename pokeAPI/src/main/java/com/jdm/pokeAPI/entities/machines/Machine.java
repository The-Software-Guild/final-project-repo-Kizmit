/* Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine. */

package com.jdm.pokeAPI.entities.machines;

import com.jdm.pokeAPI.entities.games.VersionGroup;
import com.jdm.pokeAPI.entities.items.Item;
import com.jdm.pokeAPI.entities.moves.Move;
import com.jdm.pokeAPI.entities.utility.APIResource;

/*
{
  "id": 1,
  "item": {
    "name": "tm01",
    "url": "https://pokeapi.co/api/v2/item/305/"
  },
  "move": {
    "name": "mega-punch",
    "url": "https://pokeapi.co/api/v2/move/5/"
  },
  "version_group": {
    "name": "red-blue",
    "url": "https://pokeapi.co/api/v2/version/1/"
  }
}
*/



public class Machine extends APIResource {
	// The identifier for this resource.
	private int id;

	// The TM or HM item that corresponds to this machine.
	private Item item;

	// The move that is taught by this machine.
	private Move move;

	// The version group that this machine applies to.
	private VersionGroup version_group;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public VersionGroup getVersion_group() {
        return version_group;
    }

    public void setVersion_group(VersionGroup version_group) {
        this.version_group = version_group;
    }

	
}