/* A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them. */

package com.jdm.pokeAPI.entities.locations;
/*
{
  "id": 1,
  "name": "kanto",
  "locations": [
    {
      "name": "celadon-city",
      "url": "https://pokeapi.co/api/v2/location/67/"
    }
  ],
  "main_generation": {
    "name": "generation-i",
    "url": "https://pokeapi.co/api/v2/generation/1/"
  },
  "names": [
    {
      "name": "Kanto",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "pokedexes": [
    {
      "name": "kanto",
      "url": "https://pokeapi.co/api/v2/pokedex/2/"
    }
  ],
  "version_groups": [
    {
      "name": "red-blue",
      "url": "https://pokeapi.co/api/v2/version-group/1/"
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.games.Generation;
import com.jdm.pokeAPI.entities.games.Pokedex;
import com.jdm.pokeAPI.entities.games.VersionGroup;
import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;


public class Region extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A list of locations that can be found in this region.
	private ArrayList<Location> locations;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// The generation this region was introduced in.
	private Generation main_generation;

	// A list of pokédexes that catalogue Pokémon in this region.
	private ArrayList<Pokedex> pokedexes;

	// A list of version groups where this region can be visited.
	private ArrayList<VersionGroup> version_groups;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public Generation getMain_generation() {
        return main_generation;
    }

    public void setMain_generation(Generation main_generation) {
        this.main_generation = main_generation;
    }

    public ArrayList<Pokedex> getPokedexes() {
        return pokedexes;
    }

    public void setPokedexes(ArrayList<Pokedex> pokedexes) {
        this.pokedexes = pokedexes;
    }

    public ArrayList<VersionGroup> getVersion_groups() {
        return version_groups;
    }

    public void setVersion_groups(ArrayList<VersionGroup> version_groups) {
        this.version_groups = version_groups;
    }

	
}