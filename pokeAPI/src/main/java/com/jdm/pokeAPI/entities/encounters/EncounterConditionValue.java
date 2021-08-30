/* Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night. */

package com.jdm.pokeAPI.entities.encounters;
/*
{
  "id": 1,
  "name": "swarm-yes",
  "condition": {
    "name": "swarm",
    "url": "https://pokeapi.co/api/v2/encounter-condition/1/"
  },
  "names": [
    {
      "name": "WÃ¤hrend eines Schwarms",
      "language": {
        "name": "de",
        "url": "https://pokeapi.co/api/v2/language/6/"
      }
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class EncounterConditionValue extends NamedAPIResource {
    // The identifier for this resource.
    private int id;

    // The condition this encounter condition value pertains to.
    private EncounterCondition condition;

    // The name of this resource listed in different languages.
    private ArrayList<Name> names;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EncounterCondition getCondition() {
        return condition;
    }

    public void setCondition(EncounterCondition condition) {
        this.condition = condition;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

	
}