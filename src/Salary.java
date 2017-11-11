// Class Salary extending the Class Employee
public class Salary extends Employee {

	   private double salary;   // Annual salary
	   // Constructor for class Salary
	   public Salary(String name, String address, int number, double salary) {
		  // constructing an employee by calling super class Constructor
	      super(name, address, number);
	      setSalary(salary); // Set the salary for the employee
	   }
	   
	   public void mailCheck() {
		  // Display Employee with Salary
	      System.out.println("Mailing check to " + getName() + " with salary " + salary);
	   }
	  // getter for variable salary
	   public double getSalary() {
	      return salary;
	   }
	   // Setter for Variable for salary
	   public void setSalary(double newSalary) {
		   //check for salary should be greater than Zero
	      if(newSalary >= 0.0) {
	         salary = newSalary;
	      }
	   }

}