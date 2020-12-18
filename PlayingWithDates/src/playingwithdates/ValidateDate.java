/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playingwithdates;

/**
 * Class to validate date format given by the user
 * 
 * @author Alysson Bruno
 */
public class ValidateDate {
    // Creating attributes
    private int day; 
    private int month; 
    private int year;
        
    // Method to validate input data 
    public Boolean validation(int day, int month, int year) {
        // Determining attributes
        this.day = day;
        this.month = month;
        this.year = year;
        
       if (this.day > 0 && this.month > 0 && this.year > 0 ) {
           if(month30Days(this.day , this.month)){
               return true;
           } else if(month31Days(this.day , this.month)){
               return true;
           } else if(this.month == 2 && this.day <= 28 ){
               return true;
           } else if(leapYear(this.year) && this.day <=29){
               return true;
           }
       } 
        
        return false;
    }
    
    // Method to verify if a date is valid for a month of 30 days
    private boolean month30Days(int day , int month) {
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                && 
            day <= 31) {
            return true;
        } else {
            return false;
        }
       
    }

    // Method to verify if a date is valid for a month of 31 days
    private boolean month31Days(int day , int month) {
        if((month == 4 || month == 6 || month == 9 || month == 11) && day <= 30){
            return true;
        }else{
            return false;
        }
    }
    
    // Method to verify if the year is a leap year
    private boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;
        }else{
            return false;
        }
    }
}
