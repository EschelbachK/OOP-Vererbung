package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("AUDI", "R8",2010);
        Car car1 = new Car("BMW", "X3",2016,5);
        Motorcycle  motorcycle1 = new Motorcycle("YAMAHA", "YZF-R6", 2001,"Sportbike");

        System.out.println(vehicle1.toString());
        System.out.println(car1.toString());
        System.out.println(motorcycle1.toString());
        }
    }