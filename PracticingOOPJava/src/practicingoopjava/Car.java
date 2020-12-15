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
    
    /**
     * Creating a constructor for this class
     * The constructor has to be the same name of the class
     * 
     */
    public Car(String brand, String plate, String color, int numberOfDoors, Person person){
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
}