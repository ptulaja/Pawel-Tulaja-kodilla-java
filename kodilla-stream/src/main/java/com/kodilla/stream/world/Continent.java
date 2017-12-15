package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final String continent;
    private final List<Country>  countries = new ArrayList<>();

    public void addCountries(Country country) {
        countries.add(country);
    }

    public Continent(final String continent) {
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
