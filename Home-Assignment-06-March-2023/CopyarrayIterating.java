package HomeAssignment;

public class CopyarrayIterating {
	
		    public static void main(String[] args) {
		    	// Original array
		        int[] Original = { 5, 2, 8, 7, 1 };
		        
		        int[] Copy = new int[Original.length];

		        // Copy the array elements from original to copy by iterating
		        for (int i = 0; i < Original.length; i++) {
		            Copy[i] = Original[i];
		        }

		        // Print the original array
		        System.out.print("Original array: [ ");
		        for (int i = 0; i < Original.length; i++) {
		            System.out.print(Original[i] + " ");
		        }
		        System.out.println("]");

		        // Print the copied array
		        System.out.print("Copied array: [ ");
		        for (int i = 0; i < Copy.length; i++) {
		            System.out.print(Copy[i] + " ");
		        }
		        System.out.println("]");
		    }
	    }

