package com.jdm.pokeAPI.entities.utility;

import com.jdm.pokeAPI.entities.games.VersionGroup;
import com.jdm.pokeAPI.entities.machines.Machine;


public class MachineVersionDetail {
	// The machine that teaches a move from an item.
	private Machine machine;

	// The version group of this specific machine.
	private VersionGroup version_group;

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public VersionGroup getVersion_group() {
        return version_group;
    }

    public void setVersion_group(VersionGroup version_group) {
        this.version_group = version_group;
    }

	
}