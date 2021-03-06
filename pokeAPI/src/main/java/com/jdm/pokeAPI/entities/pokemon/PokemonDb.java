/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jdm.pokeAPI.entities.pokemon;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 *
 * @author Joe McAdams
 * @email joedmcadams@gmail.com
 * 
 */
public class PokemonDb {
    private int id;
    
    @NotBlank(message = "Must enter a name for the pokemon")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Must enter a valid pokemon name")
    private String name;
    
    private String note;



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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
}
