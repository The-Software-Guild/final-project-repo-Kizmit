/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jdm.pokeAPI.service;

import com.jdm.pokeAPI.entities.pokemon.Pokemon;
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

    public void setupPokeInfo(RestTemplate restTemplate, String name, RedirectAttributes redirectAttributes) {
        Pokemon pokemon = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/" + name.toLowerCase(), Pokemon.class);
        redirectAttributes.addAttribute("pokeSpriteFront", pokemon.getSprites().getFront_shiny());
        redirectAttributes.addAttribute("pokeSpriteBack", pokemon.getSprites().getBack_shiny());
        redirectAttributes.addAttribute("pokeName", capitalize(pokemon.getName()));
        redirectAttributes.addAttribute("pokeSpecies", capitalize(pokemon.getTypes().get(0).getType().getName()));
    }

}
