package controlStatement;

import java.util.Scanner;
public class Leap {
   
	public static void main(String[] args) {
		
		
		
		    Scanner sc = new Scanner(System.in);
		    int year;
		    
		    System.out.print("Enter a year: ");
		    
		    // 
		    while (!sc.hasNextInt()) {
		      System.out.println("Invalid input. Try again.");
		      sc.next();
		    }
		    
		    year = sc.nextInt();

  boolean isLeapYear = ( year % 4 == 0 && year % 100 != 0) ||  year % 400 == 0;
		    if (isLeapYear) {
		      System.out.println(year + " is a leap year.");
		    } else {
		      System.out.println(year + " is not a leap year.");
		    }

		    sc.close();
		  }
	}

