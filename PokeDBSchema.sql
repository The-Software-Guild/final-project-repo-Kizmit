DROP DATABASE IF EXISTS pokemondb;
CREATE DATABASE pokemondb;
USE pokemondb;

CREATE TABLE team(
	teamId INT AUTO_INCREMENT,
    teamName VARCHAR(50) NOT NULL,
    teamDescription VARCHAR(100),
    CONSTRAINT pk_team PRIMARY KEY (teamId)
);

CREATE TABLE pokemon(
	pokemonId INT AUTO_INCREMENT,
    pokemonName VARCHAR(50) NOT NULL,
    pokemonNotes VARCHAR(100),
    CONSTRAINT pk_pokemon PRIMARY KEY (pokemonId)
);
CREATE TABLE teampokemon(
	teamId INT NOT NULL,
    pokemonId INT NOT NULL,
    CONSTRAINT pk_teampokemon PRIMARY KEY (teamId, pokemonId),
    CONSTRAINT fk_teampokemon_team 
		FOREIGN KEY (teamId)
        REFERENCES team(teamId),
	CONSTRAINT fk_teampokemon_pokemon
		FOREIGN KEY (pokemonId)
        REFERENCES pokemon(pokemonId)
);

