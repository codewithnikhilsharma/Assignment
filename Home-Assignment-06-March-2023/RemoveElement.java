package HomeAssignment;

public class RemoveElement {


	    public static void main(String[] args) {
	        
	        int[] array = {4, 7, 2, 8, 5};
	        int removeElement = 2;
	        
	        int[] newArray = new int[array.length - 1];
	        int index = 0;
	        
	        for(int i = 0; i < array.length; i++) {
	            if(array[i] != removeElement) {
	                newArray[index++] = array[i];
	            }
	        }
	        
	        System.out.print("Original array: ");
	        for(int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	        
	        System.out.print("New array: ");
	        for(int i = 0; i < newArray.length; i++) {
	            System.out.print(newArray[i] + " ");
	        }
	        System.out.println();
	        
	    }

	}


