/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jdm.pokeAPI.controllers;

import com.jdm.pokeAPI.entities.team.Team;
import com.jdm.pokeAPI.service.PokemonBattleService;
import com.jdm.pokeAPI.service.PokemonTeamService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Joe McAdams
 * @email joedmcadams@gmail.com
 * 
 */
@Controller
public class PokemonTeamBattleController {
    
    @Autowired
    private PokemonBattleService pokeBattleService;
    
    @Autowired
    private PokemonTeamService pokeTeamService;
    
    @GetMapping("teamBattleSetup")
    public String teamBattleSetup(Model model){
        List<Team> teams = pokeTeamService.getAllTeams();
        model.addAttribute("teams", teams);
        return "teamBattleSetup";
    }
    
    @PostMapping("teamBattleSetup")
    public String teamBattle(RedirectAttributes redirectAttributes,
                             @RequestParam("team1") int team1Id,
                             @RequestParam("team2") int team2Id){
        pokeBattleService.setupBattleInfo(team1Id, team2Id, redirectAttributes);
        return "redirect:/teamBattle";
    }

    @GetMapping("teamBattle")
    public String teamBattle(@ModelAttribute("team1Name") String team1Name,
                             @ModelAttribute("team2Name") String team2Name,
                             @ModelAttribute("team1Description") String team1Description,
                             @ModelAttribute("team2Description") String team2Description,
                             @ModelAttribute("team1Sprites") List<String> team1Sprites,
                             @ModelAttribute("team2Sprites") List<String> team2Sprites,
                             @ModelAttribute("team1StatTotal") String team1StatSum,
                             @ModelAttribute("team2StatTotal") String team2StatSum,
                             @ModelAttribute("winner") String winner){
        return "teamBattle";
    }
    
}
