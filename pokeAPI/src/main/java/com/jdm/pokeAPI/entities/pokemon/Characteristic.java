/* Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.pokemon;

import com.jdm.pokeAPI.entities.utility.APIResource;

/*
{
  "id": 1,
  "gene_modulo": 0,
  "possible_values": [
    0,
    5,
    10,
    15,
    20,
    25,
    30
  ],
  "highest_stat": {
    "name": "hp",
    "url": "https://pokeapi.co/api/v2/stat/1/"
  },
  "descriptions": [
    {
      "description": "Loves to eat",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/



public class Characteristic extends APIResource {
	// The identifier for this resource.
	private int id;

	// The remainder of the highest stat/IV divided by 5.
	private int gene_modulo;

	// The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
	private int possible_values;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGene_modulo() {
        return gene_modulo;
    }

    public void setGene_modulo(int gene_modulo) {
        this.gene_modulo = gene_modulo;
    }

    public int getPossible_values() {
        return possible_values;
    }

    public void setPossible_values(int possible_values) {
        this.possible_values = possible_values;
    }

	
}