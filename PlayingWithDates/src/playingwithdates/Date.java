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
   
   //Instance of the ValidateDate
   ValidateDate validationProcess = new ValidateDate();
   
   // Constructor to get all 3 attributes
   public Date(int day, int month, int year){
       //Validation of the input data
       
       if (validationProcess.validation(day, month, year)){
            this.day = day;
            this.month = month;
            this.year = year;
       }else{
           this.day = 0;
           this.month = 0;
           this.year = 0;
           
           // Alert of invalid date format
           System.out.println("Invalid date format");
       }
    }
   
   //Constructor to get current date of the system
   public Date(){
       // Using LocalDate to get the system's date
       this.day = LocalDate.now().getDayOfMonth();
       this.month = LocalDate.now().getMonthValue();
       this.year = LocalDate.now().getYear();
   }
   
   // Methods to set day, month and year
   public void setDay(int day){
       if(validationProcess.validation(day, this.month, this.year)){
            this.day = day;
       }
   }
   
   public void setMonth(int month){
       if(validationProcess.validation(this.day, month, this.year)){
            this.month = month;
       }
   }
   
   public void setYear(int year){
       if(validationProcess.validation(this.day, this.month, year)){
            this.year = year;
       }
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
       int newDay = this.day + 1;
       if (validationProcess.validation(newDay, this.month, this.year)) {
           setDay(newDay);
       } else {
           int newMonth = this.month + 1;
           if(validationProcess.validation(1, newMonth, this.year)){
               setMonth(newMonth);
           } else{
               setDay(1);
               setMonth(1);
               setYear(this.year + 1);
           }
       }
   }
}
