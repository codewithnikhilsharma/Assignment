package controlStatement;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		
		 int sum = 0;
		int number = 0;
//	   
//		    Scanner sc = new Scanner(System.in);
//		    System.out.println("Enter the num1 : ");
//		    
//		    int number1 = sc.nextInt();
//		    while(number>=0) {
//		    	
//		    	sum+=number;
//		    	
//		    	System.out.println("Enter the num2 : ");
//		    	number = sc.nextInt();
//		    }
//		    System.out.println(" sum is : " + sum );
//		    sc.close();
		
		Scanner sc = new Scanner(System.in);
		do {
			sum+=number;
			System.out.println("Enter the number");
			number = sc.nextInt();
			
		}while (number >=0);
		System.out.println(" sum is : " + sum);
		sc.close();
		
		  }
		}

	

