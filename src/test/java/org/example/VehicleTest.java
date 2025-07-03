package org.example;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @org.junit.jupiter.api.Test
    void getManufacture() {
        Vehicle vehicle = new Vehicle("Audi", "A4", 2020);
        assertEquals("Audi", vehicle.getManufacture());
    }

    @org.junit.jupiter.api.Test
    void getModel() {
        Vehicle vehicle = new Vehicle("Audi", "A4", 2020);
        assertEquals("A4", vehicle.getModel());
    }

    @org.junit.jupiter.api.Test
    void getYearOfManufacture() {
        Vehicle vehicle = new Vehicle("Audi", "A4", 2020);
        assertEquals(2020, vehicle.getYearOfManufacture());
    }

}