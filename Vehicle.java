/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopbasicslab;

/**
 *
 * @author shadow
 */
public class Vehicle {
     // attributes
    private String brand;
    private String model;
    private double speed;

    // constructor
    public Vehicle(String brand, String model, double speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    // method 
    public void accelerate(double increment) {
        speed += increment;
        System.out.println(model + " accelerated by " + increment + " km/h.");
    }

    // to display vehicle status
    public void displayStatus() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Current Speed: " + speed + " km/h");
        System.out.println("----------------------");
        
        
    }

}
