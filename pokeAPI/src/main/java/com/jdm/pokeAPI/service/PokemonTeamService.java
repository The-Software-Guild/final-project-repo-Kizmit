/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jdm.pokeAPI.service;

import com.jdm.pokeAPI.dao.PokemonTeamDao;
import com.jdm.pokeAPI.entities.pokemon.PokemonDb;
import com.jdm.pokeAPI.entities.team.Team;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Joe McAdams
 * @email joedmcadams@gmail.com
 * 
 */
@Component
public class PokemonTeamService {
    
    @Autowired
    RestTemplate restTemplate;
    
    @Autowired
    PokemonTeamDao teamDao;
    
    public Team createNewTeam(String teamName, String teamDescription) {
        Team team = new Team();
        team.setName(teamName);
        team.setDescription(teamDescription);
        return team;
    }

    public List<Team> getAllTeams() {
        return teamDao.getAllTeams();
    }

    public PokemonDb createPokemon(String pokemonName, String pokemonDescription) {
        
        PokemonDb pokemon = new PokemonDb();
        pokemon.setName(pokemonName);
        pokemon.setNote(pokemonDescription);
        
        return pokemon;
    }
    
    public void addPokemon(PokemonDb pokemon, int teamId){
        teamDao.addPokemonToTeam(pokemon, teamId);
    }

    public void deleteTeam(int teamId) {
        teamDao.deleteTeamById(teamId);
    }

    public void addTeam(Team team) {
        teamDao.addTeam(team);    
    }

}
