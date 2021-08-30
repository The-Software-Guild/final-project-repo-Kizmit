package com.jdm.pokeAPI.entities.utility;

import com.jdm.pokeAPI.entities.games.Version;


public class VersionGameIndex {
	// The internal id of an API resource within game data.
	private int game_index;

	// The version relevent to this game index.
	private Version version;

    public int getGame_index() {
        return game_index;
    }

    public void setGame_index(int game_index) {
        this.game_index = game_index;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

	
}