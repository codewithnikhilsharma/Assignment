   package String;

    public class StringBufferr {

		   public static void main(String[] args) {
			   
		      // create a StringBuffer
		      StringBuffer sb = new StringBuffer("This is StringBuffer");
		      
		      // add the string "- This is a sample program" to existing string
		      sb.append("- This is a sample program");
		      System.out.println("After appending: " + sb);
		      
		      // insert the string "Object" at the 21st position
		      sb.insert(21, "Object");
		      System.out.println("After inserting: " + sb);
		      
		      // reverse the entire string
		      sb.reverse();
		      System.out.println("After reversing: " + sb);
		    
              // replace "Buffer" with "Builder"
		       sb.replace( 16 , 16  , "Bilder");
		       System.out.println( "Replace : " + sb);
		      
		        

		}}
  

	
	



