/* Methods by which Pokémon can learn moves. */

package com.jdm.pokeAPI.entities.moves;
/*
{
  "id": 1,
  "name": "level-up",
  "names": [
    {
      "name": "Level up",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "descriptions": [
    {
      "description": "Wird gelernt, wenn ein Pokémon ein bestimmtes Level erreicht.",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
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

import com.jdm.pokeAPI.entities.games.VersionGroup;
import com.jdm.pokeAPI.entities.utility.Description;
import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class MoveLearnMethod extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The description of this resource listed in different languages.
	private ArrayList<Description> descriptions;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of version groups where moves can be learned through this method.
	private ArrayList<VersionGroup> version_groups;

	
}