package com.jdm.pokeAPI.entities.utility;

import com.jdm.pokeAPI.entities.games.Generation;


public class GenerationGameIndex {
	// The internal id of an API resource within game data.
	private int game_index;

	// The generation relevent to this game index.
	private Generation generation;

    public int getGame_index() {
        return game_index;
    }

    public void setGame_index(int game_index) {
        this.game_index = game_index;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

}