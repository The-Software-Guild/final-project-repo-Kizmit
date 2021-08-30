/* Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against. */

package com.jdm.pokeAPI.entities.pokemon;

import java.util.ArrayList;

public class TypeRelations {
	// A list of types this type has no effect on.
	private ArrayList<Type> no_damage_to;

	// A list of types this type is not very effect against.
	private ArrayList<Type> half_damage_to;

	// A list of types this type is very effect against.
	private ArrayList<Type> double_damage_to;

	// A list of types that have no effect on this type.
	private ArrayList<Type> no_damage_from;

	// A list of types that are not very effective against this type.
	private ArrayList<Type> half_damage_from;

	// A list of types that are very effective against this type.
	private ArrayList<Type> double_damage_from;

    public ArrayList<Type> getNo_damage_to() {
        return no_damage_to;
    }

    public void setNo_damage_to(ArrayList<Type> no_damage_to) {
        this.no_damage_to = no_damage_to;
    }

    public ArrayList<Type> getHalf_damage_to() {
        return half_damage_to;
    }

    public void setHalf_damage_to(ArrayList<Type> half_damage_to) {
        this.half_damage_to = half_damage_to;
    }

    public ArrayList<Type> getDouble_damage_to() {
        return double_damage_to;
    }

    public void setDouble_damage_to(ArrayList<Type> double_damage_to) {
        this.double_damage_to = double_damage_to;
    }

    public ArrayList<Type> getNo_damage_from() {
        return no_damage_from;
    }

    public void setNo_damage_from(ArrayList<Type> no_damage_from) {
        this.no_damage_from = no_damage_from;
    }

    public ArrayList<Type> getHalf_damage_from() {
        return half_damage_from;
    }

    public void setHalf_damage_from(ArrayList<Type> half_damage_from) {
        this.half_damage_from = half_damage_from;
    }

    public ArrayList<Type> getDouble_damage_from() {
        return double_damage_from;
    }

    public void setDouble_damage_from(ArrayList<Type> double_damage_from) {
        this.double_damage_from = double_damage_from;
    }

	
}