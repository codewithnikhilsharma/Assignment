package HomeAssignment;

public class FindIndex {

	    public static void main(String[] args) {
	        
	        int[] array = {4, 7, 2, 8, 5};
	        int searchElement = 8;
	        int index = -1;
	        
	        for(int i = 0; i < array.length; i++) {
	            if(array[i] == searchElement) {
	                index = i;
	                break;
	            }
	        }
	        
	        if(index == -1) {
	            System.out.println("Element not found in array.");
	        } else {
	            System.out.println("Element found at index: " + index);
	        }     
	    }
	 }


