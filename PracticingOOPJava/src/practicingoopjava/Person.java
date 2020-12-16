/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicingoopjava;

/**
 * Class to define some aspects of a person:
 *  - Name
 *  - Age
 *  - Gender
 * 
 * @author Alysson Bruno
 */
class Person {
   String name;
   int age;
   String gender;
   Car car;
   
   // Construct to define the attributes of a person
   public Person(String name, int age , String gender){
       this.name = name;
       this.age = age;
       this.gender = gender;   
   }
   
   public Person(String name){
       this.name = name;
   }
   
   // Method to determine a person car
   void setCar(Car car){
       this.car = car;
   }
   
   // Methods for a person interact with the car
   void startEngine(){
       car.startEngine();
   }
   
   void stopEngine(){
       car.stopEngine();
   }
   
   void accelerateCar(){
       car.accelerating();
   }
   
   void breakCar(){
       car.breaking();
   }
   
   void setShiftCar(int shift){
       car.setShift(shift);
   }
   
   void getShiftCar(){
       car.getshift();
   }
}
