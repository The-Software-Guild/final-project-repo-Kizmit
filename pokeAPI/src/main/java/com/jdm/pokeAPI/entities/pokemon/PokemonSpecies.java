/* A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant. */

package com.jdm.pokeAPI.entities.pokemon;
/*
{
  "id": 413,
  "name": "wormadam",
  "order": 441,
  "gender_rate": 8,
  "capture_rate": 45,
  "base_happiness": 70,
  "is_baby": false,
  "hatch_counter": 15,
  "has_gender_differences": false,
  "forms_switchable": false,
  "growth_rate": {
    "name": "medium",
    "url": "https://pokeapi.co/api/v2/growth-rate/2/"
  },
  "pokedex_numbers": [
    {
      "entry_number": 45,
      "pokedex": {
        "name": "kalos-central",
        "url": "https://pokeapi.co/api/v2/pokedex/12/"
      }
    }
  ],
  "egg_groups": [
    {
      "name": "bug",
      "url": "https://pokeapi.co/api/v2/egg-group/3/"
    }
  ],
  "color": {
    "name": "gray",
    "url": "https://pokeapi.co/api/v2/pokemon-color/4/"
  },
  "shape": {
    "name": "squiggle",
    "url": "https://pokeapi.co/api/v2/pokemon-shape/2/"
  },
  "evolves_from_species": {
    "name": "burmy",
    "url": "https://pokeapi.co/api/v2/pokemon-species/412/"
  },
  "evolution_chain": {
    "url": "https://pokeapi.co/api/v2/evolution-chain/213/"
  },
  "habitat": null,
  "generation": {
    "name": "generation-iv",
    "url": "https://pokeapi.co/api/v2/generation/4/"
  },
  "names": [
    {
      "name": "Wormadam",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "flavor_text_entries": [
    {
      "flavor_text": "When the bulb on\nits back grows\nlarge, it appears\fto lose the\nability to stand\non its hind legs.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      },
      "version": {
        "name": "red",
        "url": "https://pokeapi.co/api/v2/version/1/"
      }
    }
  ],
  "form_descriptions": [
    {
      "description": "Forms have different stats and movepools.  During evolution, Burmy's current cloak becomes Wormadam's form, and can no longer be changed.",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "genera": [
    {
      "genus": "Bagworm",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ],
  "varieties": [
    {
      "is_default": true,
      "pokemon": {
        "name": "wormadam-plant",
        "url": "https://pokeapi.co/api/v2/pokemon/413/"
      }
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.evolution.EvolutionChain;
import com.jdm.pokeAPI.entities.games.Generation;
import com.jdm.pokeAPI.entities.utility.Description;
import com.jdm.pokeAPI.entities.utility.FlavorText;
import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;


public class PokemonSpecies extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
	private int order;

	// The chance of this Pokémon being female, in eighths; or -1 for genderless.
	private int gender_rate;

	// The base capture rate; up to 255. The higher the number, the easier the catch.
	private int capture_rate;

	// The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
	private int base_happiness;

	// Whether or not this is a baby Pokémon.
	private boolean is_baby;

	// Initial hatch counter: one must walk 255 × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's.
	private int hatch_counter;

	// Whether or not this Pokémon has visual gender differences.
	private boolean has_gender_differences;

	// Whether or not this Pokémon has multiple forms and can switch between them.
	private boolean forms_switchable;

	// The rate at which this Pokémon species gains levels.
	private GrowthRate growth_rate;

	// A list of Pokedexes and the indexes reserved within them for this Pokémon species.
	private ArrayList<PokemonSpeciesDexEntry> pokedex_numbers;

	// A list of egg groups this Pokémon species is a member of.
	private ArrayList<EggGroup> egg_groups;

	// The color of this Pokémon for Pokédex search.
	private PokemonColor color;

	// The shape of this Pokémon for Pokédex search.
	private PokemonShape shape;

	// The Pokémon species that evolves into this Pokemon_species.
	private PokemonSpecies evolves_from_species;

	// The evolution chain this Pokémon species is a member of.
	private EvolutionChain evolution_chain;

	// The habitat this Pokémon species can be encountered in.
	private PokemonHabitat habitat;

	// The generation this Pokémon species was introduced in.
	private Generation generation;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of encounters that can be had with this Pokémon species in pal park.
	private ArrayList<PalParkEncounterArea> pal_park_encounters;

	// A list of flavor text entries for this Pokémon species.
	private ArrayList<FlavorText> flavor_text_entries;

	// Descriptions of different forms Pokémon take on within the Pokémon species.
	private ArrayList<Description> form_descriptions;

	// The genus of this Pokémon species listed in multiple languages.
	private ArrayList<Genus> genera;

	// A list of the Pokémon that exist within this Pokémon species.
	private ArrayList<PokemonSpeciesVariety> varieties;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getGender_rate() {
        return gender_rate;
    }

    public void setGender_rate(int gender_rate) {
        this.gender_rate = gender_rate;
    }

    public int getCapture_rate() {
        return capture_rate;
    }

    public void setCapture_rate(int capture_rate) {
        this.capture_rate = capture_rate;
    }

    public int getBase_happiness() {
        return base_happiness;
    }

    public void setBase_happiness(int base_happiness) {
        this.base_happiness = base_happiness;
    }

    public boolean isIs_baby() {
        return is_baby;
    }

    public void setIs_baby(boolean is_baby) {
        this.is_baby = is_baby;
    }

    public int getHatch_counter() {
        return hatch_counter;
    }

    public void setHatch_counter(int hatch_counter) {
        this.hatch_counter = hatch_counter;
    }

    public boolean isHas_gender_differences() {
        return has_gender_differences;
    }

    public void setHas_gender_differences(boolean has_gender_differences) {
        this.has_gender_differences = has_gender_differences;
    }

    public boolean isForms_switchable() {
        return forms_switchable;
    }

    public void setForms_switchable(boolean forms_switchable) {
        this.forms_switchable = forms_switchable;
    }

    public GrowthRate getGrowth_rate() {
        return growth_rate;
    }

    public void setGrowth_rate(GrowthRate growth_rate) {
        this.growth_rate = growth_rate;
    }

    public ArrayList<PokemonSpeciesDexEntry> getPokedex_numbers() {
        return pokedex_numbers;
    }

    public void setPokedex_numbers(ArrayList<PokemonSpeciesDexEntry> pokedex_numbers) {
        this.pokedex_numbers = pokedex_numbers;
    }

    public ArrayList<EggGroup> getEgg_groups() {
        return egg_groups;
    }

    public void setEgg_groups(ArrayList<EggGroup> egg_groups) {
        this.egg_groups = egg_groups;
    }

    public PokemonColor getColor() {
        return color;
    }

    public void setColor(PokemonColor color) {
        this.color = color;
    }

    public PokemonShape getShape() {
        return shape;
    }

    public void setShape(PokemonShape shape) {
        this.shape = shape;
    }

    public PokemonSpecies getEvolves_from_species() {
        return evolves_from_species;
    }

    public void setEvolves_from_species(PokemonSpecies evolves_from_species) {
        this.evolves_from_species = evolves_from_species;
    }

    public EvolutionChain getEvolution_chain() {
        return evolution_chain;
    }

    public void setEvolution_chain(EvolutionChain evolution_chain) {
        this.evolution_chain = evolution_chain;
    }

    public PokemonHabitat getHabitat() {
        return habitat;
    }

    public void setHabitat(PokemonHabitat habitat) {
        this.habitat = habitat;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public ArrayList<PalParkEncounterArea> getPal_park_encounters() {
        return pal_park_encounters;
    }

    public void setPal_park_encounters(ArrayList<PalParkEncounterArea> pal_park_encounters) {
        this.pal_park_encounters = pal_park_encounters;
    }

    public ArrayList<FlavorText> getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public void setFlavor_text_entries(ArrayList<FlavorText> flavor_text_entries) {
        this.flavor_text_entries = flavor_text_entries;
    }

    public ArrayList<Description> getForm_descriptions() {
        return form_descriptions;
    }

    public void setForm_descriptions(ArrayList<Description> form_descriptions) {
        this.form_descriptions = form_descriptions;
    }

    public ArrayList<Genus> getGenera() {
        return genera;
    }

    public void setGenera(ArrayList<Genus> genera) {
        this.genera = genera;
    }

    public ArrayList<PokemonSpeciesVariety> getVarieties() {
        return varieties;
    }

    public void setVarieties(ArrayList<PokemonSpeciesVariety> varieties) {
        this.varieties = varieties;
    }

	
}