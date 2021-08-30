package com.jdm.pokeAPI.entities.utility;

public class NamedAPIResource extends APIResource {
	// The name of the referenced resource.
	private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}