/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playingwithdates;

import java.time.LocalDate;


/**
 * Class to manipulate date formats and user input
 * 
 * @author Alysson Bruno
 */
public class Date {
   // Basic attributes of a date
   private int day; 
   private int month; 
   private int year;
   
   // Constructor to get all 3 attributes
   public Date(int day, int month, int year){
       this.day = day;
       this.month = month;
       this.year = year;
       
       validateDate();
   }
   
   //Constructor to get current date
   public Date(){
       this.day = LocalDate.now().getDayOfYear();
       this.month = LocalDate.now().getMonthValue();
       this.month = LocalDate.now().getYear();
   }

   // Method to validate input data 
   private void validateDate() {
        if (this.day < 1 || this.day > 31 || this.month < 1 || this.month > 12 || this.year < 1  ) {
            System.out.println("Valid date. Thank you!!!");
       } else {
            System.out.println("Invalid date");
       }
   }
   
   // Methods to set day, month and year
   public void setDay(int day){
       this.day = day;
   }
   
   public void setMonth(int month){
       this.month = month;
   }
   
   public void setYear(int year){
       this.year = year;
   }
   
   // Methods to get day, month and year
   public int getDay(){
       return this.day;
   }
   
   public int getMonth(){
       return this.month;
   }
   
   public int getYear(){
       return this.year;
   }
   
   // Method to output date as a string
   public String dateString (){
       return this.day+"/"+this.month+"/"+this.year;
   }
   
   // Method to one day forward
   public void oneDayForward(){
       this.day += 1;
   }
}
