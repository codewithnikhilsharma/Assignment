package controlStatement;

import java.util.Scanner;

public class Switch1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Your Command : ");
		String text = in.nextLine();
		
		switch(text){
		
			case "Start":
				System.out.println(" Starting Process.....");
				break;
				
			case "Stop":
				System.out.println(" Stopping Process.....");
				break;
				
			case "Pause":
				System.out.println(" Pausing Process.....");
				break;
				
				default:System.out.println("Invalid Command");	
		}
	}
}
