package Array;

import java.util.Scanner;

public class EvenOddInteger {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Taking input size of an array
		System.out.print(" Enter the Size of an array : ");
		int Size = scanner.nextInt();
		

	     // Initialize the array with the given size
		 int[] arr = new int[Size];
		 
		 System.out.println();
		 
		// Taking inputs of array element
		System.out.print(" Enter the Element : " );
		for(int i = 0; i<Size; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println();
		// printing Even number
		System.out.print(" Even Number : ");
		for(int i : arr) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}	
	    	}
		
		System.out.println();
		System.out.println();
		
		// printing Odd Number
		System.out.print(" Odd Number : ");
		 for(int i : arr) {
			 if(i % 2 !=0) {
				 System.out.print(i + " ");
			 }
		   }
		 System.out.println();
		 }	
	   }

