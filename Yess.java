package Now;

/**
 * This class represents an employee
 */
class Employee {
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;

    public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }

    /**
     * This method calculates the salary of the employee
     */
    public void calculateSalary() {
        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
        System.out.println("Salary: " + salary);
    }

    /**
     * This method calculates the transport allowance of the employee
     */
    public void calculateTransportAllowance() {
        double transportAllowance = 10.0 / 100 * basicSalary;
        double salary = basicSalary + transportAllowance;
        System.out.println("Transport Allowance for Trainee: " + transportAllowance);
        System.out.println("Total Salary for Trainee: " + salary);
    }
}

/**
 * This class represents a manager, who is an employee
 */
class Manager extends Employee {
    public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }

    /**
     * This method calculates the transport allowance of the manager
     * (override the method in Employee class)
     */
    @Override
    public void calculateTransportAllowance() {
        double transportAllowance = 15.0 / 100 * basicSalary;
        double salary = basicSalary + transportAllowance;
        System.out.println("Transport Allowance for Manager: " + transportAllowance);
        System.out.println("Total Salary for Manager: " + salary);
    }
}

/**
 * This class represents a trainee, who is an employee
 */
class Trainee extends Employee {
    public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }
}

/**
 * This class is the main entry point for the program
 */


public class Yess {
	
	    public static void main(String[] args) {
	        // Create a Manager object and calculate salary and transport allowance
	        Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
	        System.out.println("Manager Name: " + manager.employeeName);
	        manager.calculateSalary();
	        manager.calculateTransportAllowance();

	        // Create a Trainee object and calculate salary and transport allowance
	        Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
	        System.out.println("Trainee Name: " + trainee.employeeName);
	        trainee.calculateSalary();
	        trainee.calculateTransportAllowance();
	    }
	}

