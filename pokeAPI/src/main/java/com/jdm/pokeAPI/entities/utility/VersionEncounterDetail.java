package com.jdm.pokeAPI.entities.utility;

import com.jdm.pokeAPI.entities.games.Version;
import java.util.ArrayList;


public class VersionEncounterDetail {
	// The game version this encounter happens in.
	private Version version;

	// The total percentage of all encounter potential.
	private int max_chance;

	// A list of encounters and their specifics.
	private ArrayList<Encounter> encounter_details;

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public int getMax_chance() {
        return max_chance;
    }

    public void setMax_chance(int max_chance) {
        this.max_chance = max_chance;
    }

    public ArrayList<Encounter> getEncounter_details() {
        return encounter_details;
    }

    public void setEncounter_details(ArrayList<Encounter> encounter_details) {
        this.encounter_details = encounter_details;
    }

	
}