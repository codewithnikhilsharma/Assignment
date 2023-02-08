package Today;

import java.util.Scanner;

public class Factorial {
 
	  public static void main(String[] args) {
		  
		  // taking input
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    
	    int num = sc.nextInt();
	    
	    
	    int factorial = calculateFactorial(num);
	    
	    System.out.println("The factorial of " + num + " is: " + factorial);
	  }
	  
	  public static int calculateFactorial(int n) {
	    int result = 1;
	    for (int i = 1; i <= n; i++) {
	      result *= i;
	    }
	    return result;
	  }
	}


