/* Versions of the games, e.g., Red, Blue or Yellow. */

package com.jdm.pokeAPI.entities.games;
/*
{
  "id": 1,
  "name": "red",
  "names": [
    {
      "name": "Rot",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ],
  "version_group": {
    "name": "red-blue",
    "url": "https://pokeapi.co/api/v2/version-group/1/"
  }
}
*/

import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class Version extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// The version group this version belongs to.
	private VersionGroup version_group;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public VersionGroup getVersion_group() {
        return version_group;
    }

    public void setVersion_group(VersionGroup version_group) {
        this.version_group = version_group;
    }

	
}