/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jdm.pokeAPI.controllers;

import com.jdm.pokeAPI.entities.pokemon.PokemonDb;
import com.jdm.pokeAPI.entities.team.Team;
import com.jdm.pokeAPI.service.PokemonTeamService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
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
public class PokemonTeamController {
    
    Set<ConstraintViolation<Team>> teamViolations = new HashSet<>();
    Set<ConstraintViolation<PokemonDb>> pokeViolations = new HashSet<>();
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private PokemonTeamService pokeTeamService;
    
    
    @PostMapping("createTeam")
    public String createTeam(@ModelAttribute("teamName") String teamName,
                             @ModelAttribute("teamDescription") String teamDescription,
                             Model model){
        teamViolations.clear();
        Team team = pokeTeamService.createNewTeam(teamName, teamDescription);
        
        Validator validate = Validation.buildDefaultValidatorFactory().getValidator();
        teamViolations = validate.validate(team);
        
        
        if(teamViolations.isEmpty()){
            pokeTeamService.addTeam(team);
        }
        return "redirect:/viewTeams";
    }
    
    @GetMapping("viewTeams")
    public String teamView(Model model){
        List<Team> teams = pokeTeamService.getAllTeams();
        model.addAttribute("pokeTeams", teams);
        model.addAttribute("errors", teamViolations);
        return "viewTeams";
    }
    
    @GetMapping("addPokemon")
    public String addPokemon(HttpServletRequest request, Model model){
        model.addAttribute("errors", pokeViolations);
        int id = Integer.parseInt(request.getParameter("id"));
        model.addAttribute("teamId", id);
        return "addPokemon";
    }
    
    @PostMapping("addPokemon")
    public String addPokemon(@ModelAttribute("pokeName") String pokemonName,
                             @ModelAttribute("pokeDescription") String pokemonDescription,
                             @ModelAttribute("teamId") String teamId,
                             Model model
                             ){ 
        
        model.addAttribute("errors", pokeViolations);
     
        PokemonDb pokemon = pokeTeamService.createPokemon(pokemonName, pokemonDescription);

        Validator validate = Validation.buildDefaultValidatorFactory().getValidator();
        pokeViolations = validate.validate(pokemon);      
        
        if(pokeViolations.isEmpty()){
            pokeTeamService.addPokemon(pokemon, Integer.parseInt(teamId));
            pokeViolations.clear();
            return "redirect:/viewTeams";
        }
        else{
            return "addPokemon";
        }
        
        
    }
    
    @GetMapping("deleteTeam")
    public String deleteTeam(@ModelAttribute("id") String teamId){
        pokeTeamService.deleteTeam(Integer.parseInt(teamId));
        return "redirect:/viewTeams";
    }
    
    
}
