package Object;
public class Ind {

	// Default 
	Ind(){
		System.out.println(" This is Default ");
	 }
   // parameterized 
	 int age;
	 String name;
	 
	 Ind( int a , String n){	 
		 age = a;
		 name = n;		 
	   } 
	 void show() {
		 System.out.println(age+ " "+ name);}
			 	 
	 public static void main(String[] args) {
		
		 Ind o = new Ind(); 
		 Ind ob = new Ind(22 , "Nikhil");
		 ob.show(); 
	 }
   }
