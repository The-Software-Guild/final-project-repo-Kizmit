/* Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their nature. Check out Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.berries;
/*
{
  "id": 1,
  "name": "spicy",
  "berries": [
    {
      "potency": 10,
      "berry": {
        "name": "rowap",
        "url": "https://pokeapi.co/api/v2/berry/64/"
      }
    }
  ],
  "contest_type": {
    "name": "cool",
    "url": "https://pokeapi.co/api/v2/contest-type/1/"
  },
  "names": [
    {
      "name": "Spicy",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

public class FlavorBerryMap {
    // How powerful the referenced flavor is for this berry.
    private int potency;

    // The berry with the referenced flavor.
    private Berry berry;

    public int getPotency() {
        return potency;
    }

    public void setPotency(int potency) {
        this.potency = potency;
    }

    public Berry getBerry() {
        return berry;
    }

    public void setBerry(Berry berry) {
        this.berry = berry;
    }

	
}