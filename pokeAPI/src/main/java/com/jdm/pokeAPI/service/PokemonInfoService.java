/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jdm.pokeAPI.service;

import com.jdm.pokeAPI.entities.pokemon.Pokemon;
import com.jdm.pokeAPI.entities.pokemon.PokemonSpecies;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import static org.springframework.util.StringUtils.capitalize;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Joe McAdams
 * @email joedmcadams@gmail.com
 * 
 */
@Component
public class PokemonInfoService {
    @Autowired
    RestTemplate restTemplate;
    
    public void setupPokeInfo( String name, RedirectAttributes redirectAttributes) {

        Pokemon pokemon = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/" + name.toLowerCase(), Pokemon.class);
        pokemon.setSpecies(restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon-species/"+ name.toLowerCase(), PokemonSpecies.class));
        
        redirectAttributes.addAttribute("pokeSpriteFrontMale", pokemon.getSprites().getFront_shiny());
        redirectAttributes.addAttribute("pokeSpriteBackMale", pokemon.getSprites().getBack_shiny());
        redirectAttributes.addAttribute("pokeSpriteBackFemale", pokemon.getSprites().getBack_shiny_female());
        redirectAttributes.addAttribute("pokeSpriteFrontFemale", pokemon.getSprites().getFront_shiny_female());
        redirectAttributes.addAttribute("pokeGenus", capitalize(pokemon.getSpecies().getGenera().get(7).getGenus())); //English genus at index 7
        if(pokemon.getSpecies().getGender_rate() != -1){
            redirectAttributes.addAttribute("pokeGenderRatio", pokemon.getSpecies().getGender_rate() + "%");
        }
        else{
            redirectAttributes.addAttribute("pokeGenderRatio", "0" + "%");
        }
        redirectAttributes.addAttribute("pokeSpecies", capitalize(pokemon.getSpecies().getName()));
        redirectAttributes.addAttribute("pokeHabitat", capitalize(pokemon.getSpecies().getHabitat().getName()));
        redirectAttributes.addAttribute("pokeWeight", pokemon.getWeight() + " hg");
        redirectAttributes.addAttribute("pokeHeight", pokemon.getHeight() + " dm");
        List<String> stats = new ArrayList<>();
        List<String> types = new ArrayList<>();
        List<String> abilities = new ArrayList<>();
        
        pokemon.getStats().forEach(stat -> {
            stats.add(capitalize(stat.getStat().getName() + ": " + stat.getBase_stat()));
        });
        
        pokemon.getTypes().forEach(type -> {
            types.add(capitalize(type.getType().getName()));
        });
        
        pokemon.getAbilities().forEach(ability -> {
            abilities.add(capitalize(ability.getAbility().getName()));
        });
        
        redirectAttributes.addAttribute("pokeStats", stats);
        redirectAttributes.addAttribute("pokeAbilities", abilities);
        redirectAttributes.addAttribute("pokeTypes", types);
        
    }

}
