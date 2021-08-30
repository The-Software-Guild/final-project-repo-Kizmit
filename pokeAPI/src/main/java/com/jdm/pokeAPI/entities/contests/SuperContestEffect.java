/* Super contest effects refer to the effects of moves when used in super contests. */

package com.jdm.pokeAPI.entities.contests;
/*
{
  "id": 1,
  "appeal": 2,
  "flavor_text_entries": [
    {
      "flavor_text": "Enables the user to perform first in the next turn.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "moves": [
    {
      "name": "agility",
      "url": "https://pokeapi.co/api/v2/move/97/"
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.moves.Move;
import com.jdm.pokeAPI.entities.utility.APIResource;
import com.jdm.pokeAPI.entities.utility.FlavorText;
import java.util.ArrayList;



public class SuperContestEffect extends APIResource {
    // The identifier for this resource.
    private int id;

    // The level of appeal this super contest effect has.
    private int appeal;

    // The flavor text of this super contest effect listed in different languages.
    private ArrayList<FlavorText> flavor_text_entries;

    // A list of moves that have the effect when used in super contests.
    private ArrayList<Move> moves;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAppeal() {
        return appeal;
    }

    public void setAppeal(int appeal) {
        this.appeal = appeal;
    }

    public ArrayList<FlavorText> getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public void setFlavor_text_entries(ArrayList<FlavorText> flavor_text_entries) {
        this.flavor_text_entries = flavor_text_entries;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Move> moves) {
        this.moves = moves;
    }

	
}