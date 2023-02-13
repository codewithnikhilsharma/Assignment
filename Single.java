package Today;

//Defines a class named "Animal"
   class Animal {
	   
 // Declares a method named "makeSound" in the "Animal" class
   void makeSound() {
   System.out.println("The animal makes a sound");
   }
   }
   
// Defines a class named "Dog" that extends the "Animal" class
  class Dog extends Animal {
	  
// Declares a method named "bark" in the "Dog" class
  void bark() {
  System.out.println("The dog barks");
  }
  }
  // Defines a class named "Single"
      public class Single {
    // Declares the main method of the "Single" class
	   public static void main(String[] args) {
		   
		Dog dog = new Dog();
		dog.makeSound();
		dog.bark();
		}	
      }
