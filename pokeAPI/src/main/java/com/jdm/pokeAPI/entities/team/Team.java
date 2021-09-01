/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jdm.pokeAPI.entities.team;

import com.jdm.pokeAPI.entities.pokemon.PokemonDb;
import java.util.List;

/**
 *
 * @author Joe McAdams
 * @email joedmcadams@gmail.com
 * 
 */
public class Team {
    private int id;
    private String name, description;
    private List<PokemonDb> pokemon;

    public List<PokemonDb> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<PokemonDb> pokemon) {
        this.pokemon = pokemon;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
