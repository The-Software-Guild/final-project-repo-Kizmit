/* Natures influence how a Pokémon's stats grow. See Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.pokemon;

public class NatureStatChange {
	// The amount of change.
	private int max_change;

	// The stat being affected.
	private PokeathlonStat pokeathlon_stat;

    public int getMax_change() {
        return max_change;
    }

    public void setMax_change(int max_change) {
        this.max_change = max_change;
    }

    public PokeathlonStat getPokeathlon_stat() {
        return pokeathlon_stat;
    }

    public void setPokeathlon_stat(PokeathlonStat pokeathlon_stat) {
        this.pokeathlon_stat = pokeathlon_stat;
    }


}