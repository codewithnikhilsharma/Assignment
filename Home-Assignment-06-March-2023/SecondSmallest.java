package HomeAssignment;

public class SecondSmallest {
	    public static void main(String[] args) {
	        int[] arr = { 5, 2, 8, 7, 1, 9, 3 };
	        int smallest = arr[0];
	        int secondSmallest = arr[0];
	        
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < smallest) {
	                secondSmallest = smallest;
	                smallest = arr[i];
	            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
	                secondSmallest = arr[i];
	            }
	        }
	        
	        System.out.println("The second smallest element in the array is: " + secondSmallest);
	    }
	}


