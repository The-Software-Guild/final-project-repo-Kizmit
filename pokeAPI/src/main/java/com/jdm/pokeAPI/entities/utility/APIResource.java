package com.jdm.pokeAPI.entities.utility;

public class APIResource {
	// The URL of the referenced resource.
	private String url;

	// Check if this object has already been fetched from the API
	private boolean is_fetched;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isIs_fetched() {
        return is_fetched;
    }

    public void setIs_fetched(boolean is_fetched) {
        this.is_fetched = is_fetched;
    }
}