/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicingoopjava;

/**
 * Class responsible to run the application
 * 
 * @author Alysson Bruno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * 1- Object creation
         * 2- data manipulation
         * 3- Program ending
         * 
         */
        
        // Instance of an object
        Car yourCar = new Car("Toyota","TRY-4455","dark green",4);
        
        // Testing a method
        System.out.println("The color of your car is: "+yourCar.getColor());
    }
    
}
