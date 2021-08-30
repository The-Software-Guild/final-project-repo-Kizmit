/* Contest effects refer to the effects of moves when used in contests. */

package com.jdm.pokeAPI.entities.contests;
/*
{
  "id": 1,
  "appeal": 4,
  "jam": 0,
  "effect_entries": [
    {
      "effect": "Gives a high number of appeal points wth no other effects.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "flavor_text_entries": [
    {
      "flavor_text": "A highly appealing move.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.utility.APIResource;
import com.jdm.pokeAPI.entities.utility.Effect;
import com.jdm.pokeAPI.entities.utility.FlavorText;
import java.util.ArrayList;


public class ContestEffect extends APIResource {
    // The identifier for this resource.
    private int id;

    // The base number of hearts the user of this move gets.
    private int appeal;

    // The base number of hearts the user's opponent loses.
    private int jam;

    // The result of this contest effect listed in different languages.
    private ArrayList<Effect> effect_entries;

    // The flavor text of this contest effect listed in different languages.
    private ArrayList<FlavorText> flavor_text_entries;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAppeal() {
        return appeal;
    }

    public void setAppeal(int appeal) {
        this.appeal = appeal;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public ArrayList<Effect> getEffect_entries() {
        return effect_entries;
    }

    public void setEffect_entries(ArrayList<Effect> effect_entries) {
        this.effect_entries = effect_entries;
    }

    public ArrayList<FlavorText> getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public void setFlavor_text_entries(ArrayList<FlavorText> flavor_text_entries) {
        this.flavor_text_entries = flavor_text_entries;
    }

	
}