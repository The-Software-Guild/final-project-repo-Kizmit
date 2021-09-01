/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jdm.pokeAPI.dao;

import com.jdm.pokeAPI.entities.pokemon.PokemonDb;
import com.jdm.pokeAPI.entities.team.Team;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Joe McAdams
 * @email joedmcadams@gmail.com
 * 
 */
@Repository
public class PokemonTeamDaoDbImpl implements PokemonTeamDao{
    
    @Autowired
    JdbcTemplate jdbc;
    
    @Override
    public List<Team> getAllTeams() {
        final String GET_ALL_TEAMS = "SELECT * FROM team";
        List<Team> teams = jdbc.query(GET_ALL_TEAMS, new TeamMapper());
        teams.forEach(team -> {
            team = assosciatePokemon(team);
        });
        
        return teams;
    }
    @Override
    public Team getTeamById(int teamId){
       final String GET_TEAM_BY_ID = "SELECT * FROM team WHERE teamId = ?";
       Team team = jdbc.queryForObject(GET_TEAM_BY_ID, new TeamMapper(), teamId);
       team = assosciatePokemon(team);
       return team;
    }

    private Team assosciatePokemon(Team team) {
        final String GET_POKEMON_FOR_TEAM = "SELECT * FROM pokemon p "
                + "JOIN teampokemon tp ON tp.pokemonId = p.pokemonId "
                + "WHERE tp.teamId = ?";
        
        team.setPokemon(jdbc.query(GET_POKEMON_FOR_TEAM, new PokeMapper(), team.getId()));
        return team;
    }

    @Override
    public Team addTeam(Team team) {
        final String CREATE_TEAM = "INSERT INTO team(teamName, teamDescription) VALUES (?,?)";
        jdbc.update(CREATE_TEAM, team.getName(), team.getDescription());
        int newId = jdbc.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);
        team.setId(newId);
        return team;
    }

    @Override
    public void addPokemonToTeam(PokemonDb pokemon, int teamId) {
        final String ADD_POKEMON_TO_TEAM = "INSERT INTO pokemon(pokemonName, pokemonNote) VALUES (?,?)";
        jdbc.update(ADD_POKEMON_TO_TEAM, pokemon.getName(), pokemon.getNote());
        
        int newId = jdbc.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);
        pokemon.setId(newId);
        
        final String BRIDGE_POKEMON_TEAM = "INSERT INTO teampokemon(pokemonId, teamId) VALUES (?,?)";
        jdbc.update(BRIDGE_POKEMON_TEAM, pokemon.getId(), teamId);
    }

    @Override
    public void deleteTeamById(int teamId) {
        Team team = getTeamById(teamId);
        
        final String DELETE_POKETEAM = "DELETE pt.* FROM teampokemon pt WHERE teamId = ?";
        jdbc.update(DELETE_POKETEAM, teamId);
        
        final String DELETE_POKEMON = "DELETE p.* FROM pokemon p WHERE pokemonId = ?";
        team.getPokemon().forEach(pokemon -> {
            jdbc.update(DELETE_POKEMON, pokemon.getId());
        });

        final String DELETE_TEAM = "DELETE t.* FROM team t WHERE teamId = ?";
        jdbc.update(DELETE_TEAM, teamId);
    }


    private static final class TeamMapper implements RowMapper<Team> {

        @Override
        public Team mapRow(ResultSet rs, int index) throws SQLException {
            Team team = new Team();
            team.setId(rs.getInt("teamId"));
            team.setName(rs.getString("teamName"));
            team.setDescription(rs.getString("teamDescription"));
            return team;
        }
    }
    
    private static final class PokeMapper implements RowMapper<PokemonDb> {

        @Override
        public PokemonDb mapRow(ResultSet rs, int index) throws SQLException {
            PokemonDb pokemon = new PokemonDb();
            pokemon.setId(rs.getInt("pokemonId"));
            pokemon.setName(rs.getString("pokemonName"));
            pokemon.setNote(rs.getString("pokemonNote"));
            return pokemon;
        }
    }

}
