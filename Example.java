package Object;

public class Example {

	// Default
	
	Example(){
		System.out.println(" This one is Default");
	}
	
	// parameterized
	
	int mul;
	
	Example(int a , int b){
		mul=a*b;
	}
	
	void show() {
		System.out.println("Mul is : " + mul);
	}
	
	  public static void main(String[] args) {
		
		  Example vi = new Example();
		  Example vii = new Example(22 , 44);
		  vii.show(); 
	}
}
