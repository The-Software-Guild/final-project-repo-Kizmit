/* Natures influence how a Pokémon's stats grow. See Bulbapedia for greater detail. */

package com.jdm.pokeAPI.entities.pokemon;

import com.jdm.pokeAPI.entities.berries.BerryFlavor;
import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class Nature extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// The stat decreased by 10% in Pokémon with this nature.
	private Stat decreased_stat;

	// The stat increased by 10% in Pokémon with this nature.
	private Stat increased_stat;

	// The flavor hated by Pokémon with this nature.
	private BerryFlavor hates_flavor;

	// The flavor liked by Pokémon with this nature.
	private BerryFlavor likes_flavor;

	// A list of Pokéathlon stats this nature effects and how much it effects them.
	private ArrayList<NatureStatChange> pokeathlon_stat_changes;

	// A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
	private ArrayList<MoveBattleStylePreference> move_battle_style_preferences;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Stat getDecreased_stat() {
        return decreased_stat;
    }

    public void setDecreased_stat(Stat decreased_stat) {
        this.decreased_stat = decreased_stat;
    }

    public Stat getIncreased_stat() {
        return increased_stat;
    }

    public void setIncreased_stat(Stat increased_stat) {
        this.increased_stat = increased_stat;
    }

    public BerryFlavor getHates_flavor() {
        return hates_flavor;
    }

    public void setHates_flavor(BerryFlavor hates_flavor) {
        this.hates_flavor = hates_flavor;
    }

    public BerryFlavor getLikes_flavor() {
        return likes_flavor;
    }

    public void setLikes_flavor(BerryFlavor likes_flavor) {
        this.likes_flavor = likes_flavor;
    }

    public ArrayList<NatureStatChange> getPokeathlon_stat_changes() {
        return pokeathlon_stat_changes;
    }

    public void setPokeathlon_stat_changes(ArrayList<NatureStatChange> pokeathlon_stat_changes) {
        this.pokeathlon_stat_changes = pokeathlon_stat_changes;
    }

    public ArrayList<MoveBattleStylePreference> getMove_battle_style_preferences() {
        return move_battle_style_preferences;
    }

    public void setMove_battle_style_preferences(ArrayList<MoveBattleStylePreference> move_battle_style_preferences) {
        this.move_battle_style_preferences = move_battle_style_preferences;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

	
}