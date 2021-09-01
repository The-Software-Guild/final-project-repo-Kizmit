/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdm.pokeAPI.dao;

import com.jdm.pokeAPI.entities.pokemon.PokemonDb;
import com.jdm.pokeAPI.entities.team.Team;
import java.util.List;

/**
 *
 * @author Joe
 */
public interface PokemonTeamDao {

    public List<Team> getAllTeams();


    public Team addTeam(Team team);

    public void addPokemonToTeam(PokemonDb pokemon, int teamId);

    public void deleteTeamById(int teamId);
    
}
