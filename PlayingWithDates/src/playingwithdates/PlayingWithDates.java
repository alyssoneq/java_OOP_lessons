/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playingwithdates;

import java.util.Scanner;

/**
 *
 * @author Alysson Bruno
 */
public class PlayingWithDates {
    // Params
    private static int day;
    private static int month;
    private static int year;
    
    public static void main(String[] args) {
        // Getting the system's date of today
        Date todayDate = new Date();
        // Instance of the Scanner method
        Scanner userInput = new Scanner(System.in);
        
        // Getting user input
        System.out.println("Hello!!");
        System.out.println("Please insert a date below");
        System.out.println("Type the day:");
        day = userInput.nextInt();
        System.out.println("Type the month:");
        month = userInput.nextInt();
        System.out.println("Type the year:");
        year = userInput.nextInt();
        
        // Creating a date with the user input
        Date yourDate = new Date(day, month, year);
        
        // Printing all the dates
        System.out.println("Today's date: "+todayDate.dateString());
        System.out.println("your date: "+yourDate.dateString());
        
        
    }
    
}
