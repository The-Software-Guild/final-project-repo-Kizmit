/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jdm.pokeAPI.controllers;




import com.jdm.pokeAPI.entities.pokemon.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Joe McAdams
 * @email joedmcadams@gmail.com
 * 
 */
@Controller
public class PokemonController {
    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("searchPokemon")
    public String findPokemon(){
        return "searchPokemon";
    }
    
    @PostMapping("searchPokemon")
    public String showPokeInfo(Model model,
                               @ModelAttribute("pokemonName") String name){
        Pokemon pokemon = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/" + name.toLowerCase(), Pokemon.class);
        model.addAttribute("pokemon", pokemon);
        return "searchPokemon";
    }
}
