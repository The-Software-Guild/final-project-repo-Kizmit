/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jdm.pokeAPI.controllers;




import com.jdm.pokeAPI.service.PokemonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    
    @Autowired
    private PokemonInfoService pokeInfoService;
    @GetMapping("searchPokemon")
    public String findPokemon(){
        return "searchPokemon";
    }
    
    @PostMapping("searchPokemon")
    public String searchPokeInfo(RedirectAttributes redirectAttributes,
                                @ModelAttribute("pokemonName") String name){
        pokeInfoService.setupPokeInfo(restTemplate, name, redirectAttributes);
        return "redirect:/pokeInfo";
    }
    
    @GetMapping("pokeInfo")
    public String showPokeInfo(@ModelAttribute("pokeSpriteFront") String spriteFront,
                               @ModelAttribute("pokeSpriteBack") String spriteBack,
                               @ModelAttribute("pokeName") String pokeName,
                               @ModelAttribute("pokeSpecies") String pokeSpecies){
        return "pokeInfo";
    }
}
