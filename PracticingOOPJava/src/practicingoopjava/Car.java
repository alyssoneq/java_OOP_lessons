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
    
    // Defining the methods to set and get every attribute
    void setBrand(String brand){
        this.brand = brand;
    }
    
    String getBrand(){
        return this.brand;
    }
    
    void setPlate(String plate){
        this.plate = plate;
    }
    
    String getPlate(){
        return this.plate;
    }
    
    void setColor(String color){
        this.color = color;
    }
    
    String getColor(){
        return this.color;
    }
    
    void setNumberOfDoors(int numberDoors){
        this.numberOfDoors = numberDoors;
    }
    
    int getNumberOfDoors(){
        return this.numberOfDoors;
    }
}
