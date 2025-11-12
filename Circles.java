/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopbasicslab;

/**
 *
 * @author shadow
 */
public class Circles {
     double radius;

    // Constructor
    Circles(double r) {
        radius = r;
    }

    // Method to compute area
    double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to compute circumference
    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
        System.out.println("------------------------");
}
}