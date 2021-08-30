/* Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles. */

package com.jdm.pokeAPI.entities.pokemon;

import com.jdm.pokeAPI.entities.moves.Move;


public class MoveStatAffect {
	// The maximum amount of change to the referenced stat.
	private int change;

	// The move causing the change.
	private Move move;

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }


}