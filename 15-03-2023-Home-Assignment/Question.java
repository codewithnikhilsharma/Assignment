package String;

public class Question {

	  public static void main(String[] args) {
	    String str = "Welcome to Java World";
	        
	      char ch = str.charAt(4);
	      System.out.println("Character at 5th position: " + ch);
	        
	      String str1 = "welcome to java world";
	      if (str1.equalsIgnoreCase(str)){
	          System.out.println("Strings are equal");
	        }        
	        	       
	       String suffix = "- Let us learn";
	       String newStr = str + suffix;
	       System.out.println("Concatenated string: " + newStr);

	       int pos = str.indexOf('a');
	       System.out.println("Position of first 'a': " + pos);
	        
	       String replacedStr = str.replace('a', 'e');
	       System.out.println("String after replacement: " + replacedStr);
	        
	       String subStr = str.substring(3, 10);
	       System.out.println("Substring between 4th and 10th position: " + subStr);
	        
	       String lowerCaseStr = str.toLowerCase();
	       System.out.println("Lowercase string: " + lowerCaseStr);
	    }
	    }


