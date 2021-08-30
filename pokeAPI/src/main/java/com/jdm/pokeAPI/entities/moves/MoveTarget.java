/* Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves. */

package com.jdm.pokeAPI.entities.moves;
/*
{
  "id": 1,
  "name": "specific-move",
  "descriptions": [
    {
      "description": "Eine spezifische Fähigkeit. Wie diese Fähigkeit genutzt wird, hängt von den genutzten Fähigkeiten ab.",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "moves": [
    {
      "name": "counter",
      "url": "https://pokeapi.co/api/v2/move/68/"
    }
  ],
  "names": [
    {
      "name": "Spezifische Fähigkeit",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.utility.Description;
import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class MoveTarget extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The description of this resource listed in different languages.
	private ArrayList<Description> descriptions;

	// A list of moves that that are directed at this target.
	private ArrayList<Move> moves;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(ArrayList<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Move> moves) {
        this.moves = moves;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

	
}