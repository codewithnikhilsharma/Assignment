package Today;

class Example3 {
    
	 // instance variable
	    int x;
	    
	   // static variable
	    static int y;
       
	    // constructor 
	    Example3(int x) {
	        this.x = x;
	    }
          
	    // display method
	    void display() {
	        System.out.println("The value of x is: " + x);
	        System.out.println("The value of y is: " + y);
	    }
       
	    // static method
	    static void updateY(int value) {
	        y = value;
	    }
	}

	public class Example2 {
	    public static void main(String[] args) {
	        Example3 obj1 = new Example3(10);
	        obj1.display();

	        Example3.updateY(20);

	        Example3 obj2 = new Example3(30);
	        obj2.display();
	    }
	}


