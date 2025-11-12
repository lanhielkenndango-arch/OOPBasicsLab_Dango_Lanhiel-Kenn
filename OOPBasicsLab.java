/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopbasicslab;

import java.util.Scanner;

/**
 *
 * @author shadow
 */
public class OOPBasicsLab {

    public static void main(String[] args) {
        
        
        System.out.println("Lab Activity 8: Object-Oriented Programming (OOP) Basics");

        System.out.println("Activity 1 - Create a Class and Object\n");

        Student Kenn = new Student("Kenn", 13, 94.7);
        Student Ken = new Student("Ken", 24, 76.3);

        Kenn.displayInfo();
        Ken.displayInfo();

        System.out.println("\nActivity 2 - Encapsulation and Getters/Setters\n");

        Kenn.setName("Lanhiel");
        Kenn.setAge(20);
        Kenn.setGrade(85.0);

        Ken.setName("Lan");
        Ken.setAge(20);
        Ken.setGrade(98.5);

        Kenn.displayInfo();
        Ken.displayInfo();

        System.out.println("\nActivity 3 - Vehicle Class Example\n");

        //  two objects
        Vehicle car = new Vehicle("BMW", "X5", 40);
        Vehicle motorcycle = new Vehicle("Yamaha", "Mio", 20);

        // Display initial info
        System.out.println("Initial Vehicle Status:");
        car.displayStatus();
        motorcycle.displayStatus();

        // Accelerate both
        car.accelerate(50);
        motorcycle.accelerate(30);
        System.out.println("--------------------");

        // Display updated info
        System.out.println("After Acceleration:");
        car.displayStatus();
        motorcycle.displayStatus();

        System.out.println("\nActivity 4: Bank Account Simulation\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = input.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = input.nextDouble();

        // Create a BankAccount object
        BankAccount account = new BankAccount(name, initialBalance);

        int choice;
        do {
            System.out.println("\n=== Bank Account Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
        
        
        System.out.println("\nActivity 5: Circle Geometry (Engineering Application) ");

        Circles c1 = new Circles(5.0);
        Circles c2 = new Circles(10.0);

        System.out.println("Circle 1 Details:");
        c1.displayDetails();

        System.out.println("Circle 2 Details:");
        c2.displayDetails();
        
    }
}
