/* Shapes used for sorting Pokémon in a Pokédex. */

package com.jdm.pokeAPI.entities.pokemon;

import com.jdm.pokeAPI.entities.utility.Language;

/*
{
  "id": 1,
  "name": "ball",
  "awesome_names": [
    {
      "awesome_name": "Pomaceous",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "names": [
    {
      "name": "Ball",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "pokemon_species": [
    {
      "name": "shellder",
      "url": "https://pokeapi.co/api/v2/pokemon-species/90/"
    }
  ]
}
*/


public class AwesomeName {
	// The localized "scientific" name for an API resource in a specific language.
	private String awesome_name;

	// The language this "scientific" name is in.
	private Language language;

    public String getAwesome_name() {
        return awesome_name;
    }

    public void setAwesome_name(String awesome_name) {
        this.awesome_name = awesome_name;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

	
}