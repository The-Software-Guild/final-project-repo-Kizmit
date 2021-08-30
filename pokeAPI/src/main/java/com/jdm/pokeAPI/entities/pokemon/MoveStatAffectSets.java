/* Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles. */

package com.jdm.pokeAPI.entities.pokemon;

import java.util.ArrayList;

public class MoveStatAffectSets {
	// A list of moves and how they change the referenced stat.
	private ArrayList<MoveStatAffect> increase;

	// A list of moves and how they change the referenced stat.
	private ArrayList<MoveStatAffect> decrease;

    public ArrayList<MoveStatAffect> getIncrease() {
        return increase;
    }

    public void setIncrease(ArrayList<MoveStatAffect> increase) {
        this.increase = increase;
    }

    public ArrayList<MoveStatAffect> getDecrease() {
        return decrease;
    }

    public void setDecrease(ArrayList<MoveStatAffect> decrease) {
        this.decrease = decrease;
    }


}