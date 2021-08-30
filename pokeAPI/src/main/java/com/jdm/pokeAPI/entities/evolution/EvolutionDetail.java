/* Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy. */

package com.jdm.pokeAPI.entities.evolution;

import com.jdm.pokeAPI.entities.items.Item;
import com.jdm.pokeAPI.entities.locations.Location;
import com.jdm.pokeAPI.entities.moves.Move;
import com.jdm.pokeAPI.entities.pokemon.PokemonSpecies;
import com.jdm.pokeAPI.entities.pokemon.Type;

/*
{
  "id": 7,
  "baby_trigger_item": null,
  "chain": {
    "is_baby": false,
    "species": {
      "name": "rattata",
      "url": "https://pokeapi.co/api/v2/pokemon-species/19/"
    },
    "evolution_details": null,
    "evolves_to": [
      {
        "is_baby": false,
        "species": {
          "name": "raticate",
          "url": "https://pokeapi.co/api/v2/pokemon-species/20/"
        },
        "evolution_details": [
          {
            "item": null,
            "trigger": {
              "name": "level-up",
              "url": "https://pokeapi.co/api/v2/evolution-trigger/1/"
            },
            "gender": null,
            "held_item": null,
            "known_move": null,
            "known_move_type": null,
            "location": null,
            "min_level": 20,
            "min_happiness": null,
            "min_beauty": null,
            "min_affection": null,
            "needs_overworld_rain": false,
            "party_species": null,
            "party_type": null,
            "relative_physical_stats": null,
            "time_of_day": "",
            "trade_species": null,
            "turn_upside_down": false
          }
        ],
        "evolves_to": []
      }
    ]
  }
}
*/



public class EvolutionDetail {
	// The item required to cause evolution this into Pokémon species.
	private Item item;

	// The type of event that triggers evolution into this Pokémon species.
	private EvolutionTrigger trigger;

	// The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
	private int gender;

	// The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
	private Item held_item;

	// The move that must be known by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
	private Move known_move;

	// The evolving Pokémon species must know a move with this type during the evolution trigger event in order to evolve into this Pokémon species.
	private Type known_move_type;

	// The location the evolution must be triggered at.
	private Location location;

	// The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
	private int min_level;

	// The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
	private int min_happiness;

	// The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
	private int min_beauty;

	// The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
	private int min_affection;

	// Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
	private boolean needs_overworld_rain;

	// The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
	private PokemonSpecies party_species;

	// The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
	private Type party_type;

	// The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
	private int relative_physical_stats;

	// The required time of day. Day or night.
	private String time_of_day;

	// Pokémon species for which this one must be traded.
	private PokemonSpecies trade_species;

	// Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
	private boolean turn_upside_down;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public EvolutionTrigger getTrigger() {
        return trigger;
    }

    public void setTrigger(EvolutionTrigger trigger) {
        this.trigger = trigger;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Item getHeld_item() {
        return held_item;
    }

    public void setHeld_item(Item held_item) {
        this.held_item = held_item;
    }

    public Move getKnown_move() {
        return known_move;
    }

    public void setKnown_move(Move known_move) {
        this.known_move = known_move;
    }

    public Type getKnown_move_type() {
        return known_move_type;
    }

    public void setKnown_move_type(Type known_move_type) {
        this.known_move_type = known_move_type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getMin_level() {
        return min_level;
    }

    public void setMin_level(int min_level) {
        this.min_level = min_level;
    }

    public int getMin_happiness() {
        return min_happiness;
    }

    public void setMin_happiness(int min_happiness) {
        this.min_happiness = min_happiness;
    }

    public int getMin_beauty() {
        return min_beauty;
    }

    public void setMin_beauty(int min_beauty) {
        this.min_beauty = min_beauty;
    }

    public int getMin_affection() {
        return min_affection;
    }

    public void setMin_affection(int min_affection) {
        this.min_affection = min_affection;
    }

    public boolean isNeeds_overworld_rain() {
        return needs_overworld_rain;
    }

    public void setNeeds_overworld_rain(boolean needs_overworld_rain) {
        this.needs_overworld_rain = needs_overworld_rain;
    }

    public PokemonSpecies getParty_species() {
        return party_species;
    }

    public void setParty_species(PokemonSpecies party_species) {
        this.party_species = party_species;
    }

    public Type getParty_type() {
        return party_type;
    }

    public void setParty_type(Type party_type) {
        this.party_type = party_type;
    }

    public int getRelative_physical_stats() {
        return relative_physical_stats;
    }

    public void setRelative_physical_stats(int relative_physical_stats) {
        this.relative_physical_stats = relative_physical_stats;
    }

    public String getTime_of_day() {
        return time_of_day;
    }

    public void setTime_of_day(String time_of_day) {
        this.time_of_day = time_of_day;
    }

    public PokemonSpecies getTrade_species() {
        return trade_species;
    }

    public void setTrade_species(PokemonSpecies trade_species) {
        this.trade_species = trade_species;
    }

    public boolean isTurn_upside_down() {
        return turn_upside_down;
    }

    public void setTurn_upside_down(boolean turn_upside_down) {
        this.turn_upside_down = turn_upside_down;
    }

	
}