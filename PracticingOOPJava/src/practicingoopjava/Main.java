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
        // Instance of a person
        Person you = new Person("John Wick", 35, "Male");
        //Instance of a car
        Car yourCar = new Car("Toyota", "TRY-4455", "dark green", 4);
        // Determining the owner of the car
        you.setCar(yourCar);
        // Instance of a new car
        Car twoDoorCar = new Car("Ferrari", "ENZ-0254", "Red");
        
        // Testing the methods and classes
        System.out.println("Hello, "+you.getName());
        System.out.println("The color of your car is: "+yourCar.getColor());
        System.out.println("");
        System.out.println("There is a supercar in store");
        System.out.println("Characteristics:");
        System.out.println(" - Brand: "+twoDoorCar.getBrand()+
                           "\n - Plate: "+twoDoorCar.getPlate()+
                           "\n - Color: "+twoDoorCar.getColor()+
                           "\n - Number of doors: "+twoDoorCar.getNumberOfDoors());
        
        // Test drive of the car
        you.startEngine();
        you.setShiftCar(1);
        you.accelerateCar();
        you.setShiftCar(2);
        you.accelerateCar();
        you.setShiftCar(3);
        you.accelerateCar();
        you.setShiftCar(2);
        you.accelerateCar();
        you.setShiftCar(1);
        you.accelerateCar();
        you.setShiftCar(0);
        you.accelerateCar();
        you.breakCar();
        you.stopEngine();
        
    }
    
}
