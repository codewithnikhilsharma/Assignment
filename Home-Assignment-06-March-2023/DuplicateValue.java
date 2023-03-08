package HomeAssignment;

public class DuplicateValue {
	
	    public static void main(String[] args) {
	        // initialize an array of integers
	        int[] numbers = {2, 4, 6, 8, 10, 2, 6};

	        // find the duplicate values in the array
	        for (int i = 0; i < numbers.length; i++) {
	        	
	            for (int j = i + 1; j < numbers.length; j++) {
	            	
	                if (numbers[i] == numbers[j]) {
	                    System.out.println(numbers[i] + " is a duplicate value");
	                    break;
	                }
	            }
	        }
	    }
	}


