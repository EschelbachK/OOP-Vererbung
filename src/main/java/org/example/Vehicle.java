package org.example;

public class Vehicle {
    //Attribute
    private String manufacture;
    private String model;
    private int yearOfManufacture;

    public Vehicle(String manufacture, String model, int yearOfManufacture) {
        this.manufacture = manufacture;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }
    public String getManufacture() {
        return manufacture;
    }
    public String getModel() {
        return model;
    }
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
    public String toString() {
        return "Hersteller: " + manufacture + "\n" + "Model: " + model + "\n" + "Herstellungsjahr: " + yearOfManufacture + "\n";
    }
}
