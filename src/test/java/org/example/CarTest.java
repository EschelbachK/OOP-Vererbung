package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testGetNumberOfDoors() {
        Car car = new Car("Audi", "A4", 2020, 4);
        assertEquals(4, car.getNumberOfDoors());
    }

    @Test
    void testToString() {
        Car car = new Car("Mercedes", "C-Klasse", 2018, 3);
        String expected = "Hersteller: Mercedes\nModel: C-Klasse\nHerstellungsjahr: 2018\nAnzahl der Türen: 3\n";
        assertEquals(expected, car.toString());
    }
}