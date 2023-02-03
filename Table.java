package controlStatement;

import java.util.Scanner;
public class Table {
    
	// printing table 
	public static void main(String[] args) {
		
		        // input
		        Scanner input = new Scanner(System.in);
		        
		        System.out.print("Enter an integer: ");
		        
		             int number = input.nextInt();

         System.out.println("Multiplication table of " + number);
           
	        for (int i = 1; i <= 10; i++) {
	       System.out.println(number + " x " + i + " = " + number * i);
		        }
		    }
    	}

