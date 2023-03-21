package Lab;

public class Handeling {
	    public static void main(String[] args) {
	    	
	        int a = 10;
	        int b = 0;
	        int[] arr = new int[5];
	        String str = "abc";
	        
	        try {
	            int c = a / b; 
	        } catch (ArithmeticException e) {
	            System.out.println("Invalid division");
	            
	        }
	        
	        try {
	            int num = Integer.parseInt(str); 
	        } catch (NumberFormatException e) {
	            System.out.println("Format mismatch");
	            
	        }
	        
	        try {
	            int result = arr[7]; 
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index is invalid");
	            
	        }
	        
	       try {
	    	   int d = a/b;   
	           }catch(ArithmeticException e) {
	   	        System.out.println("Calculation invalid");
	   	    
	   	    }	 
	       
	       System.out.println("Exception handeling is complete");
      }}


