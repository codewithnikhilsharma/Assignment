package cognizant.tax;

 class TaxCalculator {

 // Define an instance variable named basicSalary of type float
 private float basicSalary;

 // Define an instance variable named citizenship of type boolean
 private boolean citizenship;

 // Define a method named calculateTax that calculates and prints the tax for the given basic salary
 public void calculateTax() {
     // Calculate the tax as 30% of the basic salary and store it in a new instance variable named tax
     float tax = 30 * basicSalary / 100;
     // Print a message to the console that includes the basic salary and calculated tax
     System.out.println("The Tax of the employee for the " + basicSalary + " is " + tax);
 }

 // Define a method named deductTax that deducts the calculated tax from the basic salary and stores it as nettSalary
 public void deductTax() {
     // Calculate the nett salary by subtracting the tax from the basic salary and cast the result to an integer
     int nettSalary = (int)(basicSalary - (30 * basicSalary / 100));
     // Print a message to the console that includes the nett salary
     System.out.println("The nett salary of the employee " + nettSalary);
 }

 // Define a method named validateSalary that checks if the basic salary is greater than 1 lakh and citizenship is true
 public void validateSalary() {
     // Check if the basic salary is greater than 1 lakh and citizenship is true
     boolean response = basicSalary > 100000 && citizenship;
     // Print a message to the console that indicates the salary and citizenship eligibility
     System.out.println("The salary and citizenship eligibility: " + response);
 }

 // Define a constructor that takes two parameters for the basic salary and citizenship and initializes the instance variables
 public TaxCalculator(float basicSalary, boolean citizenship) {
     this.basicSalary = basicSalary;
     this.citizenship = citizenship;
 }
}

public class EmployeeTax {

 // Define the main method
 public static void main(String[] args) {
     // Create a new instance of TaxCalculator with a basic salary of 25000 and citizenship of true
     TaxCalculator calculator1 = new TaxCalculator(25000, true);
     // Invoke the calculateTax method on the calculator object
     calculator1.calculateTax();
     // Invoke the deductTax method on the calculator object
     calculator1.deductTax();
     // Invoke the validateSalary method on the calculator object
     calculator1.validateSalary();

     // Create a new instance of TaxCalculator with a basic salary of 125000 and citizenship of true
     TaxCalculator calculator2 = new TaxCalculator(125000, true);
     // Invoke the calculateTax method on the calculator object
     calculator2.calculateTax();
     // Invoke the deductTax method on the calculator object
     calculator2.deductTax();
     // Invoke the validateSalary method on the calculator object
     calculator2.validateSalary();
 }
}



