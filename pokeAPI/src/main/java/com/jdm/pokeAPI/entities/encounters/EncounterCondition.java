/* Conditions which affect what pokemon might appear in the wild, e.g., day or night. */

package com.jdm.pokeAPI.entities.encounters;
/*
{
  "id": 1,
  "name": "swarm",
  "values": [
    {
      "name": "swarm-yes",
      "url": "https://pokeapi.co/api/v2/encounter-condition-value/1/"
    },
    {
      "name": "swarm-no",
      "url": "https://pokeapi.co/api/v2/encounter-condition-value/2/"
    }
  ],
  "names": [
    {
      "name": "Schwarm",
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



public class EncounterCondition extends NamedAPIResource {
    // The identifier for this resource.
    private int id;

    // The name of this resource listed in different languages.
    private ArrayList<Name> names;

    // A list of possible values for this encounter condition.
    private ArrayList<EncounterConditionValue> values;

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

    public ArrayList<EncounterConditionValue> getValues() {
        return values;
    }

    public void setValues(ArrayList<EncounterConditionValue> values) {
        this.values = values;
    }

	
}