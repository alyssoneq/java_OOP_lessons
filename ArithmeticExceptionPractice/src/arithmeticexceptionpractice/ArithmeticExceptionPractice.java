/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticexceptionpractice;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Simple code to practice an Exception
 * The exception ArithmeticException throws when an exceptional
 * arithmetic condition happens
 *
 * @author Alysson Bruno
 */
public class ArithmeticExceptionPractice {
    
    public static void main(String[] args) {
        int value1;
        int value2;
       
        // Instance of the Scanner method
        Scanner userInput = new Scanner(System.in);

        try{
        // getting user input
        System.out.println("Please type values for a simple division");
        System.out.println("Please type the value of the dividend: ");
        value1 = userInput.nextInt();
        System.out.println("Please type the value of the divisor: ");
        value2 = userInput.nextInt();
        
        // Calling the method to perform the division
        Calculator operation = new Calculator();
        int result = operation.division(value1, value2);
        
        System.out.println("The result is: "+result);
        
        } catch (ArithmeticException error){
            // This type of exception only occurs with integer input
            // System.err is an output in red to represent an error
            System.err.println("Error occurred: "+ error);
            System.out.println("No number can be divided by zero!!");
        }
    }
    
    
}
