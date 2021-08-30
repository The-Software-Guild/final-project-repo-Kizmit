package com.jdm.pokeAPI.entities.moves;

import com.jdm.pokeAPI.entities.utility.Description;
import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class MoveCategory extends NamedAPIResource {
	// 
	private int id;

	// 
	private ArrayList<Description> descriptions;

	// 
	private ArrayList<Move> moves;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(ArrayList<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Move> moves) {
        this.moves = moves;
    }

	
}