/* Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles. */

package com.jdm.pokeAPI.entities.pokemon;

import com.jdm.pokeAPI.entities.moves.MoveDamageClass;
import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class Stat extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// ID the games use for this stat.
	private int game_index;

	// Whether this stat only exists within a battle.
	private boolean is_battle_only;

	// A detail of moves which affect this stat positively or negatively.
	private MoveStatAffectSets affecting_moves;

	// A detail of natures which affect this stat positively or negatively.
	private NatureStatAffectSets affecting_natures;

	// A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
	private ArrayList<Characteristic> characteristics;

	// The class of damage this stat is directly related to.
	private MoveDamageClass move_damage_class;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGame_index() {
        return game_index;
    }

    public void setGame_index(int game_index) {
        this.game_index = game_index;
    }

    public boolean isIs_battle_only() {
        return is_battle_only;
    }

    public void setIs_battle_only(boolean is_battle_only) {
        this.is_battle_only = is_battle_only;
    }

    public MoveStatAffectSets getAffecting_moves() {
        return affecting_moves;
    }

    public void setAffecting_moves(MoveStatAffectSets affecting_moves) {
        this.affecting_moves = affecting_moves;
    }

    public NatureStatAffectSets getAffecting_natures() {
        return affecting_natures;
    }

    public void setAffecting_natures(NatureStatAffectSets affecting_natures) {
        this.affecting_natures = affecting_natures;
    }

    public ArrayList<Characteristic> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(ArrayList<Characteristic> characteristics) {
        this.characteristics = characteristics;
    }

    public MoveDamageClass getMove_damage_class() {
        return move_damage_class;
    }

    public void setMove_damage_class(MoveDamageClass move_damage_class) {
        this.move_damage_class = move_damage_class;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

	
}