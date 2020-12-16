/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicingoopjava;

/**
 * Class to define some attributes of a car:
 *  - Brand
 *  - Color
 *  - Plate
 *  - Number of doors
 * 
 * @author Alysson Bruno
 */
public class Car {
    // Defining the attributes
    String brand;
    String plate;
    String color;
    int numberOfDoors;
    Person person;
    int shift;
    
    /**
     * Creating a constructor for this class
     * The constructor has to be the same name of the class
     * 
     */
    public Car(String brand, String plate, String color, int numberOfDoors){
        this.brand = brand;
        this.plate = plate;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.person = person;
    }
    
    // Constructor overloading
    public Car(String brand, String plate, String color){
        this.brand = brand;
        this.plate = plate;
        this.color = color;
        this.numberOfDoors = 2;
    }
    
    // Defining the methods to get every attribute
    
    String getBrand(){
        return this.brand;
    }   
   
    String getPlate(){
        return this.plate;
    }
    
    String getColor(){
        return this.color;
    }
    
    int getNumberOfDoors(){
        return this.numberOfDoors;
    }
    
    // Defining methods for basic functionalities of a car
    void startEngine(){
        System.out.println("The engine has started");
    }
    
    void stopEngine(){
        System.out.println("The engine has stopped");
    }
    
    void accelerating(){
        System.out.println("The car is accelerating");
    }
    
    void breaking(){
        System.out.println("The car is breaking");
    }
    
    void setShift( int shift){
        this.shift = shift;
    }
    
    int getshift(){
        return this.shift;
    }
}
