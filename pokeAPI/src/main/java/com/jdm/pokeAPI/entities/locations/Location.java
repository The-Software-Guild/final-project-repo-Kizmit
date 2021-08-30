/* Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes. */

package com.jdm.pokeAPI.entities.locations;
/*
{
  "id": 1,
  "name": "canalave-city",
  "region": {
    "name": "sinnoh",
    "url": "https://pokeapi.co/api/v2/region/4/"
  },
  "names": [
    {
      "name": "Canalave City",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "game_indices": [
    {
      "game_index": 7,
      "generation": {
        "name": "generation-iv",
        "url": "https://pokeapi.co/api/v2/generation/4/"
      }
    }
  ],
  "areas": [
    {
      "name": "canalave-city-area",
      "url": "https://pokeapi.co/api/v2/location-area/1/"
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.utility.GenerationGameIndex;
import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class Location extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The region this location can be found in.
	private Region region;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of game indices relevent to this location by generation.
	private ArrayList<GenerationGameIndex> game_indices;

	// Areas that can be found within this location.
	private ArrayList<LocationArea> areas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public ArrayList<GenerationGameIndex> getGame_indices() {
        return game_indices;
    }

    public void setGame_indices(ArrayList<GenerationGameIndex> game_indices) {
        this.game_indices = game_indices;
    }

    public ArrayList<LocationArea> getAreas() {
        return areas;
    }

    public void setAreas(ArrayList<LocationArea> areas) {
        this.areas = areas;
    }

	
}