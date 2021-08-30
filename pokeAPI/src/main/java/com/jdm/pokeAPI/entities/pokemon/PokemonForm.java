/* Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety. */

package com.jdm.pokeAPI.entities.pokemon;
/*
{
  "id": 413,
  "name": "wormadam-plant",
  "order": 503,
  "form_order": 1,
  "is_default": true,
  "is_battle_only": false,
  "is_mega": false,
  "form_name": "plant",
  "pokemon": {
    "name": "wormadam-plant",
    "url": "https://pokeapi.co/api/v2/pokemon/413/"
  },
  "sprites": {
    "back_default": "http://pokeapi.co/media/sprites/pokemon/back/413.png",
    "back_shiny": "http://pokeapi.co/media/sprites/pokemon/back/shiny/413.png",
    "front_default": "http://pokeapi.co/media/sprites/pokemon/413.png",
    "front_shiny": "http://pokeapi.co/media/sprites/pokemon/shiny/413.png"
  },
  "version_group": {
    "name": "diamond-pearl",
    "url": "https://pokeapi.co/api/v2/version-group/8/"
  }
}
*/

import com.jdm.pokeAPI.entities.games.VersionGroup;
import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class PokemonForm extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
	private int order;

	// The order in which forms should be sorted within a species' forms.
	private int form_order;

	// True for exactly one form used as the default for each Pokémon.
	private boolean is_default;

	// Whether or not this form can only happen during battle.
	private boolean is_battle_only;

	// Whether or not this form requires mega evolution.
	private boolean is_mega;

	// The name of this form.
	private String form_name;

	// The Pokémon that can take on this form.
	private Pokemon pokemon;

	// A set of sprites used to depict this Pokémon form in the game.
	private PokemonFormSprites sprites;

	// The version group this Pokémon form was introduced in.
	private VersionGroup version_group;

	// The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
	private ArrayList<Name> names;

	// The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
	private ArrayList<Name> form_names;

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

    public int getForm_order() {
        return form_order;
    }

    public void setForm_order(int form_order) {
        this.form_order = form_order;
    }

    public boolean isIs_default() {
        return is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public boolean isIs_battle_only() {
        return is_battle_only;
    }

    public void setIs_battle_only(boolean is_battle_only) {
        this.is_battle_only = is_battle_only;
    }

    public boolean isIs_mega() {
        return is_mega;
    }

    public void setIs_mega(boolean is_mega) {
        this.is_mega = is_mega;
    }

    public String getForm_name() {
        return form_name;
    }

    public void setForm_name(String form_name) {
        this.form_name = form_name;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public PokemonFormSprites getSprites() {
        return sprites;
    }

    public void setSprites(PokemonFormSprites sprites) {
        this.sprites = sprites;
    }

    public VersionGroup getVersion_group() {
        return version_group;
    }

    public void setVersion_group(VersionGroup version_group) {
        this.version_group = version_group;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public ArrayList<Name> getForm_names() {
        return form_names;
    }

    public void setForm_names(ArrayList<Name> form_names) {
        this.form_names = form_names;
    }

	
}