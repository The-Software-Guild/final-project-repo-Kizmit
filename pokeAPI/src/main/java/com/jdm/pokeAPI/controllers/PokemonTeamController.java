/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jdm.pokeAPI.controllers;

import com.jdm.pokeAPI.entities.team.Team;
import com.jdm.pokeAPI.service.PokemonTeamService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Joe McAdams
 * @email joedmcadams@gmail.com
 * 
 */

@Controller
public class PokemonTeamController {
    
    @Autowired
    private PokemonTeamService pokeTeamService;
    
    
    @PostMapping("createTeam")
    public String createTeam(@ModelAttribute("teamName") String teamName,
                             @ModelAttribute("teamDescription") String teamDescription){
        Team team = pokeTeamService.createNewTeam(teamName, teamDescription);
        return "redirect:/viewTeams";
    }
    
    @GetMapping("viewTeams")
    public String teamView(Model model){
        List<Team> teams = pokeTeamService.getAllTeams();
        model.addAttribute("pokeTeams", teams);
        return "viewTeams";
    }
    
    @GetMapping("addPokemon")
    public String addPokemon(HttpServletRequest request, Model model){
        int id = Integer.parseInt(request.getParameter("id"));
        model.addAttribute("teamId", id);
        return "addPokemon";
    }
    
    @PostMapping("addPokemon")
    public String addPokemon(@ModelAttribute("pokeName") String pokemonName,
                             @ModelAttribute("pokeDescription") String pokemonDescription,
                             @ModelAttribute("teamId") String teamId){ 
        pokeTeamService.addPokemon(pokemonName, pokemonDescription, Integer.parseInt(teamId));
        return "redirect:/viewTeams";
    }
    
    @GetMapping("deleteTeam")
    public String deleteTeam(@ModelAttribute("id") String teamId){
        pokeTeamService.deleteTeam(Integer.parseInt(teamId));
        return "redirect:/viewTeams";
    }
    
    
}
