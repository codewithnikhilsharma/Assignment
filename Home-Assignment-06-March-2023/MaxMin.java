package Array;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	// Taking input size of an array
	System.out.print(" Enter the Size of an array : ");
	int Size = scanner.nextInt();

     // Initialize the array with the given size
	 int[] jo = new int[Size];
	 
	 System.out.println();
	 
	// Taking inputs of array element
	System.out.print(" Enter the Element : " );
	for(int i = 0; i<Size; i++) {
		jo[i] = scanner.nextInt();
	   }
	
	 System.out.println();
		
	     int ans = 0;
	     
		// Max Number
		for(int i = 0; i<jo.length; i++) {
			if(jo[i] > ans) {
				ans = jo[i];	
			}	
	    	}
		System.out.println(" Maximum Number is : " + ans);
		
		System.out.println();
		
		// Min Number
     for(int i = 0; i<jo.length; i++) {
			if(jo[i] < ans) {
				ans = jo[i];		
	     }		
         }
       System.out.println(" minumum Number is : " + ans);
	     
	     }
	     }

