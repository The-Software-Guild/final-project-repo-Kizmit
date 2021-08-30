/* Damage classes moves can have, e.g. physical, special, or non-damaging. */

package com.jdm.pokeAPI.entities.moves;

import com.jdm.pokeAPI.entities.utility.Description;
import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class MoveDamageClass extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The description of this resource listed in different languages.
	private ArrayList<Description> descriptions;

	// A list of moves that fall into this damage class.
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