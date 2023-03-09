package HomeAssignment;

	public class InsertElement{

	    public static void main(String[] args) {
	        
	        int[] array = {4, 7, 2, 8, 5};
	        int insertElement = 3;
	        int position = 2;
	        
	        int[] newArray = new int[array.length + 1];
	        
	        for(int i = 0, j = 0; i < newArray.length; i++) {
	            if(i == position) {
	                newArray[i] = insertElement;
	            } else {
	                newArray[i] = array[j];
	                j++;
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


