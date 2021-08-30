package com.jdm.pokeAPI.entities.utility;

import com.jdm.pokeAPI.entities.encounters.EncounterConditionValue;
import com.jdm.pokeAPI.entities.encounters.EncounterMethod;
import java.util.ArrayList;


public class Encounter {
	// The lowest level the Pokémon could be encountered at.
	private int min_level;

	// The highest level the Pokémon could be encountered at.
	private int max_level;

	// A list of condition values that must be in effect for this encounter to occur.
	private ArrayList<EncounterConditionValue> condition_values;

	// Percent chance that this encounter will occur.
	private int chance;

	// The method by which this encounter happens.
	private EncounterMethod method;

    public int getMin_level() {
        return min_level;
    }

    public void setMin_level(int min_level) {
        this.min_level = min_level;
    }

    public int getMax_level() {
        return max_level;
    }

    public void setMax_level(int max_level) {
        this.max_level = max_level;
    }

    public ArrayList<EncounterConditionValue> getCondition_values() {
        return condition_values;
    }

    public void setCondition_values(ArrayList<EncounterConditionValue> condition_values) {
        this.condition_values = condition_values;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public EncounterMethod getMethod() {
        return method;
    }

    public void setMethod(EncounterMethod method) {
        this.method = method;
    }

	
}