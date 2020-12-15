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
   
   // Construct to define the attributes of a person
   public Person(String name, int age , String gender){
       this.name = name;
       this.age = age;
       this.gender = gender;   
   }
   
   public Person(String name){
       this.name = name;
   }
   
   
   
}
