package Object;

import java.util.Scanner;

public class YearDay {
   
public static void main(String[] args) {
			
		 // taking input
	  Scanner scanner = new Scanner(System.in);
		   
	  System.out.print("Enter the number of minutes: ");
	    
		    int minutes = scanner.nextInt();
		    
		    // one year : 525600 min 
		    
		    int years = minutes / 525600; // to cal year divide time value by 525600
		    
		    int days = (minutes % 525600) / 1440; // to cal days 
		    
          System.out.println(minutes + " minutes is : " + years + " years and : " + days + " days.");
		   
		  }	

	  }	
		
	

