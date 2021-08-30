/* A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released. */

package com.jdm.pokeAPI.entities.games;
/*
{
  "id": 1,
  "name": "generation-i",
  "abilities": [],
  "main_region": {
    "name": "kanto",
    "url": "https://pokeapi.co/api/v2/region/1/"
  },
  "moves": [
    {
      "name": "pound",
      "url": "https://pokeapi.co/api/v2/move/1/"
    }
  ],
  "names": [
    {
      "name": "Generation I",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "pokemon_species": [
    {
      "name": "bulbasaur",
      "url": "https://pokeapi.co/api/v2/pokemon-species/1/"
    }
  ],
  "types": [
    {
      "name": "normal",
      "url": "https://pokeapi.co/api/v2/type/1/"
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

import com.jdm.pokeAPI.entities.locations.Region;
import com.jdm.pokeAPI.entities.moves.Move;
import com.jdm.pokeAPI.entities.pokemon.Ability;
import com.jdm.pokeAPI.entities.pokemon.PokemonSpecies;
import com.jdm.pokeAPI.entities.pokemon.Type;
import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;


public class Generation extends NamedAPIResource {
    // The identifier for this resource.
    private int id;

    // A list of abilities that were introduced in this generation.
    private ArrayList<Ability> abilities;

    // The name of this resource listed in different languages.
    private ArrayList<Name> names;

    // The main region travelled in this generation.
    private Region main_region;

    // A list of moves that were introduced in this generation.
    private ArrayList<Move> moves;

    // A list of Pokémon species that were introduced in this generation.
    private ArrayList<PokemonSpecies> pokemon_species;

    // A list of types that were introduced in this generation.
    private ArrayList<Type> types;

    // A list of version groups that were introduced in this generation.
    private ArrayList<VersionGroup> version_groups;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public Region getMain_region() {
        return main_region;
    }

    public void setMain_region(Region main_region) {
        this.main_region = main_region;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Move> moves) {
        this.moves = moves;
    }

    public ArrayList<PokemonSpecies> getPokemon_species() {
        return pokemon_species;
    }

    public void setPokemon_species(ArrayList<PokemonSpecies> pokemon_species) {
        this.pokemon_species = pokemon_species;
    }

    public ArrayList<Type> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<Type> types) {
        this.types = types;
    }

    public ArrayList<VersionGroup> getVersion_groups() {
        return version_groups;
    }

    public void setVersion_groups(ArrayList<VersionGroup> version_groups) {
        this.version_groups = version_groups;
    }

	
}