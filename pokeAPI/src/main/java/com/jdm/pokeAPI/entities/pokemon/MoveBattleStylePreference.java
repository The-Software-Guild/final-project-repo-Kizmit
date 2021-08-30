/* Natures influence how a Pokémon's stats grow. See Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.pokemon;

import com.jdm.pokeAPI.entities.moves.MoveBattleStyle;



public class MoveBattleStylePreference {
	// Chance of using the move, in percent, if HP is under one half.
	private int low_hp_preference;

	// Chance of using the move, in percent, if HP is over one half.
	private int high_hp_preference;

	// The move battle style.
	private MoveBattleStyle move_battle_style;

    public int getLow_hp_preference() {
        return low_hp_preference;
    }

    public void setLow_hp_preference(int low_hp_preference) {
        this.low_hp_preference = low_hp_preference;
    }

    public int getHigh_hp_preference() {
        return high_hp_preference;
    }

    public void setHigh_hp_preference(int high_hp_preference) {
        this.high_hp_preference = high_hp_preference;
    }

    public MoveBattleStyle getMove_battle_style() {
        return move_battle_style;
    }

    public void setMove_battle_style(MoveBattleStyle move_battle_style) {
        this.move_battle_style = move_battle_style;
    }

	
}