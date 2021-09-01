/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jdm.pokeAPI.entities.team;

import com.jdm.pokeAPI.entities.pokemon.PokemonDb;
import java.util.List;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Size;

/**
 *
 * @author Joe McAdams
 * @email joedmcadams@gmail.com
 * 
 */
public class Team {
    private int id;
    
    @NotBlank(message = "Must enter a name")
    private String name;

    @Size(max = 50, message = "Description must be less than 50 characters")
    private String description;
    
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
