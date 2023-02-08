package Today;

import java.util.Scanner;

public class Number {
       
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print(" first number: ");
	        double firstNumber = sc.nextDouble();

	        System.out.print(" second number: ");
	        double secondNumber = sc.nextDouble();

	        boolean first = firstNumber > 0 && firstNumber < 1;
	        boolean second = secondNumber > 0 && secondNumber < 1;

	        if (first && second) {
	            System.out.println("Both numbers are strictly between 0 and 1");
	        } else {
	            System.out.println("Both numbers are not strictly between 0 and 1");
	        }
	    }
	}


