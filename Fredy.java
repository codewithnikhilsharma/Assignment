package Now;

 class ParentClass {
    protected int x; 

    public ParentClass(int x) { // constructor
        this.x = x; // initialize x with the parameter value
    }

    public void printX() { // method to print x
        System.out.println("Parent x: " + x);
    }
}

 class ChildClass extends ParentClass {
    protected int y; 

    public ChildClass(int x, int y) { // constructor
        super(x); // call the constructor of the ParentClass with parameter x
        this.y = y; // initialize y with the parameter value
    }

    public void printY() { // method to print y
        System.out.println("Child y: " + y);
    }

    @Override 
    public void printX() { 
        super.printX(); // call the printX() method of the ParentClass
        System.out.println("Child x: " + x); // print the value of x in the ChildClass
    }
}



public class Fredy {
	    public static void main(String[] args) { // main method
	        ChildClass child = new ChildClass(10, 20); 
	        child.printX(); // call the overridden printX() method of the ChildClass
	        child.printY(); // call the printY() method of the ChildClass
	    }
	}

