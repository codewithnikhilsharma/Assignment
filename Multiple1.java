package Today;

 class Animal1 {
 void makeSound() {
 System.out.println("The animal makes a sound");
 }
 }

 class Dog1 extends Animal {
 void bark() {
 System.out.println("The dog barks");
 }
 }

 class Lab extends Dog {
 void fetch() {
 System.out.println("The Labrador Retriever fetches");
 }
 }
       public class Multiple1 {
		public static void main(String[] args) {
		Lab oreo = new Lab();
		oreo.makeSound();
		oreo.bark();
		oreo.fetch();
		}
		}

