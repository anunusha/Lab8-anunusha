package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {

    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    // Adds a city
    public void addCity(City city) {
        cities.add(city);
    }

    //if the city exists, return true
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    // Deletes a city, returns city not found
    public void deleteCity(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not found in list.");
        }
        cities.remove(city);
    }

    //the number of cities
    public int countCities() {
        return cities.size();
    }
}
