/* Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against. */

package com.jdm.pokeAPI.entities.pokemon;

import com.jdm.pokeAPI.entities.games.Generation;
import com.jdm.pokeAPI.entities.moves.Move;
import com.jdm.pokeAPI.entities.moves.MoveDamageClass;
import com.jdm.pokeAPI.entities.utility.GenerationGameIndex;
import com.jdm.pokeAPI.entities.utility.Name;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;


public class Type extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// A detail of how effective this type is toward others and vice versa.
	private TypeRelations damage_relations;

	// A list of game indices relevent to this item by generation.
	private ArrayList<GenerationGameIndex> game_indices;

	// The generation this type was introduced in.
	private Generation generation;

	// The class of damage inflicted by this type.
	private MoveDamageClass move_damage_class;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

	// A list of details of Pokémon that have this type.
	private ArrayList<TypePokemon> pokemon;

	// A list of moves that have this type.
	private ArrayList<Move> moves;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeRelations getDamage_relations() {
        return damage_relations;
    }

    public void setDamage_relations(TypeRelations damage_relations) {
        this.damage_relations = damage_relations;
    }

    public ArrayList<GenerationGameIndex> getGame_indices() {
        return game_indices;
    }

    public void setGame_indices(ArrayList<GenerationGameIndex> game_indices) {
        this.game_indices = game_indices;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
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

    public ArrayList<TypePokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(ArrayList<TypePokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Move> moves) {
        this.moves = moves;
    }

	
}