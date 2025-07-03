package org.example;

public class Car extends Vehicle {
    int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public Car(String manufacture, String model, int yearOfManufacture, int numberOfDoors) {
        super(manufacture, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public String toString() {
        return super.toString() + "Anzahl der Türen: " + numberOfDoors + "\n";
        }
    }
