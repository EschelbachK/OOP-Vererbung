package org.example;

public class Motorcycle extends Vehicle {
    String typ;
    public Motorcycle(String manufacture, String model, int yearOfManufacture,String typ) {
        super(manufacture, model,yearOfManufacture);
        this.typ = typ;
    }
}
