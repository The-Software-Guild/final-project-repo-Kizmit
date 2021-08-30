/* Version groups categorize highly similar versions of the games. */

package com.jdm.pokeAPI.entities.games;
/*
{
  "id": 1,
  "name": "red-blue",
  "order": 1,
  "generation": {
    "name": "generation-i",
    "url": "https://pokeapi.co/api/v2/generation/1/"
  },
  "move_learn_methods": [
    {
      "name": "level-up",
      "url": "https://pokeapi.co/api/v2/move-learn-method/1/"
    }
  ],
  "pokedexes": [
    {
      "name": "kanto",
      "url": "https://pokeapi.co/api/v2/pokedex/2/"
    }
  ],
  "regions": [
    {
      "name": "kanto",
      "url": "https://pokeapi.co/api/v2/region/1/"
    }
  ],
  "versions": [
    {
      "name": "red",
      "url": "https://pokeapi.co/api/v2/version/1/"
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.locations.Region;
import com.jdm.pokeAPI.entities.moves.MoveLearnMethod;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class VersionGroup extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// Order for sorting. Almost by date of release, except similar versions are grouped together.
	private int order;

	// The generation this version was introduced in.
	private Generation generation;

	// A list of methods in which Pokémon can learn moves in this version group.
	private ArrayList<MoveLearnMethod> move_learn_methods;

	// A list of Pokédexes introduces in this version group.
	private ArrayList<Pokedex> pokedexes;

	// A list of regions that can be visited in this version group.
	private ArrayList<Region> regions;

	// The versions this version group owns.
	private ArrayList<Version> versions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public ArrayList<MoveLearnMethod> getMove_learn_methods() {
        return move_learn_methods;
    }

    public void setMove_learn_methods(ArrayList<MoveLearnMethod> move_learn_methods) {
        this.move_learn_methods = move_learn_methods;
    }

    public ArrayList<Pokedex> getPokedexes() {
        return pokedexes;
    }

    public void setPokedexes(ArrayList<Pokedex> pokedexes) {
        this.pokedexes = pokedexes;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public ArrayList<Version> getVersions() {
        return versions;
    }

    public void setVersions(ArrayList<Version> versions) {
        this.versions = versions;
    }

	
}