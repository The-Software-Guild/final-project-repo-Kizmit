/* Very general categories that loosely group move effects. */

package com.jdm.pokeAPI.entities.moves;
/*
{
  "id": 1,
  "name": "ailment",
  "descriptions": [
    {
      "description": "No damage; inflicts status ailment",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "moves": [
    {
      "name": "sing",
      "url": "https://pokeapi.co/api/v2/move/47/"
    }
  ]
}
*/

import java.util.ArrayList;
import com.jdm.pokeAPI.entities.utility.Description;

public class ModelName {
	// The identifier for this resource.
	private int id;

	// The name for this resource.
	private String name;

	// A list of moves that fall into this category.
	private ArrayList<Move> moves;

	// The description of this resource listed in different languages.
	private ArrayList<Description> descriptions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Move> moves) {
        this.moves = moves;
    }

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(ArrayList<Description> descriptions) {
        this.descriptions = descriptions;
    }

	
}