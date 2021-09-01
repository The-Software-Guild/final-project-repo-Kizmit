/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jdm.pokeAPI.service;

import com.jdm.pokeAPI.dao.PokemonTeamDao;
import com.jdm.pokeAPI.entities.pokemon.Pokemon;
import com.jdm.pokeAPI.entities.pokemon.PokemonSpecies;
import com.jdm.pokeAPI.entities.pokemon.PokemonStat;
import com.jdm.pokeAPI.entities.team.Team;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Joe McAdams
 * @email joedmcadams@gmail.com
 * 
 */

@Component
public class PokemonBattleService {
    @Autowired
    PokemonTeamDao pokeTeamDao;
    @Autowired
    RestTemplate restTemplate;
    
    public void setupBattleInfo(int team1Id, int team2Id, RedirectAttributes redirectAttributes) {
        Team team1 = pokeTeamDao.getTeamById(team1Id);
        Team team2 = pokeTeamDao.getTeamById(team2Id);
        
        redirectAttributes.addAttribute("team1Name", team1.getName());
        redirectAttributes.addAttribute("team2Name", team2.getName());
        redirectAttributes.addAttribute("team1Description", team1.getDescription());
        redirectAttributes.addAttribute("team2Description", team2.getDescription());
        
        List<String> team1Pokemon = new ArrayList<>();
        List<String> team2Pokemon = new ArrayList<>();

        team1.getPokemon().forEach(pokemon -> {
            team1Pokemon.add(pokemon.getName());
        });        
        team2.getPokemon().forEach(pokemon -> {
            team2Pokemon.add(pokemon.getName());
        });
        
        
        List<Pokemon> team1PokemonObj = new ArrayList<>();
        List<Pokemon> team2PokemonObj = new ArrayList<>();
        
        List<String> team1Sprites = new ArrayList<>();
        List<String> team2Sprites = new ArrayList<>();
        
        List<Integer> team1StatValues = new ArrayList<>();
        List<Integer> team2StatValues = new ArrayList<>();

        team1Pokemon.forEach(name -> {
           team1PokemonObj.add(restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/" + name.toLowerCase(), Pokemon.class));
        });
        
        team2Pokemon.forEach(name -> {
           team2PokemonObj.add(restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/" + name.toLowerCase(), Pokemon.class));
        });

        team1PokemonObj.forEach(pokemon -> {
            team1Sprites.add(pokemon.getSprites().getFront_default());
            pokemon.getStats().forEach(stat -> {
                team1StatValues.add(stat.getBase_stat());
            });
        });
        team2PokemonObj.forEach(pokemon -> {
            team2Sprites.add(pokemon.getSprites().getFront_default());
            pokemon.getStats().forEach(stat -> {
                team2StatValues.add(stat.getBase_stat());
            });
        });
        
        Integer team1StatSum = team1StatValues.stream().mapToInt(Integer::intValue).sum();
        Integer team2StatSum = team2StatValues.stream().mapToInt(Integer::intValue).sum();

        redirectAttributes.addAttribute("team1Sprites", team1Sprites);
        redirectAttributes.addAttribute("team2Sprites", team2Sprites);
        redirectAttributes.addAttribute("team1StatTotal", String.valueOf(team1StatSum));
        redirectAttributes.addAttribute("team2StatTotal", String.valueOf(team2StatSum));
        
        String winner="";
        
        if(team1StatSum > team2StatSum){
            winner = team1.getName() + " wins!";
        }
        else if(team1StatSum.equals(team2StatSum)){
            winner = "It's a draw!";
        }
        else{
            winner = team2.getName() + " wins!";
        }
        
        redirectAttributes.addAttribute("winner", winner);
    }

}
