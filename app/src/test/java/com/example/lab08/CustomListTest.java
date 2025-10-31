package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Vancouver", "BC");

        assertFalse(list.hasCity(calgary));
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);

        assertTrue(list.hasCity(edmonton));
        list.deleteCity(edmonton);
        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public void testDeleteCityNotFound() {
        CustomList list = new CustomList();
        City toronto = new City("Toronto", "ON");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            list.deleteCity(toronto);
        });
        assertEquals("City not found in list.", exception.getMessage());
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());

        list.addCity(new City("Victoria", "BC"));
        list.addCity(new City("Toronto", "ON"));
        assertEquals(2, list.countCities());

    }
}
