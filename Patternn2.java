package controlStatement;

public class Patternn2 {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 1; i <= n; i++) {
			
			// loop to print the number of space before the star
			for (int j = 5; j>= i; j--) {
				System.out.print(" ");
			}
			
			// loop to print the number of star in each row 
			for (int j = 1; j<=i; j++) {
				System.out.print(" *");
			}
			
			// for new line after printing each row
			System.out.println();
		}
	}
}
