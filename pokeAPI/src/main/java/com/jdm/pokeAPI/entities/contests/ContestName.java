/* Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.contests;

import com.jdm.pokeAPI.entities.utility.Language;

/*
{
  "id": 1,
  "name": "cool",
  "berry_flavor": {
    "name": "spicy",
    "url": "https://pokeapi.co/api/v2/berry-flavor/1/"
  },
  "names": [
    {
      "name": "Cool",
      "color": "Red",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/



public class ContestName {
	// The name for this contest.
	private String name;

	// The color associated with this contest's name.
	private String color;

	// The language that this name is in.
	private Language language;

	public String getName(){
            return name;
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
        
}