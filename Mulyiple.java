package Object;

//First interface
interface Printable {
void print();
int age = 22;
}

//Second interface
interface Showable {
void show();
String name = "Gogo";
}



//Class implementing multiple interfaces
class MyClass implements Printable, Showable {
public void print() {
   System.out.println("Printing");
}

public void show() {
   System.out.println("Showing");
}
}


public class Mulyiple {
	
	public static void main(String[] args) {
	   MyClass obj = new MyClass();
	   obj.print();
	   obj.show();
	   
	   System.out.println("Age" + Printable.age);
	   System.out.println("Name" + Showable.name);
	}
	}


