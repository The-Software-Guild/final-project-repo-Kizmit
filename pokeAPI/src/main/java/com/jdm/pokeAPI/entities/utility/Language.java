/* Languages for translations of API resource information. */

package com.jdm.pokeAPI.entities.utility;
/*
{
  "id": 1,
  "name": "ja",
  "official": true,
  "iso639": "ja",
  "iso3166": "jp",
  "names": [
    {
      "name": "Japanese",
      "language": {
        "name": "en",
        "url": "https://pokeapi.co/api/v2/language/9/"
      }
    }
  ]
}
*/

import java.util.ArrayList;


public class Language extends NamedAPIResource {
	// The identifier for this resource.
	private int id;

	// Whether or not the games are published in this language.
	private boolean official;

	// The two-letter code of the country where this language is spoken. Note that it is not unique.
	private String iso639;

	// The two-letter code of the language. Note that it is not unique.
	private String iso3166;

	// The name of this resource listed in different languages.
	private ArrayList<Name> names;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isOfficial() {
        return official;
    }

    public void setOfficial(boolean official) {
        this.official = official;
    }

    public String getIso639() {
        return iso639;
    }

    public void setIso639(String iso639) {
        this.iso639 = iso639;
    }

    public String getIso3166() {
        return iso3166;
    }

    public void setIso3166(String iso3166) {
        this.iso3166 = iso3166;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

	
}