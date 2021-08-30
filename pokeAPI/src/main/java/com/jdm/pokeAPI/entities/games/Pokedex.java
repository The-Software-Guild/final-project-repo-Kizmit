/* A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.games;
/*
{
  "id": 2,
  "name": "kanto",
  "is_main_series": true,
  "descriptions": [
    {
      "description": "Rot/Blau/Gelb Kanto Dex",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "names": [
    {
      "name": "Kanto",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "pokemon_entries": [
    {
      "entry_number": 1,
      "pokemon_species": {
        "name": "bulbasaur",
        "url": "https://pokeapi.co/api/v2/pokemon-species/1/"
      }
    }
  ],
  "region": {
    "name": "kanto",
    "url": "https://pokeapi.co/api/v2/region/1/"
  },
  "version_groups": [
    {
      "name": "red-blue",
      "url": "https://pokeapi.co/api/v2/version-group/1/"
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.locations.Region;
import com.jdm.pokeAPI.entities.utility.Description;
import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class Pokedex extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// Whether or not this Pokédex originated in the main series of the video games.
	private boolean is_main_series;

	// The description of this resource listed in different languages.
	private ArrayList<Description> descriptions;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of Pokémon catalogued in this Pokédex and their indexes.
	private ArrayList<PokemonEntry> pokemon_entries;

	// The region this Pokédex catalogues Pokémon for.
	private Region region;

	// A list of version groups this Pokédex is relevant to.
	private ArrayList<VersionGroup> version_groups;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIs_main_series() {
        return is_main_series;
    }

    public void setIs_main_series(boolean is_main_series) {
        this.is_main_series = is_main_series;
    }

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(ArrayList<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public ArrayList<PokemonEntry> getPokemon_entries() {
        return pokemon_entries;
    }

    public void setPokemon_entries(ArrayList<PokemonEntry> pokemon_entries) {
        this.pokemon_entries = pokemon_entries;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public ArrayList<VersionGroup> getVersion_groups() {
        return version_groups;
    }

    public void setVersion_groups(ArrayList<VersionGroup> version_groups) {
        this.version_groups = version_groups;
    }

	
}