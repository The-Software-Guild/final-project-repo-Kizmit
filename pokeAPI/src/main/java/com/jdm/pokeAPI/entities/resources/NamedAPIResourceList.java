package com.jdm.pokeAPI.entities.resources;
/*
{
  "count": 248,
  "next": "https://pokeapi.co/api/v2/ability/?limit=20&offset=20",
  "previous": null,
  "results": [
    {
      "name": "stench",
      "url": "https://pokeapi.co/api/v2/ability/1/"
    }
  ]
}
*/

import com.jdm.pokeAPI.entities.utility.NamedAPIResource;
import java.util.ArrayList;



public class NamedAPIResourceList {
	// The total number of resources available from this API.
	private int count;

	// The URL for the next page in the list.
	private String next;

	// The URL for the previous page in the list.
	private boolean previous;

	// A list of named API resources.
	private ArrayList<NamedAPIResource> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public boolean isPrevious() {
        return previous;
    }

    public void setPrevious(boolean previous) {
        this.previous = previous;
    }

    public ArrayList<NamedAPIResource> getResults() {
        return results;
    }

    public void setResults(ArrayList<NamedAPIResource> results) {
        this.results = results;
    }

	
}